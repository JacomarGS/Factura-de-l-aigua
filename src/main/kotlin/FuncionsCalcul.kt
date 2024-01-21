import kotlin.math.roundToLong

/**
 * Function whose purpose is to articulate the calculation functions.
 * @author Jacomar
 * @since 11/01/2024
 */
fun emetreFactura() {
    // Reading input data
    val litresConsumits:Float = llegirLitresConsumits()
    val unitatFamiliar:Boolean = llegirTipusDeUnitatFamiliar()
    val membresUnitatFamiliar:Int = if (unitatFamiliar) llegirMembresDeLaUnitatFamiliar()
                                    else 0
    val boSocial:Boolean = llegirBoSocial()

    // Defining the fixed fee
    val quotaFixa:Float = if (boSocial) 3.0f
                          else 6.0f

    // Defining the variable fee
    val costDelsLitresConsumits:Float = calculantElCostDelConsum(litresConsumits)

    // Defining the value of the discount for large or single-parent families.
    val descompteFNM:Float = if (unitatFamiliar && membresUnitatFamiliar >= 2) aplicantElDescompteFNM(costDelsLitresConsumits, membresUnitatFamiliar)
                             else 0.0f

    // Defining the value of the discount for possessing the social bonus.
    val descompteBoSocial:Float = if (boSocial) aplicantElDescompteBoSocial(costDelsLitresConsumits)
                                  else 0.0f

    // Calculating the total invoice
    val totalFactura:Float = calculantElTotalDeLaFactura (quotaFixa, costDelsLitresConsumits, descompteFNM, descompteBoSocial)

    // Printing the invoice
    val factura = imprimintTotalFactura(quotaFixa, costDelsLitresConsumits, descompteFNM, descompteBoSocial, totalFactura)
    println(factura)
}
/**
 * This function determines the cost of the variable fee based on the number of liters provided by the user.
 * @author Jacomar
 * @since 11/01/2024
 * @param pLitresConsumits the number of liters provided by the user.
 * @return Output value
 */
fun calculantElCostDelConsum (pLitresConsumits:Float): Float {
    return when {
        pLitresConsumits < 50f -> pLitresConsumits + 0.0f
        pLitresConsumits in 50f .. 200f -> pLitresConsumits * 0.15f
        else -> pLitresConsumits * 0.30f
    }
}
/**
 * This function determines the value of the discount for large or single-parent families.
 * @author Jacomar
 * @since 11/01/2024
 * @param pCostDelsLitresConsumits the cost of the liters consumed by the user.
 * @param pMembresUnitatFamiliar number of family members of the user.
 * @return Output value
 */
fun aplicantElDescompteFNM (pCostDelsLitresConsumits: Float, pMembresUnitatFamiliar: Int): Float {
    val descompteMaxim = 0.50f
    val pDescompteFNM:Float = 0.10f * pMembresUnitatFamiliar
    return if (pDescompteFNM > descompteMaxim) {
        descompteMaxim * pCostDelsLitresConsumits
    } else {
        pDescompteFNM * pCostDelsLitresConsumits
    }
}
/**
 * This function determines the value of the discount for the social bonus.
 * @author Jacomar
 * @since 11/01/2024
 * @param pCostDelsLitresConsumits the cost of the liters consumed by the user.
 * @return Output value
 */
fun aplicantElDescompteBoSocial (pCostDelsLitresConsumits: Float): Float {
    val descompteBoSocial = 0.80f * pCostDelsLitresConsumits
    return descompteBoSocial
}
/**
 * This function calculates the total invoice amount based on the information provided by the user.
 * @author Jacomar
 * @since 11/01/2024
 * @param pQuotaFixa the fixed fee for water consumption determined by the supply company.
 * @param pCostDelsLitresConsumits the cost of the liters consumed by the user.
 * @param pDescompteFNM discount applied if the user confirms their status as a large or single-parent family.
 * @param pDescompteBoSocial discount applied if the user confirms their status as having a social voucher.
 * @return Output value
 */
fun calculantElTotalDeLaFactura (pQuotaFixa:Float, pCostDelsLitresConsumits:Float, pDescompteFNM:Float, pDescompteBoSocial:Float): Float {
    val totalFactura:Float = pQuotaFixa + pCostDelsLitresConsumits
    return if (pDescompteBoSocial > pDescompteFNM){
        totalFactura - pDescompteBoSocial
    } else {
        totalFactura - pDescompteFNM
    }
}

