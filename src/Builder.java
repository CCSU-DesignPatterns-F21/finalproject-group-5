package designProject;

import java.awt.Color;
import java.util.List;

import designProject.MapBuilder.MapFactory;

public interface Builder {
	int setTrees(int numTrees);
	int setRocks(int numRocks);
	List<Integer> get_coordinates(String objectType, int num_coordinates);
	

}
