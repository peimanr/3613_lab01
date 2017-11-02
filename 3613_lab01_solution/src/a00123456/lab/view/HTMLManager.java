/*
 * Paul Mills	
 * A00123456
 * HTMLManager.java
*/

package a00123456.lab.view;

import java.lang.String;

public class HTMLManager {

	public static StringBuffer addPageHeader(String title) {
		StringBuffer header = new StringBuffer("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 ");
		header.append( "Transitional//EN\">\n" );
		header.append( "<LINK REL=STYLESHEET HREF=\"mainstyle.css\" TYPE=\"text/css\">" );
		header.append( "<HTML>\n" );
		header.append( "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" );
		header.append( "<BODY>" );
		header.append( "<div id=\"header\"> " );
		header.append( "<H1>COMP 3613 Lab01</H1>\n" );
		header.append( "</div>" );

		return header;
	}

	public static StringBuffer addDataToOutput(String fName, String lName, String id) {
		StringBuffer outputData = new StringBuffer();

		outputData.append("<div id=\"mainDoc\">");
		outputData.append("<H2> Student Number: " + id + "</H2><BR>");
		outputData.append("<H2> First Name: " + fName + "</H2><BR>");
		outputData.append("<H2> Last Name: " + lName + "</H2><p>");
		outputData.append("<img src=images/bullwinkle.jpg />");
		
		outputData.append("</div>");
		
		return outputData;
	}

	public static StringBuffer addPageFooter() {
		StringBuffer footer = new StringBuffer("</BODY>\n" + "</HTML>");

		return footer;
	}
}
	