package defpackage;

import android.content.Context;

/* renamed from: rgv reason: default package */
public final class rgv implements wig<rgu> {
    private final wzi<Context> a;

    private rgv(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static rgv a(wzi<Context> wzi) {
        return new rgv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rgu((Context) this.a.get());
    }
}
