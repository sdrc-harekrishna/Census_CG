package org.sdrc.censuscg.util;

public interface SendMail {

	public String send(String fromUserName, String toUserName, String toEmailId,StringBuffer subject, StringBuffer msg);
}
