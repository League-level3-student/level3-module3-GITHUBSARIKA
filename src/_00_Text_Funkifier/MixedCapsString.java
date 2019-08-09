package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String b="";
		for (int i = 0; i < s.length(); i++) {
			char a=Character.toUpperCase(s.charAt(i));
			char c=Character.toLowerCase(s.charAt(i));
			if (i%2==0) {
			b+=c;
					
		}else {
			b+=a;
		}
		}
	
		
		
		return b;
	}

}
