/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.Statement;

public class Insert {
	public void inTable(int num) {
		Connection c;
		Statement stmt = null;
		try {
			c = Conexao.getConnection();
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "INSERT INTO numeros (number) VALUES (10);";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Records created successfully");
	}
}