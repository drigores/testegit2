package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class UsuarioPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String codTipoInstrumentoContratual;

  /**
   * @generated
   */
  private java.lang.Integer ideUsuario;

  /**
   * @generated
   */
  private java.lang.Short instrumentoContratual;

  /**
   * @generated
   */
  private java.lang.Integer numInstrumentoContratual;

  /**
   * Construtor
   * @generated
   */
  public UsuarioPK(){
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
  public UsuarioPK setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
    this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
    return this;
  }
  /**
   * Obtém ideUsuario
   * return ideUsuario
   * @generated
   */
  public java.lang.Integer getIdeUsuario(){
    return this.ideUsuario;
  }

  /**
   * Define ideUsuario
   * @param ideUsuario ideUsuario
   * @generated
   */
  public UsuarioPK setIdeUsuario(java.lang.Integer ideUsuario){
    this.ideUsuario = ideUsuario;
    return this;
  }
  /**
   * Obtém instrumentoContratual
   * return instrumentoContratual
   * @generated
   */
  public java.lang.Short getInstrumentoContratual(){
    return this.instrumentoContratual;
  }

  /**
   * Define instrumentoContratual
   * @param instrumentoContratual instrumentoContratual
   * @generated
   */
  public UsuarioPK setInstrumentoContratual(java.lang.Short instrumentoContratual){
    this.instrumentoContratual = instrumentoContratual;
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
  public UsuarioPK setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
    this.numInstrumentoContratual = numInstrumentoContratual;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
UsuarioPK object = (UsuarioPK)obj;
    if (codTipoInstrumentoContratual != null ? !codTipoInstrumentoContratual.equals(object.codTipoInstrumentoContratual) : object.codTipoInstrumentoContratual != null) return false;
    if (ideUsuario != null ? !ideUsuario.equals(object.ideUsuario) : object.ideUsuario != null) return false;
    if (instrumentoContratual != null ? !instrumentoContratual.equals(object.instrumentoContratual) : object.instrumentoContratual != null) return false;
    if (numInstrumentoContratual != null ? !numInstrumentoContratual.equals(object.numInstrumentoContratual) : object.numInstrumentoContratual != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((codTipoInstrumentoContratual == null) ? 0 : codTipoInstrumentoContratual.hashCode());
    result = 31 * result + ((ideUsuario == null) ? 0 : ideUsuario.hashCode());
    result = 31 * result + ((instrumentoContratual == null) ? 0 : instrumentoContratual.hashCode());
    result = 31 * result + ((numInstrumentoContratual == null) ? 0 : numInstrumentoContratual.hashCode());
    return result;
  }

}
