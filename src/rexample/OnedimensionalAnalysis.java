/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rexample;

import java.util.List;

/**
 *
 * @author B590
 */
public class OnedimensionalAnalysis extends RAlgorithm implements ROnedimensionalAnalysisInterface {

    private final double[] frecuencies;
    private final String[] attributeValues;

    public OnedimensionalAnalysis(List<String> list) {
        super.initEngine("--no-save");
        super.assignEngine(list, "list");
        frecuencies = super.engine.eval("table(list)").asDoubleArray();
        attributeValues = super.attributesNameAnalyzed("list");
    }

    @Override
    public double[] getFrecuencies() {
        return frecuencies;
    }

    @Override
    public String[] getAttributeValues() {
        return attributeValues;
    }

}
