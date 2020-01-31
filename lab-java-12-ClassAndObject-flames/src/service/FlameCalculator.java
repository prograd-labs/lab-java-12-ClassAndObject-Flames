package service;

public class FlameCalculator {
	
	String your, crush;

	public FlameCalculator(String your, String crush) {
		super();
		this.your = your;
		this.crush = crush;
	}
	
	static String final_String;
	
	public String flames(String your, String crush) {
		
		your = your.trim();
		crush = crush.trim();
		your = your.toLowerCase();
		crush = crush.toLowerCase();
		String your_split[] = your.split(" ");
		String crush_split[] = crush.split(" ");
		your = "";
		crush = "";
		for (int i = 0; i < your_split.length; i++) {
			your = your + your_split[i];
		}
		for (int i = 0; i < crush_split.length; i++) {
			crush = crush + crush_split[i];
		}
        
        StringBuilder your1 = new StringBuilder(your);
        StringBuilder crush1 = new StringBuilder(crush);
        int flag = 0;
        
        for (int i = 0; i < your1.length(); i++) {
            for (int j = 0; j < crush1.length(); j++) {
                if (your1.charAt(i) == crush1.charAt(j)) {
                    crush1.deleteCharAt(j);
                    your1.deleteCharAt(i);
                    
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) {
                flag = 0;
                i--;
            }
        }
        
        int len = your1.length()+crush1.length();
        StringBuilder flames = new StringBuilder("FLAMES");
        int flames_len = flames.length();
        while(flames_len>1) {
            flames.deleteCharAt(len%flames_len);
            flames_len--;
        }
        final_String = new String(flames);
        return final_String;
	}

}
