/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miJuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hector
 */
class clickEnBoton implements ActionListener {
    private final VentanaJuego outer;

    clickEnBoton(final VentanaJuego outer) {
        this.outer = outer;
    }

    //Clase que sirve para usar solo 1 action listener para los 9 botones
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 1; i <= 9; i++) {
            if (outer.botones[i].equals(e.getSource())) {
                //Source trae el boton de origen
                if (outer.botones[i].getText().isEmpty()) {
                    outer.tirada(i);
                }
                break;
            }
        }
    }
    
}
