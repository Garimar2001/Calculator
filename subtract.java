package Calculator;

public class subtract implements Operate{
	@Override
	public Double getResult(Double... numbers)
	{
		Double diff = numbers[0];
		for(int i=1; i<numbers.length;i++)
		{
			diff -=numbers[i];
		}
		return diff;
	}
	
	

}
