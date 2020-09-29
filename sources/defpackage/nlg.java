package defpackage;

import android.content.Context;

/* renamed from: nlg reason: default package */
public abstract class nlg {
    private nli a;

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public final nli a(Context context) {
        if (this.a == null) {
            this.a = new nli((Context) fay.a((Context) fay.a(context)), b(), c());
        }
        return this.a;
    }
}
