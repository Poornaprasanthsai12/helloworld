
public class larg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Test automation";
		
		String[] split = s.split(" ");
		
		int count=split.length;
		for(int i =count-1;i >=0 ;i--) {
			
			
			System.out.println(split[i]);
			
		}

	}

}
