package ExercisesOops;

public class VolumeRectPrism implements VolumeShapes{
	int length;
	int width;
	int height;
	
	VolumeRectPrism(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}

	@Override
	public void volume() {
		int res = length * width * height;
		System.out.println("Rectangular Prism Volume: "+ res);
	}
	
	public static void main(String[] args) {
		
		VolumeRectPrism rObj = new VolumeRectPrism(5, 15, 25);
		rObj.volume();
	}


}
