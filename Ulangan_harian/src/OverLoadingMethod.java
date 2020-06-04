/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class Matematika {
    static public double kuadrat (double nilai){
        return nilai * nilai;
    }
    static public int kuadrat (int nilai){
        return nilai * nilai;
    }
    static public double kuadrat (String nilai){
        double bilangan;
        
        bilangan = Double.valueOf(nilai).doubleValue();
        return bilangan * bilangan;
    }
}
public class OverLoadingMethod {
    public static void main(String [] args){
        System.out.println(Matematika.kuadrat(25.0));
        System.out.println(Matematika.kuadrat(25));
        System.out.println(Matematika.kuadrat("25"));
    }
}
