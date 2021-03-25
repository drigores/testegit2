package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class STCInstrumentoContratualPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.Short anoInstrContratual;

  /**
   * @generated
   */
  private java.lang.String codTipoInstrContratual;

  /**
   * @generated
   */
  private java.lang.Integer numInstrContratual;

  /**
   * Construtor
   * @generated
   */
  public STCInstrumentoContratualPK(){
  }

  /**
   * Obtém anoInstrContratual
   * return anoInstrContratual
   * @generated
   */
  public java.lang.Short getAnoInstrContratual(){
    return this.anoInstrContratual;
  }

  /**
   * Define anoInstrContratual
   * @param anoInstrContratual anoInstrContratual
   * @generated
   */
  public STCInstrumentoContratualPK setAnoInstrContratual(java.lang.Short anoInstrContratual){
    this.anoInstrContratual = anoInstrContratual;
    return this;
  }
  /**
   * Obtém codTipoInstrContratual
   * return codTipoInstrContratual
   * @generated
   */
  public java.lang.String getCodTipoInstrContratual(){
    return this.codTipoInstrContratual;
  }

  /**
   * Define codTipoInstrContratual
   * @param codTipoInstrContratual codTipoInstrContratual
   * @generated
   */
  public STCInstrumentoContratualPK setCodTipoInstrContratual(java.lang.String codTipoInstrContratual){
    this.codTipoInstrContratual = codTipoInstrContratual;
    return this;
  }
  /**
   * Obtém numInstrContratual
   * return numInstrContratual
   * @generated
   */
  public java.lang.Integer getNumInstrContratual(){
    return this.numInstrContratual;
  }

  /**
   * Define numInstrContratual
   * @param numInstrContratual numInstrContratual
   * @generated
   */
  public STCInstrumentoContratualPK setNumInstrContratual(java.lang.Integer numInstrContratual){
    this.numInstrContratual = numInstrContratual;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
STCInstrumentoContratualPK object = (STCInstrumentoContratualPK)obj;
    if (anoInstrContratual != null ? !anoInstrContratual.equals(object.anoInstrContratual) : object.anoInstrContratual != null) return false;
    if (codTipoInstrContratual != null ? !codTipoInstrContratual.equals(object.codTipoInstrContratual) : object.codTipoInstrContratual != null) return false;
    if (numInstrContratual != null ? !numInstrContratual.equals(object.numInstrContratual) : object.numInstrContratual != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((anoInstrContratual == null) ? 0 : anoInstrContratual.hashCode());
    result = 31 * result + ((codTipoInstrContratual == null) ? 0 : codTipoInstrContratual.hashCode());
    result = 31 * result + ((numInstrContratual == null) ? 0 : numInstrContratual.hashCode());
    return result;
  }

}
