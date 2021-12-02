package designProject;

import java.awt.Graphics;
import java.util.List;

public class BuildMap extends MapBuilder {
	
	MapBuilder mapBuilder = new MapBuilder();
	MapFactory mapFactory = mapBuilder.new MapFactory();
	
	/** Creates tree */
	MapObject tree = mapFactory.getObject("TREE");
	    /** Creates rock */
	MapObject rock = mapFactory.getObject("ROCK");
	
	
	 /*public BuildMap(String objectType) {
		super(objectType);
		// TODO Auto-generated constructor stub
	}*/
	
	int numRocks;
	int numTrees;
	int [] coordinates_to_use;
	
	List<Integer> tree_coordinates_list;
	List<Integer> rock_coordinates_list;
	
	public void constructMap( Builder builder, Graphics g) {
		
		numTrees = builder.setTrees(4);
		tree_coordinates_list = builder.get_coordinates("TREE", numTrees);
		tree.getg(g);
		tree.draw(tree_coordinates_list);
		
		numRocks = builder.setRocks(4);
		rock_coordinates_list = builder.get_coordinates("ROCK", numRocks);
		rock.getg(g);
		rock.draw(rock_coordinates_list);
		

	}



}
