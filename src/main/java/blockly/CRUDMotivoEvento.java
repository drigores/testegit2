package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDMotivoEvento {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDMotivoEvento
public static Var AntesDeAlterar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSOutroMotivoEvento = Var.VAR_NULL;

   public Var call() throws Exception {

    RSOutroMotivoEvento =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.MotivoEvento"),Var.valueOf("select m.motivoEvento from MotivoEvento m where m.desMotivoEvento = :desMotivoEvento AND m.motivoEvento <> :motivoEvento"),Var.valueOf("desMotivoEvento",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMotivoEvento"))),Var.valueOf("motivoEvento",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("motivoEvento"))));

    if (
    cronapi.database.Operations.hasElement(RSOutroMotivoEvento).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida pois já existe um outro Tipo de Evento \"").toString() +
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMotivoEvento")).toString() +
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

   private Var RSEvento = Var.VAR_NULL;

   public Var call() throws Exception {

    RSEvento =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Evento"),Var.valueOf("select e.motivoEvento, e.cargoEmExercicio.terceirizado.nomTerceirizado, e.datInicioEvento from Evento e where e.motivoEvento = :motivoEvento"),Var.valueOf("motivoEvento",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("motivoEvento"))));

    if (
    cronapi.database.Operations.hasElement(RSEvento).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão nao permitida pois este Tipo de Evento já foi utilizado por ").toString() +
        cronapi.database.Operations.getField(RSEvento,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf("em ").toString() +
        cronapi.dateTime.Operations.formatDateTime(
        cronapi.database.Operations.getField(RSEvento,
        Var.valueOf("this[2]")),
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

   private Var RSMotivoEventoDuplicado = Var.VAR_NULL;

   public Var call() throws Exception {

    RSMotivoEventoDuplicado =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.MotivoEvento"),Var.valueOf("select m.motivoEvento from MotivoEvento m where m.desMotivoEvento = :desMotivoEvento"),Var.valueOf("desMotivoEvento",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMotivoEvento"))));

    if (
    cronapi.database.Operations.hasElement(RSMotivoEventoDuplicado).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida pois já existe um Tipo de Evento \"").toString() +
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("desMotivoEvento")).toString() +
        Var.valueOf("\" cadastrado no sistema.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

