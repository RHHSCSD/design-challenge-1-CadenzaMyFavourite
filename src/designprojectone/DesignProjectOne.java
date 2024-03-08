/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program:
*  Author:
*  Date: 
*  Description:
****************************************************/

/**************** IPO CHART ************************
*INPUT:
*
*
*PROCESSING:
*
*
*
*OUTPUT:
*
*
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Ouput
*
*
*
*
*
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS
    final double BASIC_KIT_COST = 50.00;
    final double ARDUINO_COST_UP_TO_15 = 10.00;
    final double ARDUINO_COST_ABOVE_15 = 9.00;
    final double RASPBERRY_PI_COST_UP_TO_20 = 15.00;
    final double RASPBERRY_PI_COST_ABOVE_20 = 12.00;
    final double VR_PROJECT_COST = 20.00;
    final int DISCOUNT_THRESHOLD = 100;
    final double DISCOUNT_PERCENTAGE = 0.05;


  //VARIABLES
    int totalStudents,arduinoStudens,vrStudens,raspberryPiStudens;
    
    double totalFixedCost,totalCost,vrCost,arduinoCost,raspberryPiCost,eachStudentCost;
       

  //CODE
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the total number of students: ");
    totalStudents = sc.nextInt();
    System.out.print("Enter the number of Arduino students: " );    
    arduinoStudens = sc.nextInt();
    System.out.println("Enter the number of VR students: ");
    vrStudens = sc.nextInt();
    System.out.print("Enter the number of Raspberry PI students: " );
    raspberryPiStudens = sc.nextInt();

    // Step 3: Calculate the total cost
    totalFixedCost = BASIC_KIT_COST * totalStudents;

    if (totalStudents > DISCOUNT_THRESHOLD) {
        totalFixedCost *= (1 - DISCOUNT_PERCENTAGE);
    }
    
    
    // step 4: calculate the additional cost
    if (arduinoStudens > 15){
        arduinoCost = arduinoStudens*ARDUINO_COST_ABOVE_15;
        
    }else{
        arduinoCost = arduinoStudens*ARDUINO_COST_UP_TO_15;
        
    }
    if (raspberryPiStudens > 20){
        raspberryPiCost = raspberryPiStudens*RASPBERRY_PI_COST_ABOVE_20;
        
    }else{
        raspberryPiCost = raspberryPiStudens*RASPBERRY_PI_COST_UP_TO_20;
        
    }
    vrCost = vrStudens*VR_PROJECT_COST;
    
    totalCost = totalFixedCost + vrCost + arduinoCost + raspberryPiCost;
    eachStudentCost = totalCost/(double)totalStudents;
    
    System.out.println("price per student is $"+eachStudentCost);
    
    
    
    
    }
    
}
