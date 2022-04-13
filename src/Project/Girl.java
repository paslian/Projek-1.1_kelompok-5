/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author hp
 */
public class Girl extends IdealOld{
 
   public void hasilinfog(){
        if (getTotal() < 17.0) {
            this.info = "Kamu Kurus";
        }else if (getTotal() < 22.0){
            this.info = "Kamu Ideal";
        }else if (getTotal() < 27.9){
            this.info = "Kamu Overweight";
        }else if (getTotal() > 30.0){
            this.info = "Kamu Obesitas";
        }
}
}
