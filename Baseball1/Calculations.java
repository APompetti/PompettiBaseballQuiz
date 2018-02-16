package Baseball1;
import java.util.Scanner;
public class Calculations {
	 
	
	public static void main(String[] args) {
		
		
		PlayerCalculations();
	}
	public static BallStats PlayerCalculations() {
		BallStats Player = new BallStats();
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Player Name: ");
		Scanner name = new Scanner(System.in);
		String Name = name.next();
		
		
		System.out.print("Enter Player At Bats: ");
		Scanner ab = new Scanner(System.in);
		double AB = ab.nextDouble();
		
		System.out.print("Enter Player Hits: ");
		Scanner h = new Scanner(System.in);
		double H = h.nextDouble();
		
		System.out.print("Enter Player Doubles: ");
		Scanner twob = new Scanner(System.in);
		double TwoB = twob.nextDouble();
		
		System.out.print("Enter Player Triples: ");
		Scanner threeb = new Scanner(System.in);
		double ThreeB = threeb.nextDouble();
		
		System.out.print("Enter Player Home Runs: ");
		Scanner hr = new Scanner(System.in);
		double HR = hr.nextDouble();
		
		System.out.print("Enter Player Runs: ");
		Scanner r = new Scanner(System.in);
		double R = r.nextDouble();
		
		System.out.print("Enter Player Walks: ");
		Scanner bb = new Scanner(System.in);
		double BB = bb.nextDouble();
		
		double battingAverage = H/AB;
		double onbasePercentage = (H + BB)/(AB + BB);
		double sluggingPercentage = (((TwoB * 2) + (ThreeB * 3) + (HR * 4)) / AB);
		double onbaseplusSlugging = (onbasePercentage + sluggingPercentage);
		double totalBases = ((TwoB * 2) + (ThreeB * 3) + (HR * 4));
		
		
		System.out.println(Name);
		System.out.println(battingAverage);
		System.out.println(onbasePercentage);
		System.out.println(sluggingPercentage);
		System.out.println(onbaseplusSlugging);
		System.out.println(totalBases);
		
		
		return Player;
	}
}