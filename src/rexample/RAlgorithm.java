/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rexample;

import java.util.List;
import org.rosuda.JRI.RFactor;
import org.rosuda.JRI.Rengine;

/**
 *
 * @author B590
 */
public class RAlgorithm {

    protected Rengine engine;

    public void initEngine(String argType) {
        this.engine = new Rengine(new String[]{argType}, false, null);
    }

    public void assignEngine(List<String> list, String name) {
        this.engine.assign(name, list.toArray(new String[list.size()]));
    }

    public String[] attributesNameAnalyzed(String dataset) { 
        RFactor f = this.engine.eval(new StringBuilder().append("as.data.frame(").append(dataset).append(")").toString()).asVector().at(0).asFactor();
        return f.toString().replace("{levels=(", "").replace("),ids", "###").split("###")[0].replace("\"", "").split(",");
    }

}
