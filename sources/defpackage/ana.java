package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: ana reason: default package */
class ana {
    private static String a = ana.class.getSimpleName();
    private static amv b;

    /* renamed from: ana$a */
    static class a extends BufferedInputStream {
        private HttpURLConnection a;

        a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.a = httpURLConnection;
        }

        public final void close() {
            super.close();
            ank.a((URLConnection) this.a);
        }
    }

    ana() {
    }

    private static synchronized amv a() {
        amv amv;
        synchronized (ana.class) {
            if (b == null) {
                b = new amv(a, new d());
            }
            amv = b;
        }
        return amv;
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

    static InputStream a(Uri uri, Context context) {
        if (uri == null || !a(uri)) {
            return null;
        }
        try {
            return a().a(uri.toString(), null);
        } catch (IOException e) {
            and.a(LoggingBehavior.CACHE, 5, a, e.toString());
            return null;
        }
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
