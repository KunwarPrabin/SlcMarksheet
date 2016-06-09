/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slcmarksheet.result;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("<======SLC MARKSHEET======>");
        Scanner input = new Scanner(System.in);
        String[] subjects = {"English", "Nepali", "Science", "Health&Population", "CompulsoryMath", "OPT Math", "Computer"};
        
        Marksheet marksheet = new Marksheet(subjects, input);
        marksheet.getEntry();
        
        if(marksheet.isFail()){
            System.out.println("You are fail");
        }
        else{
            System.out.println("You Have Obtained :"+marksheet.getPercentage() +"%");
            System.out.println("Congratulation you have obatined"+":"+marksheet.getDivision());
        }
        
       
    }

}
