package com.bmi_nishashahi;

public class BMI_NishaShahi {

    private double height,weight,bmi;

    public BMI_NishaShahi(double height, double weight){
        this.height=height;
        this.weight=weight;
    }
    public double calculate(){
        bmi= weight/ (height/100*height/100);
        bmi=Math.round(bmi*100)/100.0D;
        return bmi;
    }
    public String Category(){
        if(bmi<18.5){
            return "underweight";
        }
        else if (bmi>18.5 && bmi<24.9){
            return "normal weight";
        }

        else if(bmi>25 && bmi<29.9){
            return "overweight";
        }
        else {
            return "obesity";
        }
    }
}
