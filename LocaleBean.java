package mybeans;
public class LocaleBean
{
	double cost;
	double markup;
	double subtotal;
	double vat;
	double total;
	
	public void setCost(double cost)
	{
		this.cost=cost;
		this.markup=((cost/100)*20);
		this.subtotal=(cost+markup);
		this.vat=((subtotal/100)*12.5);
		this.total=(subtotal+vat);
	}
	
	public double getCost()
	{
		return cost;
	}
	public String getCostPrice()
	{
		return doFormat(cost);
	}
	public String getMarkup()
	{
		return doFormat(markup);
	}
	public String getSubtotal()
	{
		return doFormat(subtotal);
	}
	public String getVat()
	{
		return doFormat(vat);
	}
	public String getTotal()
	{
		return doFormat(total);
	}
	private String doFormat(double sum)//user defined method
	{
		//locale is predefined class in util package
		java.util.Locale loc=new java.util.Locale("en","GB");// new instantiating,en language for communication,gb is great Britain country name
		java.text.NumberFormat nf=java.text.NumberFormat.getCurrencyInstance(loc);//new is not used bcz this is interface and for interface obj cannot be created.
		return nf.format(sum);// nf is allocated with value in loc
		// format is predefined 
	}
}
