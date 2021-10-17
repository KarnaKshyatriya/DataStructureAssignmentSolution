package Driver;

public class Floors implements Comparable<Floors> {
	
	int floorNo;
	int days;
	Floors(int floorNo,int days)
	{
		this.floorNo=floorNo;
		this.days=days;
	}
	@Override
	public int compareTo(Floors o) {
		// TODO Auto-generated method stub
		return this.floorNo - o.floorNo;
	}

}
