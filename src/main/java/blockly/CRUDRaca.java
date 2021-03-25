package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDRaca {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDMontanteB
public static Var AntesDeAlterar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSOutraRaca = Var.VAR_NULL;

   public Var call() throws Exception {

    RSOutraRaca =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Raca"),Var.valueOf("select r.nomRaca from Raca r where r.nomRaca = :nomRaca AND r.raca <> :raca"),Var.valueOf("nomRaca",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("nomRaca"))),Var.valueOf("raca",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("raca"))));

    if (
    cronapi.database.Operations.hasElement(RSOutraRaca).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida.  Já existe uma Raça com nome de \"").toString() +
        cronapi.database.Operations.getField(RSOutraRaca,
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

   private Var RSRacaTerceirizado = Var.VAR_NULL;

   public Var call() throws Exception {

    RSRacaTerceirizado =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Terceirizado"),Var.valueOf("select t.nomTerceirizado from Terceirizado t where t.raca = :raca"),Var.valueOf("raca",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("raca"))));

    if (
    cronapi.database.Operations.hasElement(RSRacaTerceirizado).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão não permitida.  O terceirizado ").toString() +
        cronapi.database.Operations.getField(RSRacaTerceirizado,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf(" está cadastrado como membro desta raça.").toString())));
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

   private Var RSRacaJaExiste = Var.VAR_NULL;

   public Var call() throws Exception {

    RSRacaJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Raca"),Var.valueOf("select r.nomRaca from Raca r where r.nomRaca = :nomRaca"),Var.valueOf("nomRaca",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("nomRaca"))));

    if (
    cronapi.database.Operations.hasElement(RSRacaJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida.  Já existe uma Raça com nome de \"").toString() +
        cronapi.database.Operations.getField(RSRacaJaExiste,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf("\" cadastrada no sistema.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

