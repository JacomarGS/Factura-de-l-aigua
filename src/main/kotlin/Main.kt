fun main() {
    do {
        bannerAmbBenvinguda()
        val opcioMenu = llegirOpcioUsuari()
        when(opcioMenu){
            1 -> emetreFactura()
            2 -> missatgeDeGuiaPasAPas()
            0 -> missatgeDeSortida()
            else -> println(RED_BOLD + "ERROR: Opció incorrecta" + RESET)
        }
    }while(opcioMenu!= 0)
}