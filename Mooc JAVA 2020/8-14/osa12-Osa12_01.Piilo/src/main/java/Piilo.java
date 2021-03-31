/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Piilo <T>{
    T t;
    public Piilo() {
    }
    
    public void laitaPiiloon(T piilotettava) {
        this.t=piilotettava;
    }
    public T otaPiilosta() {
        T p = this.t;
        this.t=null;
        return p;
    }
    public boolean onkoPiilossa(){
        if(this.t==null) {
            return false;
        } else {
            return true;
        }
    }
}
