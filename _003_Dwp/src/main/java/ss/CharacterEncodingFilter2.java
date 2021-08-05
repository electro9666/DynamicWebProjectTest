package ss;

import org.springframework.web.filter.CharacterEncodingFilter;

public class CharacterEncodingFilter2 extends CharacterEncodingFilter {

	public void setEncoding(String encoding) {
		super.setEncoding(encoding);
		System.out.println("11. CharacterEncodingFilter2, encoding:" + encoding);
	}
}
