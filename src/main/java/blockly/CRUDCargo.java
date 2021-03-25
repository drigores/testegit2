package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CRUDCargo {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CRUDCargo
public static Var AntesDeAlterar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSOutroCargosJaExiste = Var.VAR_NULL;
   private Var RSOutraSiglaJaExiste = Var.VAR_NULL;
   private Var RSOutroCargoFemininoJaExiste = Var.VAR_NULL;

   public Var call() throws Exception {

    RSOutroCargosJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Cargo"),Var.valueOf("select c.cargo, c.nomCargo, c.sigCargo from Cargo c where c.codTipoInstrumentoContratual = :codTipoInstrumentoContratual AND c.anoInstrumentoContratual = :anoInstrumentoContratual AND c.numInstrumentoContratual = :numInstrumentoContratual AND c.cargo <> :cargo AND c.nomCargo = :nomCargo"),Var.valueOf("codTipoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("codTipoInstrumentoContratual"))),Var.valueOf("anoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("anoInstrumentoContratual"))),Var.valueOf("numInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("numInstrumentoContratual"))),Var.valueOf("cargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo"))),Var.valueOf("nomCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("nomCargo"))));

    if (
    cronapi.database.Operations.hasElement(RSOutroCargosJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida. Já existe um outro cargo com o mesmo nome de ome ").toString() +
        cronapi.database.Operations.getField(RSOutroCargosJaExiste,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf(", cuja sigla é ").toString() +
        cronapi.database.Operations.getField(RSOutroCargosJaExiste,
        Var.valueOf("this[2]")).toString() +
        Var.valueOf(".").toString())));
    }

    RSOutraSiglaJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Cargo"),Var.valueOf("select c.cargo, c.nomCargo, c.sigCargo from Cargo c where c.codTipoInstrumentoContratual = :codTipoInstrumentoContratual AND c.anoInstrumentoContratual = :anoInstrumentoContratual AND c.numInstrumentoContratual = :numInstrumentoContratual AND c.cargo <> :cargo AND c.sigCargo = :sigCargo"),Var.valueOf("codTipoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("codTipoInstrumentoContratual"))),Var.valueOf("anoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("anoInstrumentoContratual"))),Var.valueOf("numInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("numInstrumentoContratual"))),Var.valueOf("cargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo"))),Var.valueOf("sigCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("sigCargo"))));

    if (
    cronapi.database.Operations.hasElement(RSOutraSiglaJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida. Já existe um outro cargo com o mesmo nome de ome ").toString() +
        cronapi.database.Operations.getField(RSOutroCargosJaExiste,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf(", cuja sigla també é ").toString() +
        cronapi.database.Operations.getField(RSOutroCargosJaExiste,
        Var.valueOf("this[2]")).toString() +
        Var.valueOf(".").toString())));
    }

    RSOutroCargoFemininoJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Cargo"),Var.valueOf("select c.cargo, c.nomCargo, c.sigCargo, c.nomCargoFeminino from Cargo c where c.codTipoInstrumentoContratual = :codTipoInstrumentoContratual AND c.anoInstrumentoContratual = :anoInstrumentoContratual AND c.numInstrumentoContratual = :numInstrumentoContratual AND c.cargo <> :cargo AND c.nomCargoFeminino = :nomCargoFeminino"),Var.valueOf("codTipoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("codTipoInstrumentoContratual"))),Var.valueOf("anoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("anoInstrumentoContratual"))),Var.valueOf("numInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("numInstrumentoContratual"))),Var.valueOf("cargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo"))),Var.valueOf("nomCargoFeminino",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("nomCargoFeminino"))));

    if (
    cronapi.database.Operations.hasElement(RSOutroCargoFemininoJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Alteração não permitida. Já existe um outro cargo com o mesmo nome de ome ").toString() +
        cronapi.database.Operations.getField(RSOutroCargoFemininoJaExiste,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf(", cuja sigla é ").toString() +
        cronapi.database.Operations.getField(RSOutroCargoFemininoJaExiste,
        Var.valueOf("this[2]")).toString() +
        Var.valueOf("e que possui o mesmo nome de cargo feminino ").toString() +
        cronapi.database.Operations.getField(RSOutroCargoFemininoJaExiste,
        Var.valueOf("this[3]")).toString() +
        Var.valueOf(" já cadastrado no sistema.").toString())));
    }

    if (
    /*# sourceMappingStart=sOJcj2/YL;hK;mzB|]qJ */
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("indPercentuaisCargo")).negate().getObjectAsBoolean()) {

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perEncargosSociaisContrato"),
        Var.VAR_NULL);

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perTaxaAdministracaoContrato"),
        Var.VAR_NULL);

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perEncargosSociais"),
        Var.VAR_NULL);

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perTaxaAdministracao"),
        Var.VAR_NULL);
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
// CRUDCargo
public static Var AntesDeIncluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSCargoJaExiste = Var.VAR_NULL;
   private Var RSCargoFemininoJaExiste = Var.VAR_NULL;
   private Var RSSiglaJaExiste = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("Entrou Aqui").getObjectAsString());

    RSCargoJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Cargo"),Var.valueOf("select c.cargo, c.nomCargo from Cargo c where c.codTipoInstrumentoContratual = :codTipoInstrumentoContratual AND c.anoInstrumentoContratual = :anoInstrumentoContratual AND c.numInstrumentoContratual = :numInstrumentoContratual AND c.nomCargo = :nomCargo"),Var.valueOf("codTipoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("codTipoInstrumentoContratual"))),Var.valueOf("anoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("anoInstrumentoContratual"))),Var.valueOf("numInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("numInstrumentoContratual"))),Var.valueOf("nomCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("nomCargo"))));

    if (
    cronapi.database.Operations.hasElement(RSCargoJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida. Já existe um cargo com nome de ").toString() +
        cronapi.database.Operations.getField(RSCargoJaExiste,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf(" cadastrado neste contrato no sistema.").toString())));
    }

    RSCargoFemininoJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Cargo"),Var.valueOf("select c.cargo, c.nomCargoFeminino from Cargo c where c.codTipoInstrumentoContratual = :codTipoInstrumentoContratual AND c.anoInstrumentoContratual = :anoInstrumentoContratual AND c.numInstrumentoContratual = :numInstrumentoContratual AND c.nomCargoFeminino = :nomCargoFeminino"),Var.valueOf("codTipoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("codTipoInstrumentoContratual"))),Var.valueOf("anoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("anoInstrumentoContratual"))),Var.valueOf("numInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("numInstrumentoContratual"))),Var.valueOf("nomCargoFeminino",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("nomCargoFeminino"))));

    if (
    cronapi.database.Operations.hasElement(RSCargoFemininoJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida. Já existe um cargo com nome no feminino de ").toString() +
        cronapi.database.Operations.getField(RSCargoFemininoJaExiste,
        Var.valueOf("this[1]")).toString() +
        Var.valueOf(" cadastrado neste contrato no sistema.").toString())));
    }

    RSSiglaJaExiste =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.Cargo"),Var.valueOf("select c.cargo, c.nomCargo, c.sigCargo from Cargo c where c.codTipoInstrumentoContratual = :codTipoInstrumentoContratual AND c.anoInstrumentoContratual = :anoInstrumentoContratual AND c.numInstrumentoContratual = :numInstrumentoContratual AND c.sigCargo = :sigCargo"),Var.valueOf("codTipoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("codTipoInstrumentoContratual"))),Var.valueOf("anoInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("anoInstrumentoContratual"))),Var.valueOf("numInstrumentoContratual",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("numInstrumentoContratual"))),Var.valueOf("sigCargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("sigCargo"))));

    if (
    cronapi.database.Operations.hasElement(RSSiglaJaExiste).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Inclusão não permitida. Já existe um cargo com sigla  ").toString() +
        cronapi.database.Operations.getField(RSSiglaJaExiste,
        Var.valueOf("this[2]")).toString() +
        Var.valueOf(" cadastrada neste contrato no sistema.").toString())));
    }

    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("qtdPessoasContrato"))).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Inclusão não permitida. É obrigatório informar uma quantidade de pessoas que serão contratada.")));
    }

    cronapi.database.Operations.updateField(Entidade,
    Var.valueOf("qtdPessoas"),
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("qtdPessoasContrato")));

    if (
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("indPercentuaisCargo")).getObjectAsBoolean()) {

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perEncargosSociais"),
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("perEncargosSociaisContrato")));

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perTaxaAdministracao"),
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("perTaxaAdministracaoContrato")));
    } else {

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perEncargosSociais"),
        Var.VAR_NULL);

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perTaxaAdministracao"),
        Var.VAR_NULL);

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perEncargosSociaisContrato"),
        Var.VAR_NULL);

        cronapi.database.Operations.updateField(Entidade,
        Var.valueOf("perTaxaAdministracaoContrato"),
        Var.VAR_NULL);
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
// Descreva esta função...
public static Var AntesDeExcluir(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var RSPossuiRubrica = Var.VAR_NULL;
   private Var RSPossuiCargoEmExercicio = Var.VAR_NULL;

   public Var call() throws Exception {

    RSPossuiRubrica =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.CargoRubrica"),Var.valueOf("select cr.rubrica.desRubrica from CargoRubrica cr where cr.cargo = :cargo"),Var.valueOf("cargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo"))));

    if (
    cronapi.database.Operations.hasElement(RSPossuiRubrica).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão não permitida. Este cargo possuia a rubrica ").toString() +
        cronapi.database.Operations.getField(RSPossuiRubrica,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf(".").toString())));
    }

    RSPossuiCargoEmExercicio =
    cronapi.database.Operations.queryPaged(Var.valueOf("stc.entity.CargoEmExercicio"),Var.valueOf("select c.terceirizado.nomTerceirizado from CargoEmExercicio c where c.cargo = :cargo"),Var.valueOf(false),Var.valueOf("cargo",
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cargo"))),Var.valueOf("limit",
    Var.valueOf(1)),Var.valueOf("offset",Var.VAR_NULL));

    if (
    cronapi.database.Operations.hasElement(RSPossuiCargoEmExercicio).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf(
        Var.valueOf("Exclusão não permitida. O terceirizado ").toString() +
        cronapi.database.Operations.getField(RSPossuiCargoEmExercicio,
        Var.valueOf("this[0]")).toString() +
        Var.valueOf(" foi designado para este cargo.").toString())));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

