import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Hierba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hierba extends Elementos
{
    private int Sanacion;
    
    public Hierba(){
        setImage("hierba.png");
        this.Sanacion=50;
    }
    public void regeneracion(){
        // Renueva constantemente a factor de dos unidades de sanacion por iteración.
        // Rango: Desde 0 unidades hasta 100 unidades.        
        if(Sanacion>0 && Sanacion<=100){
            if((Sanacion+2)>100){
                Sanacion=100;
            }
            else{
                Sanacion+=2;
            }
        }    
    }
    public void act() 
    {
        regeneracion();
        World mundo = getWorld();
        List<Chamanes> aldeanos = mundo.getObjectsAt(getX(), getY(), Chamanes.class);
        int totalAldeanos = aldeanos.size();
        if(totalAldeanos != 0){
            for(int i = 0;i<aldeanos.size();i++){
                Chamanes temp = aldeanos.get(i);
                darSanacion(temp);
                if(Sanacion==0){
                    mundo.removeObject(this);                              
                }
            }
        }
    }
    public void darSanacion(Chamanes cha){
        if(cha.getSanacion()!=120){
            if(cha.getSanacion()+20>120){
                int Sustraer = 120-cha.getSanacion();
                cha.setSanacion(120);
                Sanacion-=Sustraer;
            }
            else{
                if(Sanacion>=20){
                    cha.addSanacion(20);
                    Sanacion-=20;
                }
                else{
                    cha.addSanacion(Sanacion);
                    Sanacion=0;
                }
            }
        }
    }
    public int getSanacion(){
        return Sanacion;
    }
    public void setSanacion(int cant){
        Sanacion=cant;
    }
}
