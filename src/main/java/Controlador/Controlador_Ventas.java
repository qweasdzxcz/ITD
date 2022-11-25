package Controlador;

import Vista.Principal;
import static Vista.Principal.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Ventas implements ActionListener{
    
    private Principal principal;

    public Controlador_Ventas(Principal principal) {
        this.principal = principal;
        principal.btn_ventas.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
          if (e.getSource() == principal.btn_ventas) {
            principal.tabed.setSelectedComponent(panel_ventas);
            
        }
    }
    
}
