package com.example.luhn;

import org.springframework.stereotype.Service;

@Service
public class Luhn {


    public static Integer CalculateControl(Integer incomplete) {
        String number=Integer.toString(incomplete);
        Integer sum=0;
        int multiplier=2;
        int controlDigit=0;

        for (int i=number.length()-1;i>=0;i--)
        {
            if(Character.getNumericValue(number.charAt(i))*multiplier<10)
                sum+=Character.getNumericValue(number.charAt(i))*multiplier;
            else
                sum+=(1+(Character.getNumericValue(number.charAt(i))*multiplier)%10);

            if(multiplier==2)
                multiplier=1;
            else multiplier=2;
        }


        if(sum%10!=0)
            controlDigit=10-sum%10;


        String wholeNumber=number+Integer.toString(controlDigit);


        return Integer.parseInt(wholeNumber);
    }


    public static boolean CheckNumber(Integer complete) {

        String number=Integer.toString(complete);
        Integer sum=0;
        int multiplier=1;


        for (int i=number.length()-1;i>=0;i--)
        {
            if(Character.getNumericValue(number.charAt(i))*multiplier<10)
                sum+=Character.getNumericValue(number.charAt(i))*multiplier;
            else
                sum+=(1+(Character.getNumericValue(number.charAt(i))*multiplier)%10);

            if(multiplier==2)
                multiplier=1;
            else multiplier=2;
        }


        if(sum%10==0)
            return true;
        else return false;

    }
}

