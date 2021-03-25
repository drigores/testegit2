package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class DiaUtilPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.util.Date datUtil;

  /**
   * @generated
   */
  private java.lang.String cargo;

  /**
   * Construtor
   * @generated
   */
  public DiaUtilPK(){
  }

  /**
   * Obtém datUtil
   * return datUtil
   * @generated
   */
  public java.util.Date getDatUtil(){
    return this.datUtil;
  }

  /**
   * Define datUtil
   * @param datUtil datUtil
   * @generated
   */
  public DiaUtilPK setDatUtil(java.util.Date datUtil){
    this.datUtil = datUtil;
    return this;
  }
  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  public java.lang.String getCargo(){
    return this.cargo;
  }

  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public DiaUtilPK setCargo(java.lang.String cargo){
    this.cargo = cargo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
DiaUtilPK object = (DiaUtilPK)obj;
    if (datUtil != null ? !datUtil.equals(object.datUtil) : object.datUtil != null) return false;
    if (cargo != null ? !cargo.equals(object.cargo) : object.cargo != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((datUtil == null) ? 0 : datUtil.hashCode());
    result = 31 * result + ((cargo == null) ? 0 : cargo.hashCode());
    return result;
  }

}
