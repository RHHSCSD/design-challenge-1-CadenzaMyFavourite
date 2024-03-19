/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program: Tech Fair Cost Calculator
*  Author: Jackie Zou
*  Date: 2024-03-18
*  Description: this is a program which help teacher find the fair cost for each students;user need to
*               input the total students number and the number of students for each project.they will see the 
*               questions when program run.
****************************************************/

/**************** IPO CHART ************************
*INPUT:the total number of students and the # of students for each projects.
*
*
*PROCESSING:find the discount work or not
* 1. total #students met the total discount or not(fix cost) and fins the total fix cost by(# of students)*price*discount
* 2. for each projects do the # of students met the discount
* 3. find each projects fee based on (discount or no-discount price)*#of students for each projects
* 4. combine all those fee to find the total fee and find the final by (final cost)+(discount*fix cost)
* 5. find the cost for each students by (total cost)/# of students
*
*
*
*OUTPUT:
* the cost for each students.
*
*
***************************************************/

  
/**************** TEST CASES ************************
*Test      Input          Desired Output
*1)      30 5 10 15         66.67
*2)      20 16 2 2           60.7
*3)      25 2 21 2           62.48  
*4)      10 0 0 0             50   
*5)      200 0 0 0          47.5 
*
*
//***************************************************/
/* (Start) --> /Input/Output: totalStudents, arduinoStudents, vrStudents, raspberryPiStudents/
               |
               V
     [Process: Calculate totalFixedCost]
               |
               V
    <Decision: Check Discount>
   /                  \
  /Yes                 No
 /                        \
V                             V
[Process: Apply Discount]-->[Process: Calculate arduinoCost]--> <Decision: Check Discount>
                                                                   /          \
                                                                  /Yes         \No
                                                [Process: Apply Discount]-->[Process: Calculate raspberryPiCost]--> <Decision: Check Discount>
                                                                                                                           /          \
                                                                                                                          /Yes         \No
                                                                                                       [Process: Apply Discount] --> [Process: Calculate vrCost]
                                                                                                                                                V            
                                                                                                                                     [Process: Calculate totalCost]  -->  [Process: Calculate eachStudentCost]
                                                                                                                                                                                          |                         
                                                                                                                                                                                           V                       
                                                                                                                                                                            /Output: eachStudentCost/
                                                                                                                                                                                               |
                                                                                                                                                                                               V
                                                                                                                                                                                           (Start/Stop)
*/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
   // CONSTANTS
/*DEFINE BASIC_KIT_COST AS 50.00
DEFINE ARDUINO_COST_UP_TO_15 AS 10.00
DEFINE ARDUINO_COST_ABOVE_15 AS 9.00
DEFINE RASPBERRY_PI_COST_UP_TO_20 AS 15.00
DEFINE RASPBERRY_PI_COST_ABOVE_20 AS 12.00
DEFINE VR_PROJECT_COST AS 20.00
DEFINE DISCOUNT_THRESHOLD AS 100
DEFINE DISCOUNT_PERCENTAGE AS 0.05

// VARIABLES
totalStudents, arduinoStudents, vrStudents, raspberryPiStudents, totalFixedCost, totalCost, vrCost, arduinoCost, raspberryPiCost, eachStudentCost

// INPUT
PRINT "Enter the total number of students: "
GET totalStudents
PRINT "Enter the number of Arduino students: "
GET arduinoStudents
PRINT "Enter the number of VR students: "
GET vrStudents
PRINT "Enter the number of Raspberry PI students: "
GET raspberryPiStudents

// PROCESSING
totalFixedCost = BASIC_KIT_COST * totalStudents

IF totalStudents > DISCOUNT_THRESHOLD THEN
    totalFixedCost = totalFixedCost * (1 - DISCOUNT_PERCENTAGE)
ENDIF

IF arduinoStudents > 15 THEN
    arduinoCost = arduinoStudents * ARDUINO_COST_ABOVE_15
ELSE
    arduinoCost = arduinoStudents * ARDUINO_COST_UP_TO_15
ENDIF

IF raspberryPiStudents > 20 THEN
    raspberryPiCost = raspberryPiStudents * RASPBERRY_PI_COST_ABOVE_20
ELSE
    raspberryPiCost = raspberryPiStudents * RASPBERRY_PI_COST_UP_TO_20
ENDIF

vrCost = vrStudents * VR_PROJECT_COST

totalCost = totalFixedCost + vrCost + arduinoCost + raspberryPiCost
eachStudentCost = totalCost / totalStudents

// OUTPUT
PRINT "Price per student is $" + eachStudentCost    */

    
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
    Scanner sc = new Scanner(System.in);// define scanner 
    
    System.out.print("Enter the total number of students: ");//out put the question
    totalStudents = sc.nextInt();//get the answer 
    System.out.print("Enter the number of Arduino students: " );    //out put the question 
    arduinoStudens = sc.nextInt();// get the answer 
    System.out.print("Enter the number of Raspberry PI students: " );// out put the questions 
    raspberryPiStudens = sc.nextInt(); // get the answer 
    System.out.print("Enter the number of VR students: ");//ou put the question 
    vrStudens = sc.nextInt();// get the answer 
    

    // Step 3: Calculate the total cost
    totalFixedCost = BASIC_KIT_COST * totalStudents;

    if (totalStudents > DISCOUNT_THRESHOLD) { // if # reach the limit 
        totalFixedCost *= (1 - DISCOUNT_PERCENTAGE); // go discount 
    } 
    
    
    // step 4: calculate the additional cost
    // all same logic that if reach the # go discount else not
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
    vrCost = vrStudens*VR_PROJECT_COST;// vr don't have discount 
    
    totalCost = totalFixedCost + vrCost + arduinoCost + raspberryPiCost;// find the total cost 
    eachStudentCost = Math.round(totalCost/(double)totalStudents*100)/100.00; // find cosrt for each 
    
    
    
    System.out.println("price per student is $"+eachStudentCost);// out put the answer 
    
    
    
    
    }
    
}
