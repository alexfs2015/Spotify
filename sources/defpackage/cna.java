package defpackage;

import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@cfp
/* renamed from: cna reason: default package */
public class cna {
    private cna() {
    }

    /* synthetic */ cna(byte b) {
        this();
    }

    public static boolean a(cti cti) {
        if (cti == null) {
            return false;
        }
        cti.onPause();
        return true;
    }

    public static boolean b(cti cti) {
        if (cti == null) {
            return false;
        }
        cti.onResume();
        return true;
    }

    public static boolean e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int a() {
        return 0;
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public ctj a(cti cti, boolean z) {
        return new ctj(cti, z);
    }

    public String a(Context context) {
        return "";
    }

    public String a(SslError sslError) {
        return "";
    }

    public Set<String> a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public void a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public void a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean a(Request request) {
        return false;
    }

    public boolean a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean a(Window window) {
        return false;
    }

    public int b() {
        return 1;
    }

    public void b(Context context) {
    }

    public boolean b(View view) {
        return false;
    }

    public int c() {
        return 5;
    }

    public CookieManager c(Context context) {
        if (e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            cml.a("Failed to obtain CookieManager.", th);
            bkc.i().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public boolean c(View view) {
        return false;
    }

    public LayoutParams d() {
        return new LayoutParams(-2, -2);
    }

    public int f() {
        return 0;
    }
}
