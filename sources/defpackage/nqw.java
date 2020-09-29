package defpackage;

import android.content.Context;

/* renamed from: nqw reason: default package */
public abstract class nqw {
    private nqy a;

    public abstract String a();

    public final nqy a(Context context) {
        if (this.a == null) {
            this.a = new nqy((Context) fbp.a((Context) fbp.a(context)), b(), c());
        }
        return this.a;
    }

    public abstract String b();

    public abstract int c();
}
