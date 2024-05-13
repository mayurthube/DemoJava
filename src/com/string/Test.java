package com.string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("Hello");
		new Test().main(a);
		
		String url="https:\\wwwwwwooglecomcom";
		
		System.out.println(url.length()+" ::: "+url.lastIndexOf("com"));
		String tempUrl="";
		String finalUrl="";
		boolean wwwflag= false;
		
		for(int i=0; i< url.length(); i++)
		{
			if(tempUrl.length()< 3 && (""+url.charAt(i)).equals("w") ) {
				tempUrl = tempUrl+url.charAt(i);
				if(tempUrl.length() ==3)
				wwwflag =true;
			}
			
			
			finalUrl= finalUrl+url.charAt(i);
			if(i== url.length()-4)
				finalUrl= finalUrl+".";
			if(wwwflag== true)
			{
				finalUrl= finalUrl+".";
				wwwflag= false;
			}
		}
		System.out.println("finalUrl :: "+finalUrl);
	}
	public void main(int args) {
		// TODO Auto-generated method stub
		System.out.println("Rushi");
	}
}
