package defpackage;

import android.net.Uri;

/* renamed from: ema reason: default package */
public final class ema {
    final Uri a;
    final String b;
    final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public ema(Uri uri) {
        String str = "";
        this(uri, str, str);
    }

    private ema(Uri uri, String str, String str2) {
        this.d = null;
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.e = false;
        this.f = false;
        this.g = false;
    }
}
