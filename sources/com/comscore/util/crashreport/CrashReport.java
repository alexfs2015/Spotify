package com.comscore.util.crashreport;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CrashReport {
    private String a;
    private String b;
    private Map<String, String> c;

    public CrashReport(String str, String str2, Map<String, String> map) {
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        this.b = str2;
        if (str == null) {
            str = str3;
        }
        this.a = str;
        a(map);
    }

    public CrashReport(String str, Throwable th) {
        this(str, th, null);
    }

    public CrashReport(String str, Throwable th, Map<String, String> map) {
        String str2;
        String str3 = "";
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            str2 = stringWriter.toString();
        } else {
            str2 = str3;
        }
        this.b = str2;
        if (str == null) {
            str = str3;
        }
        this.a = str;
        a(map);
    }

    private void a(Map<String, String> map) {
        this.c = new LinkedHashMap();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                this.c.put(str, str2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CrashReport)) {
            return false;
        }
        CrashReport crashReport = (CrashReport) obj;
        return crashReport.getMessage().equals(getMessage()) && crashReport.getStackTrace().equals(getStackTrace()) && crashReport.getExtras().equals(getExtras());
    }

    public Map<String, String> getExtras() {
        return this.c;
    }

    public String getMessage() {
        return this.a;
    }

    public String getStackTrace() {
        return this.b;
    }
}
