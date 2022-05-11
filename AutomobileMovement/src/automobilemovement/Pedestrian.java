/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilemovement;

public class Pedestrian implements IObserver{

    private final String namePedestrians;

    public Pedestrian(String namePedestrians) {
        this.namePedestrians = namePedestrians;
    }
      
    @Override
    public void receiveNotification(String msg) {
        System.out.println(msg);
        System.out.println(namePedestrians+" Stops");   
      }
    public void recognizePedestrian(Auto1 Automobile1) {
       Automobile1.addObserverPedestrian(this);
    }

    public void unrecognizePedestrian(Auto1 Automobile1) {
       Automobile1.removeObserverPedestrian(this);
    }

    public String getNamePedestrian() {
        return namePedestrians;
    } 
}
