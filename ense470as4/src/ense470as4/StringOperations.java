package ense470as4;

/*                                                                              
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates                       
 * and open the template in the editor.                                         
 */
//package optimizations;     

/**                                                                             
 *                                                                              
 * @author luigibenedicenti                                                     
 *                                                                              
 * @modified kcyow March 14th 2019                                              
 *                                                                              
*/

public class StringOperations {

    static final int N = 10000;
    private String s1;
    private String s2;

    public void usingPlus() {
    	//private String s1 = "";
        s1 = "";
        for (int i = 1; i <= N; i++) {
            //s1 = s1 + "*";
        	/* 
        	 * Refactor 3 - notation change of the operation
             */
        	s1 += "*";
        }
    }

    public void usingStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= N; i++) {
            sb.append("*");
        }
      //private String s2 = sb.toString();;
        s2 = sb.toString();
    }
    
}