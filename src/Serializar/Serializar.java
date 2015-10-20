package Serializar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Serializar {

    String ruta = "/home/oracle/Desktop/Pruebas/texto12.txt";

    public static void main(String[] args) {
        Serializar ser = new Serializar();
        Mclase obx = new Mclase("ola", -7, 2.7E10);
        Mclase obx1 = new Mclase();
        ser.Escribir(obx);
        ser.Leer(obx);

    }

    public void Escribir(Mclase obx) {
        try {

            FileOutputStream fos = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obx);
            System.out.println("Grabado");
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Leer(Mclase obx) {

        try {
            FileInputStream fis1 = new FileInputStream(ruta);
            ObjectInputStream ois1 = new ObjectInputStream(fis1);
            Mclase obj = (Mclase) ois1.readObject();
            System.out.println(obj.nome + " " + obj.num1 + " " + obj.num2);
            fis1.close();
            ois1.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
