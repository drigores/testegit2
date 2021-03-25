package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.lang.Math;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GERAL {

public static final int TIMEOUT = 300;

/**
 *
 * @param TipoInstrumentoContratual
 * @param NumInstrumentoContratual
 * @param AnoInstrumentoContratual
 * @return Var
 */
// GERAL
public static Var FormataInstrumentoContratual(Var TipoInstrumentoContratual, Var NumInstrumentoContratual, Var AnoInstrumentoContratual) throws Exception {
 return new Callable<Var>() {

   private Var RSTipoInstrumentoContratual = Var.VAR_NULL;
   private Var sContratoAnoNumero = Var.VAR_NULL;

   public Var call() throws Exception {

    RSTipoInstrumentoContratual =
    cronapi.database.Operations.query(Var.valueOf("stc.entity.STCTipoInstrContratual"),Var.valueOf("select s.txtTipoInstrContratual from STCTipoInstrContratual s where s.codTipoInstrContratual = :codTipoInstrContratual"),Var.valueOf("codTipoInstrContratual",TipoInstrumentoContratual));

    if (
    cronapi.database.Operations.hasElement(RSTipoInstrumentoContratual).getObjectAsBoolean()) {

        sContratoAnoNumero =
        Var.valueOf(
        cronapi.database.Operations.getField(RSTipoInstrumentoContratual,
        Var.valueOf("this[5]")).toString() +
        Var.valueOf(" ").toString() +
        cronapi.conversion.Operations.convert(NumInstrumentoContratual,
        Var.valueOf("STRING")).toString() +
        Var.valueOf("/").toString() +
        cronapi.conversion.Operations.convert(
        cronapi.conversion.Operations.convert(AnoInstrumentoContratual,
        Var.valueOf("STRING")),
        Var.valueOf("STRING")).toString());
    } else {

        sContratoAnoNumero =
        Var.valueOf(
        TipoInstrumentoContratual.toString() +
        Var.valueOf(" ").toString() +
        cronapi.conversion.Operations.convert(NumInstrumentoContratual,
        Var.valueOf("STRING")).toString() +
        Var.valueOf("/").toString() +
        cronapi.conversion.Operations.convert(
        cronapi.conversion.Operations.convert(AnoInstrumentoContratual,
        Var.valueOf("STRING")),
        Var.valueOf("STRING")).toString());
    }

    cronapi.database.Operations.close(RSTipoInstrumentoContratual);
    return sContratoAnoNumero;
   }
 }.call();
}

/**
 *
 * @param anoFeriado
 * @return Var
 */
// Retorna todos os Feriados Padrões de um o Ano.
//
// Como Tiradentes pode chocar com a semana santa, o fluxo faz um tratamento para identificar uma eventual colisão.
public static Var FeriadosAno(Var anoFeriado) throws Exception {
 return new Callable<Var>() {

   private Var domingoPascoa = Var.VAR_NULL;
   private Var sextaFeiraPaixao = Var.VAR_NULL;
   private Var quintaFeiraSanta = Var.VAR_NULL;
   private Var Tiradentes = Var.VAR_NULL;
   private Var listaFeriados = Var.VAR_NULL;

   public Var call() throws Exception {

    domingoPascoa =
    blockly.GERAL.Pascoa(
    Var.valueOf(Pascoa(anoFeriado)));

    sextaFeiraPaixao =
    cronapi.dateTime.Operations.incDay(domingoPascoa,
    Var.valueOf(-2));

    quintaFeiraSanta =
    cronapi.dateTime.Operations.incDay(domingoPascoa,
    Var.valueOf(-3));

    Tiradentes =
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(4),
    Var.valueOf(21),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL);

    listaFeriados =
    cronapi.list.Operations.newList(
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(1),
    Var.valueOf(1),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Confraternização Universal"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.incDay(domingoPascoa,
    Var.valueOf(-40)),
    Var.valueOf("Terça-feira gorda"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.incDay(domingoPascoa,
    Var.valueOf(-41)),
    Var.valueOf("Segunda-feira de carnaval"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.incDay(domingoPascoa,
    Var.valueOf(-41)),
    Var.valueOf("Quarta-feira de cinzas"),
    Var.valueOf(1)));

    if (
    Var.valueOf(Tiradentes.compareTo(quintaFeiraSanta) < 0).getObjectAsBoolean()) {

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(Tiradentes,
        Var.valueOf("Tiradentes"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(quintaFeiraSanta,
        Var.valueOf("Quinta-feira santa"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(sextaFeiraPaixao,
        Var.valueOf("Sexta-feira da paixão"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(domingoPascoa,
        Var.valueOf("Páscoa"),
        Var.valueOf(0)));
    } else if (
    Var.valueOf(Tiradentes.compareTo(domingoPascoa) > 0).getObjectAsBoolean()) {

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(quintaFeiraSanta,
        Var.valueOf("Quinta-feira santa"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(sextaFeiraPaixao,
        Var.valueOf("Sexta-feira da paixão"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(domingoPascoa,
        Var.valueOf("Páscoa"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(Tiradentes,
        Var.valueOf("Tiradentes"),
        Var.valueOf(0)));
    } else if (
    Var.valueOf(Tiradentes.equals(quintaFeiraSanta)).getObjectAsBoolean()) {

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(Tiradentes,
        Var.valueOf("Tiradentes"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(sextaFeiraPaixao,
        Var.valueOf("Sexta-feira da paixão"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(domingoPascoa,
        Var.valueOf("Páscoa"),
        Var.valueOf(0)));
    } else if (
    Var.valueOf(
    Var.valueOf(Tiradentes.equals(sextaFeiraPaixao)).getObjectAsBoolean() ||
    Var.valueOf(Tiradentes.equals(domingoPascoa)).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(quintaFeiraSanta,
        Var.valueOf("Quinta-feira santa"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(sextaFeiraPaixao,
        Var.valueOf("Sexta-feira da paixão"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(domingoPascoa,
        Var.valueOf("Páscoa"),
        Var.valueOf(0)));
    } else {

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(quintaFeiraSanta,
        Var.valueOf("Quinta-feira santa"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(sextaFeiraPaixao,
        Var.valueOf("Sexta-feira da paixão"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(Tiradentes,
        Var.valueOf("Tiradentes"),
        Var.valueOf(0)));

        cronapi.list.Operations.setLast(listaFeriados,
        cronapi.list.Operations.newList(domingoPascoa,
        Var.valueOf("Páscoa"),
        Var.valueOf(0)));
    }

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(5),
    Var.valueOf(1),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Dia do trabalho"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.incDay(domingoPascoa,
    Var.valueOf(60)),
    Var.valueOf("Corpus Cristie"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(9),
    Var.valueOf(7),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Independência do Brasil"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(10),
    Var.valueOf(12),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Padroeira do Brasil"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(11),
    Var.valueOf(2),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Finados"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(11),
    Var.valueOf(15),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Proclamação da República"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(12),
    Var.valueOf(24),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Véspera de Natal"),
    Var.valueOf(2)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(12),
    Var.valueOf(25),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Natal"),
    Var.valueOf(0)));

    cronapi.list.Operations.setLast(listaFeriados,
    cronapi.list.Operations.newList(
    cronapi.dateTime.Operations.newDate(anoFeriado,
    Var.valueOf(12),
    Var.valueOf(31),
    Var.VAR_NULL,
    Var.VAR_NULL,
    Var.VAR_NULL),
    Var.valueOf("Véspera de Ano Novo"),
    Var.valueOf(2)));
    return listaFeriados;
   }
 }.call();
}

/**
 *
 * @param Ano
 * @return Var
 */
// Implementada segundo o algoritmo de Meeus/Jones/Butcher.
public static Var Pascoa(Var Ano) throws Exception {
 return new Callable<Var>() {

   private Var a = Var.VAR_NULL;
   private Var b = Var.VAR_NULL;
   private Var c = Var.VAR_NULL;
   private Var d = Var.VAR_NULL;
   private Var e = Var.VAR_NULL;
   private Var f = Var.VAR_NULL;
   private Var g = Var.VAR_NULL;
   private Var h = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var k = Var.VAR_NULL;
   private Var l = Var.VAR_NULL;
   private Var m = Var.VAR_NULL;
   private Var MES = Var.VAR_NULL;
   private Var DIA = Var.VAR_NULL;
   private Var sPascoa = Var.VAR_NULL;
   private Var pascoa = Var.VAR_NULL;

   public Var call() throws Exception {

    a =
    cronapi.math.Operations.mod(Ano,
    Var.valueOf(19));

    b =
    cronapi.math.Operations.floor(
    cronapi.math.Operations.divisor(Ano,
    Var.valueOf(100)));

    c =
    cronapi.math.Operations.mod(Ano,
    Var.valueOf(100));

    d =
    cronapi.math.Operations.floor(
    cronapi.math.Operations.divisor(b,
    Var.valueOf(4)));

    e =
    cronapi.math.Operations.mod(b,
    Var.valueOf(4));

    f =
    cronapi.math.Operations.floor(
    cronapi.math.Operations.divisor(
    cronapi.math.Operations.sum(b,
    Var.valueOf(8)),
    Var.valueOf(25)));

    g =
    cronapi.math.Operations.floor(
    cronapi.math.Operations.divisor(
    cronapi.math.Operations.sum(cronapi.math.Operations.subtract(b,f),
    Var.valueOf(1)),
    Var.valueOf(3)));

    h =
    cronapi.math.Operations.mod((
    cronapi.math.Operations.sum(cronapi.math.Operations.subtract(cronapi.math.Operations.sum(
    cronapi.math.Operations.multiply(
    Var.valueOf(19),a),b),d,g),
    Var.valueOf(15))),
    Var.valueOf(30));

    i =
    cronapi.math.Operations.floor(
    cronapi.math.Operations.divisor(c,
    Var.valueOf(4)));

    k =
    cronapi.math.Operations.mod(c,
    Var.valueOf(4));

    l =
    cronapi.math.Operations.mod((
    cronapi.math.Operations.subtract(cronapi.math.Operations.sum(
    Var.valueOf(32),
    cronapi.math.Operations.multiply(
    Var.valueOf(2),e),
    cronapi.math.Operations.multiply(
    Var.valueOf(2),i)),h,k)),
    Var.valueOf(7));

    m =
    cronapi.math.Operations.floor(
    cronapi.math.Operations.divisor(
    cronapi.math.Operations.sum(a,
    cronapi.math.Operations.multiply(
    Var.valueOf(11),h),
    cronapi.math.Operations.multiply(
    Var.valueOf(22),l)),
    Var.valueOf(451)));

    MES =
    cronapi.conversion.Operations.convert(
    cronapi.math.Operations.floor(
    cronapi.math.Operations.divisor(
    cronapi.math.Operations.sum(cronapi.math.Operations.subtract(cronapi.math.Operations.sum(h,l),
    cronapi.math.Operations.multiply(
    Var.valueOf(7),m)),
    Var.valueOf(114)),
    Var.valueOf(31))),
    Var.valueOf("INTEGER"));

    DIA =
    cronapi.conversion.Operations.convert(
    cronapi.math.Operations.sum(
    Var.valueOf(1),
    cronapi.math.Operations.mod((
    cronapi.math.Operations.sum(cronapi.math.Operations.subtract(cronapi.math.Operations.sum(h,l),
    cronapi.math.Operations.multiply(
    Var.valueOf(7),m)),
    Var.valueOf(114))),
    Var.valueOf(31))),
    Var.valueOf("INTEGER"));

    sPascoa =
    Var.valueOf(
    cronapi.text.Operations.getLettersFromEndToFromLast((
    Var.valueOf(
    Var.valueOf("00").toString() +
    cronapi.conversion.Operations.convert(DIA,
    Var.valueOf("STRING")).toString())),
    Var.valueOf(2)).toString() +
    Var.valueOf("/").toString() +
    cronapi.text.Operations.getLettersFromEndToFromLast((
    Var.valueOf(
    Var.valueOf("00").toString() +
    cronapi.conversion.Operations.convert(MES,
    Var.valueOf("STRING")).toString())),
    Var.valueOf(2)).toString() +
    Var.valueOf("/").toString() +
    cronapi.text.Operations.getLettersFromEndToFromLast((
    Var.valueOf(
    Var.valueOf("0000").toString() +
    cronapi.conversion.Operations.convert(Ano,
    Var.valueOf("STRING")).toString())),
    Var.valueOf(4)).toString());

    pascoa =
    cronapi.conversion.Operations.convert(
    cronapi.dateTime.Operations.formatDateTime(sPascoa,
    Var.valueOf("dd/MM/yyyy")),
    Var.valueOf("DATE"));
    return pascoa;
   }
 }.call();
}

}

