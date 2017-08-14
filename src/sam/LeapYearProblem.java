package sam;

public class LeapYearProblem {
	
	public boolean isLeap(int year){
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
			return true;
		}else{
			return false;
		}
	}
	
	/*public int countLeap(int startYear,int endYear){
		int leapCount=0;
		for(int i = startYear;i<=endYear;i++){
			if(isLeap(i)==true){
				leapCount++;
			}
		}
		return leapCount;
	}*/
	
	public int countLeap(int startYear,int endYear){
		int leapCount=0;
		int newStartYear = -1;
		while(startYear<=endYear){
			if(isLeap(startYear)){
				newStartYear = startYear;
				break;
			}
			startYear++;
		}
		for(int i = newStartYear;i<=endYear;i=i+4){
			if(isLeap(i)==true){
				leapCount++;
			}
		}
		return leapCount;
	}
	
	public static void main(String ar[]){
		LeapYearProblem leapYearProblem = new LeapYearProblem();
		System.out.println(leapYearProblem.countLeap(200, 5000));
	}

}
