package defpackage;

import android.net.Uri;

/* renamed from: mha reason: default package */
public final class mha implements mgr {
    public final boolean a(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith("https://www.paypal.com/cgi-bin/webscr") || uri2.startsWith("https://www.sandbox.paypal.com/cgi-bin/webscr");
    }
}
