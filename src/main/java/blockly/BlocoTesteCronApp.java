package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoTesteCronApp {

public static final int TIMEOUT = 300;

/**
 *
 * @param p
 * @return Var
 */
// BlocoTesteCronApp
public static Var DesabilitaComponente(Var p) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
    Var.valueOf("idEntrada"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
    Var.valueOf("idSexo"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
    Var.valueOf("idComboRubrica"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// BlocoTesteCronApp
public static Var HabilitaComponente() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
    Var.valueOf("idEntrada"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
    Var.valueOf("idSexo"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
    Var.valueOf("idComboRubrica"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

