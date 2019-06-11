package ense470as4;

/*                                                                              
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates                       
 * and open the template in the editor.                                         
 */
//package optimizations;                                                        

import java.util.ArrayList;
import java.util.LinkedList;

/**                                                                             
 *                                                                              
 * @author luigibenedicenti                                                     
 *                                                                              
 * @modified kcyow March 14th 2019                                              
 *                                                                              
*/
public class ArrayListvsLinkedList {
	private ArrayList<Integer> al = new ArrayList<Integer>();
    private LinkedList<Integer> ll = new LinkedList<Integer>();
    private static final int N = 100000; // 1000000  
    /* Refactor 4 - Duplicated Code
	 * Object o is now declared outside the classes
	 */
    Object o;

    public void arrayListCreation() {
        for (int i = 1; i <= N; i++) {
            al.add(0, new Integer(i));
        }
    }

    public void linkedListCreation() {
        for (int i = 1; i <= N; i++) {
            ll.add(0, new Integer(i));
        }
    }

    public void arrayListAccess() {
        //Object o;
        for (int i = 0; i < N; i++) {
        	o = al.get(i);
        }
    }

    public void linkedListAccess() {
        //Object o;
        for (int i = 0; i < N; i++) {
            o = ll.get(i);
        }
    }
    
}

