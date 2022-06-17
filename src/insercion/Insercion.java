/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insercion;

import java.util.Scanner;

/**
 *
 * @author Torrev_101
 */
public class Insercion {
    public static void main(String []args){
        Nodo p;        
        Nodo px=new Nodo();
        Nodo q=new Nodo();
        Nodo cab=new Nodo();
        int pos=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            p=new Nodo();
            p.dato=sc.nextInt();
            if(i==0){
                pos=i;
            }
            if(i==0){
                cab=p;
                q=p;
            }else{
                
                q.enlace=p;
                q=p;
            }
        }
        p=cab;
        for(int i=0;i<3;i++){
            if(i==pos){
                System.out.print("posicion "+i+"\n valor: "+p.dato);
            }            
            p=p.enlace;
        }
        System.out.println("\ninsercion");
        System.out.println("");
        p=cab;
        q=p;
        for(int i=0;i<4;i++){           
            if(i==pos){
                /*if(i==0 && pos==0){
                    px.enlace=p;
                    p=p.enlace;
                }*/
                System.out.println("digite valor a insertar");
                px.dato=sc.nextInt();
                q.enlace=px;
                px.enlace=p;
            }else{
                q=p;
                p=p.enlace;
            }               
        }
        p=cab;
        for(int i=0;i<4;i++){            
            System.out.print("|"+p.dato);                    
            p=p.enlace;
        }
    }
}
class Nodo{
    int dato;
    Nodo enlace;
}