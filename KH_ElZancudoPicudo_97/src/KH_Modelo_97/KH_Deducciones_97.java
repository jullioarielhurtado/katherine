/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KH_Modelo_97;

import KH_Control_97.KH_Constantes_97;

/**
 *
 * @author katherinne
 */
public class KH_Deducciones_97 {
    public double KH_CalcRetefuente_97( double SBMA)
    {
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         // Resumen: Calcula el valor de la retefuente.
         // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
         // Retorna: retefuente
         // Fecha de creación:8/10/2020
         // Autor: kathernie
         // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

         double Retefuente=0; // Declaración de una variable local.
         // Cálculos.
         if ((SBMA>=10*KH_Constantes_97.SMLV)&& (SBMA<12*KH_Constantes_97.SMLV))
             Retefuente=SBMA*10.8/100;
         if  ((SBMA>=12*KH_Constantes_97.SMLV)&& (SBMA<14*KH_Constantes_97.SMLV))
             Retefuente=SBMA*10.8/100;
         if ((SBMA>=14*KH_Constantes_97.SMLV)&& (SBMA<16*KH_Constantes_97.SMLV))
             Retefuente=SBMA*10.8/100;
         if ((SBMA>=16*KH_Constantes_97.SMLV)&& (SBMA<18*KH_Constantes_97.SMLV))
             Retefuente=SBMA*10.8/100;
         if ((SBMA>=18*KH_Constantes_97.SMLV)&& (SBMA<20*KH_Constantes_97.SMLV))
             Retefuente=SBMA*16.5/100;
         if (SBMA>=20*KH_Constantes_97.SMLV)
             Retefuente=SBMA*17.95/100;
        return Retefuente;
    }
    
    public double KH_CalcPension_97(double SBMA)
    {
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         // Resumen: Calcula el valor de la retefuente.
         // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
         // Retorna: pension
         // Fecha de creación:8/10/2020
         // Autor: kathernie
         // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

         double pension=0; // Declaración de una variable local.
         // Cálculos.
         if ((SBMA>=1*KH_Constantes_97.SMLV)&& (SBMA<2*KH_Constantes_97.SMLV))
             pension=SBMA*2.58/100;
         if  ((SBMA>=2*KH_Constantes_97.SMLV)&& (SBMA<4*KH_Constantes_97.SMLV))
             pension=SBMA*3.58/100;
         if ((SBMA>=4*KH_Constantes_97.SMLV)&& (SBMA<6*KH_Constantes_97.SMLV))
             pension=SBMA*4.58/100;
         if ((SBMA>=6*KH_Constantes_97.SMLV)&& (SBMA<8*KH_Constantes_97.SMLV))
             pension=SBMA*5.58/100;
         if ((SBMA>=8*KH_Constantes_97.SMLV)&& (SBMA<10*KH_Constantes_97.SMLV))
             pension=SBMA*6.58/100;
         if ((SBMA>=10*KH_Constantes_97.SMLV)&& (SBMA<12*KH_Constantes_97.SMLV))
             pension=SBMA*7.58/100;
        return pension;
    }
    
    
     public double KH_CalcSalud_97(double SBMA)
    {
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         // Resumen: Calcula el valor de salud.
         // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
         // Retorna: salud
         // Fecha de creación:8/10/2020
         // Autor: kathernie
         // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

         double salud=0; // Declaración de una variable local.
         // Cálculos.
         if ((SBMA>=1*KH_Constantes_97.SMLV)&& (SBMA<2*KH_Constantes_97.SMLV))
             salud=SBMA*1.55/100;
         if  ((SBMA>=2*KH_Constantes_97.SMLV)&& (SBMA<4*KH_Constantes_97.SMLV))
             salud=SBMA*2.86/100;
         if ((SBMA>=4*KH_Constantes_97.SMLV)&& (SBMA<6*KH_Constantes_97.SMLV))
             salud=SBMA*3.15/100;
         if ((SBMA>=6*KH_Constantes_97.SMLV)&& (SBMA<8*KH_Constantes_97.SMLV))
             salud=SBMA*4.38/100;
         if ((SBMA>=8*KH_Constantes_97.SMLV)&& (SBMA<10*KH_Constantes_97.SMLV))
             salud=SBMA*5.125/100;
         if (SBMA>=10*KH_Constantes_97.SMLV)
             salud=SBMA*7.58/100;
        return salud;
    }
    
    
    
   
}
