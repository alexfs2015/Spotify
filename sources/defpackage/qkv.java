package defpackage;

import android.content.Context;

/* renamed from: qkv reason: default package */
public final class qkv implements wig<qku> {
    private final wzi<Context> a;
    private final wzi<qlc> b;

    private qkv(wzi<Context> wzi, wzi<qlc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qkv a(wzi<Context> wzi, wzi<qlc> wzi2) {
        return new qkv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qku((Context) this.a.get(), (qlc) this.b.get());
    }
}
