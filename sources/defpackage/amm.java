package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: amm reason: default package */
class amm {
    private static String a = amm.class.getSimpleName();
    private static amh b;

    /* renamed from: amm$a */
    static class a extends BufferedInputStream {
        private HttpURLConnection a;

        a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.a = httpURLConnection;
        }

        public final void close() {
            super.close();
            amw.a((URLConnection) this.a);
        }
    }

    amm() {
    }

    private static synchronized amh a() {
        amh amh;
        synchronized (amm.class) {
            if (b == null) {
                b = new amh(a, new d());
            }
            amh = b;
        }
        return amh;
    }

    static InputStream a(Uri uri, Context context) {
        if (uri == null || !a(uri)) {
            return null;
        }
        try {
            return a().a(uri.toString(), null);
        } catch (IOException e) {
            amp.a(LoggingBehavior.CACHE, 5, a, e.toString());
            return null;
        }
    }

    static InputStream a(Context context, HttpURLConnection httpURLConnection) {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (a(parse)) {
                return new c(new a(inputStream, httpURLConnection), a().b(parse.toString(), null));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    private static boolean a(Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (host.endsWith("fbcdn.net")) {
                return true;
            }
            if (host.startsWith("fbcdn") && host.endsWith("akamaihd.net")) {
                return true;
            }
        }
        return false;
    }
}
