package br.com.magalu.ExercicioI.Exercicio4;

public class MinimoParentese {

    public double a = 6*(3+2);
    public double b = 2+6*(3+2);
    public double c = 2+3*6/(2+4d);
    public double d = 2*8/(3+1d);
    public double e = 3+(16-2)/(2*(9-2d));
    public double f = 6/3d+8/2d;
    public double g = (3+8/2d)*4+3*2;
    public double h = 6*3*3+6-10;
    public double i = (10*8+3)*9;
    public double j = -12*-4+3*-4;

    //construtor da classe
    public MinimoParentese(){
    }

    //metodo para imprimir valores
    public void print(double x){
        System.out.println("---------" + x + "---------");
    }

}

//    public double a = 6*(3+2);
//    public double b = 2+(6*(3+2));
//    public double c = 2+(3*6)/(2+4d);
//    public double d = 2*(8/(3+1d));
//    public double e = 3+(16-2)/(2*(9-2d));
//    public double f = (6/3d)+(8/2d);
//    public double g = ((3+(8/2d))*4)+(3*2);
//    public double h = (6*(3*3)+6)-10;
//    public double i = (((10*8)+3)*9);
//    public double j = ((-12)*(-4))+(3*(-4));