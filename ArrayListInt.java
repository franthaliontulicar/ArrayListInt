
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] lista;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        // initialise instance variables
        lista = new int[0];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void add(int elemento)
    {
        // put your code here

        int [] temporal = new int [lista.length + 1];
        for(int i = 0; i < lista.length; i++){
            temporal[i] = lista[i];
        }

        temporal[lista.length] = elemento;
        lista = temporal;

    }

    public void add(int index, int elemento){
        if((index < lista.length) && index >= 0){

            int [] temporal = new int [lista.length + 1];
            int indice = 0;
            int indice2 = 0;
            while(indice < lista.length){
                if(indice2 == index){
                    temporal[indice2] = elemento;
                }
                else{
                    temporal[indice2] = lista[indice];
                    indice++;
                }
                indice2++;
            }
            lista = temporal;
        }
        else{
            System.out.println("El valor introducido no es valido introduzca un valor entre 0 y "+lista.length);
        }

    }

    public void clear(){
        lista = new int[0];
    }

    public boolean contains(int elemento){
        boolean contenido = false;
        int indice = 0;
        if(indice < lista.length && !(contenido)){
            if(lista[indice] == elemento){
                contenido = true;
            }
            indice++;        
        }
        return contenido;
    }

    public int get(int index){
        int elemento = -1;

        if(index >= 0 && index < lista.length){
            elemento = lista[index];
        } 

        return elemento;
    }
    
    public void set(int index, int elemento){
        if(index >= 0 && index < lista.length){
            elemento = lista[index];
        } 
    
    }
    
    public int indexOf(int elemento){
        int indiceEncontrado = -1;
        int indice = 0;
        boolean encontrado = false;
        
        while(indice < lista.length && !(encontrado)){
            if(lista[indice] == elemento){
                encontrado = true;
                indice = indiceEncontrado;
            }
            else{
                encontrado = false;
            }
        }
        
        return indiceEncontrado;
    }
    
    public boolean isEmpty(){
        boolean vacio = false;
        if(lista.length == 0){
            vacio = true;
        }
        return vacio;
    }
    
   public int remove(int index)
    {
             
        int eliminado = -1;
        if ((index <= lista.length) && (index >= 0) && (lista.length != 0))
        {
            
            int[] temporal = new int[lista.length - 1];
            int indiceTemp = 0;
            int indiceLista = 0;
            while(indiceLista < (lista.length))
            {
                if(indiceTemp != index)
                {
                    temporal[indiceTemp] = lista[indiceLista];
                    indiceTemp++;
                }
                else
                {
                    eliminado = lista[indiceLista];
                }
                indiceLista++;
            }
           
            lista = temporal;
        }
        return eliminado;
    }
    
    public int size(){
        return lista.length;
    }
}
