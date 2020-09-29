package defpackage;

import android.content.Context;

/* renamed from: uwg reason: default package */
public final class uwg implements wig<uwf> {
    private final wzi<Context> a;

    private uwg(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static uwg a(wzi<Context> wzi) {
        return new uwg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uwf((Context) this.a.get());
    }
}
