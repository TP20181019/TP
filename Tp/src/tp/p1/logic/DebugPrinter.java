package tp.p1.logic;

import tp.p1.lists.GameObjectList;
//import tp.p1.objects.Plants;
import tp.p1.objects.GameObject;

public class DebugPrinter extends BoardPrinter {
    
    private GameObject [] list;
    
    public DebugPrinter(String []board){
        super(board);
        
       
        //imagino que recorrere las listas para obtener los datos de cada
        //objeto
        
        
    }
    
    public boolean printPlant (String dName, int dLife, int dX, int dY){
        boolean print = false;
        //GameObjectList listPlants = null;
        
        
        //recorrer la lista de objetos para obtener las plantas a mostrar
        for ( int i  = 0; i< list.length; i++){
            //ir mostrando cada planta que haya
        	dName = list[i].getName();
        	dLife = list [i].getLife();
        	dX = list [i].getX();
        	/*...
        	es una idea. Supongo que crearemos un metodo para saber
        	el comportamiento de cada objeto y calcular los ciclos que faltan
        	para que haga su accion cada objeto
        	
           	toStringObject();
            */
        }
                return print;
    }
    /*public String toStringObject (){
        GameObjectList listPlants = null;
        
        String obcjectPrint = String.format ("|",listPlants.getNamePlant(),"" )   ;   
        return toStringObject();
    }   */
    public void encodeGame (){
            
            
    }
        
        
        
        

        public String toString(){
    
        String pipe = "|";
        String script = "-";
        //String space = " ";
        
       // String upLimiter = MyStringUtils.repeat(script,1);
        
       // String line = String.format(" ", upLimiter);
        
        StringBuilder str = new StringBuilder();
        //String star = 
       // str.append (/*line*/script);
        
        for (int i = 0; i < 5/*longitud del array*/; i++){
            str.append(/*upLimiter*/script);//.append(script);
            
            
        }
        //mostraria los resultados obtenidos
       // for (int i = 0; i < 5; i++){
        //    str.append(pipe);
        //}
        //str.substring((int)start, (int)end);
        
      //  str.append(/*line*/script);
        
        return str.toString();
        
    }
    
}



