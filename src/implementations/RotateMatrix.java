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
public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        
        if(size == 0){
            return;
        }
        
        if(size == 1){
            return; 
        }
        
        //transpose matrix
        for(int i =0 ; i<size;i++){
           for(int j= 0 ;j<i;j++){
               int tmp = matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=tmp;
           }
       }
        
        //swap colums vertically for clockwise rotation
        //swap rows for counter-clockwise rotation
        for(int row = 0;row<size;row++){
            for(int col=0;col<size/2;col++){
                int targetCol = size-1-col;
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[row][targetCol];
                matrix[row][targetCol]=tmp;
            }
        }
    }
}
