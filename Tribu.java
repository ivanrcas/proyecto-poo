import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Tribu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tribu extends Actor
{
    private int tipo;
    private int energia;
    private String rol;
    
    public Tribu(int tipo, int dire){
        this.energia=100;
        
        if(tipo==0){
            this.tipo=tipo;
        }
        if(tipo==1){
            this.tipo=tipo;
        }
        if(dire == 7){
            setRotation(270);
        }
        if(dire == 3){
            setRotation(90);
        }
        if(dire == 1){
            setRotation(0);
        }
        if(dire == 5){
            setRotation(180);
        }
        if(dire == 2){
            setRotation(45);
        }
        if(dire == 4){
            setRotation(135);
        }
        if(dire == 8){
            setRotation(315);
        }
        if(dire == 6){
            setRotation(225);
        }
    }
    
    public void act() 
    {
        getObstaculo();
        noPuedeEntrar();
        move(1);
        int temp = getRotation();
        World mundo = getWorld();
        Random aleatorio = new Random();
        int mover = aleatorio.nextInt(3);
        int mover2 = aleatorio.nextInt(5);
        
        
        if(mundo.getHeight()-1==getY()){
            if(getRotation()==0){
                if(mundo.getWidth()-1==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(180);
                    }
                    if(alea==1){
                        setRotation(225);
                    }
                    if(alea==2){
                        setRotation(270);
                    }
                }
            }
            if(getRotation()==90){
                if(0==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(0);
                    }
                    if(alea==1){
                        setRotation(270);
                    }
                    if(alea==2){
                        setRotation(315);
                    }
                }
            }
            if(getRotation()==90){
                if(mundo.getWidth()-1==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(180);
                    }
                    if(alea==1){
                        setRotation(225);
                    }
                    if(alea==2){
                        setRotation(270);
                    }
                }
            }
            if(getRotation()==90){
                    int alea = mover2;
                    if(alea==0){
                        setRotation(0);
                    }
                    if(alea==1){
                        setRotation(180);
                    }
                    if(alea==2){
                        setRotation(225);
                    }
                    if(alea==3){
                        setRotation(270);
                    }
                    if(alea==4){
                        setRotation(315);
                    }
            }
            if(getRotation()==180){
                if(0==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(0);
                    }
                    if(alea==1){
                        setRotation(270);
                    }
                    if(alea==2){
                        setRotation(315);
                    }
                }
            }
            if(getRotation()==45){
                if(mundo.getWidth()-1==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(180);
                    }
                    if(alea==1){
                        setRotation(225);
                    }
                    if(alea==2){
                        setRotation(270);
                    }
                }
            }
            if(getRotation()==135){
                if(0==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(0);
                    }
                    if(alea==1){
                        setRotation(270);
                    }
                    if(alea==2){
                        setRotation(315);
                    }
                }
            }
            if(getRotation()==45){
                int alea = mover2;
                if(alea==0){
                        setRotation(0);
                    }
                if(alea==1){
                        setRotation(180);
                    }
                if(alea==2){
                        setRotation(225);
                    }
                if(alea==3){
                        setRotation(270);
                    }
                if(alea==4){
                        setRotation(315);
                    }
            }
            if(getRotation()==135){
                int alea = mover2;
                if(alea==0){
                        setRotation(0);
                    }
                if(alea==1){
                        setRotation(180);
                    }
                if(alea==2){
                        setRotation(225);
                    }
                if(alea==3){
                        setRotation(270);
                    }
                if(alea==4){
                        setRotation(315);
                    }
            }
        }
        if(0==getY()){
            if(getRotation()==0){
                if(mundo.getWidth()-1==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(90);
                    }
                    if(alea==1){
                        setRotation(135);
                    }
                    if(alea==2){
                        setRotation(180);
                    }
                }
            }
            if(getRotation()==270){
                if(mundo.getWidth()-1==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(90);
                    }
                    if(alea==1){
                        setRotation(135);
                    }
                    if(alea==2){
                        setRotation(180);
                    }
                }
            }
            if(getRotation()==270){
                if(0==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(90);
                    }
                    if(alea==1){
                        setRotation(45);
                    }
                    if(alea==2){
                        setRotation(90);
                    }
                }
            }
            if(getRotation()==270){
                int alea = mover2;
                if(alea==0){
                    setRotation(0);
                }
                if(alea==1){
                    setRotation(45);
                }
                if(alea==2){
                    setRotation(90);
                }
                if(alea==3){
                    setRotation(135);
                }
                if(alea==4){
                    setRotation(180);
                }
            }
            if(getRotation()==180){
                if(0==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(0);
                    }
                    if(alea==1){
                        setRotation(45);
                    }
                    if(alea==2){
                        setRotation(90);
                    }
                }
            }
            if(getRotation()==315){
                if(mundo.getWidth()-1==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(90);
                    }
                    if(alea==1){
                        setRotation(135);
                    }
                    if(alea==2){
                        setRotation(180);
                    }
                }
            }
            if(getRotation()==225){
                if(0==getX()){
                    int alea = mover;
                    if(alea==0){
                        setRotation(0);
                    }
                    if(alea==1){
                        setRotation(45);
                    }
                    if(alea==2){
                        setRotation(90);
                    }
                }
            }
            if(getRotation()==225){
                int alea = mover2;
                if(alea==0){
                    setRotation(0);
                }
                if(alea==1){
                    setRotation(45);
                }
                if(alea==2){
                    setRotation(90);
                }
                if(alea==3){
                    setRotation(135);
                }
                if(alea==4){
                    setRotation(180);
                }
            }
            if(getRotation()==315){
                int alea = mover2;
                if(alea==0){
                    setRotation(0);
                }
                if(alea==1){
                    setRotation(45);
                }
                if(alea==2){
                    setRotation(90);
                }
                if(alea==3){
                    setRotation(135);
                }
                if(alea==4){
                    setRotation(180);
                }
            }
        }
        if(mundo.getWidth()-1==getX()){
            if(getRotation()==90){
                if(mundo.getHeight()-1==getY()){
                    turn(180);
                }
            }
            if(getRotation()==0){
                int alea = mover2;
                if(alea==0){
                    setRotation(90);
                }
                if(alea==1){
                    setRotation(180);
                }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(225);
                }
                if(alea==4){
                    setRotation(270);
                }
            }
            if(getRotation()==270){
                if(getY()==0){
                    turn(180);
                }
            }
            if(getRotation()==45){
                int alea = mover2;
                if(alea==0){
                    setRotation(90);
                }
                if(alea==1){
                    setRotation(180);
                }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(225);
                }
                if(alea==4){
                    setRotation(270);
                }
            }
            if(getRotation()==315){
                int alea = mover2;
                if(alea==0){
                    setRotation(90);
                }
                if(alea==1){
                    setRotation(180);
                }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(225);
                }
                if(alea==4){
                    setRotation(270);
                }
            }
        }
        if(0==getX()){
            if(getRotation()==90){
                if(mundo.getHeight()-1==getY()){
                    turn(180);
                }
            }
            if(getRotation()==180){
                int alea = mover2;
                if(alea==0){
                    setRotation(0);
                }
                if(alea==1){
                    setRotation(45);
                }
                if(alea==2){
                    setRotation(90);
                }
                if(alea==3){
                    setRotation(270);
                }
                if(alea==4){
                    setRotation(315);
                }
            }
            if(getRotation()==270){
                if(getY()==0){
                    turn(180);
                }
            }
            if(getRotation()==135){
                int alea = mover2;
                if(alea==0){
                    setRotation(0);
                }
                if(alea==1){
                    setRotation(45);
                }
                if(alea==2){
                    setRotation(90);
                }
                if(alea==3){
                    setRotation(270);
                }
                if(alea==4){
                    setRotation(315);
                }
            }
            if(getRotation()==225){
                int alea = mover2;
                if(alea==0){
                    setRotation(0);
                }
                if(alea==1){
                    setRotation(45);
                }
                if(alea==2){
                    setRotation(90);
                }
                if(alea==3){
                    setRotation(270);
                }
                if(alea==4){
                    setRotation(315);
                }
            }
        }    
    }
    public int getTipo(){
        return tipo;
    }
    public double probabilidad(){
        double posible;
        Random ran = new Random();
        int n = ran.nextInt(100);
        posible = n;
        
        return posible;
    }
    public void bajarEnergia(){
        energia=energia-20;
    }
    public int getEnergia(){
        return energia;
    }
    public void EnergiaInicial(){
        energia=100;
    }
    public String getRol(){
        return "";
    }
    public void addEnergia(){
        energia=energia+20;
    }
    public void noPuedeEntrar(){
    }
    public void getObstaculo(){  
        int Rotacion = getRotation();
        Random aleatorio = new Random();
        int mover2 = aleatorio.nextInt(5);
        if(Rotacion == 0){ 
            Actor obs=(Obstaculos)getOneObjectAtOffset(1,0,Obstaculos.class);
            if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(45);
                }
                if(alea==1){
                    setRotation(90);
                    }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(180);
                }
                if(alea==4){
                    setRotation(225);
                }
                if(alea==5){
                    setRotation(270);
                }
                if(alea==6){
                    setRotation(315);
                }
            }
        }
        if(Rotacion == 180){
            Actor obs=(Obstaculos)getOneObjectAtOffset(-1,0,Obstaculos.class);
            if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(45);
                }
                if(alea==1){
                    setRotation(90);
                    }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(0);
                }
                if(alea==4){
                    setRotation(225);
                }
                if(alea==5){
                    setRotation(270);
                }
                if(alea==6){
                    setRotation(315);
                }
            }
        }
        if(Rotacion == 45){
            Actor obs=(Obstaculos)getOneObjectAtOffset(1,1,Obstaculos.class);
            if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(0);
                }
                if(alea==1){
                    setRotation(90);
                    }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(180);
                }
                if(alea==4){
                    setRotation(225);
                }
                if(alea==5){
                    setRotation(270);
                }
                if(alea==6){
                    setRotation(315);
                }
            }
        }
        if(Rotacion == 90){
            Actor obs=(Obstaculos)getOneObjectAtOffset(0,1,Obstaculos.class);
            if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(45);
                }
                if(alea==1){
                    setRotation(0);
                    }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(180);
                }
                if(alea==4){
                    setRotation(225);
                }
                if(alea==5){
                    setRotation(270);
                }
                if(alea==6){
                    setRotation(315);
                }
            }
        }
        if(Rotacion == 135){
           Actor obs=(Obstaculos)getOneObjectAtOffset(-1,1,Obstaculos.class);
           if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(45);
                }
                if(alea==1){
                    setRotation(90);
                    }
                if(alea==2){
                    setRotation(0);
                }
                if(alea==3){
                    setRotation(180);
                }
                if(alea==4){
                    setRotation(225);
                }
                if(alea==5){
                    setRotation(270);
                }
                if(alea==6){
                    setRotation(315);
                }
            }            
        }
        if(Rotacion == 225){
            Actor obs=(Obstaculos)getOneObjectAtOffset(-1,-1,Obstaculos.class);
            if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(45);
                }
                if(alea==1){
                    setRotation(90);
                    }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(180);
                }
                if(alea==4){
                    setRotation(0);
                }
                if(alea==5){
                    setRotation(270);
                }
                if(alea==6){
                    setRotation(315);
                }
            }            
        }
        if(Rotacion == 270){
            Actor obs=(Obstaculos)getOneObjectAtOffset(0,-1,Obstaculos.class);
            if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(45);
                }
                if(alea==1){
                    setRotation(90);
                    }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(180);
                }
                if(alea==4){
                    setRotation(225);
                }
                if(alea==5){
                    setRotation(0);
                }
                if(alea==6){
                    setRotation(315);
                }
            }          
        }
        if(Rotacion == 315){
            Actor obs=(Obstaculos)getOneObjectAtOffset(1,-1,Obstaculos.class);
            if(obs != null){
                int alea = mover2;
                if(alea==0){
                    setRotation(45);
                }
                if(alea==1){
                    setRotation(90);
                    }
                if(alea==2){
                    setRotation(135);
                }
                if(alea==3){
                    setRotation(180);
                }
                if(alea==4){
                    setRotation(225);
                }
                if(alea==5){
                    setRotation(270);
                }
                if(alea==6){
                    setRotation(0);
                }
            }
        }
    }
}
