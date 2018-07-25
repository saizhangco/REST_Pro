package com.saizhang.rest.logic;

public class StringUtils {

	public static String stringClean(String txt) {
		
		if( txt == null || "".equals(txt) ) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		char[] ca_txt = txt.toCharArray();
		char c_comp = ca_txt[0];
		
		for( int i = 1 ; i< ca_txt.length; i++ ) {
			if( ca_txt[i] != c_comp ) {
				sb.append(c_comp);
				c_comp = ca_txt[i];
			}
		}
		sb.append(c_comp);
		
		return sb.toString();
	}
	
	public static int maxBlock(String txt) {
		
		if( txt == null || "".equals(txt) ) {
			return 0;
		}
		int result = 1;
		int max = 1;
		char[] ca_txt = txt.toCharArray();
		char start = ca_txt[0];
		for( int i=1;i<ca_txt.length;i++ ) {
			if( ca_txt[i] == start ) {
				max++;
			}else {
				if( max > result ) {
					result = max;
				}
				max = 1;
				start = ca_txt[i];
			}
		}
		if( max > result ) {
			result = max;
		}
		
		return result;
	}
	
	public static String reorderBlock(String txt) {
		if( txt == null || "".equals(txt) ) {
			return "";
		}
		
		char[] ca_txt = txt.toCharArray();
		
		for( int i=0;i<ca_txt.length-1;i++ ) {
			for( int j=0;j<ca_txt.length-1-i;j++ ) {
				if( ca_txt[j] > ca_txt[j+1] ) {
					char tmp = ca_txt[j];
					ca_txt[j] = ca_txt[j+1];
					ca_txt[j+1] = tmp;
				}
			}
		}
		
		return String.valueOf(ca_txt);
	}
}
