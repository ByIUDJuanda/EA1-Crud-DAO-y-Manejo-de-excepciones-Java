package com.iudigital.Fun.center.iud.Controller;

import com.iudigital.Fun.center.iud.Dao.FuncionarioDao;
import com.iudigital.Fun.center.iud.Domain.Funcionarios;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JUANDA
 */
public class FuncionariosController {
    
    private FuncionarioDao funcionarioDao;
    
    public FuncionariosController(){
        funcionarioDao = new FuncionarioDao();
    }
    
    public List<Funcionarios> obtenerFuncionarios() throws SQLException{
        return funcionarioDao.obtenerFuncionarios();
    }
    
    public void crearFuncionarios(Funcionarios funcionario) throws SQLException{
        funcionarioDao.crearFuncionarios(funcionario);
    }
    
    public Funcionarios obtenerFunionariosId(int id) throws SQLException{
        return funcionarioDao.obtenerFunionariosId(id);
    }
    
    public void actualizarFuncionarios(int id, Funcionarios funcionario) throws SQLException{
        funcionarioDao.actualizarFuncionarios(id,funcionario);
    }
    
    public void eliminarFuncionarios(int id) throws SQLException{
        funcionarioDao.eliminarFuncionarios(id);
    }
}
