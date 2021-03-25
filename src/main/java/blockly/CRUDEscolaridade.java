package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDEscolaridade {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDMontanteB
public static Var AntesDeAlterar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSOutraEscolaridade = Var.VAR_NULL;

   public Var call() throws Exception {

    RSOutraEscolaridade =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Escolaridade"),Var.valueOf("select e.desEscolaridade from Escolaridade e where e.desEscolaridade = :desEscolaridade AND e.escolaridade = :escolaridade"),Var.valueOf("desEscolaridade",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desEscolaridade"))),Var.valueOf("escolaridade",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("escolaridade"))));

    if (
    cronapi.database.Operations.hasElement(RSOutraEscolaridade).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida.  Já existe uma Escolaridade denominada \"").toString() +
        cronapi.database.Operations.getField(RSOutraEscolaridade,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf("\" cadastrada no sistema.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDMontanteB
public static Var AntesDeExcluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSEscolaridadeTerceirizado = Var.VAR_NULL;

   public Var call() throws Exception {

    RSEscolaridadeTerceirizado =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Terceirizado"),Var.valueOf("select t.nomTerceirizado from Terceirizado t where t.escolaridade = :escolaridade"),Var.valueOf("escolaridade",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("escolaridade"))));

    if (
    cronapi.database.Operations.hasElement(RSEscolaridadeTerceirizado).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão não permitida.  O terceirizado ").toString() +
        cronapi.database.Operations.getField(RSEscolaridadeTerceirizado,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf(" está cadastrado como possuindo este nível de escolaridade.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDMontanteB
public static Var AntesDeInserir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSEscolaridadeJaExiste = Var.VAR_NULL;

   public Var call() throws Exception {

    RSEscolaridadeJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Escolaridade"),Var.valueOf("select e.desEscolaridade from Escolaridade e where e.desEscolaridade = :desEscolaridade"),Var.valueOf("desEscolaridade",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desEscolaridade"))));

    if (
    cronapi.database.Operations.hasElement(RSEscolaridadeJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida.  Já existe uma Escolaridade denominada \"").toString() +
        cronapi.database.Operations.getField(RSEscolaridadeJaExiste,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf("\" cadastrada no sistema.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

