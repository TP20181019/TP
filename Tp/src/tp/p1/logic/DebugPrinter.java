package tp.p1.logic;

import tp.p1.lists.GameObjectList;
import tp.p1.objects.Plants;

public class DebugPrinter {
    
    
    
    public DebugPrinter(){
        
        //imagino que recorrere las listas para obtener los datos de cada
        //objeto
        
        
    }
    
    public boolean printPlant (){
        boolean print = false;
        GameObjectList listPlants = null;
        
        
        //recorrer la lista de objetos para obtener las plantas a mostrar
        for ( int i  = 0; i< listPlants.getStack(); i++){
            //ir mostrando cada planta que haya
        	
            toStringObject();
            
        }
                return print;
    }
    public String toStringObject (){
        GameObjectList listPlants = null;
        
        String obcjectPrint = String.format ("|",listPlants.getNamePlant(),"" )   ;   
        return toStringObject();
    }   
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



