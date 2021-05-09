import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Depositos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Depositos extends Elementos
{
    private int almacen;
    
    public Depositos(){
        setImage("cueva.png");
        almacen=0;
    }
    public void darAlimento(Tribu tri){
        if(almacen!=0){
            if(almacen>=20){
                if(tri.getEnergia()<=140){
                    tri.addEnergia();
                    almacen=almacen-20;
                }
            }
        }
    }
    public void addAlimento(int add){
        almacen=almacen+add;
    }
    public void act(){
        World mundo = getWorld();
        List<Tribu> aldeanos = mundo.getObjectsAt(getX(), getY(), Tribu.class);
        int totalAldeanos = aldeanos.size();
        if(totalAldeanos != 0){
            for(int i = 0;i<aldeanos.size();i++){
                Tribu temp = aldeanos.get(i);
                darAlimento(temp);
                if(temp instanceof Agricultores){
                    Agricultores a1 = (Agricultores)temp;
                    if(a1.getAlimentos()>=40){
                        a1.depositoAlimentos(this);
                    }
                }
            }
        }
    }
    public int getAlimento(){
        return almacen;
    }
    public void setAlimento(int cant){
        almacen=cant;
    }
}
