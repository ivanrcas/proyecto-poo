import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Cultivos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cultivos extends Elementos
{
   private int alimentos;    
    
   public Cultivos(){
       setImage("cultivo.png");
       this.alimentos=100;
   }
   public void act(){
        World mundo = getWorld();
        List<Agricultores> agricultores = mundo.getObjectsAt(getX(), getY(), Agricultores.class);
        int totalAgricultores = agricultores.size();
        if(totalAgricultores !=0){
            for(int i=0;i<totalAgricultores;i++){
                Agricultores temp = agricultores.get(i);
                darAlimentos(temp);
                if(alimentos==0){
                    mundo.removeObject(this);                              
                }
            }
        }
   }
   public void darAlimentos(Agricultores agri){
       if(agri.getTanqueAgua()>=20){      
          if(agri.getAlimentos()+40>120){
              int Sustraer = 120-agri.getAlimentos();
              agri.quitarAgua();
              agri.setAlimentos(120);
              alimentos-=Sustraer;
              ganaciaAlimentos();
          }
           else{
              agri.quitarAgua();
              agri.addAlimentos(40);
              alimentos-=40;
              ganaciaAlimentos();
          }
       }
       else{
            agri.addAlimentos(20);
            alimentos-=20;
       }
   }
   public void ganaciaAlimentos(){
       //Cada vez que el cultivo es regado, aumenta en 60 puntos su cantidad de puntos de alimentos.
       alimentos+=60;
   }
   public int getAlimentos(){
       return alimentos;
   }
   public void setAlimentos(int cant){
       alimentos=cant;
   }
}