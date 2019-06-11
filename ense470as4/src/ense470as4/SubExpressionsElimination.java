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
public class SubExpressionsElimination {

	/* 
	 * Refactor 1 - Duplicated Code
	 * extracted variables so there is no need for the repetition in both functions
	 * "exampleNoElimination()" & "exampleElimination()"
	 * 
	 * Refactor 2 - Encapsulation
	 * changed variables so it's private
	 */
	private double d = 1.112;
	private double lim = 2.234;
	private double max = 3.3342;
	private double sx = 4.4554;
	private double sy = 3.224;
	private double x;
	private double y;
	
    public void exampleNoElimination() {
        /*double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;*/
        x = d * (lim / max) * sx;
        y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        /*double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;*/
        double se = d * (lim / max);
        x = se * sx;
        y = se * sy;
    }

}
