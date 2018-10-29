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
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){
        this.myBoardLength = 0;
        setBrand("Ally Skate");
        setModel("Rocket");
        setBoardLength(54.5);

        System.out.println("\nSkateboard");
        System.out.println("Brand  : " + getBrand());
        System.out.println("Model  : " + getModel());
        System.out.println("Panjangnya Board: " + getBoardLength());
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double BoardLength) {
        this.myBoardLength = BoardLength;
    }
        
    
}
