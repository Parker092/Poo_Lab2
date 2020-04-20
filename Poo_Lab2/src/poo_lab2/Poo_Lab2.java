package poo_lab2;

import entidades.edificio;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author PARKER(L)
 */
public class Poo_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        edificio deportivo = new edificio("Polideportivo Las Marias", "Aldea San Antonio, Santa Ana, El Salvador", "Edificio Deportivo", 30, 65, 1);
        edificio hospitalario = new edificio("Hospital Resurreccion", "Colonia IVU, Santa Ana, El Salvador", "Edificio Hospitalario", 120, 200, 2);
        edificio educativo = new edificio("Colegio San Chepe", "Altos del Palmar, Santa Ana, El Salvador", "Edificio Educativo", 60, 90, 1);
        int menu;
        do {
            String menuS =JOptionPane.showInputDialog("*** CONSTRUCTORA PARKER ***"+
                                                                                                "\n\n1 - Proyectos. \n2 - SALIR");
            menu = Integer.parseInt(menuS);
        switch (menu){
            case 1:
                int op;
                do {
                    String menuPP = JOptionPane.showInputDialog("*** CONSTRUCTORA PARKER ***\n*** PROYECTOS ***"+
                                                "\n\n1 - Polideportivo.\n2 - Hospital.\n3 - Centro Educativo.\n4 - SALIR");
                op = Integer.parseInt(menuPP);
                switch (op){
                    case 1:
                        String mnsjDep = "\nNombre: "+deportivo.getNombreEdificio()+
                                                        "\nTipo de construccion: "+deportivo.getTipoEdificio()+
                                                        "\nDireccion: "+deportivo.getDireccionEdificio()+
                                                        "\n\nMaterial: "+deportivo.material()+
                                                        "\nArea: "+df.format(deportivo.area())+" m cuadrados."+
                                                        "\n\nCosto: $"+df.format(deportivo.costo());
                        JOptionPane.showMessageDialog(null, mnsjDep);
                        break;
                    case 2:
                        String mnsjHosp = "\nNombre: "+hospitalario.getNombreEdificio()+
                                                        "\nTipo de construccion: "+hospitalario.getTipoEdificio()+
                                                        "\nDireccion: "+hospitalario.getDireccionEdificio()+
                                                        "\n\nMaterial: "+hospitalario.material()+
                                                        "\nArea: "+df.format(hospitalario.area())+" m cuadrados."+
                                                        "\n\nCosto: $"+df.format(hospitalario.costo());
                        JOptionPane.showMessageDialog(null, mnsjHosp);
                        break;
                    case 3:
                        String mnsjEdu = "\nNombre: "+educativo.getNombreEdificio()+
                                                        "\nTipo de construccion: "+educativo.getTipoEdificio()+
                                                        "\nDireccion: "+educativo.getDireccionEdificio()+
                                                        "\n\nMaterial: "+educativo.material()+
                                                        "\nArea: "+df.format(educativo.area())+" m cuadrados."+
                                                        "\n\nCosto: $"+df.format(educativo.costo());
                        JOptionPane.showMessageDialog(null, mnsjEdu);
                        break;
                }
                } while (op!=4);
                                        
                break;
            case 2:
                String mnsajeSalida = "Gracias por su visita ! :D";
                JOptionPane.showMessageDialog(null, mnsajeSalida);
                break;
        }
        } while (menu !=2);       
    }
    
}
