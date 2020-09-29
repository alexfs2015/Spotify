package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

@cfp
/* renamed from: dvu reason: default package */
public final class dvu extends b {
    private final dvr a;
    private final Drawable b;
    private final Uri c;
    private final double d;

    public dvu(dvr dvr) {
        Drawable drawable;
        String str = "";
        this.a = dvr;
        Uri uri = null;
        try {
            cbi a2 = this.a.a();
            if (a2 != null) {
                drawable = (Drawable) cbj.a(a2);
                this.b = drawable;
                uri = this.a.b();
                this.c = uri;
                double d2 = 1.0d;
                d2 = this.a.c();
                this.d = d2;
            }
        } catch (RemoteException e) {
            cpn.a(str, e);
        }
        drawable = null;
        this.b = drawable;
        try {
            uri = this.a.b();
        } catch (RemoteException e2) {
            cpn.a(str, e2);
        }
        this.c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.a.c();
        } catch (RemoteException e3) {
            cpn.a(str, e3);
        }
        this.d = d22;
    }

    public final Drawable a() {
        return this.b;
    }

    public final Uri b() {
        return this.c;
    }

    public final double c() {
        return this.d;
    }
}
