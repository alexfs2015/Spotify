package defpackage;

import android.content.res.Resources;

/* renamed from: qlj reason: default package */
public final class qlj implements wig<qli> {
    private final wzi<Resources> a;

    private qlj(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static qlj a(wzi<Resources> wzi) {
        return new qlj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qli((Resources) this.a.get());
    }
}
