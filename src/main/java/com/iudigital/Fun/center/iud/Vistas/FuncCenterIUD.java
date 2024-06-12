package com.iudigital.Fun.center.iud.Vistas;

import com.iudigital.Fun.center.iud.Controller.FuncionariosController;
import com.iudigital.Fun.center.iud.Domain.Funcionarios;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JUANDA
 */
public class FuncCenterIUD {
    
    public static void obtenerFuncionarios(FuncionariosController funcionariosController){
        try {
            List<Funcionarios> funcionarios = funcionariosController.obtenerFuncionarios();
            if (funcionarios.isEmpty()){
                System.out.println("No hay Funcionario");
            }else{
                funcionarios.forEach(funcionario1 -> {
                    System.out.println("ID: " + funcionario1.getID());
                    System.out.println("TipoIdentificación: " + funcionario1.getTipoIdentificación());
                    System.out.println("NúmeroIdentificación: " + funcionario1.getNúmeroIdentificación());
                    System.out.println("Nombres: " + funcionario1.getNombres());
                    System.out.println("Apellidos: " + funcionario1.getApellidos());
                    System.out.println("EstadoCivil: " + funcionario1.getEstadoCivil());
                    System.out.println("Sexo: " + funcionario1.getSexo());
                    System.out.println("Dirección: " + funcionario1.getDirección());
                    System.out.println("Teléfono: " + funcionario1.getTeléfono());
                    System.out.println("FechaNacimiento: " + funcionario1.getFechaNacimiento());
                    System.out.println("-----------------------------------------------");
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here    
        FuncionariosController funcionariosController = new FuncionariosController();
        obtenerFuncionarios(funcionariosController);
        
    }    
}
