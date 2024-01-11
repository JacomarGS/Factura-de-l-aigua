fun main() {
    do {
        bannerAmbBenvinguda()
        val opcioMenu = llegirOpcioUsuari()
        when(opcioMenu){
            1 -> emetreFactura()
            2 -> missatgeDeGuiaPasAPas()
            0 -> missatgeDeSortida()
        }
    }while(opcioMenu!= 0)
}