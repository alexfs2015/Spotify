package defpackage;

import android.content.res.Resources;

/* renamed from: tlk reason: default package */
public final class tlk implements wig<tlj> {
    private final wzi<Resources> a;

    private tlk(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static tlk a(wzi<Resources> wzi) {
        return new tlk(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tlj((Resources) this.a.get());
    }
}
