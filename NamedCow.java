class NamedCow extends Cow
{
	private String myName;

	public namedCow(String type, String name, String sound)     {                     
		myName = name;
     }
    public namedCow()     {          
         myName = "unknown";    
     }    
    public String getName(){return myName;}        
}     
