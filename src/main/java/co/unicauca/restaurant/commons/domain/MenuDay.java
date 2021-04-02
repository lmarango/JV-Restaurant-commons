
package co.unicauca.restaurant.commons.domain;

import java.util.ArrayList;

public class MenuDay {

    public MenuDay() {
    }

    enum Bebidas {
        LIMONADA, GASEOSA, AGUA
    }

    enum Proteina {
        POLLO, CARNECERDO, RES, PESCADO
    }

    enum frutasyVegetales {
        ENSALADADEFRUTAS, TOMATES, BROCOLY
    }

    enum Carbohidrato {
        ARROZ, PASTA, LENTEJAS, FRIJOL
    }

    enum Adicion {
        POSTRE, ARROZ, CHOCOLATE
    }

    ArrayList<String> Componentes = new ArrayList<String>();

    public ArrayList<String> getComponentes() {
        return Componentes;
    }

    public void setComponentes(ArrayList<String> Componentes) {
        this.Componentes = Componentes;
    }

}
