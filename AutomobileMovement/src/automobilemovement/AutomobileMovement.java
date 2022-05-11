/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilemovement;

public class AutomobileMovement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto1 automobile1 = new  Auto1("Auto 17");
        Auto2 automobile2 = new Auto2("Auto 22");
        Pedestrian pedestrian = new Pedestrian("Pedestrian 3");

        
        //Cases Recognize Automobile
        automobile1.addObserverAutomobile(automobile2);
        automobile1.notifyObserverAutomobile("slows down 25%", automobile2);
        
        //Cases Recognize Predestrians
        automobile1.addObserverPedestrian(pedestrian);
        automobile1.notifyObserverPedestrian("slows down 50%", pedestrian);
        
    }
    
}
