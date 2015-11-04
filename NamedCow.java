class NamedCow extends Cow
{
	private String myName;
	public NamedCow()
	{
	myName="bob";
	myType="NamedCow";
	mySound="moo";
	}
	public NamedCow(String name, String type, String sound)
	{
		mySound=sound;
		myName=name;
		myType=type;
	}
	public String getSound(){return mySound;}     
    public String getType(){return myType;}
    public String getName(){return myName;}
}