package designProject;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class MapBuilder implements Builder{
	
	private int numTrees;
	private int numRocks;
	
	private tree Tree;
	private rock Rock;
	private Color color;
	
	MapObject mapfactory;
	
	/*public MapBuilder(String objectType) {
		 mapfactory = new MapFactory().getObject(objectType);
	}*/
	
	@Override
    public int setTrees(int numTrees) {
        return numTrees;
    }
	
	@Override
    public int setRocks(int numRocks) {
        return numRocks;
    }
	

	class MapFactory{
		
		    MapObject getObject(String objectType){
			   
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



	@Override
	public List<Integer> get_coordinates(String objectType, int num_coordinates) {
		
		int[] tree_coordinates = {345,245, 200,50, 175,35, 275,295,350,150};
		int[] rock_coordinates = {345,245+50,200,50+50,175,35+50,275,295+50,350,150+50};
		
		
		List<Integer> coordinates = new ArrayList<>();
	
		
		if(objectType == "TREE") {
			for(int i=0; i<num_coordinates; i++) 
				coordinates.add(tree_coordinates[i]);
		}
		else if(objectType == "ROCK") {
			for(int i=0; i<num_coordinates; i++) 
				coordinates.add(rock_coordinates[i]);
		}
		//System.out.println(coordinates);
	
		return coordinates;
		
	}
	
		

}
