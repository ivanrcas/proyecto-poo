import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * PROYECTO DE POO - UNIVERSIDAD INDUSTRIAL DE SANTANDER
 * >>>>>>>>> JUEGO DE ROLES <<<<<<<<<<<<
 * 
 * @author: Iván Castillo, Santiago Gómez. 
 * @version: 3.0.15.02.17
 */
public class Board extends World
{  
    private int Energia1;
    private int Energia2;

    public Board(int x, int y)
    {
        super(x, y, 50);
        setBackground("fondo.png");
    }

    public void act(){
        for(int i=0;i<getWidth();i++){
            for(int j=0;j<getHeight();j++){
                List objetos = getObjectsAt(i, j, Tribu.class);
                if(objetos.size()>1){
                    for(int k=0;k<objetos.size();k++){
                        for(int e=k+1;e<objetos.size();e++){
                            Tribu t1 = (Tribu) objetos.get(k);
                            Tribu t2 = (Tribu) objetos.get(e);

                            /////// ENFRENTAMIENTO Y CURACION ////////////

                            if(t1.getTipo()==t2.getTipo()){
                                if(t1 instanceof Chamanes){
                                    Chamanes aux = (Chamanes) t1;
                                    aux.Curar(t2);
                                    if(t2 instanceof Chamanes){
                                        Chamanes aux2 = (Chamanes) t2;
                                        aux2.Curar(t1);
                                    }
                                }
                            }
                            else{
                                if(t1.getClass()==t2.getClass()){
                                    if(t1.probabilidad()>t2.probabilidad()){
                                        t2.bajarEnergia();
                                        if(t2.getEnergia()==0){
                                            removeObject(t2);
                                        }
                                    }
                                    else{
                                        t1.bajarEnergia();
                                        if(t1.getEnergia()==0){
                                            removeObject(t1);
                                        }
                                    }
                                }
                                else{
                                    if(t1 instanceof Chamanes && t2 instanceof Guerreros){
                                        double op1 = t1.probabilidad()*0.3;
                                        double op2 = t2.probabilidad()*0.7;

                                        if(op1>op2){
                                            t2.bajarEnergia();
                                            if(t2.getEnergia()==0){
                                                removeObject(t2);
                                            }
                                        }
                                        else{
                                            t1.bajarEnergia();
                                            if(t1.getEnergia()==0){
                                                removeObject(t1);
                                            }
                                        }
                                    }
                                    if(t1 instanceof Guerreros && t2 instanceof Chamanes){
                                        double op1 = t1.probabilidad()*0.7;
                                        double op2 = t2.probabilidad()*0.3;

                                        if(op1>op2){
                                            t2.bajarEnergia();
                                            if(t2.getEnergia()==0){
                                                removeObject(t2);
                                            }
                                        }
                                        else{
                                            t1.bajarEnergia();
                                            if(t1.getEnergia()==0){
                                                removeObject(t1);
                                            }
                                        }
                                    }
                                    if(t1 instanceof Chamanes && t2 instanceof Agricultores){
                                        double op1 = t1.probabilidad()*0.5;
                                        double op2 = t2.probabilidad()*0.5;

                                        if(op1>op2){
                                            t2.bajarEnergia();
                                            if(t2.getEnergia()==0){
                                                removeObject(t2);
                                            }
                                        }
                                        else{
                                            t1.bajarEnergia();
                                            if(t1.getEnergia()==0){
                                                removeObject(t1);
                                            }
                                        }
                                    }
                                    if(t1 instanceof Agricultores && t2 instanceof Chamanes){
                                        double op1 = t1.probabilidad()*0.5;
                                        double op2 = t2.probabilidad()*0.5;

                                        if(op1>op2){
                                            t2.bajarEnergia();
                                            if(t2.getEnergia()==0){
                                                removeObject(t2);
                                            }
                                        }
                                        else{
                                            t1.bajarEnergia();
                                            if(t1.getEnergia()==0){
                                                removeObject(t1);
                                            }
                                        }
                                    }
                                    if(t1 instanceof Agricultores && t2 instanceof Guerreros){
                                        double op1 = t1.probabilidad()*0.3;
                                        double op2 = t2.probabilidad()*0.7;

                                        if(op1>op2){
                                            t2.bajarEnergia();
                                            if(t2.getEnergia()==0){
                                                removeObject(t2);
                                            }
                                        }
                                        else{
                                            t1.bajarEnergia();
                                            if(t1.getEnergia()==0){
                                                removeObject(t1);
                                            }
                                        }
                                    }
                                    if(t1 instanceof Guerreros && t2 instanceof Agricultores){
                                        double op1 = t1.probabilidad()*0.7;
                                        double op2 = t2.probabilidad()*0.3;

                                        if(op1>op2){
                                            t2.bajarEnergia();
                                            if(t2.getEnergia()==0){
                                                removeObject(t2);
                                            }
                                        }
                                        else{
                                            t1.bajarEnergia();
                                            if(t1.getEnergia()==0){
                                                removeObject(t1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }                    
                }                
            }
        }
        List all = getObjects(Tribu.class);
        for(int t=0;t<all.size();t++){
            Tribu tribe = (Tribu)all.get(t);
            int ran=Greenfoot.getRandomNumber(8);
            if(tribe.getTipo()==0){
                if(Greenfoot.isKeyDown("a")==true && Greenfoot.isKeyDown("down")==true){
                    tribe.setRotation(90);
                }
                if(Greenfoot.isKeyDown("a")==true && Greenfoot.isKeyDown("up")==true){
                    tribe.setRotation(270);
                }
                if(Greenfoot.isKeyDown("a")==true && Greenfoot.isKeyDown("left")==true){
                    tribe.setRotation(180);
                }
                if(Greenfoot.isKeyDown("a")==true && Greenfoot.isKeyDown("right")==true){
                    tribe.setRotation(0);
                }
                if(Greenfoot.isKeyDown("c")==true){
                    tribe.setRotation(ran*45);
                }
            }
            if(tribe.getTipo()==1){
                if(Greenfoot.isKeyDown("b")==true && Greenfoot.isKeyDown("down")==true){
                    tribe.setRotation(90);
                }
                if(Greenfoot.isKeyDown("b")==true && Greenfoot.isKeyDown("up")==true){
                    tribe.setRotation(270);
                }
                if(Greenfoot.isKeyDown("b")==true && Greenfoot.isKeyDown("left")==true){
                    tribe.setRotation(180);
                }
                if(Greenfoot.isKeyDown("b")==true && Greenfoot.isKeyDown("right")==true){
                    tribe.setRotation(0);
                }
                if(Greenfoot.isKeyDown("d")==true){
                    tribe.setRotation(ran*45);
                }
            }
        }
        //Impresión de puntaje.
        if(all.size()==1){
            Tribu tribe = (Tribu)all.get(0);
            int opcion = tribe.getTipo();
            if(opcion==0){
                System.out.println("»»»»»» GANADOR DEL JUEGO ««««««");
                System.out.println("»»»»»» La tribu ganadora es TRIBU 1 ««««««");
                }
            else{
                System.out.println("»»»»»» GANADOR DEL JUEGO ««««««");                    
                System.out.println("»»»»»» La tribu ganadora es TRIBU 2 ««««««");
            }
        }
    }
}
