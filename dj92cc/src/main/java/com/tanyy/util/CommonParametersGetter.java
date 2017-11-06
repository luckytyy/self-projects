package com.tanyy.util;

import org.apache.commons.lang.math.RandomUtils;

/**  
 * Description： 
 * Author:lucktyy@gmail.com
 * Date:2015-3-11上午10:16:46
 */
public class CommonParametersGetter {


	
	public static final String[] USER_AGENTS = {
                   "Mozilla/5.0 (Windows; U; Windows NT 5.1; it; rv:1.8.1.11) Gecko/20071127 Firefox/2.0.0.11",
                   "Opera/9.25 (Windows NT 5.1; U; en)",
                   "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)",
                   "Mozilla/5.0 (compatible; Konqueror/3.5; Linux) KHTML/3.5.5 (like Gecko) (Kubuntu)",
                   "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.0.12) Gecko/20070731 Ubuntu/dapper-security Firefox/1.5.0.12",
                   "Lynx/2.8.5rel.1 libwww-FM/2.14 SSL-MM/1.4.1 GNUTLS/1.2.9",
                   "Mozilla/5.0 (X11; Linux i686) AppleWebKit/535.7 (KHTML, like Gecko) Ubuntu/11.04 Chromium/16.0.912.77 Chrome/16.0.912.77 Safari/535.7",
                   "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:10.0) Gecko/20100101 Firefox/10.0 ",
                   "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36"
	};
	
	public static final int CONNECTION_TIME_OUT = 60000;       // CONNECTION_TIME_OUT seconds time out
	public static final int DOWNLOAD_CONNECTION_TIME_OUT = 30000;
	
	public static String getRandomUserAgents(){
		int len = USER_AGENTS.length;
		return USER_AGENTS[RandomUtils.nextInt(len)];
	}
	
	public static String decodeUnicode(String theString) {
    char aChar;
    int len = theString.length();
    StringBuffer outBuffer = new StringBuffer(len);
    for (int x = 0; x < len;) {
      aChar = theString.charAt(x++);
      if (aChar == '\\') {
        aChar = theString.charAt(x++);
        if (aChar == 'u') {
          // Read the xxxx
          int value = 0;
          for (int i = 0; i < 4; i++) {
            aChar = theString.charAt(x++);
            switch (aChar) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              value = (value << 4) + aChar - '0';
              break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
              value = (value << 4) + 10 + aChar - 'a';
              break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
              value = (value << 4) + 10 + aChar - 'A';
              break;
            default:
              throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
            }
          }
          outBuffer.append((char) value);
        } else {
          if (aChar == 't')
            aChar = '\t';
          else if (aChar == 'r')
            aChar = '\r';
          else if (aChar == 'n')
            aChar = '\n';
          else if (aChar == 'f')
            aChar = '\f';
          outBuffer.append(aChar);
        }
      } else
        outBuffer.append(aChar);
    }
    return outBuffer.toString();
  }
}
