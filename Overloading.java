/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author lydia
 */
public class Overloading {
    
    public static void main(String [] args){
        int[] i_grades = {89, 95, 80, 96};
        double[] d_grades = {89.0, 95.0, 80.0, 96.0};
        System.out.println("The average in integer is: " + average(i_grades));
        System.out.println("The average in double is: " + average(d_grades));
    }
    
    public static int average(int [] grades){
        int length = grades.length;
        int sum = 0;
        for(int grade : grades ){
            sum += grade;
        }
        return (sum / length);
    }
    public static double average(double[] grades){
        int length = grades.length;
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return (sum / length);
    }
    
}
