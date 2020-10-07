package de.template;

public class LineCounter extends AbstractCounter{
	
	

	@Override
	public void process(final char c) {
		if(c == '\n')
			counter ++;
		
	}
	
	

}
