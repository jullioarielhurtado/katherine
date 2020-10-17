/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KH_Modelo_97;

/**
 *
 * @author katherinne
 */
public class KH_Valores_97 {
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: en esta clase se implementan los métodos para el cálculo
 // de valores de la nómina.
 // Se implementan los métodos: CalcVrDia, CalcVrExtra y
 // CalcSalDev.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
 public double KH_CalcVDia_97(double SBMA) 
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el valor del día.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=SBMA/30;
 // Retorno de valores.
 return Tmp;
}// Fin CalcVrDia.
 
    public double KH_CalcVHora_97(double VDia) 
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el valor de la horas trabajadas.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=VDia/8;
 // Retorno de valores.
 return Tmp;
}// Fin CalcVrDia.
    
    public double KH_CalcHEDiurna_97(double VHora) 
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el valor de la hora extra diurna.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=VHora+(VHora*50/100);
 // Retorno de valores.
 return Tmp;
}// Fin CalcVrDia.
    
    public double KH_CalcHENocturna_97(double VHora) 
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el valor de la hora extra nocturna.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=VHora+(VHora*75/100);
 // Retorno de valores.
 return Tmp;
}// Fin CalcVrDia.
    
     public double KH_CalcHEDomFes_97(double VHora) 
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el valor de la hora extra nocturna.
 // Parámetros: SBMA (Salario Básico Mensual Asignado) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=VHora+(VHora*95/100);
 // Retorno de valores.
 return Tmp;
}// Fin CalcVrDia.
}
