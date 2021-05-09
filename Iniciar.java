import greenfoot.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Iniciar  
{
 
    /**
     * Constructor for objects of class Iniciar
     */
    public Iniciar()
    {
    }
     
    /*
     * readFile recibe la ruta del archivo que se va a leer, este archivo debe estar en la ruta principal del proyecto.
     * Este método lee el archivo línea por línea, luego guarda en un vector de tipo String todas las letras o números que hay en esa línea.
     * Cada letra se guarda en una posición del vector, gracias al método linea.split(","), el cual saca cada letra o número que se encuentra entre comas.
     * Se crean instancias de las clases miMundo, Tribu, Fuente, Obtaculo, estas clases son ejemplos de una versión de proyecto anterior;
     * les va a arrojar error porque ustedes no tienen esas clases en sus proyectos, además, deben modificarlas de acuerdo a los elementos que tienen definidos en sus proyectos
     */
    public void readFile(String nameFile) {
        BufferedReader br = null;//Se crea una variable de referencia de tipo BufferedReader que permita leer cada línea del archivo de texto
        Board myWorld = null; //Creación variable de referencia del mundo
        Obstaculos miObstaculo = null; //Creación variable de referencia de Obstaculo
        Lagos miLago = null; //Creación variable de referencia de Obstaculo
        Cultivos miCultivo = null; //Creación variable de referencia de Obstaculo
        Hierba miHierba = null; //Creación variable de referencia de Obstaculo
        Depositos miDeposito = null; //Creación variable de referencia de Obstaculo
        Guerreros miGuerrero = null; //Creación variable de referencia de Guerrero
        Chamanes miChaman = null; //Creación variable de referencia de Chamanes
        Agricultores miAgricultor = null; //Creación variable de referencia de Agricultores
        
        
        /*
         * A continuación se utiliza la estructura try -  catch, la cual permite intentar ejecutar un código (el que está entre las llaves del try),
         * y en dado caso que se genere una excepción o un error, atraparla (código entre las llaves del catch), para luego tratarla y arreglar el código.
         * Para más información https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html
         * 
         * 
         */
        try {
            String linea; //Creación de una variable de tipo String que almacenará cada línea del archivo
            br = new BufferedReader(new FileReader(nameFile)); //Se crea la instancia del BufferedReader con el nombre del archivo que se recibe como parámetro
            while ((linea = br.readLine()) != null) {//Mientras linea tenga lo mismo que saca del archivo (br.readLine) y además tenga una línea (!= null)
                String[] elementos = linea.split(",");//crea el vector elementos que va a contener cada letra o número de la línea, las cuales están separadas
                                                      //por comas (,). De izquierda a derecha quedará en cada posición cada letra.  
                /*
                 * La primera línea tendrá indicado las filas y columnas del mundo.
                 * Ejemplo de la línea del archivo de texto: M,12,10 (Ver pdf Formato de archivo)
                 * El método Integer.parseInt("texto"), convierte el texto en un entero.
                 */
                                                    
                if (elementos[0].equals("M")){//Si el primer elemento de esa fila es "M", se va a crear el mundo
                    int filas = Integer.parseInt(elementos[1]);//Saca el número de filas que sería el segundo elemento del vector, en el ejemplo anterior es qw
                    int columnas = Integer.parseInt(elementos[2]);//Saca el número de columnas que sería el tercer elemento
                    myWorld = new Board(columnas,filas); //hace que la variable de referencia myWorld apunte a una instancia de mundo con las columnas y filas
                                                           //leídas desde el archivo
                    Greenfoot.setWorld(myWorld);//hace que el mundo creado sea el mundo del juego
                }
                if (elementos[0].equals("T1")){//Si el primer elmento de esa fila es de la Tribu 1 haga...
                    if (elementos[1].equals("G")){                
                        int x = Integer.parseInt(elementos[2]);
                        int y = Integer.parseInt(elementos[3]);
                        int rot = Integer.parseInt(elementos[4]);
                        
                        miGuerrero = new Guerreros(0,rot);
                        myWorld.addObject(miGuerrero,x,y);
                    }
                    if (elementos[1].equals("C")){                
                        int x = Integer.parseInt(elementos[2]);
                        int y = Integer.parseInt(elementos[3]);
                        int rot = Integer.parseInt(elementos[4]);
                        
                        miChaman = new Chamanes(0,rot);
                        myWorld.addObject(miChaman,x,y);
                    }
                    if (elementos[1].equals("A")){                
                        int x = Integer.parseInt(elementos[2]);
                        int y = Integer.parseInt(elementos[3]);
                        int rot = Integer.parseInt(elementos[4]);
                        
                        miAgricultor = new Agricultores(0,rot);
                        myWorld.addObject(miAgricultor,x,y);
                    }
                }
                if (elementos[0].equals("T2")){//Si el primer elmento de esa fila es de la Tribu 1 haga...
                    if (elementos[1].equals("G")){                
                        int x = Integer.parseInt(elementos[2]);
                        int y = Integer.parseInt(elementos[3]);
                        int rot = Integer.parseInt(elementos[4]);
                        
                        miGuerrero = new Guerreros(1,rot);
                        myWorld.addObject(miGuerrero,x,y);
                    }
                    if (elementos[1].equals("C")){                
                        int x = Integer.parseInt(elementos[2]);
                        int y = Integer.parseInt(elementos[3]);
                        int rot = Integer.parseInt(elementos[4]);
                        
                        miChaman = new Chamanes(1,rot);
                        myWorld.addObject(miChaman,x,y);
                    }
                    if (elementos[1].equals("A")){                
                        int x = Integer.parseInt(elementos[2]);
                        int y = Integer.parseInt(elementos[3]);
                        int rot = Integer.parseInt(elementos[4]);
                        
                        miAgricultor = new Agricultores(1,rot);
                        myWorld.addObject(miAgricultor,x,y);
                    }
                }
                if (elementos[0].equals("O")){//Si el primer elmento de esa fila es un obstáculo haga...
                    int x = Integer.parseInt(elementos[1]);
                    int y = Integer.parseInt(elementos[2]);
                    
                    miObstaculo = new Obstaculos();
                    myWorld.addObject(miObstaculo,x,y);
                }
                if (elementos[0].equals("L")){//Si el primer elmento de esa fila es un lago haga...
                    int x = Integer.parseInt(elementos[1]);
                    int y = Integer.parseInt(elementos[2]);
                    
                    miLago = new Lagos();
                    myWorld.addObject(miLago,x,y);
                }
                if (elementos[0].equals("D")){//Si el primer elmento de esa fila es un deposito haga...
                    int x = Integer.parseInt(elementos[1]);
                    int y = Integer.parseInt(elementos[2]);
                    
                    miDeposito = new Depositos();
                    myWorld.addObject(miDeposito,x,y);
                }
                if (elementos[0].equals("H")){//Si el primer elmento de esa fila es un hierba haga...
                    int x = Integer.parseInt(elementos[1]);
                    int y = Integer.parseInt(elementos[2]);
                    
                    miHierba = new Hierba();
                    myWorld.addObject(miHierba,x,y);
                }
                if (elementos[0].equals("C")){//Si el primer elmento de esa fila es un cultivo haga...
                    int x = Integer.parseInt(elementos[1]);
                    int y = Integer.parseInt(elementos[2]);
                    
                    miCultivo = new Cultivos();
                    myWorld.addObject(miCultivo,x,y);
                }
            }
            br.close();//cierra el archivo
        }
        /*
         * El código siguiente es el que trata la excepción en caso de que se genere, para más información ver enlace de arriba
         */
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    /*
     * En esta versión el juego se iniciará como se explica en el paso 4.
     */
    public static void main(String[] args) {
        //Se crea una instancia de esta misma clase y se llama el método readFile("config.txt"), pasando el nombre completo (con la ruta) del archivo de configuración
        Iniciar miJuego = new Iniciar();
        miJuego.readFile("config.txt");
 
    }
}