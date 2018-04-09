/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author B590
 */
public class RAnalysis {

    public static ROnedimensionalAnalysisInterface onedimensionalAnalysis(List<String> string) {
        return new OnedimensionalAnalysis(string);
    }

    public static RBidimensionalAnalysisInterface bidimensionalAnalysis(List<String> stringA, List<String> stringB) {
        return new BidimensionalAnalysis(stringA, stringB);
    }

    public static void attributesToDataMining(int cont, Map<Integer, Set<String>> attributesToDataMining, List<String> approvedAttributesBidimensional) {
        String com = approvedAttributesBidimensional.get(0);
        attributesToDataMining.put(cont, new HashSet());
        attributesToDataMining.get(cont).add(com.split("___")[0]);
        attributesToDataMining.get(cont).add(com.split("___")[1]);
        List<String> attributesToProcced= new ArrayList();
        for (int i = 1; i< approvedAttributesBidimensional.size(); i++) {
            String value = approvedAttributesBidimensional.get(i);
            boolean add= true;
            if (attributesToDataMining.get(cont).contains(value.split("___")[0])) {
                add=false;
                attributesToDataMining.get(cont).add(value.split("___")[1]);
            }
            if (attributesToDataMining.get(cont).contains(value.split("___")[1])) {
                add=false;
                attributesToDataMining.get(cont).add(value.split("___")[0]);
            }
            if(add){
                attributesToProcced.add(value);
            }
        }
        if (attributesToProcced.size() > 0) {
            attributesToDataMining(cont + 1, attributesToDataMining, attributesToProcced);
        }
    }
}
