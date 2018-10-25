/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.service;

import java.io.IOException;

/**
 *
 * @author Jonathan Prieto
 */
public interface ClimaServicios {

    /**
     *
     * @param city the value of city
     * @return
     * @throws IOException
     */
    public String obtenerClimaCiudad(String city) throws IOException;
}
