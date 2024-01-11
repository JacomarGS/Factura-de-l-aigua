fun emetreFactura() {
    // Llegim dades d'entrada
    var litresConsumits:Float = llegirLitresConsumits()
    var unitatFamiliar:Boolean = llegirTipusDeUnitatFamiliar()
    var membresUnitatFamiliar:Int = if (unitatFamiliar) llegirMembresDeLaUnitatFamiliar()
                                else 0
    var boSocial:Boolean = llegirBoSocial()

    // Inicialitzem variables
    var quotaFixa:Float = if (boSocial) 3.0f
                          else 6.0f
    var descompteFNM:Float = if (unitatFamiliar && membresUnitatFamiliar >= 2) 0.1f * membresUnitatFamiliar
                             else 0.0f
    var descompteBoSocial:Float = 0.8f

    //Calculem el cost del consum
    var costDelsLitresConsumits:Float = calculantElCostDelConsum(litresConsumits)
}

fun calculantElCostDelConsum (plitresConsumits:Float): Float {
    return when {
        plitresConsumits < 50f -> plitresConsumits + 0.0f
        plitresConsumits in 50f .. 200f -> plitresConsumits * 0.15f
        else -> plitresConsumits * 0.30f
    }
}