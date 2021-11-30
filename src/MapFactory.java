package designProject;

public class MapFactory {
	   public MapObject getObject(String objectType){
		      if(objectType == null){
		         return null;
		      }		
		      if(objectType.equalsIgnoreCase("TREE")){
		         return new tree();
		         
		      } else if(objectType.equalsIgnoreCase("ROCK")){
		         return new rock();		         
		      } 		      
		      return null;
		   }
}
