package defpackage;

import android.content.Context;

/* renamed from: qok reason: default package */
public final class qok implements wig<qoj> {
    private final wzi<sso> a;
    private final wzi<Context> b;

    private qok(wzi<sso> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qok a(wzi<sso> wzi, wzi<Context> wzi2) {
        return new qok(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qoj((sso) this.a.get(), (Context) this.b.get());
    }
}
