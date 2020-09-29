package defpackage;

import android.net.Uri;

/* renamed from: mcx reason: default package */
public final class mcx implements mco {
    public final boolean a(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith("https://www.paypal.com/cgi-bin/webscr") || uri2.startsWith("https://www.sandbox.paypal.com/cgi-bin/webscr");
    }
}
