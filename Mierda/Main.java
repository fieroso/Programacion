/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println(" Hello World");
		int x=5;
		int y=2;
		int resul=x+y;
		int count = args.length;
		System.out.printf(" %d", args.length);
		//System.out.printf("\n %s %s %s %s",args[0],args[1],args[2],args[3]);
		if (count==1) {System.out.printf("\n Tiene elementos"); System.out.printf("\n %d + %d = %d",x,y,resul);}
		else if (count==0) System.out.printf("\n No tiene elementos");
		else System.out.printf("\n Sobran elementos");
  }
}	                                                    