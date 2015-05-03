import java.util.ArrayList;

public class Arraygetter 
{
	public static Integer[][] raster = new Integer[9][9]; 
	public static ArrayList<lObject> rasterl = new ArrayList<lObject>();
	static int o = 0;
	static boolean found = false;
	static boolean b = false;
	static boolean end = false;
	
	public static void löser(){
		int y = 0;
		int x = 0;
		forloop:
		for(int s = 0; s < raster.length; s++){
			for(int z = 0; z < raster[0].length; z++){
				if(raster[s][z] == 0){
					y = s;
					x = z;
					b = true;
					break forloop;
				}	
			}     
		}	
		if(b == true){		
			getMissing(y, x);
			b = false;
		}
	}
	
	public static boolean isInRow(int row, int val){
		for(int x = 0;x<9;x++){
			if(raster[row][x] == val)
				return true;
		}
		return false;
	}
	
	public static boolean isInCol(int col, int val){
		for(int y = 0;y<9;y++){
			if(raster[y][col] == val){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isInBlock(int xPos, int yPos, int val){
		int[] returnMap = getBlock(xPos, yPos);
		for(int i = 0;i<9;i++){
			if(returnMap[i] == val){
				return true;
			}
		}
		return false;
	}
	
	public static void getMissing(int yPos, int xPos) {
		lObject current;
		found = false;
		for(int i = raster[yPos][xPos]; i <= 9; i++){
			found = false;
			if(isInCol(xPos,i) || isInRow(yPos,i) || isInBlock(xPos,yPos,i)){
				found = true;
			}
			if(!found){
				raster[yPos][xPos] = i;
				if(o == 0){
					rasterl.add(new lObject(i,xPos,yPos));
					if(yPos == 8 && xPos == 8){
						end = true;
					}
				}
				else{
					if(rasterl.get(rasterl.size()-1).getX() == xPos && rasterl.get(rasterl.size()-1).getY() == yPos){
						rasterl.get(rasterl.size()-1).setVal(i);
					}
					else{
						rasterl.add(new lObject(i, xPos, yPos));
						if(yPos == 8 && xPos == 8){
							end = true;
						}
						o++;
					}
				}
				break;
			}
		}		
		if(found == true && raster[yPos][xPos] != 0){
			raster[yPos][xPos] = 0;
			rasterl.remove(rasterl.size() - 1);
			o--;
			current = rasterl.get(rasterl.size()-1);
			getMissing(current.getY(), current.getX());
		}
		if(found == true && raster[yPos][xPos] == 0){
			current = rasterl.get(rasterl.size()-1);
			getMissing(current.getY(), current.getX());
		}
		if(end == false){
			löser();
		}
		else
			transfer();
	}

	public static int[] getBlock(int xPos, int yPos){
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
		
		for(int y = yStart;y<yStart+3;y++){
			for(int x = xStart;x<xStart+3;x++){
				returnMap[(y-yStart)*3+(x-xStart)] = raster[y][x];
			}
		}
		return returnMap;
	}
	
	public static void transfer(){
		Gui.TF1_1.setText(raster[0][0].toString());
	    Gui.TF2_1.setText(raster[0][1].toString());
	    Gui.TF3_1.setText(raster[0][2].toString());
	    Gui.TF4_1.setText(raster[0][3].toString());
	    Gui.TF5_1.setText(raster[0][4].toString());
	    Gui.TF6_1.setText(raster[0][5].toString());
	    Gui.TF7_1.setText(raster[0][6].toString());
	    Gui.TF8_1.setText(raster[0][7].toString());
	    Gui.TF9_1.setText(raster[0][8].toString());
	    Gui.TF1_2.setText(raster[1][0].toString());
	    Gui.TF2_2.setText(raster[1][1].toString());
	    Gui.TF3_2.setText(raster[1][2].toString());
	    Gui.TF4_2.setText(raster[1][3].toString());
	    Gui.TF5_2.setText(raster[1][4].toString());
	    Gui.TF6_2.setText(raster[1][5].toString());
	    Gui.TF7_2.setText(raster[1][6].toString());
	    Gui.TF8_2.setText(raster[1][7].toString());
	    Gui.TF9_2.setText(raster[1][8].toString());
	    Gui.TF1_3.setText(raster[2][0].toString());
	    Gui.TF2_3.setText(raster[2][1].toString());
	    Gui.TF3_3.setText(raster[2][2].toString());
	    Gui.TF4_3.setText(raster[2][3].toString());
	    Gui.TF5_3.setText(raster[2][4].toString());
	    Gui.TF6_3.setText(raster[2][5].toString());
	    Gui.TF7_3.setText(raster[2][6].toString());
	    Gui.TF8_3.setText(raster[2][7].toString());
	    Gui.TF9_3.setText(raster[2][8].toString());
	    Gui.TF1_4.setText(raster[3][0].toString());
	    Gui.TF2_4.setText(raster[3][1].toString());
	    Gui.TF3_4.setText(raster[3][2].toString());
	    Gui.TF4_4.setText(raster[3][3].toString());
	    Gui.TF5_4.setText(raster[3][4].toString());
	    Gui.TF6_4.setText(raster[3][5].toString());
	    Gui.TF7_4.setText(raster[3][6].toString());
	    Gui.TF8_4.setText(raster[3][7].toString());
	    Gui.TF9_4.setText(raster[3][8].toString());
	    Gui.TF1_5.setText(raster[4][0].toString());
	    Gui.TF2_5.setText(raster[4][1].toString());
	    Gui.TF3_5.setText(raster[4][2].toString());
	    Gui.TF4_5.setText(raster[4][3].toString());
	    Gui.TF5_5.setText(raster[4][4].toString());
	    Gui.TF6_5.setText(raster[4][5].toString());
	    Gui.TF7_5.setText(raster[4][6].toString());
	    Gui.TF8_5.setText(raster[4][7].toString());
	    Gui.TF9_5.setText(raster[4][8].toString());
	    Gui.TF1_6.setText(raster[5][0].toString());
	    Gui.TF2_6.setText(raster[5][1].toString());
	    Gui.TF3_6.setText(raster[5][2].toString());
	    Gui.TF4_6.setText(raster[5][3].toString());
	    Gui.TF5_6.setText(raster[5][4].toString());
	    Gui.TF6_6.setText(raster[5][5].toString());
	    Gui.TF7_6.setText(raster[5][6].toString());
	    Gui.TF8_6.setText(raster[5][7].toString());
	    Gui.TF9_6.setText(raster[5][8].toString());
	    Gui.TF1_7.setText(raster[6][0].toString());
	    Gui.TF2_7.setText(raster[6][1].toString());
	    Gui.TF3_7.setText(raster[6][2].toString());
	    Gui.TF4_7.setText(raster[6][3].toString());
	    Gui.TF5_7.setText(raster[6][4].toString());
	    Gui.TF6_7.setText(raster[6][5].toString());
	    Gui.TF7_7.setText(raster[6][6].toString());
	    Gui.TF8_7.setText(raster[6][7].toString());
	    Gui.TF9_7.setText(raster[6][8].toString());
	    Gui.TF1_8.setText(raster[7][0].toString());
	    Gui.TF2_8.setText(raster[7][1].toString());
	    Gui.TF3_8.setText(raster[7][2].toString());
	    Gui.TF4_8.setText(raster[7][3].toString());
	    Gui.TF5_8.setText(raster[7][4].toString());
	    Gui.TF6_8.setText(raster[7][5].toString());
	    Gui.TF7_8.setText(raster[7][6].toString());
	    Gui.TF8_8.setText(raster[7][7].toString());
	    Gui.TF9_8.setText(raster[7][8].toString());
	    Gui.TF1_9.setText(raster[8][0].toString());
	    Gui.TF2_9.setText(raster[8][1].toString());
	    Gui.TF3_9.setText(raster[8][2].toString());
	    Gui.TF4_9.setText(raster[8][3].toString());
	    Gui.TF5_9.setText(raster[8][4].toString());
	    Gui.TF6_9.setText(raster[8][5].toString());
	    Gui.TF7_9.setText(raster[8][6].toString());
	    Gui.TF8_9.setText(raster[8][7].toString());
	    Gui.TF9_9.setText(raster[8][8].toString());  
	}
}