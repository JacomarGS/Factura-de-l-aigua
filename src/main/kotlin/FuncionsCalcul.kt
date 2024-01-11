fun emetreFactura() {
    // Llegim dades d'entrada
    var litresConsumits:Float = llegirLitresConsumits()
    var unitatFamiliar:Boolean = llegirTipusDeUnitatFamiliar()
    var membresUnitatFamiliar:Int = if (unitatFamiliar) llegirMembresDeLaUnitatFamiliar()
                                    else 0
    var boSocial:Boolean = llegirBoSocial()

    // Definim la quota fixa
    var quotaFixa:Float = if (boSocial) 3.0f
                          else 6.0f

    // Definim la quota variable
    var costDelsLitresConsumits:Float = calculantElCostDelConsum(litresConsumits)

    // Definim el descompte per família nombrosa o monoparental
    var descompteFNM:Float = if (unitatFamiliar && membresUnitatFamiliar >= 2) aplicantElDescompteFNM(costDelsLitresConsumits, membresUnitatFamiliar)
                             else 0.0f

    // Definim el descompte per bo social
    var descompteBoSocial:Float = if (boSocial) aplicantElDescompteBoSocial(costDelsLitresConsumits)
                                  else 0.0f

    // Calculem el total de la factura
    var totalFactura:Float = calculantElTotalDeLaFactura (quotaFixa, costDelsLitresConsumits, descompteFNM, descompteBoSocial)

    // Imprimim la factura
    var factura = imprimintTotalFactura(quotaFixa, costDelsLitresConsumits, descompteFNM, descompteBoSocial, totalFactura)
    println(factura)
}

fun calculantElCostDelConsum (pLitresConsumits:Float): Float {
    return when {
        pLitresConsumits < 50f -> pLitresConsumits + 0.0f
        pLitresConsumits in 50f .. 200f -> pLitresConsumits * 0.15f
        else -> pLitresConsumits * 0.30f
    }
}

fun aplicantElDescompteFNM (pCostDelsLitresConsumits: Float, pMembresUnitatFamiliar: Int): Float {
    val descompteMaxim = 0.50f
    var pDescompteFNM:Float = 0.10f * pMembresUnitatFamiliar
    return if (pDescompteFNM > descompteMaxim) {
        descompteMaxim * pCostDelsLitresConsumits
    } else {
        pDescompteFNM * pCostDelsLitresConsumits
    }
}

fun aplicantElDescompteBoSocial (pCostDelsLitresConsumits: Float): Float {
    val descompteBoSocial = 0.80f * pCostDelsLitresConsumits
    return descompteBoSocial
}

fun calculantElTotalDeLaFactura (pQuotaFixa:Float, pCostDelsLitresConsumits:Float, pDescompteFNM:Float, pDescompteBoSocial:Float): Float {
    val totalFactura:Float = pQuotaFixa + pCostDelsLitresConsumits
    return if (pDescompteBoSocial > pDescompteFNM){
        totalFactura - pDescompteBoSocial
    } else {
        totalFactura - pDescompteFNM
    }
}

