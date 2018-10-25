/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.eci.arsw.parcial.bean.Clima;

/**
 *
 * @author Jonathan Prieto
 */
@Service
public class ClimaServicesImpl implements ClimaServicios {

    @Autowired
    @Qualifier("OpenWeather")
    Clima clima;

    /**
     *
     * @param city the value of city
     * @throws IOException
     */
    @Override
    public String obtenerClimaCiudad(String city) throws IOException {
        return clima.obtenerAcciones(city);
    }
}
