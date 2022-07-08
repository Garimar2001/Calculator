package Calculator;

public class multiplication implements Operate{
	@Override
	public Double getResult(Double... numbers)
	{
		Double prod = 1.0;
		for(Double num:numbers)
		{
			prod *=num;
		}
		return prod;
	}
	

}
