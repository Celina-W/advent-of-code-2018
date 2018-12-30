public class Day6 {
	
	final static int MAX_GRID_SIZE = 500;
	final static int SAFE_DISTANCE = 10000;

	public static void main(String[] args) {
		
//		String puzzleInput = "1, 1\r\n" + 
//				"1, 6\r\n" + 
//				"8, 3\r\n" + 
//				"3, 4\r\n" + 
//				"5, 5\r\n" + 
//				"8, 9";
		String puzzleInput = "183, 157\r\n" + 
				"331, 86\r\n" + 
				"347, 286\r\n" + 
				"291, 273\r\n" + 
				"285, 152\r\n" + 
				"63, 100\r\n" + 
				"47, 80\r\n" + 
				"70, 88\r\n" + 
				"333, 86\r\n" + 
				"72, 238\r\n" + 
				"158, 80\r\n" + 
				"256, 140\r\n" + 
				"93, 325\r\n" + 
				"343, 44\r\n" + 
				"89, 248\r\n" + 
				"93, 261\r\n" + 
				"292, 250\r\n" + 
				"240, 243\r\n" + 
				"342, 214\r\n" + 
				"192, 51\r\n" + 
				"71, 92\r\n" + 
				"219, 63\r\n" + 
				"240, 183\r\n" + 
				"293, 55\r\n" + 
				"316, 268\r\n" + 
				"264, 151\r\n" + 
				"68, 98\r\n" + 
				"190, 288\r\n" + 
				"85, 120\r\n" + 
				"261, 59\r\n" + 
				"84, 222\r\n" + 
				"268, 171\r\n" + 
				"205, 134\r\n" + 
				"80, 161\r\n" + 
				"337, 326\r\n" + 
				"125, 176\r\n" + 
				"228, 122\r\n" + 
				"278, 151\r\n" + 
				"129, 287\r\n" + 
				"293, 271\r\n" + 
				"57, 278\r\n" + 
				"104, 171\r\n" + 
				"330, 69\r\n" + 
				"141, 141\r\n" + 
				"112, 127\r\n" + 
				"201, 151\r\n" + 
				"331, 268\r\n" + 
				"95, 68\r\n" + 
				"289, 282\r\n" + 
				"221, 359";
		
		// PART 1
		int[][] coords = organize(puzzleInput);
//		for (int i = 0; i < coords.length; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(coords[i][j] + " ");
//			}
//			System.out.println();
//		}
		int[][][] plane = gridify(coords);
//		for (int i = 0; i < plane.length; i++) {
//			for (int j = 0; j < plane[i].length; j++) {
//				System.out.print(plane[i][j][0] + " ");
//			}
//			System.out.println();
//		}
		System.out.printf("The largest finite area is: %d\n", getArea(coords, plane));
		
		// PART 2
		System.out.printf("The size of the safest region is: %d\n", getSafeRegion(coords));

	}
	
	public static int[][] organize(String input) {
		
		String[] splitInput = input.split("\r\n");
		/* Coordinates are formatted as follows:
		 * coordinates[a][b]
		 * a = 0 - max_number_of_coordinates -> a unique number for each point
		 * b = 0 - 2 -> 0 = coordinate identifier; 1 = x-coordinate; 2 = y-coordinate
		 */
		int[][] coordinates = new int[splitInput.length][3];
		
		for (int i = 0; i < splitInput.length; i++) {
			coordinates[i][0] = i + 1;
			int commaIndex = splitInput[i].indexOf(",");
			coordinates[i][1] = Integer.parseInt(splitInput[i].substring(0,commaIndex));
			coordinates[i][2] = Integer.parseInt(splitInput[i].substring(commaIndex+2));
		}
		
		return coordinates;
		
	}
	
	public static int[][][] gridify(int[][] coordinates) {
		
		/* The grid is formatted as follows:
		 * grid[a][b][c]
		 * a & b = the coordinates, x & y
		 * c = 0 - 1
		 * -> 0 -> identifier of closest point
		 * -> 1 -> distance from closest point
		 */
		int[][][] grid = new int[MAX_GRID_SIZE][MAX_GRID_SIZE][2];
		
		// reset all distances
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j][1] = Integer.MAX_VALUE;
			}
		}
		
		// iterate over the coordinates and over the grid
		for (int i = 0; i < coordinates.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				for (int k = 0; k < grid[j].length; k++) {
					// get distance from the coordinate to the point on the grid
					int distanceFromPoint = getDistance(coordinates[i][1], coordinates[i][2], j, k);
					// if the coordinate is the closest point, store identifier and distance
					if (distanceFromPoint < grid[j][k][1]) {
						grid[j][k][0] = coordinates[i][0];
						grid[j][k][1] = distanceFromPoint;
					}
					// if the coordinate is equally close as another point, remove identifier
					else if (distanceFromPoint == grid[j][k][1]) {
						grid[j][k][0] = 0;
					}
				}
			}
		}
		
		return grid;
		
	}
	
	public static int getDistance(int a, int b, int x, int y) {
		
		// get the Manhattan distance
		int horizontalDistance = Math.abs(a - x);
		int verticalDistance = Math.abs(b - y);
		
		return horizontalDistance + verticalDistance;
		
	}
	
	public static int getArea(int[][] coordinates, int[][][] grid) {
		
		int largestArea = Integer.MIN_VALUE;
		
		// iterate over the coordinates
		for (int i = 0; i < coordinates.length; i++) {
			int area = 0;
			boolean infinite = false;
			int j = 0;
			// iterate over the grid as long as the area is not infinite
			while (!infinite && j < grid.length) {
				int k = 0;
				while (!infinite && k < grid[j].length) {
					// if the position on the grid is part of the coordinate's area
					if (grid[j][k][0] == coordinates[i][0]) {
						// ignore this coordinate if it is infinite (hits boundary of grid)
						if (j == 0 || j == grid.length - 1 || k == 0 || k == grid[j].length - 1) {
							infinite = true;
						}
						// otherwise increment the area
						else {
							area++;
						}
					}
					k++;
				}
				j++;
			}
			// if the area is not infinite and is the largest area, store area
			if (!infinite && area > largestArea) {
				largestArea = area;
			}
			
		}
		
		return largestArea;
		
	}
	
	public static int getSafeRegion(int[][] coordinates) {
		
		int region = 0;
		
		// iterate through the grid
		for (int x = 0; x < MAX_GRID_SIZE; x++) {
			for (int y = 0; y < MAX_GRID_SIZE; y++) {
				int distance = 0;
				// calculate the distance of every point on the grid to each coordinate
				for (int i = 0; i < coordinates.length; i++) {
					distance += getDistance(coordinates[i][1], coordinates[i][2], x, y);
					
				}
				// if the distance is within the safe distance, add its area to the safe region
				if (distance < SAFE_DISTANCE) {
					region++;
				}
			}
		}
		
		return region;
		
		
	}

}
