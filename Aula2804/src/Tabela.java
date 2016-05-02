/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;

public class Tabela
{
  public void criar()
  {
    Connection c;
    Statement stmt = null;
    try {
      c = Conexao.getConnection();
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE numeros " +
                   "(number INT)"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Table created successfully");
  }
}