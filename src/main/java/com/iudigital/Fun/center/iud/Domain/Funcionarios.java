/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iudigital.Fun.center.iud.Domain;

import java.util.Date;

/**
 *
 * @author JUANDA
 */
public class Funcionarios {
    
    private int ID;
    private String TipoIdentificación;
    private String NúmeroIdentificación;
    private String Nombres;
    private String Apellidos;
    private String EstadoCivil;
    private String Sexo;
    private String Dirección;
    private String Teléfono;
    private Date FechaNacimiento;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipoIdentificación() {
        return TipoIdentificación;
    }

    public void setTipoIdentificación(String TipoIdentificación) {
        this.TipoIdentificación = TipoIdentificación;
    }

    public String getNúmeroIdentificación() {
        return NúmeroIdentificación;
    }

    public void setNúmeroIdentificación(String NúmeroIdentificación) {
        this.NúmeroIdentificación = NúmeroIdentificación;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    
    @Override
    public String toString() {
        return Nombres + " " + Apellidos;
    }

    public String setFechaNacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
