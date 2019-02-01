/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1;

/**
 *
 * @author andre
 */
public class CidadaoGalaxia {
    private String nomeCidadao;
    private String planetaCidadao;
    private int    idadeCidadao;
    private int    forcaCidadao;

    public CidadaoGalaxia(String nomeCidadao, String planetaCidadao, int idadeCidadao, int forcaCidadao) {
        this.nomeCidadao = nomeCidadao;
        this.planetaCidadao = planetaCidadao;
        this.idadeCidadao = idadeCidadao;
        this.forcaCidadao = forcaCidadao;
    }

    
    
    public String getNomeCidadao() {
        return nomeCidadao;
    }

    public String getPlanetaCidadao() {
        return planetaCidadao;
    }

    public int getIdadeCidadao() {
        return idadeCidadao;
    }

    public int getForcaCidadao() {
        return forcaCidadao;
    }
    
    
    
}
