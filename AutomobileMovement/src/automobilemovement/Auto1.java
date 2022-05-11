/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilemovement;

import java.util.Vector;

public class Auto1 implements IObserverable{
  private String nameAutomobile;
  private Vector<Auto2> observerAutomobile;
  private Vector<Pedestrian> observerPedestrian;

  
  public Auto1(String nameAutomobile) {
    this.nameAutomobile = nameAutomobile;
    this.observerAutomobile = new Vector<Auto2>();
    this.observerPedestrian = new Vector<Pedestrian>();

  }

    @Override
    public void addObserverAutomobile(Auto2 observer1) {
        observerAutomobile.add(observer1);
    }

    @Override
    public void removeObserverAutomobile(Auto2 observer1) {
        observerAutomobile.remove(observer1);
    }

    @Override
    public void notifyObserverAutomobile(String msg, Auto2 observer1) {  
       System.out.println("TheApplication recognizes that "+nameAutomobile + " has came clost to "+ observer1.getNameAutomobile2() +" and the following results !"); 
       String constructedMessage = String.format("%s %s", nameAutomobile, msg);
       for(Auto2 Automobile2 : observerAutomobile) {
        Automobile2.receiveNotification(constructedMessage);
        }
    }

    @Override
    public void addObserverPedestrian(Pedestrian observer2) {
        observerPedestrian.add(observer2);
    }

    @Override
    public void removeObserverPedestrian(Pedestrian observer2) {
        observerPedestrian.remove(observer2);
    }

    @Override
    public void notifyObserverPedestrian(String msg, Pedestrian observer2) {
       System.out.println("TheApplication recognizes that "+nameAutomobile + " has came clost to "+ observer2.getNamePedestrian() +" and the following results !"); 
       String constructedMessage = String.format("%s %s", nameAutomobile, msg);
        for(Pedestrian pedestrians : observerPedestrian) {
            pedestrians.receiveNotification(constructedMessage);
        }   
    }
}
