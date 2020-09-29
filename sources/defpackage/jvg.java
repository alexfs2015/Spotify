package defpackage;

import android.content.Context;

/* renamed from: jvg reason: default package */
public final class jvg implements wig<jvf> {
    private final wzi<Context> a;

    private jvg(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static jvg a(wzi<Context> wzi) {
        return new jvg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jvf((Context) this.a.get());
    }
}
