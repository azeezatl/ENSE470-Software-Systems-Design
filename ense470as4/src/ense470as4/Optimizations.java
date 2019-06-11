package ense470as4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

import java.util.Random;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 * 
 */
public class Optimizations {
//static long tBeg, tEnd;
/*
 * Refactor 5 - Rename variable
 * for better understanding of the code
 */
static long beginTime, endTime;
static int testSize = 1000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Optimization example program\n\n");
        
        
        /*StrengthReduction test1 = new StrengthReduction();
        beginTime = System.nanoTime();
        test1.recursiveSum(testSize);
        endTime = System.nanoTime();
        System.out.println("Strength reduction\n Recursive time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test1.unreducedSum(testSize);
        endTime = System.nanoTime();
        System.out.println(" Iterative time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test1.reducedSum(testSize);
        endTime = System.nanoTime();
        System.out.println(" Direct time:" + (endTime - beginTime));
        
        SubExpressionsElimination test2 = new SubExpressionsElimination();
        beginTime = System.nanoTime();
        test2.exampleNoElimination();
        endTime = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (preassigned numbers)\n Before time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test2.exampleElimination();
        endTime = System.nanoTime();
        System.out.println(" After time:" + (endTime - beginTime));
        
        SubExpressionsElimination2 test3 = new SubExpressionsElimination2();
        // Initialize random number generator: do it in the class or here?
        // Random rd = new Random();
        beginTime = System.nanoTime();
        test3.exampleNoElimination();
        endTime = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers)\n Before time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test3.exampleElimination();
        endTime = System.nanoTime();
        System.out.println(" After time:" + (endTime - beginTime));
        
        SubExpressionsElimination3 test4 = new SubExpressionsElimination3();
        beginTime = System.nanoTime();
        test4.exampleNoElimination();
        endTime = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers in constructor)\n Before time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test4.exampleElimination();
        endTime = System.nanoTime();
        System.out.println(" After time:" + (endTime - beginTime));
        
        CodeMotion test5 = new CodeMotion();
        // Note that the default constructor is lazy and initializes only when the class is needed in this case
        beginTime = System.nanoTime();
        test5.codeInsideLoop();
        endTime = System.nanoTime();
        System.out.println("\n\nCode Motion\n Before time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test5.codeOutsideLoop();
        endTime = System.nanoTime();
        System.out.println(" After time:" + (endTime - beginTime));

        ArrayListvsLinkedList test6 = new ArrayListvsLinkedList();
        beginTime = System.nanoTime();
        test6.arrayListCreation();
        endTime = System.nanoTime();
        System.out.println("\n\nArrayLists vs LinkedLists\n ArrayList Creation:" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test6.arrayListCreation();
        endTime = System.nanoTime();
        System.out.println(" LinkedList Creation:" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test6.arrayListAccess();
        endTime = System.nanoTime();
        System.out.println(" ArrayList Access:" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test6.arrayListAccess();
        endTime = System.nanoTime();
        System.out.println(" LinkedList Access:" + (endTime - beginTime));

        StringOperations test7 = new StringOperations();
        beginTime = System.nanoTime();
        test7.usingPlus();
        endTime = System.nanoTime();
        System.out.println("\n\nString Operations\n Using + :" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test7.usingStringBuffer();
        endTime = System.nanoTime();
        System.out.println(" Using StringBuffer :" + (endTime - beginTime));*/
        
        /*
         * Refactor 6 - Extract Functions
         * this enables the main to call whichever function is needed
         */
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();

        System.out.println("\n\nTests complete, end of program");
        
    }
    
    public static void test1()
    {
    	StrengthReduction test1 = new StrengthReduction();
        beginTime = System.nanoTime();
        test1.recursiveSum(testSize);
        endTime = System.nanoTime();
        System.out.println("Strength reduction\n Recursive time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test1.unreducedSum(testSize);
        endTime = System.nanoTime();
        System.out.println(" Iterative time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test1.reducedSum(testSize);
        endTime = System.nanoTime();
        System.out.println(" Direct time:" + (endTime - beginTime));
    }
    
    public static void test2()
    {
    	SubExpressionsElimination test2 = new SubExpressionsElimination();
        beginTime = System.nanoTime();
        test2.exampleNoElimination();
        endTime = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (preassigned numbers)\n Before time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test2.exampleElimination();
        endTime = System.nanoTime();
        System.out.println(" After time:" + (endTime - beginTime));
    }
    
    public static void test3()
    {
    	 SubExpressionsElimination2 test3 = new SubExpressionsElimination2();
         // Initialize random number generator: do it in the class or here?
         // Random rd = new Random();
         beginTime = System.nanoTime();
         test3.exampleNoElimination();
         endTime = System.nanoTime();
         System.out.println("\n\nSub Expression elimination (random numbers)\n Before time:" + (endTime - beginTime));
         
         beginTime = System.nanoTime();
         test3.exampleElimination();
         endTime = System.nanoTime();
         System.out.println(" After time:" + (endTime - beginTime));
    }
    
    public static void test4()
    {
    	SubExpressionsElimination3 test4 = new SubExpressionsElimination3();
        beginTime = System.nanoTime();
        test4.exampleNoElimination();
        endTime = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers in constructor)\n Before time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test4.exampleElimination();
        endTime = System.nanoTime();
        System.out.println(" After time:" + (endTime - beginTime));
    }
    
    public static void test5()
    {
    	CodeMotion test5 = new CodeMotion();
        // Note that the default constructor is lazy and initializes only when the class is needed in this case
        beginTime = System.nanoTime();
        test5.codeInsideLoop();
        endTime = System.nanoTime();
        System.out.println("\n\nCode Motion\n Before time:" + (endTime - beginTime));
        
        beginTime = System.nanoTime();
        test5.codeOutsideLoop();
        endTime = System.nanoTime();
        System.out.println(" After time:" + (endTime - beginTime));
    }
    
    public static void test6()
    {
    	ArrayListvsLinkedList test6 = new ArrayListvsLinkedList();
        beginTime = System.nanoTime();
        test6.arrayListCreation();
        endTime = System.nanoTime();
        System.out.println("\n\nArrayLists vs LinkedLists\n ArrayList Creation:" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test6.arrayListCreation();
        endTime = System.nanoTime();
        System.out.println(" LinkedList Creation:" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test6.arrayListAccess();
        endTime = System.nanoTime();
        System.out.println(" ArrayList Access:" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test6.arrayListAccess();
        endTime = System.nanoTime();
        System.out.println(" LinkedList Access:" + (endTime - beginTime));
    }
    
    public static void test7()
    {
    	StringOperations test7 = new StringOperations();
        beginTime = System.nanoTime();
        test7.usingPlus();
        endTime = System.nanoTime();
        System.out.println("\n\nString Operations\n Using + :" + (endTime - beginTime));

        beginTime = System.nanoTime();
        test7.usingStringBuffer();
        endTime = System.nanoTime();
        System.out.println(" Using StringBuffer :" + (endTime - beginTime));
    }
}
