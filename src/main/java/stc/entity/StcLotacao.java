package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_LOTACAO
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_LOTACAO\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.StcLotacao")
public class StcLotacao implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "co_lot", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer coLot;

    /**
    * @generated
    */
    @Column(name = "co_barra_lot", nullable = false, unique = false, length=35, insertable=true, updatable=true)
        
        private java.lang.String coBarraLot;

    /**
    * @generated
    */
    @Column(name = "co_lot_cco", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coLotCco;

    /**
    * @generated
    */
    @Column(name = "co_lot_hier", nullable = false, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String coLotHier;

    /**
    * @generated
    */
    @Column(name = "co_lot_separ", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coLotSepar;

    /**
    * @generated
    */
    @Column(name = "co_lot_sup", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coLotSup;

    /**
    * @generated
    */
    @Column(name = "co_matr", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coMatr;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cria", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date dtCria;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_exti", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date dtExti;

    /**
    * @generated
    */
    @Column(name = "in_nivel", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short inNivel;

    /**
    * @generated
    */
    @Column(name = "in_separ", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String inSepar;

    /**
    * @generated
    */
    @Column(name = "in_subor", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short inSubor;

    /**
    * @generated
    */
    @Column(name = "in_tab", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short inTab;

    /**
    * @generated
    */
    @Column(name = "in_val_por", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String inValPor;

    /**
    * @generated
    */
    @Column(name = "ob_lot", nullable = true, unique = false, length=260, insertable=true, updatable=true)
        
        private java.lang.String obLot;

    /**
    * @generated
    */
    @Column(name = "sg_lot", nullable = false, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String sgLot;

    /**
    * @generated
    */
    @Column(name = "tx_lot", nullable = false, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String txLot;

    /**
    * Construtor
    * @generated
    */
    public StcLotacao(){
    }

    /**
    * Obtém coLot
    * return coLot
    * @generated
    */
    
    public java.lang.Integer getCoLot(){
        return this.coLot;
    }

    /**
    * Define coLot
    * @param coLot coLot
    * @generated
    */
    public StcLotacao setCoLot(java.lang.Integer coLot){
        this.coLot = coLot;
        return this;
    }
    /**
    * Obtém coBarraLot
    * return coBarraLot
    * @generated
    */
    
    public java.lang.String getCoBarraLot(){
        return this.coBarraLot;
    }

    /**
    * Define coBarraLot
    * @param coBarraLot coBarraLot
    * @generated
    */
    public StcLotacao setCoBarraLot(java.lang.String coBarraLot){
        this.coBarraLot = coBarraLot;
        return this;
    }
    /**
    * Obtém coLotCco
    * return coLotCco
    * @generated
    */
    
    public java.lang.Integer getCoLotCco(){
        return this.coLotCco;
    }

    /**
    * Define coLotCco
    * @param coLotCco coLotCco
    * @generated
    */
    public StcLotacao setCoLotCco(java.lang.Integer coLotCco){
        this.coLotCco = coLotCco;
        return this;
    }
    /**
    * Obtém coLotHier
    * return coLotHier
    * @generated
    */
    
    public java.lang.String getCoLotHier(){
        return this.coLotHier;
    }

    /**
    * Define coLotHier
    * @param coLotHier coLotHier
    * @generated
    */
    public StcLotacao setCoLotHier(java.lang.String coLotHier){
        this.coLotHier = coLotHier;
        return this;
    }
    /**
    * Obtém coLotSepar
    * return coLotSepar
    * @generated
    */
    
    public java.lang.Integer getCoLotSepar(){
        return this.coLotSepar;
    }

    /**
    * Define coLotSepar
    * @param coLotSepar coLotSepar
    * @generated
    */
    public StcLotacao setCoLotSepar(java.lang.Integer coLotSepar){
        this.coLotSepar = coLotSepar;
        return this;
    }
    /**
    * Obtém coLotSup
    * return coLotSup
    * @generated
    */
    
    public java.lang.Integer getCoLotSup(){
        return this.coLotSup;
    }

    /**
    * Define coLotSup
    * @param coLotSup coLotSup
    * @generated
    */
    public StcLotacao setCoLotSup(java.lang.Integer coLotSup){
        this.coLotSup = coLotSup;
        return this;
    }
    /**
    * Obtém coMatr
    * return coMatr
    * @generated
    */
    
    public java.lang.Integer getCoMatr(){
        return this.coMatr;
    }

    /**
    * Define coMatr
    * @param coMatr coMatr
    * @generated
    */
    public StcLotacao setCoMatr(java.lang.Integer coMatr){
        this.coMatr = coMatr;
        return this;
    }
    /**
    * Obtém dtCria
    * return dtCria
    * @generated
    */
    
    public java.util.Date getDtCria(){
        return this.dtCria;
    }

    /**
    * Define dtCria
    * @param dtCria dtCria
    * @generated
    */
    public StcLotacao setDtCria(java.util.Date dtCria){
        this.dtCria = dtCria;
        return this;
    }
    /**
    * Obtém dtExti
    * return dtExti
    * @generated
    */
    
    public java.util.Date getDtExti(){
        return this.dtExti;
    }

    /**
    * Define dtExti
    * @param dtExti dtExti
    * @generated
    */
    public StcLotacao setDtExti(java.util.Date dtExti){
        this.dtExti = dtExti;
        return this;
    }
    /**
    * Obtém inNivel
    * return inNivel
    * @generated
    */
    
    public java.lang.Short getInNivel(){
        return this.inNivel;
    }

    /**
    * Define inNivel
    * @param inNivel inNivel
    * @generated
    */
    public StcLotacao setInNivel(java.lang.Short inNivel){
        this.inNivel = inNivel;
        return this;
    }
    /**
    * Obtém inSepar
    * return inSepar
    * @generated
    */
    
    public java.lang.String getInSepar(){
        return this.inSepar;
    }

    /**
    * Define inSepar
    * @param inSepar inSepar
    * @generated
    */
    public StcLotacao setInSepar(java.lang.String inSepar){
        this.inSepar = inSepar;
        return this;
    }
    /**
    * Obtém inSubor
    * return inSubor
    * @generated
    */
    
    public java.lang.Short getInSubor(){
        return this.inSubor;
    }

    /**
    * Define inSubor
    * @param inSubor inSubor
    * @generated
    */
    public StcLotacao setInSubor(java.lang.Short inSubor){
        this.inSubor = inSubor;
        return this;
    }
    /**
    * Obtém inTab
    * return inTab
    * @generated
    */
    
    public java.lang.Short getInTab(){
        return this.inTab;
    }

    /**
    * Define inTab
    * @param inTab inTab
    * @generated
    */
    public StcLotacao setInTab(java.lang.Short inTab){
        this.inTab = inTab;
        return this;
    }
    /**
    * Obtém inValPor
    * return inValPor
    * @generated
    */
    
    public java.lang.String getInValPor(){
        return this.inValPor;
    }

    /**
    * Define inValPor
    * @param inValPor inValPor
    * @generated
    */
    public StcLotacao setInValPor(java.lang.String inValPor){
        this.inValPor = inValPor;
        return this;
    }
    /**
    * Obtém obLot
    * return obLot
    * @generated
    */
    
    public java.lang.String getObLot(){
        return this.obLot;
    }

    /**
    * Define obLot
    * @param obLot obLot
    * @generated
    */
    public StcLotacao setObLot(java.lang.String obLot){
        this.obLot = obLot;
        return this;
    }
    /**
    * Obtém sgLot
    * return sgLot
    * @generated
    */
    
    public java.lang.String getSgLot(){
        return this.sgLot;
    }

    /**
    * Define sgLot
    * @param sgLot sgLot
    * @generated
    */
    public StcLotacao setSgLot(java.lang.String sgLot){
        this.sgLot = sgLot;
        return this;
    }
    /**
    * Obtém txLot
    * return txLot
    * @generated
    */
    
    public java.lang.String getTxLot(){
        return this.txLot;
    }

    /**
    * Define txLot
    * @param txLot txLot
    * @generated
    */
    public StcLotacao setTxLot(java.lang.String txLot){
        this.txLot = txLot;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
StcLotacao object = (StcLotacao)obj;
        if (coLot != null ? !coLot.equals(object.coLot) : object.coLot != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((coLot == null) ? 0 : coLot.hashCode());
        return result;
    }

}