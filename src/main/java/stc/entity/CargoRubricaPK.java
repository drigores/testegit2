package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class CargoRubricaPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String cargo;

  /**
   * @generated
   */
  private java.lang.String rubrica;

  /**
   * Construtor
   * @generated
   */
  public CargoRubricaPK(){
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
  public CargoRubricaPK setCargo(java.lang.String cargo){
    this.cargo = cargo;
    return this;
  }
  /**
   * Obtém rubrica
   * return rubrica
   * @generated
   */
  public java.lang.String getRubrica(){
    return this.rubrica;
  }

  /**
   * Define rubrica
   * @param rubrica rubrica
   * @generated
   */
  public CargoRubricaPK setRubrica(java.lang.String rubrica){
    this.rubrica = rubrica;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
CargoRubricaPK object = (CargoRubricaPK)obj;
    if (cargo != null ? !cargo.equals(object.cargo) : object.cargo != null) return false;
    if (rubrica != null ? !rubrica.equals(object.rubrica) : object.rubrica != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((cargo == null) ? 0 : cargo.hashCode());
    result = 31 * result + ((rubrica == null) ? 0 : rubrica.hashCode());
    return result;
  }

}
