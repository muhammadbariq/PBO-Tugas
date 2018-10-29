/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan57.vehicle;

/**
 *
 * @author
 */
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle() {
        this.myGearCount = 0;
        setBrand("Trek Bike");
        setModel("7.4FX");
        setGearCount(23);

        System.out.println("Bicycle");
        System.out.println("Brand  : " + getBrand());
        System.out.println("Model  : " + getModel());
        System.out.println("Jumlah Gear : " + getGearCount());
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int GearCount) {
        this.myGearCount = GearCount;
    }
    
    
}
