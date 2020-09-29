package com.comscore.util.crashreport;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HttpGetCrashReportParser implements CrashReportParser {
    private final String a = " | ";
    private final String b = "ns_ap_uxc";

    private String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    private String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String reportToString(CrashReport crashReport) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator it = crashReport.getExtras().entrySet().iterator();
        while (true) {
            str = "=";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                if (str3 == null) {
                    str3 = "";
                }
                sb.append("&");
                sb.append(str2);
                sb.append(str);
                sb.append(a(str3));
            }
        }
        String message = crashReport.getMessage();
        if (crashReport.getStackTrace() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(message);
            sb2.append(" | ");
            sb2.append(crashReport.getStackTrace());
            message = sb2.toString();
        }
        sb.append("&ns_ap_uxc");
        sb.append(str);
        sb.append(a(message));
        return (sb.length() <= 0 || sb.charAt(0) != '&') ? sb.toString() : sb.substring(1);
    }

    public CrashReport stringToReport(String str) {
        String[] split;
        String str2;
        HashMap hashMap = new HashMap();
        for (String str3 : str.split("\\&", -1)) {
            int indexOf = str3.indexOf("=");
            hashMap.put(str3.substring(0, indexOf), b(str3.substring(indexOf + 1, str3.length())));
        }
        String str4 = "ns_ap_uxc";
        String str5 = (String) hashMap.get(str4);
        hashMap.remove(str4);
        String str6 = "";
        if (str5 != null) {
            int indexOf2 = str5.indexOf(" | ");
            if (indexOf2 >= 0) {
                str6 = str5.substring(0, indexOf2);
                str2 = str5.substring(indexOf2 + 3, str5.length());
            } else {
                String str7 = str5;
                str2 = str6;
                str6 = str7;
            }
        } else {
            str2 = str6;
        }
        return new CrashReport(str6, str2, (Map<String, String>) hashMap);
    }
}
