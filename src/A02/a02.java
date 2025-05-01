package A02;

/**
 * Crear un calendario que muestre todos los meses del año y sus semanas de forma clara y organizada. Nada de efectos especiales ni complicaciones innecesarias, solo un buen código que haga el trabajo. Crea un programa que:
 * Itere los meses del año
 * Itere las semanas del mes
 */

public class a02 {
    public static void main(String[] args) {
        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                        "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        for (String mes : meses) {
            System.out.println(mes + " :");
            for (int semana = 1; semana <= 4; semana++){
                System.out.println(" Semana " + semana);
            }
        }
    }
}
