package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDMotivoEventoCargo {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDMotivoEvento
public static Var AntesDeAlterar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSOutroMotivoEventoCargo = Var.VAR_NULL;

   public Var call() throws Exception {

    RSOutroMotivoEventoCargo =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.MotivoEventoCargo"),Var.valueOf("select ec.desMotivoEventoCargo from MotivoEventoCargo ec where ec.desMotivoEventoCargo = :desMotivoEventoCargo AND ec.motivoEventoCargo <> :motivoEventoCargo"),Var.valueOf("desMotivoEventoCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMotivoEventoCargo"))),Var.valueOf("motivoEventoCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("motivoEventoCargo"))));

    if (
    cronapi.database.Operations.hasElement(RSOutroMotivoEventoCargo).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Blavla bla Alteração não permitida pois já existe um outro Tipo de Evento de Cargo denominado \"").toString() +
        cronapi.database.Operations.getField(RSOutroMotivoEventoCargo,
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
// CRUDMotivoEvento
public static Var AntesDeExcluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSEventoCargo = Var.VAR_NULL;

   public Var call() throws Exception {

    RSEventoCargo =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.EventoCargo"),Var.valueOf("select ev.cargo.nomCargo, ev.cargo.codTipoInstrumentoContratual, ev.cargo.numInstrumentoContratual, ev.cargo.anoInstrumentoContratual, ev.datInicioEvento from EventoCargo ev where ev.motivoEventoCargo = :motivoEventoCargo"),Var.valueOf("motivoEventoCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("motivoEventoCargo"))));

    if (
    cronapi.database.Operations.hasElement(RSEventoCargo).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão nao permitida pois este Tipo de Evento de Cargo já foi utilizado no cargo ").toString() +
        cronapi.database.Operations.getField(RSEventoCargo,
        Var.VAR_NULL).toString() +
        Var.valueOf(" do ").toString() +
        blockly.GERAL.FormataInstrumentoContratual(
        cronapi.database.Operations.getField(RSEventoCargo,
        Var.valueOf("this[1]")),
        cronapi.database.Operations.getField(RSEventoCargo,
        Var.valueOf("this[2]")),
        cronapi.database.Operations.getField(RSEventoCargo,
        Var.valueOf("this[3]"))).toString() +
        Var.valueOf(" em ").toString() +
        cronapi.dateTime.Operations.formatDateTime(
        cronapi.database.Operations.getField(RSEventoCargo,
        Var.valueOf("this[4]")),
        Var.valueOf("dd/MM/yyyy")).toString() +
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
// CRUDMotivoEvento
public static Var AntesDeIncluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSMotivoEventoCargoDuplicado = Var.VAR_NULL;

   public Var call() throws Exception {

    RSMotivoEventoCargoDuplicado =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.MotivoEventoCargo"),Var.valueOf("select ec.desMotivoEventoCargo from MotivoEventoCargo ec where ec.desMotivoEventoCargo = :desMotivoEventoCargo"),Var.valueOf("desMotivoEventoCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMotivoEventoCargo"))));

    if (
    cronapi.database.Operations.hasElement(RSMotivoEventoCargoDuplicado).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida pois já existe um Tipo de Evento de Cargo denominado \"").toString() +
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMotivoEventoCargo")).toString() +
        Var.valueOf("\" cadastrado no sistema.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

