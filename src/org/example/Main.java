package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Social Media Platform ===");

        try (Connection conn = org.example.DBConnection.getConnection()) {

            System.out.println("Connected to database\n");

            insertUser(conn, "dinislam", "dinislam@mail.com");
            insertUser(conn, "babajon", "babajon@mail.com");

            insertPost(conn, "Hello, this is my first post", 1);
            insertPost(conn, "I learn OOP in AITU", 2);

            printUsers(conn);
            printPosts(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------- CREATE USER ----------
    private static void insertUser(Connection conn, String username, String email)
            throws Exception {

        String sql = "INSERT INTO users(username, email) VALUES (?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, email);
            ps.executeUpdate();
        }
    }

    // ---------- CREATE POST ----------
    private static void insertPost(Connection conn, String content, int userId)
            throws Exception {

        String sql = "INSERT INTO posts(content, user_id) VALUES (?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, content);
            ps.setInt(2, userId);
            ps.executeUpdate();
        }
    }

    // ---------- READ USERS ----------
    private static void printUsers(Connection conn) throws Exception {

        System.out.println("Users:");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("username") + " | " +
                            rs.getString("email")
            );
        }

        System.out.println();
    }

    // ---------- READ POSTS ----------
    private static void printPosts(Connection conn) throws Exception {

        System.out.println("Posts:");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT p.id, p.content, u.username " +
                        "FROM posts p JOIN users u ON p.user_id = u.id"
        );

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("content") + " | " +
                            rs.getString("username")
            );
        }

        System.out.println();
    }
}
