package Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Input {

	ArrayList<Floors> al=new ArrayList<>();
	int number;
	int storey;
	Floors fl;
	Input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		number=sc.nextInt();

		for(int i=1;i<=number;i++)
		{
			System.out.println("enter the floor size given on day : "+i);
			storey=sc.nextInt();
			fl=new Floors(storey,i);
			al.add(fl);
		}

		Collections.sort(al,Collections.reverseOrder());
		stringFormation(al, number);
		
		sc.close();
	}



	public void stringFormation(ArrayList<Floors> b,int kotola)
	{
		int check=kotola;
		String str[]=new String[check];
		int index=0,subIndex=0;
		Floors jb=b.get(index);

		int counter=jb.days;

		String s="";
		for(int h=0;h<check;h++)
		{
			if(h+1==counter)
			{
				while(counter>=jb.days)
				{
					s=s+Integer.toString(jb.floorNo)+"  ";
					index+=1;
					if(index<check)
					{

						jb=b.get(index);
					}
					else
					{
						break;
					}
				}
				str[h]=s;
				s="";
				counter=jb.days;

			}
			else
			{

				str[h]=null;
			}
		}


		System.out.println("The order of construction is as follows");
		for(int k=0;k<str.length;k++)
		{
			if(str[k]==null)
				System.out.println("Day "+(k+1));
			else
				System.out.println("Day : "+(k+1)+" \n "+str[k]);
		}


	}

}



