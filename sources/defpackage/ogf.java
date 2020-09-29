package defpackage;

import android.content.Context;

/* renamed from: ogf reason: default package */
public final class ogf implements wig<oge> {
    private final wzi<Context> a;

    private ogf(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ogf a(wzi<Context> wzi) {
        return new ogf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new oge((Context) this.a.get());
    }
}
