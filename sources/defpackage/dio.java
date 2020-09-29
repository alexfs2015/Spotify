package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzcj;

/* renamed from: dio reason: default package */
public final class dio {
    public static final String[] a = {"/aclk", "/pcs/click"};
    public dik b;
    private String c = "=";
    private String d = "/pagead/ads";
    private String e = "=";
    private String[] f = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    public dio(dik dik) {
        this.b = dik;
    }

    private final boolean b(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.e);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new zzcj("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        try {
            boolean b2 = b(uri);
            String str2 = "ms";
            if (b2) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzcj("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter(str2) != null) {
                throw new zzcj("Query parameter already exists: ms");
            }
            String a2 = z ? this.b.a(context, str, view, activity) : this.b.a(context);
            String str3 = "=";
            if (b2) {
                String str4 = "dc_ms";
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                String str5 = ";";
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    StringBuilder sb = new StringBuilder(uri2.substring(0, i));
                    sb.append(str4);
                    sb.append(str3);
                    sb.append(a2);
                    sb.append(str5);
                    sb.append(uri2.substring(i));
                    return Uri.parse(sb.toString());
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                sb2.append(str5);
                sb2.append(str4);
                sb2.append(str3);
                sb2.append(a2);
                sb2.append(str5);
                sb2.append(uri2.substring(indexOf2 + encodedPath.length()));
                return Uri.parse(sb2.toString());
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter(str2, a2).build();
            }
            int i2 = indexOf3 + 1;
            StringBuilder sb3 = new StringBuilder(uri3.substring(0, i2));
            sb3.append(str2);
            sb3.append(str3);
            sb3.append(a2);
            sb3.append("&");
            sb3.append(uri3.substring(i2));
            return Uri.parse(sb3.toString());
        } catch (UnsupportedOperationException unused) {
            throw new zzcj("Provided Uri is not in a valid state");
        }
    }

    public final void a(MotionEvent motionEvent) {
        this.b.a(motionEvent);
    }

    public final boolean a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }
}
