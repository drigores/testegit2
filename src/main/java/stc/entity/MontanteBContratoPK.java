package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class MontanteBContratoPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.Short anoInstrumentoContratual;

  /**
   * @generated
   */
  private java.lang.String codTipoInstrumentoContratual;

  /**
   * @generated
   */
  private java.lang.Integer numInstrumentoContratual;

  /**
   * @generated
   */
  private java.lang.String montanteB;

  /**
   * Construtor
   * @generated
   */
  public MontanteBContratoPK(){
  }

  /**
   * Obtém anoInstrumentoContratual
   * return anoInstrumentoContratual
   * @generated
   */
  public java.lang.Short getAnoInstrumentoContratual(){
    return this.anoInstrumentoContratual;
  }

  /**
   * Define anoInstrumentoContratual
   * @param anoInstrumentoContratual anoInstrumentoContratual
   * @generated
   */
  public MontanteBContratoPK setAnoInstrumentoContratual(java.lang.Short anoInstrumentoContratual){
    this.anoInstrumentoContratual = anoInstrumentoContratual;
    return this;
  }
  /**
   * Obtém codTipoInstrumentoContratual
   * return codTipoInstrumentoContratual
   * @generated
   */
  public java.lang.String getCodTipoInstrumentoContratual(){
    return this.codTipoInstrumentoContratual;
  }

  /**
   * Define codTipoInstrumentoContratual
   * @param codTipoInstrumentoContratual codTipoInstrumentoContratual
   * @generated
   */
  public MontanteBContratoPK setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
    this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
    return this;
  }
  /**
   * Obtém numInstrumentoContratual
   * return numInstrumentoContratual
   * @generated
   */
  public java.lang.Integer getNumInstrumentoContratual(){
    return this.numInstrumentoContratual;
  }

  /**
   * Define numInstrumentoContratual
   * @param numInstrumentoContratual numInstrumentoContratual
   * @generated
   */
  public MontanteBContratoPK setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
    this.numInstrumentoContratual = numInstrumentoContratual;
    return this;
  }
  /**
   * Obtém montanteB
   * return montanteB
   * @generated
   */
  public java.lang.String getMontanteB(){
    return this.montanteB;
  }

  /**
   * Define montanteB
   * @param montanteB montanteB
   * @generated
   */
  public MontanteBContratoPK setMontanteB(java.lang.String montanteB){
    this.montanteB = montanteB;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
MontanteBContratoPK object = (MontanteBContratoPK)obj;
    if (anoInstrumentoContratual != null ? !anoInstrumentoContratual.equals(object.anoInstrumentoContratual) : object.anoInstrumentoContratual != null) return false;
    if (codTipoInstrumentoContratual != null ? !codTipoInstrumentoContratual.equals(object.codTipoInstrumentoContratual) : object.codTipoInstrumentoContratual != null) return false;
    if (numInstrumentoContratual != null ? !numInstrumentoContratual.equals(object.numInstrumentoContratual) : object.numInstrumentoContratual != null) return false;
    if (montanteB != null ? !montanteB.equals(object.montanteB) : object.montanteB != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((anoInstrumentoContratual == null) ? 0 : anoInstrumentoContratual.hashCode());
    result = 31 * result + ((codTipoInstrumentoContratual == null) ? 0 : codTipoInstrumentoContratual.hashCode());
    result = 31 * result + ((numInstrumentoContratual == null) ? 0 : numInstrumentoContratual.hashCode());
    result = 31 * result + ((montanteB == null) ? 0 : montanteB.hashCode());
    return result;
  }

}
