package defpackage;

import android.content.Context;

/* renamed from: hjf reason: default package */
public final class hjf implements wig<hje> {
    private final wzi<Context> a;

    private hjf(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static hjf a(wzi<Context> wzi) {
        return new hjf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hje((Context) this.a.get());
    }
}
