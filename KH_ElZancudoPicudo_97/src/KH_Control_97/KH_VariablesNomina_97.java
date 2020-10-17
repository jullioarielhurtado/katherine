 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KH_Control_97;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author katherinne
 */
public class KH_VariablesNomina_97 {
     private String Nombres;//Nombres del trabajador.
     private String Mensaje;//Mensaje de la nómina.
     private int DiasT;//Días trabajados.
     private int NHEDU;//Número de horas extras diurnas.
     private int NHEN;//Numero de horas extras nocturnas.
     private int NHED;//Numero de horas extras dominicales.
     private double SBMA;//Salario básico mensual asignado.
     private int Cedula;//Céluda del trabajador.
     private String ECedula;//Expedicion de la Cedula.
     private LocalDate FNacimiento;//Fecha de nacimiento.
     private String LNacimiento;//Lugar de nacimiento.
     private String ECivil;//Estado civil.
     private String Genero;//Genero del trabajador.
     private int NHijos;//Numero de hijos del trabajador.
     private String Seccion;//Seccion.
     private LocalDate FechaA;//fecha actual.
     private int DiasV;//Dias vividos.
     private double MesesV;//Meses vividos.
     private double Edad;//Edad del trabajador.
     private double VDia;//Valor dia.
     private double VHora;//Valor hora de trabajo.
     private double VHEDiurna;//Valor hora extra diurna:
     private double VHENocturna;//Valor hora extra nocturna.
     private double VHEDomFes;//Valor hora ectra dominical y festivo.
     private double SalDev;//Salario devengado.
     private double Pension;//Pension.
     private double Salud;//Salud.
     private double SubTransporte;//subsidio de transporte
     private double PEdad;//Prima de edad.
     private double PAlimentacion;//Prima de alimentacion.
     private double PProduccion;//Prima de produccion.
     private double PManutencion;//Prima de manutencion.
     private double TDevengado;//Total devengado.
     private double TDeducido;//TDeducido:
     private double Neto;//Neto.
     private double THEDiurnas;//Total de horas extras diurnas.
     private double THENocturnas;//Total de horas extras nocturnas.
     private double THEDominicales;//Total de horas extras dominicales.
     
    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Mensaje
     */
    public String getMensaje() {
        return Mensaje;
    }

    /**
     * @param Mensaje the Mensaje to set
     */
    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    /**
     * @return the DiasT
     */
    public int getDiasT() {
        return DiasT;
    }

    /**
     * @param DiasT the DiasT to set
     */
    public void setDiasT(int DiasT) {
        this.DiasT = DiasT;
    }

    /**
     * @return the NHEDU
     */
    public int getNHEDU() {
        return NHEDU;
    }

    /**
     * @param NHEDU the NHEDU to set
     */
    public void setNHEDU(int NHEDU) {
        this.NHEDU = NHEDU;
    }

    /**
     * @return the NHEN
     */
    public int getNHEN() {
        return NHEN;
    }

    /**
     * @param NHEN the NHEN to set
     */
    public void setNHEN(int NHEN) {
        this.NHEN = NHEN;
    }

    /**
     * @return the NHED
     */
    public int getNHED() {
        return NHED;
    }

    /**
     * @param NHED the NHED to set
     */
    public void setNHED(int NHED) {
        this.NHED = NHED;
    }

    /**
     * @return the SBMA
     */
    public double getSBMA() {
        return SBMA;
    }

    /**
     * @param SBMA the SBMA to set
     */
    public void setSBMA(double SBMA) {
        this.SBMA = SBMA;
    }

    /**
     * @return the Cedula
     */
    public int getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the ECedula
     */
    public String getECedula() {
        return ECedula;
    }

    /**
     * @param ECedula the ECedula to set
     */
    public void setECedula(String ECedula) {
        this.ECedula = ECedula;
    }

    /**
     * @return the FNacimiento
     */
    public LocalDate getFNacimiento() {
        return FNacimiento;
    }

    /**
     * @param FNacimiento the FNacimiento to set
     */
    public void setFNacimiento(LocalDate FNacimiento) {
        this.FNacimiento = FNacimiento;
    }

    /**
     * @return the LNacimiento
     */
    public String getLNacimiento() {
        return LNacimiento;
    }

    /**
     * @param LNacimiento the LNacimiento to set
     */
    public void setLNacimiento(String LNacimiento) {
        this.LNacimiento = LNacimiento;
    }

    /**
     * @return the ECivil
     */
    public String getECivil() {
        return ECivil;
    }

    /**
     * @param ECivil the ECivil to set
     */
    public void setECivil(String ECivil) {
        this.ECivil = ECivil;
    }

    /**
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the NHijos
     */
    public int getNHijos() {
        return NHijos;
    }

    /**
     * @param NHijos the NHijos to set
     */
    public void setNHijos(int NHijos) {
        this.NHijos = NHijos;
    }

    /**
     * @return the Seccion
     */
    public String getSeccion() {
        return Seccion;
    }

    /**
     * @param Seccion the Seccion to set
     */
    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    /**
     * @return the FechaA
     */
    public LocalDate getFechaA() {
        return FechaA;
    }

    /**
     * @param FechaA the FechaA to set
     */
    public void setFechaA(LocalDate FechaA) {
        this.FechaA = FechaA;
    }

    /**
     * @return the DiasV
     */
    public int getDiasV() {
        return DiasV;
    }

    /**
     * @param DiasV the DiasV to set
     */
    public void setDiasV(int DiasV) {
        this.DiasV = DiasV;
    }

    /**
     * @return the MesesV
     */
    public double getMesesV() {
        return MesesV;
    }

    /**
     * @param MesesV the MesesV to set
     */
    public void setMesesV(double MesesV) {
        this.MesesV = MesesV;
    }

    /**
     * @return the Edad
     */
    public double getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(double Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the VDia
     */
    public double getVDia() {
        return VDia;
    }

    /**
     * @param VDia the VDia to set
     */
    public void setVDia(double VDia) {
        this.VDia = VDia;
    }

    /**
     * @return the VHora
     */
    public double getVHora() {
        return VHora;
    }

    /**
     * @param VHora the VHora to set
     */
    public void setVHora(double VHora) {
        this.VHora = VHora;
    }

    /**
     * @return the VHEDiurna
     */
    public double getVHEDiurna() {
        return VHEDiurna;
    }

    /**
     * @param VHEDiurna the VHEDiurna to set
     */
    public void setVHEDiurna(double VHEDiurna) {
        this.VHEDiurna = VHEDiurna;
    }

    /**
     * @return the VHENocturna
     */
    public double getVHENocturna() {
        return VHENocturna;
    }

    /**
     * @param VHENocturna the VHENocturna to set
     */
    public void setVHENocturna(double VHENocturna) {
        this.VHENocturna = VHENocturna;
    }

    /**
     * @return the VHEDomFes
     */
    public double getVHEDomFes() {
        return VHEDomFes;
    }

    /**
     * @param VHEDomFes the VHEDomFes to set
     */
    public void setVHEDomFes(double VHEDomFes) {
        this.VHEDomFes = VHEDomFes;
    }

    /**
     * @return the SalDev
     */
    public double getSalDev() {
        return SalDev;
    }

    /**
     * @param SalDev the SalDev to set
     */
    public void setSalDev(double SalDev) {
        this.SalDev = SalDev;
    }

    /**
     * @return the Pension
     */
    public double getPension() {
        return Pension;
    }

    /**
     * @param Pension the Pension to set
     */
    public void setPension(double Pension) {
        this.Pension = Pension;
    }

    /**
     * @return the Salud
     */
    public double getSalud() {
        return Salud;
    }

    /**
     * @param Salud the Salud to set
     */
    public void setSalud(double Salud) {
        this.Salud = Salud;
    }

    /**
     * @return the SubTransporte
     */
    public double getSubTransporte() {
        return SubTransporte;
    }

    /**
     * @param SubTransporte the SubTransporte to set
     */
    public void setSubTransporte(double SubTransporte) {
        this.SubTransporte = SubTransporte;
    }

    /**
     * @return the PEdad
     */
    public double getPEdad() {
        return PEdad;
    }

    /**
     * @param PEdad the PEdad to set
     */
    public void setPEdad(double PEdad) {
        this.PEdad = PEdad;
    }

    /**
     * @return the PAlimentacion
     */
    public double getPAlimentacion() {
        return PAlimentacion;
    }

    /**
     * @param PAlimentacion the PAlimentacion to set
     */
    public void setPAlimentacion(double PAlimentacion) {
        this.PAlimentacion = PAlimentacion;
    }

    /**
     * @return the PProduccion
     */
    public double getPProduccion() {
        return PProduccion;
    }

    /**
     * @param PProduccion the PProduccion to set
     */
    public void setPProduccion(double PProduccion) {
        this.PProduccion = PProduccion;
    }

    /**
     * @return the PManutencion
     */
    public double getPManutencion() {
        return PManutencion;
    }

    /**
     * @param PManutencion the PManutencion to set
     */
    public void setPManutencion(double PManutencion) {
        this.PManutencion = PManutencion;
    }

    /**
     * @return the TDevengado
     */
    public double getTDevengado() {
        return TDevengado;
    }

    /**
     * @param TDevengado the TDevengado to set
     */
    public void setTDevengado(double TDevengado) {
        this.TDevengado = TDevengado;
    }
    /**
     * @return the TDevengado
     */
    public double getTDeducido() {
        return TDeducido;
    }

    /**
     * @param TDevengado the TDevengado to set
     */
    public void setTDeducido(double TDeducido) {
        this.TDeducido = TDeducido;
    } 
    /**
     * @return the TDevengado
     */
    public double getNeto() {
        return Neto;
    }

    /**
     * @param TDevengado the TDevengado to set
     */
    public void setNeto(double Neto) {
        this.Neto = Neto;
    }
    /**
     * @return the THEDiurnas
     */
    public double getTHEDiurnas() {
        return THEDiurnas;
    }

    /**
     * @param THEDiurnas the THEDiurnas to set
     */
    public void setTHEDiurnas(double THEDiurnas) {
        this.THEDiurnas = THEDiurnas;
    }

    /**
     * @return the THENocturnas
     */
    public double getTHENocturnas() {
        return THENocturnas;
    }

    /**
     * @param THENocturnas the THENocturnas to set
     */
    public void setTHENocturnas(double THENocturnas) {
        this.THENocturnas = THENocturnas;
    }

    /**
     * @return the THEDominicales
     */
    public double getTHEDominicales() {
        return THEDominicales;
    }

    /**
     * @param THEDominicales the THEDominicales to set
     */
    public void setTHEDominicales(double THEDominicales) {
        this.THEDominicales = THEDominicales;
    }
    
     public KH_VariablesNomina_97(String Nombres,String Mensaje,int DiasT,int NHEDU,int NHEN,
             int NHED, double SBMA, int Cedula,String ECedula, LocalDate FNacimiento,
             String LNacimiento,String ECivil,String Genero,int NHijos,String Seccion,
             LocalDate FechaA,int DiasV,double MesesV,double Edad,double VDia,double VHora,
             double VHEDiurna, double VHENocurna, double VHEDomFes,double SalDev,
             double Pension, double Salud, double Subtransporte, double PEdad,
             double PAlimentacion, double PProduccion,double PManutencion,double TDevengado,
             double TDeducido, double Neto, double THEDiurnas, double THENocturnas, 
             double THEDominicales){
         this.Nombres=Nombres;
         this.Mensaje=Mensaje;
         this.DiasT=DiasT;
         this.NHEDU=NHEDU;
         this.NHEN=NHEN;
         this.NHED=NHED;
         this.SBMA=SBMA;
         this.Cedula=Cedula;
         this.ECedula=ECedula;
         this.FNacimiento=FNacimiento;
         this.LNacimiento=LNacimiento;
         this.ECivil=ECivil;
         this.Genero=Genero;
         this.NHijos=NHijos;
         this.Seccion=Seccion;
         this.FechaA=FechaA;
         this.DiasV=DiasV;
         this.MesesV=MesesV;
         this.Edad=Edad;
         this.VDia=VDia;
         this.VHora=VHora;
         this.VHEDiurna=VHEDiurna;
         this.VHENocturna=VHENocturna;
         this.VHEDomFes=VHEDomFes;
         this.SalDev=SalDev;
         this.Pension=Pension;
         this.Salud=Salud;
         this.SubTransporte=SubTransporte;
         this.PEdad=PEdad;
         this.PAlimentacion=PAlimentacion;
         this.PProduccion=PProduccion;
         this.PManutencion=PManutencion;
         this.TDevengado=TDevengado;
         this.TDeducido=TDeducido;
         this.Neto=Neto;
         this.THEDiurnas=THEDiurnas;
         this.THENocturnas=THENocturnas;
         this.THEDominicales=THEDominicales;
     }

    
}
