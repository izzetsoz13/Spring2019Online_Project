package day22;

public class SubStringPractice {

	public static void main(String[] args) {
		
					// 012345678901234567890123456
		String song = "Name : Ba Ba Black Sheep Ba" ; 
		
		String target = "Ba" ; 
		
		int indexOf1Ba = song.indexOf("Ba") ; 
		System.out.println(indexOf1Ba);
		
		// indexOf(string, beginningIndex)
		int indexOf2Ba = song.indexOf("Ba" ,indexOf1Ba + 2 ) ; 
		
		System.out.println(indexOf2Ba);
		
		int indexOf3Ba = song.indexOf("Ba" , indexOf2Ba + 2) ; 
		
		System.out.println(indexOf3Ba);
		
		
		
		
		
		
		
		

	}

}
