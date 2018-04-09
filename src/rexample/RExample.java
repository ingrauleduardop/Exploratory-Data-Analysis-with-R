/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author B590
 */
public class RExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> attributes = new ArrayList();
        attributes.add("Tendencia");
        attributes.add("Sexo");
        attributes.add("Rango edad");
        attributes.add("Estado");

        List<String> cA = new ArrayList();
        cA.add("Sexo___Tendencia");
        cA.add("Sexo___RangoEdad");
        cA.add("Estado___Tendencia");
        cA.add("Color___Pais");
        cA.add("Pais___Lengua");
        
        Map<Integer, Set<String>> attributesToDataMining= new HashMap();
        RAnalysis.attributesToDataMining(0, attributesToDataMining, cA);

        List<String> nivelSocioeconomico = new ArrayList();
//        List<String> tipoResidencia = new ArrayList();
//        nivelSocioeconomico.add("Pobre");
//        nivelSocioeconomico.add("Pobre");
//        nivelSocioeconomico.add("Pobre");
//        nivelSocioeconomico.add("Pobre");
//        nivelSocioeconomico.add("Pobre");
//        nivelSocioeconomico.add("Pobre");
//        nivelSocioeconomico.add("Pobre");
//        tipoResidencia.add("Rural");
//        tipoResidencia.add("Rural");
//        tipoResidencia.add("Rural");
//        tipoResidencia.add("Rural");
//        tipoResidencia.add("Rural");
//        tipoResidencia.add("Rural");
//        tipoResidencia.add("Rural");
//
//        nivelSocioeconomico.add("Rico");
//        nivelSocioeconomico.add("Rico");
//        nivelSocioeconomico.add("Rico");
//        nivelSocioeconomico.add("Rico");
//        nivelSocioeconomico.add("Rico");
//        nivelSocioeconomico.add("Rico");
//
//        tipoResidencia.add("Urbana");
//        tipoResidencia.add("Urbana");
//        tipoResidencia.add("Urbana");
//        tipoResidencia.add("Urbana");
//        tipoResidencia.add("Urbana");
//        tipoResidencia.add("Urbana");
//
//        RBidimensionalAnalysisInterface in = RAnalysis.bidimensionalAnalysis(nivelSocioeconomico, tipoResidencia);
//
//        ROnedimensionalAnalysisInterface uni = RAnalysis.onedimensionalAnalysis(tipoResidencia);
//
//        tipoResidencia.add("Urbana");
//        tipoResidencia.add("Urbana");
    }

}
