import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Chamanes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chamanes extends Tribu
{
    //Healer
    private int Sanacion;
    
    public Chamanes(int tipo, int dire){
        super(tipo, dire);
        if(getTipo()==0){
            setImage("Shamantribu1.png");
        }
        if(getTipo()==1){
            setImage("Shamantribu2.png");
        }
        EnergiaInicial();
        this.Sanacion=120;
    }
    public String getRol(){
        return "Chaman";
    }
    public void Curar(Tribu tri){
        if(Sanacion>=20){
            if(tri.getEnergia()<=140){
                tri.addEnergia();
                Sanacion=Sanacion-20;
            }
        }
    }
    public void addSanacion(int cant){
        if(Sanacion+cant<=120){
            Sanacion+=cant;
        }
    }    
    public int getSanacion(){
        return Sanacion;
    }
    public void setSanacion(int cant){
        if(cant>=0 && cant<=120){
            Sanacion=cant;
        }
    }
    public void noPuedeEntrar(){    
        int dx=0,dy=0;
        // CREAMOS LOS POSIBLES ESCENARIOS EN LOS QUE SE PODRIAN ENCONTRAR UN OBSTACULO
        //AL CUAL NO SE PUEDE ENTRAR PARA CHAMANES
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
    }
}
