package ExercisesOops;

public class VolumeCube implements VolumeShapes{
	int a;
	

	VolumeCube(int i){
		a = i;
	}
	@Override
	public void volume() {
		int res = (int) Math.pow(a, 3);
		System.out.println("Cube Volume: "+ res);
		
	}
	
	public static void main(String[] args) {
		VolumeCube cObj = new VolumeCube(15);
		cObj.volume();
	}

}
