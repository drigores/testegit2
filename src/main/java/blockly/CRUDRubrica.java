package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDRubrica {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDRubrica
public static Var AntesDeAlterar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSOutraRubrica = Var.VAR_NULL;

   public Var call() throws Exception {

    RSOutraRubrica =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Rubrica"),Var.valueOf("select r.rubrica from Rubrica r where r.desRubrica = :desRubrica AND r.rubrica <> :rubrica"),Var.valueOf("desRubrica",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desRubrica"))),Var.valueOf("rubrica",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("rubrica"))));

    if (
    cronapi.database.Operations.hasElement(RSOutraRubrica).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida pois já existe um outra Rubrica \"").toString() +
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desRubrica")).toString() +
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
// CRUDRubrica
public static Var AntesDeExcluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSCargoRubrica = Var.VAR_NULL;

   public Var call() throws Exception {

    RSCargoRubrica =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.CargoRubrica"),Var.valueOf("select cr.cargo.nomCargo, tic.txtTipoInstrContratual, cr.cargo.anoInstrumentoContratual, cr.cargo.numInstrumentoContratual from CargoRubrica cr, STCTipoInstrContratual tic where cr.cargo.codTipoInstrumentoContratual = tic.codTipoInstrContratual AND cr.rubrica = :rubrica"),Var.valueOf("rubrica",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("rubrica"))));

    if (
    cronapi.database.Operations.hasElement(RSCargoRubrica).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão nao permitida pois esta Rubrica já foi configurada no cargo ").toString() +
        cronapi.database.Operations.getField(RSCargoRubrica,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf(" do ").toString() +
        cronapi.database.Operations.getField(RSCargoRubrica,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf(" ").toString() +
        cronapi.conversion.Operations.convert(
        cronapi.database.Operations.getField(RSCargoRubrica,
        Var.valueOf("this[3]")),
        Var.valueOf("STRING")).toString() +
        Var.valueOf("/").toString() +
        cronapi.conversion.Operations.convert(
        cronapi.database.Operations.getField(RSCargoRubrica,
        Var.valueOf("this[2]")),
        Var.valueOf("STRING")).toString() +
        Var.valueOf(".").toString())));
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
// CRUDRubrica
public static Var AntesDeIncluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSRubricaMesmoNome = Var.VAR_NULL;

   public Var call() throws Exception {

    RSRubricaMesmoNome =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Rubrica"),Var.valueOf("select r.desRubrica from Rubrica r where r.desRubrica = :desRubrica"),Var.valueOf("desRubrica",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desRubrica"))));

    if (
    cronapi.database.Operations.hasElement(RSRubricaMesmoNome).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida pois já existe uma Rubrica \"").toString() +
        cronapi.database.Operations.getField(RSRubricaMesmoNome,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf("\" cadastrada no sistema.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

