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
public class KH_Totales_97 {
 
public double KH_CalcTDevengado_97(double SalDev, double PAlimentacion, double PProduccion,
        double PManutencion, double SubTransporte, double PEdad, double THEDiurnas,
        double THENocturnas,double THEDominicales ){
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el total devengado.
 // Parámetros: SalDev (Salario devengado), SubsTransp (subsidio de
 // transporte) y TotExt (Total extras) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=SalDev+PAlimentacion+PProduccion+PManutencion+SubTransporte+PEdad+THEDiurnas+
 THENocturnas+THEDominicales;
 // Retorno de valores. 
 return Tmp;
}// Fin CalcTotDev.
public double KH_CalcTDeducido_97(double Pension, double Salud, double Retefuente){
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el total deducido .
 // Parámetros: SalDev (Salario devengado), SubsTransp (subsidio de
 // transporte) y TotExt (Total extras) por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=Pension+Salud+Retefuente;
 // Retorno de valores. 
 return Tmp;
}// Fin CalcTotDev.

public double KH_CalcNeto_97(double TotDev, double TDeducidos)
{
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el neto a pagar.
 // Parámetros: TotDev (Total devengado) y SegSoc (Seguridad social)
 // por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 double Tmp=0; // Declaración de una variable local.
 // Cálculos.
 Tmp=TotDev-TDeducidos;
 // Retorno de valores.
 return Tmp;
}// Fin CalcNeto. 

public double KH_CalcTHEDiurnas_97(double VHEDiurna, double NHEDU){
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el neto a pagar.
 // Parámetros: TotDev (Total devengado) y SegSoc (Seguridad social)
 // por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    return VHEDiurna*NHEDU;
}//Fin CalcTHEDiurnas.

public double KH_CalcTHENocturnas_97(double VHENocturnas, double NHEN){
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el neto a pagar.
 // Parámetros: TotDev (Total devengado) y SegSoc (Seguridad social)
 // por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    return VHENocturnas*NHEN;
}//Fin CalcTHENocturnas.

public double KH_CalcTHEDominicales_97(double VHEDomFes, double NHED){
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el neto a pagar.
 // Parámetros: TotDev (Total devengado) y SegSoc (Seguridad social)
 // por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    return VHEDomFes*NHED;
}//Fin CalcTHEDominicales.


public double KH_CalcSalarioDev_97(int diasTrab, double valorDia){
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 // Resumen: Calcula el salario devengado.
 // Parámetros: diasTrab (Dias trabajados) y valorDia(Valor del Dia)
 // por valor.
 // Retorna: Tmp.
 // Fecha de creación: 6/10/2020
 // Autor:Katherine
 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    return diasTrab*valorDia;
}//Fin CalcTHEDominicales.
}//Fin de la clase
