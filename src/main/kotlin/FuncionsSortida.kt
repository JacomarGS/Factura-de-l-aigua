fun bannerAmbBenvinguda() {
    println(BLUE_BOLD_BRIGHT +
            "                                        _        ____                     _                   \n" +
            "    /\\   (_)     (_) (_)               | |      |  _ \\                   | |                  \n" +
            "   /  \\   _  __ _ _   _  ___  ___    __| | ___  | |_) | __ _ _ __ ___ ___| | ___  _ __   __ _ \n" +
            "  / /\\ \\ | |/ _` | | | |/ _ \\/ __|  / _` |/ _ \\ |  _ < / _` | '__/ __/ _ \\ |/ _ \\| '_ \\ / _` |\n" +
            " / ____ \\| | (_| | |_| |  __/\\__ \\ | (_| |  __/ | |_) | (_| | | | (_|  __/ | (_) | | | | (_| |\n" +
            "/_/    \\_\\_|\\__, |\\__,_|\\___||___/  \\__,_|\\___| |____/ \\__,_|_|  \\___\\___|_|\\___/|_| |_|\\__,_|\n" +
            "             __/ |                                                                            \n" +
            "            |___/   "
            + RESET)
    println()
    println(BLUE_BOLD_BRIGHT + "Us donem la benvinguda a l'aplicació d'Aigües de Barcelona per generar la vostra factura mensual." + RESET)
    println()
}

fun missatgeDeGuiaPasAPas() {
    val guiaPasAPas= CYAN + """
        |################################################################################
        |#                                                                              #
        |#    Per emetre la factura del consum d'aigua mensual seguiu els passos        #
        |#    següents:                                                                 #
        |#                                                                              #
        |#    1. Seleccioneu al menú principal l'opció 'Emetre factura'.                #
        |#                                                                              #
        |#    2. A continuació, indiqueu els litres d'aigua que heu consumit al llarg   #
        |#       del mes.                                                               #
        |#                                                                              #
        |#    3. Si compleix la condició de família nombrosa o monoparental, se li      #
        |#       aplicarà un 10% de descompte per cada membre de la família (fins a un  #
        |#       màxim del 50%) sobre el consum. Escriviu la paraula 'true' per         #
        |#       confirmar aquesta condició o 'false' per negar-la. *                   #
        |#                                                                              #
        |#    4. Si actualment disposeu d'un bo social vigent, se us aplicarà un 80% de #
        |#       descompte sobre el consum i una reducció de la quota fixa a 3€.        #
        |#       Escriviu la paraula 'true' per confirmar aquesta condició o 'false'    #
        |#       per negar-la. *                                                        #
        |#                                                                              #
        |#    5. Finalment, es generarà la factura corresponent al consum d'aigua del   #
        |#       mes, la qual podrà veure desglossada per pantalla.                     #
        |#                                                                              #
        |#    ** Els descomptes no són acumulables, només es tindrà en compte el        #
        |#       descompte que més beneficiï el client.                                 #
        |#                                                                              #
        |################################################################################
        """ + RESET.trimMargin()
    println(guiaPasAPas)
}

fun imprimintTotalFactura (pQuotaFixa:Float, pCostDelsLitresConsumits:Float, pDescompteFNM:Float, pDescompteBoSocial:Float, pTotalFactura:Float) {
    val factura = CYAN + """
                FACTURA DEL CONSUM D'AIGUA DE L'ÚLTIM MES                 
             ===============================================                    
                                                                                
             Quota fixa ............................... ${pQuotaFixa}           
                                                                                
             Quota variable (cost del consum) ......... ${pCostDelsLitresConsumits}
                                                                                
             Descompte FNM ............................ ${pDescompteFNM}
                                                                                
             Descompte Bo Social ...................... ${pDescompteBoSocial}
                                                                                
             TOTAL FACTURA                              ${pTotalFactura}

        """ + RESET.trimMargin()
    println(factura)
}

fun missatgeDeSortida() {
    println(BLUE_BOLD_BRIGHT +
        "Gràcies per fer servir els nostres serveis."
    + RESET)
}
