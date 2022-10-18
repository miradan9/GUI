package GUI.Suma;//Add Program that uses a JOptionPane for the entry and go out.
import javax.swing.JOptionPane;

public class Suma {
    public static void main(String[] args) {
        //Obtein the users entry of the entry dialogues of JOptionPane
        String primerNumero= JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundoNumero= JOptionPane.showInputDialog("Introduzca el segundo entero");

        //Change the String entries for int values to use it in a matematic problem.
        int numero1=Integer.parseInt(primerNumero);
        int numero2=Integer.parseInt(segundoNumero);

        int suma=numero1+numero2;

        //show the answers in a dialogue message  of JOptionPane
        JOptionPane.showMessageDialog(null, "La suma es "+ suma, "Suma de dos enteros",JOptionPane.PLAIN_MESSAGE);
    }
}//end of the Suma class




