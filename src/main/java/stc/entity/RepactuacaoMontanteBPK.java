package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class RepactuacaoMontanteBPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private MontanteBContratoPK montanteBContrato;

  /**
   * @generated
   */
  private java.lang.String repactuacao;

  /**
   * Construtor
   * @generated
   */
  public RepactuacaoMontanteBPK(){
  }

  /**
   * Obtém montanteBContrato
   * return montanteBContrato
   * @generated
   */
  public MontanteBContratoPK getMontanteBContrato(){
    return this.montanteBContrato;
  }

  /**
   * Define montanteBContrato
   * @param montanteBContrato montanteBContrato
   * @generated
   */
  public RepactuacaoMontanteBPK setMontanteBContrato(MontanteBContratoPK montanteBContrato){
    this.montanteBContrato = montanteBContrato;
    return this;
  }
  /**
   * Obtém repactuacao
   * return repactuacao
   * @generated
   */
  public java.lang.String getRepactuacao(){
    return this.repactuacao;
  }

  /**
   * Define repactuacao
   * @param repactuacao repactuacao
   * @generated
   */
  public RepactuacaoMontanteBPK setRepactuacao(java.lang.String repactuacao){
    this.repactuacao = repactuacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
RepactuacaoMontanteBPK object = (RepactuacaoMontanteBPK)obj;
    if (montanteBContrato != null ? !montanteBContrato.equals(object.montanteBContrato) : object.montanteBContrato != null) return false;
    if (repactuacao != null ? !repactuacao.equals(object.repactuacao) : object.repactuacao != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((montanteBContrato == null) ? 0 : montanteBContrato.hashCode());
    result = 31 * result + ((repactuacao == null) ? 0 : repactuacao.hashCode());
    return result;
  }

}
