package defpackage;

import android.content.Context;

/* renamed from: qbf reason: default package */
public final class qbf implements wig<qbe> {
    private final wzi<Context> a;

    private qbf(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static qbf a(wzi<Context> wzi) {
        return new qbf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qbe((Context) this.a.get());
    }
}
