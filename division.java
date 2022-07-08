package Calculator;

public class division implements Operate {
	@Override
	public Double getResult(Double... numbers)
	{
		Double d = numbers[0];
		for(int i=1; i<numbers.length;i++)
		{
			d /=numbers[i];
		}
		return d;
	}
	

}
