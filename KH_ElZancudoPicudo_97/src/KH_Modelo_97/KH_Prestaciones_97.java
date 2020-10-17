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
public class KH_Prestaciones_97 {
     // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: en esta clase se implementan los métodos para el cálculo
 // de las prestaciones sociales del trabajador.
 // Se implementan los métodos: CalcSegSoc, CalcSubsTransp.
 // Fecha de creación: 30/09/2020
 // Autor: katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
 KH_Constantes_97 ObjConstantes=new KH_Constantes_97();
 
 public double CalcPEdad(double Edad, double SBMA)
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula la prima de edad.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor: kathernie
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double PEdad=0; // Declaración de una variable local.
 // Cálculos.
 if ((Edad>=18)&&(Edad<30)){
     PEdad=SBMA*1/100;
 }
 if ((Edad>=30)&&(Edad<40)){
     PEdad=SBMA*1.5/100;
 }
  if ((Edad>=40)&&(Edad<50)){
     PEdad=SBMA*2/100;
 }
  if ((Edad>=50)&&(Edad<60)){
     PEdad=SBMA*2.5/100;
 }
   if ((Edad>=60)&&(Edad<70)){
     PEdad=SBMA*3.0/100;
 }
    if (Edad>=70){
     PEdad=0;
 }
    return PEdad;
}
public double KH_CalcPAlimentacion_97(double SBMA)
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula la prima de alimentacion.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación:30/09/2020
 // Autor: kathernie
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double PAlimentacion=0; // Declaración de una variable local.
 // Cálculos.
 if ((SBMA>=PAlimentacion)&&(SBMA<2*PAlimentacion)){
     PAlimentacion=SBMA*10.55/100;
 }
if ((SBMA>=2*PAlimentacion)&&(SBMA<4*PAlimentacion)){
     PAlimentacion=SBMA*9.86/100;
}
if ((SBMA>=4*PAlimentacion)&&(SBMA<6*PAlimentacion)){
     PAlimentacion=SBMA*4.38/100;
}
if ((SBMA>=6*PAlimentacion)&&(SBMA<8*PAlimentacion)){
     PAlimentacion=SBMA*3.15/100;
}
if (SBMA>=8*PAlimentacion){
     PAlimentacion=0;
}
return PAlimentacion;
}
public double KH_CalcPProduccion_97(String seccion, double SBMA)
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula la prima de produccion.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación:8/10/2020
 // Autor: kathernie
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double PProduccion=0; // Declaración de una variable local.
 // Cálculos.
 if (seccion.equals("Produccion"))
     PProduccion=3.25*SBMA/100;
return PProduccion;
}

public double KH_CalcPManutencion_97(int NHijos, double SBMA)
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula la prima de manutención.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: PManutencion
 // Fecha de creación:8/10/2020
 // Autor: kathernie
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double PManutencion=0; // Declaración de una variable local.
 // Cálculos.
 PManutencion=NHijos*2.5*SBMA/100;
 return PManutencion;
}

public double KH_CalcSubTransporte_97(double SBMA){
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el subsidio de transporte.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: subsidio
 // Fecha de creación:8/10/2020
 // Autor: kathernie
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    double subsidio = 0;
    if (SBMA>=(2*KH_Constantes_97.SMLV)) 
        subsidio=SBMA*10.5/100;
    return subsidio;
}

}
