/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KH_Modelo_97;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author katherinne
 */
public class KH_Informacion_97 { 
    public LocalDate Hoy(){
        return LocalDate.now();
    }
    
    public int DiasVividos(LocalDate FNacimiento){
    //DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
    return (int) ChronoUnit.DAYS.between(FNacimiento, Hoy());
    }
    
    public double MesesVividos (int DiasVividos){
    
        return (DiasVividos/30.4375);
       
    }
    
    public double Edad (int DiasVividos){
    return (DiasVividos/365.25);
    }
}
