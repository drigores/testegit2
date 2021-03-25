package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDCargoRubrica {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDCargoRubrica
public static Var AntesDeExcluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSBeneficiado = Var.VAR_NULL;

   public Var call() throws Exception {

    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo"))).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Cargo não pode ser vazio.")));
    }

    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("rubrica"))).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Rubrica não pode ser vazia.")));
    }

    RSBeneficiado =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Beneficiado"),Var.valueOf("select b.cargoEmExercicio.terceirizado.nomTerceirizado, b.cargoRubrica.rubrica.desRubrica, b.cargoEmExercicio.cargo.nomCargo from Beneficiado b where b.cargoRubrica.rubrica = :cargoRubricaRubrica"),Var.valueOf("cargoRubricaRubrica",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("rubrica"))));

    if (
    cronapi.database.Operations.hasElement(RSBeneficiado).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Esta rubrica n").toString() +
        cronapi.database.Operations.getField(RSBeneficiado,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf(" não pode ser excluida pois é utilizada no cargo ").toString() +
        cronapi.database.Operations.getField(RSBeneficiado,
        Var.valueOf("this[2]")).toString() +
        Var.valueOf(" ocupado pelo terceirizado ").toString() +
        cronapi.database.Operations.getField(RSBeneficiado,
        Var.valueOf("this[0]")).toString() +
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
// CRUDCargoRubrica
public static Var AntesDeIncluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSRubrica = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("Entrou no AntesDeIncluir").getObjectAsString());

    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo"))).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Cargo não pode ser vazio.")));
    }

    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("rubrica"))).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Rubrica não pode ser vazia.")));
    }

    System.out.println(
    Var.valueOf(
    Var.valueOf("Valor de  Cargo").toString() +
    cronapi.conversion.Operations.convert(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo")),
    Var.valueOf("STRING")).toString()).getObjectAsString());

    System.out.println(
    Var.valueOf(
    Var.valueOf("Valor de IdeRubrica").toString() +
    cronapi.conversion.Operations.convert(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("rubrica")),
    Var.valueOf("STRING")).toString()).getObjectAsString());

    RSRubrica =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Rubrica"),Var.valueOf("select r.desRubrica from Rubrica r where r.rubrica = :rubrica"),Var.valueOf("rubrica",
    cronapi.json.Operations.getJsonOrMapField(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("rubrica")),
    Var.valueOf("rubrica"))));

    if (
    cronapi.database.Operations.hasElement(RSRubrica).getObjectAsBoolean()) {

        if (
        cronapi.logic.Operations.isNullOrEmpty(
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("indPadrao"))).getObjectAsBoolean()) {

            cronapi.util.Operations.throwException(
            cronapi.util.Operations.createException(
            Var.valueOf(
            Var.valueOf("O indicador da obrigatoriedade da rubrica ").toString() +
            cronapi.database.Operations.getField(RSRubrica,
            Var.valueOf("this[0]")).toString() +
            Var.valueOf("r não pode ser nulo. Contacter o desenvolvedor do sistema.").toString())));
        }

        if (
        Var.valueOf(
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("vlrRubricaContrato")).compareTo(
        Var.valueOf(0)) < 0).getObjectAsBoolean()) {

            cronapi.util.Operations.throwException(
            cronapi.util.Operations.createException(
            Var.valueOf(
            Var.valueOf("O valor da rubrica ").toString() +
            cronapi.database.Operations.getField(RSRubrica,
            Var.valueOf("this[0]")).toString() +
            Var.valueOf(" não pode ser menor que zeros.").toString())));
        } else {

            cronapi.database.Operations.updateField(Entidade,
            Var.valueOf("vlrRubrica"),
            cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("vlrRubricaContrato")));
        }
    } else {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Rubrica não cadastrada. ")));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

