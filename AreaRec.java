/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class Rectangle {
    private double length = 1, width = 1;
    public double area(){
        return length*width;}
    
    public void set(double i, double j){
        if (0.0 <i && j<20.0){
            length = i;
            width = j;}}
    
    public double getLength(){
        return length;}
    
    public double getWidth(){
        return width;}
}

public class AreaRec {
    public static void main(String args[]){
        Rectangle obj = new Rectangle();
        
        obj.set(11, 10);
        System.out.println(obj.area());
        System.out.println("Length = "+obj.getLength()+" Width = "+obj.getWidth());}}
