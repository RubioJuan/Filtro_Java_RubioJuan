/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
    
// folder import
import Model.Ninja;
import Connection.MySQLDataSource;

/**
 *
 * @author camper
 */

public class NinjaDao {
   private MySQLDataSource conexion = new MySQLDataSource();

     public boolean InsertNinja(Ninja ninja) {
        String sql = "INSERT INTO Ninja(nombre, rango, aldea) VALUES(?, ?, ?)";
        try (Connection conn = conexion.conectarMySQL();
             PreparedStatement stms = conn.prepareStatement(sql)) {

            stms.setString(1, ninja.getNombre());
            stms.setString(2, ninja.getRango());
            stms.setString(3, ninja.getAldea());

            int rowsAffected = stms.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }

    public Ninja ViewNinjaId(int id) {
        String sql = "SELECT * FROM Ninja WHERE id = ?";
        try (Connection conn = conexion.conectarMySQL();
             PreparedStatement stms = conn.prepareStatement(sql)) {

            stms.setInt(1, id);

            ResultSet rs = stms.executeQuery();

            if (rs.next()) {
                return new Ninja(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("rango"),
                    rs.getString("aldea")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Ninja> ViewNinja() {
    List<Ninja> ninjas = new ArrayList<>();
    String sql = "SELECT * FROM Ninja";
    try (Connection conn = conexion.conectarMySQL();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Ninja ninja = new Ninja(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("rango"),
                rs.getString("aldea")
            );
            ninjas.add(ninja);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ninjas;
    }
}