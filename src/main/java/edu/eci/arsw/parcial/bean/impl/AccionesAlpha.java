/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.bean.impl;

import edu.eci.arsw.parcial.Model.HttpConnection;
import edu.eci.arsw.parcial.bean.Acciones;
import java.io.IOException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonathan Prieto
 */
@Service("Alpha")
public class AccionesAlpha implements Acciones {

    @Override
    public String obtenerAcciones(String rango, String nameAccion) throws IOException {
        return HttpConnection.getUrlData("https://www.alphavantage.co/query?function=" + rango + "&symbol=" + nameAccion + "&interval=5min&apikey=Q1QZFVJQ21K7C6XM");
    }

}
