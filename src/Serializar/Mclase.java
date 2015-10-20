package Serializar;

import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Mclase implements Serializable{
    String nome;
    transient int num1;
    double num2;

    public Mclase() {
    }

    public Mclase(String nome, int num1, double num2) {
        this.nome = nome;
        this.num1 = num1;
        this.num2 = num2;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}
