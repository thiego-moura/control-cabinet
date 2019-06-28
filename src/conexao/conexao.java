/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class conexao {
    public static Connection conectar() throws SQLException{   
        String url = "jdbc:mysql://ip:3306/armario";
        String user = "thiego";
        String key = "";
        Connection conexao = DriverManager.getConnection(url, user, key);
        return conexao;
    }
}