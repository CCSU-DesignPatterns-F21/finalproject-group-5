package designProject;

import java.util.List;

public interface Builder {
	int setTrees(int numTrees);
	int setRocks(int numRocks);
	List<Integer> get_coordinates(String objectType, int num_coordinates);
	

}
