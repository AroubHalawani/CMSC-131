package sysutilities;

public class Name {
	
	String firstName;
	String lastName;
	String middleName;
	char separator;
	String nickname;
	
	private static int nameObjsCount=0;
	
	public Name()
	{

		firstName="NOFIRSTNAME";
		middleName="NOMIDDLENAME";
		lastName="NOLASTNAME";
		separator='#';
		nameObjsCount += 1;
		
		
	}	
	public Name(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		middleName="";
		separator=',';
		nameObjsCount+=1;
		
	}
	public Name(String firstName,String middleName, String lastName)
	{
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		separator=',';
		nameObjsCount += 1;
		
	}
	public Name(String firstName,String middleName, String lastName , char separator)
	{
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		
		if(separator!=','&&separator!='-'&&separator!='#')
		{
			separator=',';
		}
		else
		{
			this.separator=separator;
		}
		
		nameObjsCount += 1;
		
	}
	
	public String getFirstname()
	{
		return firstName;
	}
	public String getMiddlename()
	{
		return middleName;
	}
	public String getLastname()
	{
		return lastName;
	}
	
	public void setNickname(String NickName)
	{
		nickname=NickName;
	}
	public String getNickname()
	{
		if(nickname==null)
		{
			return"";
		}
		else
		{
			return nickname;
		}
	}
	public void setSeparator(char Separator )
	{
		if (Separator==','||Separator=='-'||Separator=='#')
		{
			separator=Separator;
		}
		
		
	}
	public char getSeparator()
	{
		return separator;
	}
	
	
	public boolean equals(Object Name)
	{
		if(Name==null)
		
		{
			return false;
		}
		
		if(getClass()!=Name.getClass())
		
		{
			return false;
		}
		else
		{
			
			Name name =(Name)Name;
			
			if(this.firstName.equals(name.firstName)&&this.middleName.equals(name.middleName)&&this.lastName.equals(name.lastName))
			
			{
				return true;
			}
			
			return false;
		}
					
	}
	
	
	public String toString()
	{
		String answer="";
		
		if(firstName.equals(""))
			
		{
			answer+=lastName+separator+middleName;
		}
		
		if(middleName.equals(""))
			
		{
			answer+= lastName+separator+firstName;
		}
		
		if(lastName.equals(""))
			
		{
			answer+= firstName+separator+middleName;
		}
		
			
	
		if((!(firstName.equals(""))&&(!(middleName.equals("")))&&!(lastName.equals(""))))
			
		{
			
			answer+=lastName+separator+firstName+separator+middleName;
		}
		
		
		if(nickname!=null&&!(nickname.equals("")))
			
		{
			answer+="("+nickname+")";
		}
		
			
		return answer;
	}
	
	
	public int compareTo(Name parameter)
	{
		
		
		if(this.lastName.compareTo(parameter.lastName) == 0)
		{
			
			if (this.firstName.compareTo(parameter.firstName) == 0) 
			
			{
				
				if (this.middleName.compareTo(parameter.middleName) == 0) 
				
				{
				
					return 0;
				}
				else
				
				{
				
					return this.middleName.compareTo(parameter.middleName);
				}
				
				
			}
			
			else 
				
			{
			
				return this.firstName.compareTo(parameter.firstName);
			}
			
			
			
		}
		
		else
			
		{
			return this.lastName.compareTo(parameter.lastName);
		}
				
		
	}
	
	public static int getNumberOfNameObjects()
	
	{
		
		return nameObjsCount;
	}
	
	public static Name normalize(Name name, boolean y)
	
	{
		String FIRSTNAME="";
		String MIDDLENAME="";
		String LASTNAME="";
	
		if(name==null)
		{
			return null;
		}
		else
		{
			if(y==true)
				
			{
								
				FIRSTNAME= name.firstName.toUpperCase();
				MIDDLENAME= name.middleName.toUpperCase();
				LASTNAME= name.lastName.toUpperCase();
			}
			
			if(y==false)
				
			{
				FIRSTNAME= name.firstName.toLowerCase();
			    MIDDLENAME= name.middleName.toLowerCase();
				LASTNAME= name.lastName.toLowerCase();
			}
			
			Name  answer= new Name(FIRSTNAME, MIDDLENAME, LASTNAME, ',');
			
			return answer;
		}
				
		
	}
	
	private boolean validSeparato (char symbol)
	
	{
		if (symbol==','||symbol=='-'||symbol=='#')
		
		{
			return true;
		}
		
		else
		
		{
			return false;
		}
	}
	

}