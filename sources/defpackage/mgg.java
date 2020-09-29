package defpackage;

import android.net.Uri;

/* renamed from: mgg reason: default package */
public class mgg implements mgs {
    private final mgr a;
    private final mgq b;

    public mgg(mgr mgr, mgq mgq) {
        this.a = mgr;
        this.b = mgq;
    }

    public final boolean a(Uri uri) {
        if (!this.a.a(uri)) {
            return false;
        }
        this.b.a(uri);
        return true;
    }
}
