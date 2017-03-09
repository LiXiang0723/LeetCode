/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

/**
 *
 * @author l7xiang
 */
public class Divide {
    public int divide(int dividend, int divisor) {
        boolean negative = false;
        
        if( divisor ==0){
            throw new ArithmeticException("/ by zero");
        }
        
        if(dividend >Integer.MAX_VALUE || dividend < Integer.MIN_VALUE || divisor > Integer.MAX_VALUE || divisor <Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        

        if(dividend<0){
            negative = !(divisor<0);
        }
        
        if(divisor<0){
            negative = !(dividend<0);
        }
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        long result = 0;
        while((dividend-divisor) >=0){
            dividend -=divisor;
            result ++;
        }
        
        if(result>Integer.MAX_VALUE ||result<Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        
        return negative?(int)-result:(int)result;
    }
}
