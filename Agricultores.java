import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Agricultores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agricultores extends Tribu
{
    //Productor
    private int alimentos;
    private int tanqueAgua;
    
    public Agricultores(int tipo, int dire){
        super(tipo, dire);
        if(getTipo()==0){
            setImage("Agricultor.png");
        }
        if(getTipo()==1){
            setImage("AgricultorTribu2.png");
        }
        EnergiaInicial();
        this.alimentos=100;
        this.tanqueAgua=0;
    }
    public String getRol(){
        return "Agricultor";
    }
    public void depositoAlimentos(Depositos dep){
        if(alimentos>=40){
            dep.addAlimento(40); 
            alimentos-=40;
        }
        else{
            if(alimentos==20){
                dep.addAlimento(20);
                alimentos-=20;
            }
        }
    }
    public void addAlimentos(int cant){
        if(alimentos+cant<=120){
            alimentos+=cant;
        }
    }
    public int getAlimentos(){
        return alimentos;
    }    
    public void setAlimentos(int cant){
        if(cant>=0 && cant<=120){
            alimentos=cant;
        }
    }    
    public void addAgua(int cant){
        if(tanqueAgua+cant<=120){
            tanqueAgua+=cant;
        }
    }
    public void quitarAgua(){
        tanqueAgua-=20;
    }
    public int getTanqueAgua(){
        return tanqueAgua;
    }    
    public void setTanqueAgua(int cant){
        if(cant>=0 && cant<=120){
            tanqueAgua=cant;
        }
    }
    public void noPuedeEntrar(){    
        int dx=0,dy=0;
        // CREAMOS LOS POSIBLES ESCENARIOS EN LOS QUE SE PODRIAN ENCONTRAR UN OBSTACULO
        //AL CUAL NO SE PUEDE ENTRAR PARA AGRICULTORES
        switch(getRotation()){        
            case 0: dx=1;dy=0; break;
            case 45: dx=1;dy=1;break;
            case 90: dx=0;dy=1;break;
            case 135: dx=-1;dy=1;break;
            case 180: dx=-1;dy=0;break;
            case 225: dx=-1;dy=-1;break;
            case 270: dx=0;dy=-1;break;
            case 315: dx=1;dy=-1;break;
        }
        Actor temp1=this.getOneObjectAtOffset(dx,dy,Hierba.class);
        if(temp1!=null){
            int a = Greenfoot.getRandomNumber(8)*45;
            int rtemp=getRotation();
            while(a==rtemp){
                a=Greenfoot.getRandomNumber(8)*45;
            }
            setRotation(a);
            move(-1);
        }
    }
}
