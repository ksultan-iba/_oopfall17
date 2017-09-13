package com.company;

import java.math.MathContext;

public class Components {
    final double pi = 3.14159265;
    float radius;
    float diameter;
    double area;

    Components(){
        radius = 0;
        diameter = 0;
        area = 0;

    }
    void setRadius(float x){
        this.radius = x;
    }
    float getRadius(){
        return radius;}
    void setDiameter(float x){
        this.diameter = x;
     }
    float getDiameter(){
        return diameter;}
    void setArea(double x){
         this.area = x; }
    double getArea(){
         return area;
         }


     double areaofcircle (float x,char s){
         if ( s == 'R'){
         area = pi * radius * radius;
         }
         else if (s == 'D'){
             area =pi * (diameter/2) * (diameter/2);

         }

         return area;
     }

     void radiusofcircle( double x ){
         radius = (float) Math.sqrt(area/pi);


     }
     void diamterofcircle( double x){
         diameter = (float) Math.sqrt(area/pi) * 2;

     }


}
