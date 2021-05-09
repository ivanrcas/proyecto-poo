import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Guerreros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guerreros extends Tribu
{
    //Especialista en combate
    
    public Guerreros(int tipo, int dire){
        super(tipo, dire);
        if(getTipo()==0){
            setImage("Guerrero.png");
        }
        if(getTipo()==1){
            setImage("GuerreroTribu2.png");
        }
        EnergiaInicial();
    }
    public String getRol(){
        return "Guerrero";
    }
    public void noPuedeEntrar(){    
        int dx=0,dy=0;
        // CREAMOS LOS POSIBLES ESCENARIOS EN LOS QUE SE PODRIAN ENCONTRAR UN OBSTACULO
        //AL CUAL NO SE PUEDE ENTRAR PARA GUERRERO
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
        Actor temp=this.getOneObjectAtOffset(dx,dy,Lagos.class);
        if(temp!=null){
            int a = Greenfoot.getRandomNumber(8)*45;
            int rtemp=getRotation();
            while(a==rtemp){
                a=Greenfoot.getRandomNumber(8)*45;
            }
            setRotation(a);
            move(-1);
        }
        Actor temp1=this.getOneObjectAtOffset(dx,dy,Cultivos.class);
        if(temp1!=null){
            int a = Greenfoot.getRandomNumber(8)*45;
            int rtemp=getRotation();
            while(a==rtemp){
                a=Greenfoot.getRandomNumber(8)*45;
            }
            setRotation(a);
            move(-1);
        }
        Actor temp2=this.getOneObjectAtOffset(dx,dy,Hierba.class);
        if(temp2!=null){
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

