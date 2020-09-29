package com.comscore.util.crashreport;

import android.os.Build.VERSION;
import com.spotify.core.http.HttpConnection;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;

public class CrashReportHttpFlusher implements CrashReportFlusher {
    private static final int a = 4088;
    private static final int b = 5;
    private static final boolean c;
    private Proxy d;

    static {
        int i = VERSION.SDK_INT;
        c = i < 11 || i > 13;
    }

    private HttpURLConnection a(URL url) {
        Proxy proxy = this.d;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy != null ? url.openConnection(proxy) : url.openConnection());
        httpURLConnection.setRequestProperty("Connection", "Close");
        return httpURLConnection;
    }

    private Proxy a(String str) {
        int i;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            i = Integer.parseInt(str.substring(indexOf + 1));
            str = substring;
        } else {
            i = 80;
        }
        return new Proxy(Type.HTTP, new InetSocketAddress(str, i));
    }

    private URL a(URL url, int i, String str) {
        switch (i) {
            case 300:
            case HttpConnection.kErrorHttpConnectTimeout /*301*/:
            case HttpConnection.kErrorHttpConnectFail /*302*/:
            case HttpConnection.kErrorHttpInvalidUrl /*303*/:
            case HttpConnection.kErrorHttpBadRange /*305*/:
                if (str == null) {
                    return null;
                }
                if (i == 305) {
                    int i2 = 0;
                    StringBuilder sb = new StringBuilder();
                    sb.append(url.getProtocol());
                    sb.append(':');
                    if (str.startsWith(sb.toString())) {
                        i2 = url.getProtocol().length() + 1;
                    }
                    if (str.startsWith("//", i2)) {
                        i2 += 2;
                    }
                    this.d = a(str.substring(i2));
                    return url;
                }
                URL url2 = new URL(url, str);
                if (!url.getProtocol().equals(url2.getProtocol())) {
                    return null;
                }
                return url2;
            default:
                return null;
        }
    }

    private boolean a() {
        return c;
    }

    public URL createURL(String str) {
        if (str.length() > a) {
            String substring = str.substring(0, a);
            int lastIndexOf = substring.lastIndexOf(37);
            if (lastIndexOf >= 4086) {
                substring = substring.substring(0, lastIndexOf);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append("&ns_cut=");
            str = sb.toString();
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean flush(String str, CrashReportParser crashReportParser, CrashReport crashReport) {
        int i;
        boolean z = false;
        HttpURLConnection httpURLConnection = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?");
            sb.append(crashReportParser.reportToString(crashReport));
            URL createURL = createURL(sb.toString());
            if (a()) {
                httpURLConnection = a(createURL);
                i = httpURLConnection.getResponseCode();
            } else {
                int i2 = 0;
                int i3 = 0;
                while (createURL != null && i2 < 5) {
                    httpURLConnection = a(createURL);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    i3 = httpURLConnection.getResponseCode();
                    createURL = a(createURL, i3, httpURLConnection.getHeaderField("Location"));
                    i2++;
                }
                i = i3;
            }
            if (i == 200 || i == 204) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return z;
    }
}
