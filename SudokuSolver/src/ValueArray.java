
public class ValueArray {

	private static ValueArray instance = new ValueArray();
	
	private int[][] valueMap = new int[9][9];
	
	public static ValueArray getInstance(){
		return instance;
	}
	
	public int[][] getValueMap() {
		return valueMap;
	}

	public void löser(int c, int r){
		for(int s = c; s < valueMap.length; s++){
			for(int z = r; z < valueMap[0].length; z++){
				if(valueMap[s][z] == 0)
					getMissing(z, s);
			}
		}				
	}
	
	public boolean isInRow(int row, int val){
		for(int x = 0;x<9;x++){
			if(valueMap[row][x] == val)
				return true;
		}
		return false;
	}
	
	public boolean isInCol(int col, int val){
		for(int y = 0;y<9;y++){
			if(valueMap[y][col] == val){
				return true;
			}
		}
		return false;
	}
	
	public boolean isInBlock(int xPos, int yPos, int val){
		for(int i = 0;i<9;i++){
			if(getBlock(xPos,yPos)[i] == val)
				return true;
		}
		return false;
	}
	
	public int[] getBlock(int xPos, int yPos){
		int[] returnMap = new int[9];
		int xStart = 0;
		int yStart = 0;
		int yDummy = yPos;
		int xDummy = xPos;
		while(yDummy+1 > 3){
			yStart += 3;
			yDummy -= 3;
		}
		while(xDummy+1 > 3){
			xStart += 3;
			xDummy -= 3;
		}
		for(int y = yStart;y<3;y++){
			for(int x = xStart;x<3;x++){
				returnMap[y*3+x] = valueMap[x][y];
			}
		}
		return new int[9];
	}
	
	public int getMissing(int xPos, int yPos){
		System.out.println("Current block: [" + xPos + "|" + yPos + "]{");
		for(int i = valueMap[yPos][xPos]+1; i <= 9; i++){
			System.out.println("Current I: " + i);
			boolean found = false;
			if(isInRow(yPos, i) || isInCol(xPos, i) || isInBlock(yPos, xPos, i)){
				found = true;
			}
			if(!found){
				valueMap[yPos][xPos] = i;
				//transfer();
				System.out.println("TRANSFER()");
				System.out.println("	Found unset: " + i);
				System.out.println("}");
				return i;
			}
		}
		System.out.println("	Nothing Found");
		System.out.println("}");
		return -1;
	}
	
	
	
	public void printvalueMap(){
		String line = "";
		for(int i = 0;i<valueMap.length;i++){
			line = "[";
			for(int j = 0;j<valueMap[i].length;j++){
				line += valueMap[i][j]+",";
			}
			line = line.substring(0, line.length()-1) + "]";
			System.out.println(line);
		}
	}
	
	public void printRaster(){
		String line = "";
		for(int i = 0;i<valueMap.length;i++){
			line = "[";
			for(int j = 0;j<valueMap[i].length;j++){
				line += valueMap[j][i]+",";
			}
			line = line.substring(0, line.length()-1) + "]";
			System.out.println(line);
		}
	}
	
	/*
	 * 
	[2,3,4,5,9,8,1,7,6]
	[7,9,6,3,4,1,5,8,2]
	[5,1,8,6,7,2,9,3,4]
	[9,6,2,7,1,5,8,4,3]
	[8,5,3,4,6,9,7,2,1]
	[4,7,1,2,8,3,6,9,5]
	[1,2,5,8,3,7,4,6,9]
	[3,4,7,9,5,6,2,1,8]
	[6,8,9,1,2,4,3,5,7]
	
	[2,0,4,5,0,8,0,7,6]
	[7,0,6,0,4,1,5,0,2]
	[0,1,8,6,7,0,9,3,0]
	[0,6,2,0,1,5,8,0,3]
	[8,5,0,4,6,0,0,2,1]
	[4,0,1,2,0,3,6,9,0]
	[0,2,5,0,3,7,4,6,0]
	[0,4,7,9,5,0,2,0,8]
	[6,8,0,1,0,4,0,5,7]
	
	
	*/
}
