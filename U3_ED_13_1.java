/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u3_ed_13_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PROGRAMAR
 */
public class U3_ED_13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pila estática
        Pila pila1=null;
        do{
            try{
            int capacidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese capacidad de la pila:"));
            pila1=new Pila(capacidad);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Tiene que ser número entero");
            }
        }while(pila1==null);
        int resp;
        do{
            resp=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Qué desea hacer?\n1.-Insertar dato\n2.-Eliminar dato\n3.-Elemento en tope\n4.-Desplegar contenido\n5.-Tamaño de la pila\n6.-Salir"));
            switch(resp){
                case 1:
                    if(pila1.estaLlena()==false){
                        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese dato:"));
                        pila1.push(n);
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila esta llena");
                    }
                    break;
                case 2:
                    if(pila1.estaVacia()==false){
                        JOptionPane.showMessageDialog(null,"Dato eliminado: "+pila1.pop());
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila esta vacia");
                    }
                    break;
                case 3:
                    if(pila1.estaVacia()==false){
                        JOptionPane.showMessageDialog(null,"Dato en tope: "+pila1.topePila());
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila esta vacia");
                    }
                    break;
                case 4:
                    if(pila1.estaVacia()==false){
                        pila1.desplegar();
                    }else{
                        JOptionPane.showMessageDialog(null,"La pila esta vacia");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"La capacidad de la pila es: "+pila1.capacidadPila());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Terminando programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no valida");
            }
        }while(resp!=6);
    }
}
