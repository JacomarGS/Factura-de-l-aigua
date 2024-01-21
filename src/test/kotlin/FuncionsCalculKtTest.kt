import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class FuncionsCalculKtTest {
    @Test
    fun testCalculantElCostDelConsumMenysDe50Litres() {
        val resultat = calculantElCostDelConsum(40f)
        assertEquals(40f, resultat)
    }

    @Test
    fun testCalculantElCostDelConsumEntre50i200Litres() {
        val resultat = calculantElCostDelConsum(120f)
        assertEquals(18f, resultat)
    }

    @Test
    fun testCalculantElCostDelConsumMesDe200Litres() {
        val resultat = calculantElCostDelConsum(250f)
        assertEquals(75f, resultat)
    }

    @Test
    fun testAplicantElDescompteFNMDescompteMenor() {
        val resultat = aplicantElDescompteFNM(100f, 2)
        assertEquals(20f, resultat)
    }

    @Test
    fun testAplicantElDescompteFNMDescompteMayor() {
        val resultat = aplicantElDescompteFNM(100f, 6)
        assertEquals(50f, resultat)
    }

    @Test
    fun testAplicantElDescompteBoSocial() {
        val resultat = aplicantElDescompteBoSocial(60f)
        assertEquals(48f, resultat)
    }
}