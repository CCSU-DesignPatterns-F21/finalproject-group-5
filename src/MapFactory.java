

/**
 * Creates trees and rock in game.
 */
public class MapFactory implements IMapFactory{
	/**
	 * Gets object
	 * @param objectType Type of object
	 * @return Return MapObject
	 */
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
