/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilemovement;

public interface IObserverable {
    public void addObserverAutomobile(Auto2 observer1);
    public void removeObserverAutomobile(Auto2 observer1);
    public void notifyObserverAutomobile(String msg, Auto2 observer1);
    
    public void addObserverPedestrian(Pedestrian observer2);
    public void removeObserverPedestrian(Pedestrian observer2);
    public void notifyObserverPedestrian(String msg, Pedestrian observer2);
}
