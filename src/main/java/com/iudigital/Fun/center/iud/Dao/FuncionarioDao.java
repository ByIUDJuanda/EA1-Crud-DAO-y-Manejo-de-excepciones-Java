package com.iudigital.Fun.center.iud.Dao;

import com.iudigital.Fun.center.iud.Domain.Funcionarios;
import com.iudigital.Fun.center.iud.Util.ConnectionUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUANDA
 */
public class FuncionarioDao {
    
    private static final String GET_FUNC = "SELECT * FROM funcionarios";
    
    private static final String CREATE_FUNC = "INSERT INTO (TipoIdentificación, NúmeroIdentificación, Nombres, Apellidos, EstadoCivil, Sexo, Dirección, Teléfono, FechaNacimiento)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
    private static final String GET_FUNC_BY_ID = "SELECT * FROM funcionarios WHERE id = ?";
    
    private static final String UPDATE_FUNC = "UPDATE funcionarios SET TipoIdentificación = ?,NúmeroIdentificación = ?,Nombres = ?,Apellidos = ?,EstadoCivil = ?,Sexo = ?,Dirección = ?,Teléfono = ?,FechaNacimiento = ?";
    
    private static final String DELETE_FUNC = "DELETE * FROM funcionarios WHERE id = ?";
    
    
    
    public List<Funcionarios> obtenerFuncionarios() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resulSet = null;
        List<Funcionarios> funcionarios = new ArrayList<>();
        
        try{
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNC);
            resulSet = preparedStatement.executeQuery();
            while (resulSet.next()) {
                Funcionarios funcionario = new Funcionarios();
                funcionario.setID(resulSet.getInt("ID"));
                funcionario.setTipoIdentificación(resulSet.getString("TipoIdentificación"));
                funcionario.setNúmeroIdentificación(resulSet.getString("NúmeroIdentificación"));
                funcionario.setNombres(resulSet.getString("Nombres"));
                funcionario.setApellidos(resulSet.getString("Apellidos"));
                funcionario.setEstadoCivil(resulSet.getString("EstadoCivil"));
                funcionario.setSexo(resulSet.getString("Sexo"));
                funcionario.setDirección(resulSet.getString("Dirección"));
                funcionario.setTeléfono(resulSet.getString("Teléfono"));
                funcionario.setFechaNacimiento(resulSet.getDate("FechaNacimiento"));
                funcionarios.add(funcionario);
            }
            return funcionarios;
            
        }finally{
        
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
            if (resulSet != null){
                resulSet.close();
            }
        }
    }

    public void crearFuncionarios(Funcionarios funcionario) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(CREATE_FUNC);
            preparedStatement.setString(1, funcionario.getTipoIdentificación());
            preparedStatement.setString(2, funcionario.getNúmeroIdentificación());
            preparedStatement.setString(3, funcionario.getNombres());
            preparedStatement.setString(4, funcionario.getApellidos());
            preparedStatement.setString(5, funcionario.getEstadoCivil());
            preparedStatement.setString(6, funcionario.getSexo());
            preparedStatement.setString(7, funcionario.getDirección());
            preparedStatement.setString(8, funcionario.getTeléfono());
            preparedStatement.setDate(9, (Date) funcionario.getFechaNacimiento());
            preparedStatement.executeUpdate();
            
        }finally{
        
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    public Funcionarios obtenerFunionariosId(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resulSet = null;
        Funcionarios funcionario = null;
        
        try{
            
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNC_BY_ID);
            preparedStatement.setInt(1, id);
            resulSet = preparedStatement.executeQuery();
            
            if (resulSet.next()) {
                funcionario = new Funcionarios();
                funcionario.setID(resulSet.getInt("ID"));
                funcionario.setTipoIdentificación(resulSet.getString("TipoIdentificación"));
                funcionario.setNúmeroIdentificación(resulSet.getString("NúmeroIdentificación"));
                funcionario.setNombres(resulSet.getString("Nombres"));
                funcionario.setApellidos(resulSet.getString("Apellidos"));
                funcionario.setEstadoCivil(resulSet.getString("EstadoCivil"));
                funcionario.setSexo(resulSet.getString("Sexo"));
                funcionario.setDirección(resulSet.getString("Dirección"));
                funcionario.setTeléfono(resulSet.getString("Teléfono"));
                funcionario.setFechaNacimiento(resulSet.getDate("FechaNacimiento"));
            }
            return funcionario;
            
        }finally{
        
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
            if (resulSet != null){
                resulSet.close();
            }
        }
    }
    
    public void actualizarFuncionarios(int id, Funcionarios funcionario) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNC);
            preparedStatement.setString(1, funcionario.getTipoIdentificación());
            preparedStatement.setString(2, funcionario.getNúmeroIdentificación());
            preparedStatement.setString(3, funcionario.getNombres());
            preparedStatement.setString(4, funcionario.getApellidos());
            preparedStatement.setString(5, funcionario.getEstadoCivil());
            preparedStatement.setString(1, funcionario.getSexo());
            preparedStatement.setString(2, funcionario.getDirección());
            preparedStatement.setString(3, funcionario.getTeléfono());
            preparedStatement.setDate(4, (Date) funcionario.getFechaNacimiento());
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();
            
        }finally{
        
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    public void eliminarFuncionarios(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNC);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        }finally{
        
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
        }
    }
}
