/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slcmarksheet.result;

import java.util.Scanner;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author OWNER
 */
public class Marksheet {

    int fullMarks = 100;
    int passMarks = 32;
    double obtainedTotal = 0;
    double[] marks;
    String[] subjects;
    Scanner input;

    public Marksheet(String[] subjects, Scanner input) {
        marks = new double[subjects.length];
        this.subjects = subjects;
        this.input = input;
    }

    public void getEntry() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for " + subjects[i] + ":");
            marks[i] = input.nextInt();
            obtainedTotal += marks[i];
        }
    }

    public boolean isFail() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < passMarks) {
                return true;
            }
        }
        return false;

    }

    public double getPercentage() {
        return (obtainedTotal / (fullMarks * subjects.length)) * 100;

    }
    
    public String getDivision(){
        double per = getPercentage();
        if(per>=80){
            return "Distinction";
        }
        else if(per>=60 && per<80){
            return "First Division";
        }
        else if(per>=45 && per<60){
            return "Second Division";
        }
        else if(per>=32 && per<45){
            return "Third Division";
        }
        else{
            return "Sorry you have failed";
        }
    }

}
