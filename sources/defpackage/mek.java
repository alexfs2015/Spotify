package defpackage;

import android.content.res.Resources;

/* renamed from: mek reason: default package */
public final class mek implements wig<mej> {
    private final wzi<Resources> a;

    private mek(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static mek a(wzi<Resources> wzi) {
        return new mek(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mej((Resources) this.a.get());
    }
}
