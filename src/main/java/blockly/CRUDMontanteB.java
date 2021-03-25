package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDMontanteB {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDMontanteB
public static Var AntesDeAlterar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSOutroMontanteB = Var.VAR_NULL;

   public Var call() throws Exception {

    RSOutroMontanteB =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.MontanteB"),Var.valueOf("select m.desMontanteB from MontanteB m where m.montanteB <> :montanteB AND m.desMontanteB = :desMontanteB"),Var.valueOf("montanteB",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("montanteB"))),Var.valueOf("desMontanteB",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMontanteB"))));

    if (
    cronapi.database.Operations.hasElement(RSOutroMontanteB).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida.  Já existe um Montante B com nome de \"").toString() +
        cronapi.database.Operations.getField(RSOutroMontanteB,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf("\" cadastrado no sistema.").toString())));
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

   private Var RSMontanteBContrato = Var.VAR_NULL;

   public Var call() throws Exception {

    RSMontanteBContrato =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.MontanteBContrato"),Var.valueOf("select mbc.codTipoInstrumentoContratual, mbc.anoInstrumentoContratual, mbc.numInstrumentoContratual, tic.txtTipoInstrContratual, tic.codTipoInstrContratual from MontanteBContrato mbc, STCTipoInstrContratual tic where mbc.montanteB = :montanteB AND mbc.codTipoInstrumentoContratual = tic.codTipoInstrContratual"),Var.valueOf("montanteB",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("montanteB"))));

    if (
    cronapi.database.Operations.hasElement(RSMontanteBContrato).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão não permitida.  Este Montante B está sendo utilizado pelo ").toString() +
        cronapi.database.Operations.getField(RSMontanteBContrato,
        Var.valueOf("this[3]")).toString() +
        Var.valueOf(" ").toString() +
        cronapi.conversion.Operations.convert(
        cronapi.database.Operations.getField(RSMontanteBContrato,
        Var.valueOf("this[2]")),
        Var.valueOf("STRING")).toString() +
        Var.valueOf("/").toString() +
        cronapi.conversion.Operations.convert(
        cronapi.database.Operations.getField(RSMontanteBContrato,
        Var.valueOf("this[1]")),
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
// CRUDMontanteB
public static Var AntesDeInserir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSMontanteBJaExiste = Var.VAR_NULL;

   public Var call() throws Exception {

    RSMontanteBJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.MontanteB"),Var.valueOf("select m.desMontanteB from MontanteB m where m.desMontanteB = :desMontanteB"),Var.valueOf("desMontanteB",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMontanteB"))));

    if (
    cronapi.database.Operations.hasElement(RSMontanteBJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida.  Já existe um Montante B com nome de \"").toString() +
        cronapi.database.Operations.getField(RSMontanteBJaExiste,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf("\" cadastrado no sistema.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

