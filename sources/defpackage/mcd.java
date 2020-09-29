package defpackage;

import android.net.Uri;

/* renamed from: mcd reason: default package */
public class mcd implements mcp {
    private final mco a;
    private final mcn b;

    public mcd(mco mco, mcn mcn) {
        this.a = mco;
        this.b = mcn;
    }

    public final boolean a(Uri uri) {
        if (!this.a.a(uri)) {
            return false;
        }
        this.b.a(uri);
        return true;
    }
}
