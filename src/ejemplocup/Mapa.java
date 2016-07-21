/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocup;
import java.util.*;

/**
 *
 * @author pc91
 */
public class Mapa {
    
    HashMap m1 = new HashMap();

    public Mapa() {
    }

    public Mapa(HashMap m1) {
        this.m1 = m1;
    }

    public Object getM1(Object key) {
        return m1.get(key);
    }

    public void setM1(Object key, Object value) {
        this.m1.put(key, value);
    }

    
    
}
