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
public class BidimensionalAnalysis extends RAlgorithm implements RBidimensionalAnalysisInterface{

    private final double pvalue;
    private final double xsquared;

    public BidimensionalAnalysis(List<String> factorA, List<String> factorB) {
        super.initEngine("--no-save");
        super.assignEngine(factorA, "x");
        super.assignEngine(factorB, "y");
        super.engine.eval("result<-chisq.test(table(x,y))");
        this.pvalue = this.engine.eval("result$p.value").asDouble();
        this.xsquared = this.engine.eval("result$statistic").asDouble();
    }

    @Override
    public double getPvalue() {
        return this.pvalue;
    }

    @Override
    public double getXSquared() {
        return this.xsquared;
    } 

    @Override
    public boolean isCorrelated() {
        return this.pvalue <= 0.05;
    }

}
