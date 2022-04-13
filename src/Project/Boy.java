/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author hp
 */
public class Boy extends IdealOld {
   
    public void hasilinfob(){
        if (getTotal() < 18.0) {
            this.info = "Anda kurus";
        }else if (getTotal() < 25.0){
            this.info = "Anda Ideal";
        }else if (getTotal() < 27.0){
            this.info = "Anda Overweight";
        }else if (getTotal() > 30.0){
            this.info = "Anda Obesitas";
        }
}
}

