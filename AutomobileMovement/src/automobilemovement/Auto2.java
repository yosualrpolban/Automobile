/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilemovement;

public class Auto2 implements IObserver{

  private final String nameAutomobile2;

  public Auto2(String nameAutomobile2) {
    this.nameAutomobile2 = nameAutomobile2;
  }
  
  @Override
  public void receiveNotification(String msg) {
    System.out.println(msg);
    System.out.println(nameAutomobile2+" Slows down 25%");
  }
  
  public void recognizeAutomobile(Auto1 Automobile1) {
      Automobile1.addObserverAutomobile(this);
  }

  public void unrecognizeAutomobile(Auto1 Automobile1) {
     Automobile1.removeObserverAutomobile(this);
  }

  public String getNameAutomobile2() {
    return nameAutomobile2;
  }
    
    
 
}
