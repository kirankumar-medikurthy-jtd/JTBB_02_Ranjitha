/*Write a program to calculate simple Interest(SI) and Compound Interest(CI)?
Principle : 1000
Rate of Interest : 15%
Time : 3 years
*/
class simpleintrest
{
	public static void main(String[] args)
	{
	int principle = 1000;
	int Interest = 15;
	int time=3;
	int n = 1;
	Interest = (principle * Interest * time) / 100;
	int CompoundInterest = 1 + Interest;
	int dom = n* time;
	double compound = principle * Math.pow(CompoundInterest,dom)-(principle);
	
	System.out.println("Interest(SI)="+Interest);
	System.out.println("CompoundInterest(CI)="+compound);
	
	}
}
