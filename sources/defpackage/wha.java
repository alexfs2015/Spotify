package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.NetworkPolicy;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: wha reason: default package */
public final class wha implements Downloader {
    private static volatile Object a;
    private static final Object b = new Object();
    private static final ThreadLocal<StringBuilder> c = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder();
        }
    };
    private final Context d;

    public wha(Context context) {
        this.d = context.getApplicationContext();
    }

    public final a a(Uri uri, int i) {
        String str;
        if (VERSION.SDK_INT >= 14) {
            Context context = this.d;
            if (a == null) {
                try {
                    synchronized (b) {
                        if (a == null) {
                            File b2 = whb.b(context);
                            HttpResponseCache installed = HttpResponseCache.getInstalled();
                            if (installed == null) {
                                installed = HttpResponseCache.install(b2, whb.a(b2));
                            }
                            a = installed;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setUseCaches(true);
        if (i != 0) {
            if (NetworkPolicy.c(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = (StringBuilder) c.get();
                sb.setLength(0);
                if (!NetworkPolicy.a(i)) {
                    sb.append("no-cache");
                }
                if (!NetworkPolicy.b(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            httpURLConnection.setRequestProperty("Cache-Control", str);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) httpURLConnection.getHeaderFieldInt("Content-Length", -1);
            return new a(httpURLConnection.getInputStream(), whb.a(httpURLConnection.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        httpURLConnection.disconnect();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseCode);
        sb2.append(" ");
        sb2.append(httpURLConnection.getResponseMessage());
        throw new ResponseException(sb2.toString(), i, responseCode);
    }
}
