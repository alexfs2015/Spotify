package defpackage;

import android.content.Context;

/* renamed from: gme reason: default package */
public final class gme implements wig<gmd> {
    private final wzi<Context> a;

    private gme(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static gme a(wzi<Context> wzi) {
        return new gme(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gmd((Context) this.a.get());
    }
}
