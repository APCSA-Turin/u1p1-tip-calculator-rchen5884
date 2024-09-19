package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        double decPercent = (double)percent/100;
        double tip = cost * decPercent;
        double temp = tip;
        tip = Math.round(tip * 100.0) / 100.0;
        // I learned how to round from this https://stackoverflow.com/questions/8825209/rounding-decimal-points

        double bill = cost + tip;

        double perPerson = cost/people;
        perPerson = Math.round(perPerson * 100.0)/100.0;

        double tipPerson = tip/people;
        tipPerson = Math.round(tipPerson * 100.0)/100.0;

        double totPerson = cost + temp;
        totPerson = totPerson/people;
        totPerson = Math.round(totPerson * 100.0)/100.0;

                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + bill + "\n");
        result.append("Per person cost before tip: $" + perPerson + "\n");
        result.append("Tip per person: $" + tipPerson + "\n");
        result.append("Total cost per person: $" + totPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
