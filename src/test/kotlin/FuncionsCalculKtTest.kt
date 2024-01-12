import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class FuncionsCalculKtTest
@Test
fun checkCalculantElCostDelConsum(): Unit {
    var litresIntroduitsPelUsuari = 150f
    var esperat = litresIntroduitsPelUsuari * 0.15f
    assertEquals(esperat, litresIntroduitsPelUsuari)
}

@Test
fun checkAplicantElDescompteFNM(){
    var membresUnitatFamiliar = 6
    var esperat = membresUnitatFamiliar * 0.50f
    assertEquals(esperat, membresUnitatFamiliar)
}