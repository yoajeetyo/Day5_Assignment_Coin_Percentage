import java.util.Scanner;
public class PercentageOfHeadsAndTails {
	public static void main(String[] args) {
		System.out.println("Welcome to coin percentage Calculation game!!");
		Scanner scan = new Scanner(System.in);
			System.out.println("Write how many times you want to flip the coin :");
			int totalFlip=scan.nextInt();
			int headFlip=0;
			int tailFlip=0;
			if (totalFlip>0) {
				for (int i=1; i<=totalFlip;i++) {
					double flip=Math.floor(Math.random()*10)%2;
					if (flip<0.5) {
						headFlip++;
						
					}
					else {
						tailFlip++;
					}
				}
				
			}
			else {
				System.out.println("You have entered wrong value Next time enter Positive value THANK YOU !!!");
				System.exit(0);
			}
			double headPercent=(headFlip*100)/totalFlip;
			double tailPercent=(tailFlip*100)/totalFlip;
			System.out.println("Head flip percentage is : "+headPercent);
			System.out.println("Tail flip percentage is : "+tailPercent);
		}
		
	}



