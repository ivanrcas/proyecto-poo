import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Lagos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lagos extends Elementos
{
   private int agua;    
    
   public Lagos(){
     setImage("lago.png");
     this.agua=200;
   }    
   public void regeneracion(){
        // Renueva constantemente a factor de una unidad de agua por iteración.
        // Rango: Desde 0 unidades hasta 300 unidades.
        if(agua>0 && agua <=300){
            if((agua+1)>300){
                agua=300;
            }
            else{
                agua+=1;
            }
        } 
   }
   public void act(){
        regeneracion();
        World mundo = getWorld();
        List<Agricultores> agricultores = mundo.getObjectsAt(getX(), getY(), Agricultores.class);
        int totalAgricultores = agricultores.size();
        if(totalAgricultores !=0){
            for(int i=0;i<totalAgricultores;i++){             
                Agricultores temp = agricultores.get(i);
                darAgua(temp);
                if(agua==0){
                    mundo.removeObject(this);                              
                }
            }
        }    
   }
   public void darAgua(Agricultores agri){
        if(agri.getTanqueAgua()<120){
            if(agri.getTanqueAgua()+40>120){
                int Sustraer = 120-agri.getTanqueAgua();
                agri.setTanqueAgua(120);
                agua-=Sustraer;
            }
            else{
                if(agua>=40){
                    agri.addAgua(40);
                    agua-=40;
                }
                else{
                    agri.addAgua(agua);
                    agua=0;
                }
            }
        }    
   }
   public int getAgua(){
    return agua;
   }    
   public void setAgua(int cant){
    agua = cant;
   }
}
