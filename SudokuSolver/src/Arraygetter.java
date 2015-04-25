import java.util.ArrayList;
import java.util.Arrays;

public class Arraygetter 
{
	public static Integer[][] raster = new Integer[9][9]; 
	public static ArrayList<lObject> rasterl = new ArrayList<lObject>();
	static int o = 0;
	static boolean found = false;
	static boolean b = false;
	
	public static void löser(){
		int y = 0;
		int x = 0;
		forloop:
		for(int s = 0; s < raster.length; s++){
			for(int z = 0; z < raster[0].length; z++){
				System.out.println(s + " - "+ z);
				if(raster[s][z] == 0){
					y = s;
					x = z;
					b = true;
					break forloop;
				}	
			}     
		}	
		if(b ==true)
		getMissing(y, x);
	}
	
	public static boolean isInRow(int row, int val){
		System.out.println("Checking Row");
		for(int x = 0;x<9;x++){
			System.out.println("Comparing : " + raster[row][x] + " and " + val + " => " + String.valueOf(raster[row][x] == val));
			if(raster[row][x] == val)
				return true;
		}
		return false;
	}
	
	public static boolean isInCol(int col, int val){
		System.out.println("Checking Col");
		for(int y = 0;y<9;y++){
			System.out.println("Comparing : " + raster[y][col] + " and " + val + " => " + String.valueOf(raster[y][col] == val));
			if(raster[y][col] == val){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isInBlock(int xPos, int yPos, int val){
		int[] returnMap = getBlock(xPos, yPos);
		System.out.println("Block [isInBlock] for [" + xPos + "|" + yPos + "] => " + Arrays.toString(returnMap));
		for(int i = 0;i<9;i++){
			System.out.println("Comparing : " + returnMap[i] + " and " + val + " => " + String.valueOf(returnMap[i] == val));
			if(returnMap[i] == val){
				System.out.println("Found in block!");
				return true;
			}
		}
		System.out.println("Not found in block");
		return false;
	}
	
	public static void getMissing(int yPos, int xPos) {
		lObject current;
		found = false;
		System.out.println("Current block: [" + xPos + "|" + yPos + "] with value: " + raster[yPos][xPos] + " {");
		for(int i = raster[yPos][xPos]; i <= 9; i++){
			found = false;
			if(isInCol(xPos,i) || isInRow(yPos,i) || isInBlock(xPos,yPos,i)){
				found = true;
			}
			if(!found){
				System.out.println("	Found unset: " + i);
				System.out.println(raster[yPos][xPos]);
				raster[yPos][xPos] = i;
				if(o == 0)
					rasterl.add(new lObject(i,xPos,yPos));
				else{
					System.out.println("Größe von rasterl: " + rasterl.size());
					if(rasterl.get(rasterl.size()-1).getX() == xPos && rasterl.get(rasterl.size()-1).getY() == yPos){
						rasterl.get(rasterl.size()-1).setVal(i);
						System.out.println("if");
					}
					else{
						rasterl.add(new lObject(i, xPos, yPos));
						System.out.println("else");
					}
				}
				o++;
				//ausgabe();
				transfer();			
				System.out.println("	Found unset: " + i);
				System.out.println(raster[yPos][xPos]);
				System.out.println("}");
				ausgabe();
				break;
			}
		}
		System.out.println(raster[yPos][xPos]);
		
		if(found == true && raster[yPos][xPos] != 0){
			System.out.println("found +  !=0");
			raster[yPos][xPos] = 0;
			System.out.println("Setting [" + xPos + "|" + yPos + "] to value 0");
			rasterl.remove(rasterl.size() - 1);
			//ausgabe();
			current = rasterl.get(rasterl.size()-1);
			getMissing(current.getY(), current.getX());
		}
		if(found == true && raster[yPos][xPos] == 0){
			System.out.println("found +  ==0");
			//ausgabe();
			current = rasterl.get(rasterl.size()-1);
			System.out.println("yPos: " + current.getY() + " - xPos: " +  current.getX());
			getMissing(current.getY(), current.getX());
		}
		System.out.println("	Nothing Found");
		System.out.println("}");
		löser();
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
				System.out.println("Adding " + raster[y][x] + " to returnMap");
				returnMap[(y-yStart)*3+(x-xStart)] = raster[y][x];
			}
		}
		System.out.println("Block for [" + xPos + "|" + yPos + "] => " + Arrays.toString(returnMap));
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
	
	public static void printRaster(){
		String line = "";
		for(int i = 0;i<raster.length;i++){
			line = "[";
			for(int j = 0;j<raster[i].length;j++){
				line += raster[i][j]+",";
			}
			line = line.substring(0, line.length()-1) + "]";
			System.out.println(line);
		}
	}
	
	public static void ausgabe(){
		for(lObject ausgabe : rasterl)
		{
			System.out.println("["+ ausgabe.getY() + "|" + ausgabe.getX()  + "],");
		}
	}	
}