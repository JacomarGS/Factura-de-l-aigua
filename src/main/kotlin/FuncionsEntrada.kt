fun llegirOpcioUsuari(): Int {
    var controlErrorsLlegirOpcioUsuari = readInt(
        pMessageIn = "Seleccioneu una opció:\n" + "1. Emetre factura mensual.\n" + "2. Ajuda.\n" + "0. Sortir."
        , pMessageErrorDT = "Si us plau, seleccioneu 1 per emetre la vostra factura mensual, 2 per rebre ajuda o 0 per sortir de l'aplicació."
        , pMessageErrorDV = "Si us plau, seleccioneu 1 per emetre la vostra factura mensual, 2 per rebre ajuda o 0 per sortir de l'aplicació."
        , pMin = 0
        , pMax = 2
    )
    return controlErrorsLlegirOpcioUsuari
}

fun llegirLitresConsumits(): Float {
    var controlErrorsLlegirLitresConsumits = readFloat(
        pMessageIn = "Si us plau, introduïu el nombre de litres d'aigua que heu consumit aquest mes"
        , pMessageErrorDT = "Si us plau, introduïu només valors positius"
        , pMessageErrorDV = "Si us plau, introduïu només valors positius"
        , pMin = 0.0f
    )
    return controlErrorsLlegirLitresConsumits
}

fun llegirTipusDeUnitatFamiliar(): Boolean {
    var controlErrorsLlegirTipusUnitatFamiliar = readBoolean(
        pMessageIn = "Compleix la condició de família nombrosa o monoparental? Si us plau, escriviu la paraula 'true' en cas afirmatiu o 'false' en cas negatiu."
        , pMessageErrorDT = "Si us plau, escriviu la paraula 'true' en cas afirmatiu o 'false' en cas negatiu."
    )
    return controlErrorsLlegirTipusUnitatFamiliar
}

fun llegirMembresDeLaUnitatFamiliar(): Int {
    var controlErrorsLlegirUnitatFamiliar = readInt(
        pMessageIn = "Si compleix la condició de família nombrosa o monoparental, introduïu a continuació el nombre de membres de la seva unitat familiar"
        , pMessageErrorDT = "Si us plau, introduïu només valors positius sense decimals"
        , pMessageErrorDV = "Si us plau, introduïu només valors positius sense decimals"
        , pMin = 2
    )
    return controlErrorsLlegirUnitatFamiliar
}

fun llegirBoSocial(): Boolean {
    var controlErrorsLlegirBoSocial = readBoolean(
        pMessageIn = "Disposa de bo social? Si us plau, escriviu la paraula 'true' en cas afirmatiu o 'false' en cas negatiu.",
        pMessageErrorDT = "Si us plau, escriviu la paraula 'true' en cas afirmatiu o 'false' en cas negatiu."
    )
    return controlErrorsLlegirBoSocial
}