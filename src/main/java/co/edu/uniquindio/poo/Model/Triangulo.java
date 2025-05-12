package co.edu.uniquindio.poo.Model;

public class Triangulo {
  private int Base;
    private int Altura;
    private int lado;
    
    public Triangulo(int base, int altura, int lado) {
        
        this.Base = base;
        this.Altura = altura;
        this.lado = lado;
        
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int base) {
        Base = base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "Base=" + Base +
                ", Altura=" + Altura +
                ", lado=" + lado +
                '}';
    }
  
}
