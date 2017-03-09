/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author l7xiang
 */
public class GenerateParentheses {
  
    public List<String> generateParenthesis(int n) {
        ArrayList<String> m=new ArrayList<>();
        generate(m, "", n, n);
        return m;
    }
    private void generate(ArrayList m, String s, int l, int r){
        if(l==0 && r==0){ 
            m.add(s);
            return;
        }
        if(l>0) generate(m, s+"(",  l-1,  r);
        if(r>l) generate(m, s+")",  l,  r-1);
    }
}
