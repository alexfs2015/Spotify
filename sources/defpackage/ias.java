package defpackage;

import android.content.res.Resources;

/* renamed from: ias reason: default package */
public final class ias implements wig<iar> {
    private final wzi<Resources> a;

    private ias(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static ias a(wzi<Resources> wzi) {
        return new ias(wzi);
    }

    public final /* synthetic */ Object get() {
        return new iar((Resources) this.a.get());
    }
}
