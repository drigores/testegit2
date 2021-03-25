package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class STCInstrumentoContratualSPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String sanoInstrContratual;

  /**
   * @generated
   */
  private java.lang.String codTipoInstrContratual;

  /**
   * @generated
   */
  private java.lang.String snumInstrContratual;

  /**
   * Construtor
   * @generated
   */
  public STCInstrumentoContratualSPK(){
  }

  /**
   * Obtém sanoInstrContratual
   * return sanoInstrContratual
   * @generated
   */
  public java.lang.String getSanoInstrContratual(){
    return this.sanoInstrContratual;
  }

  /**
   * Define sanoInstrContratual
   * @param sanoInstrContratual sanoInstrContratual
   * @generated
   */
  public STCInstrumentoContratualSPK setSanoInstrContratual(java.lang.String sanoInstrContratual){
    this.sanoInstrContratual = sanoInstrContratual;
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
  public STCInstrumentoContratualSPK setCodTipoInstrContratual(java.lang.String codTipoInstrContratual){
    this.codTipoInstrContratual = codTipoInstrContratual;
    return this;
  }
  /**
   * Obtém snumInstrContratual
   * return snumInstrContratual
   * @generated
   */
  public java.lang.String getSnumInstrContratual(){
    return this.snumInstrContratual;
  }

  /**
   * Define snumInstrContratual
   * @param snumInstrContratual snumInstrContratual
   * @generated
   */
  public STCInstrumentoContratualSPK setSnumInstrContratual(java.lang.String snumInstrContratual){
    this.snumInstrContratual = snumInstrContratual;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
STCInstrumentoContratualSPK object = (STCInstrumentoContratualSPK)obj;
    if (sanoInstrContratual != null ? !sanoInstrContratual.equals(object.sanoInstrContratual) : object.sanoInstrContratual != null) return false;
    if (codTipoInstrContratual != null ? !codTipoInstrContratual.equals(object.codTipoInstrContratual) : object.codTipoInstrContratual != null) return false;
    if (snumInstrContratual != null ? !snumInstrContratual.equals(object.snumInstrContratual) : object.snumInstrContratual != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((sanoInstrContratual == null) ? 0 : sanoInstrContratual.hashCode());
    result = 31 * result + ((codTipoInstrContratual == null) ? 0 : codTipoInstrContratual.hashCode());
    result = 31 * result + ((snumInstrContratual == null) ? 0 : snumInstrContratual.hashCode());
    return result;
  }

}
