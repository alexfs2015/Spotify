package defpackage;

import android.content.res.Resources;

/* renamed from: uqz reason: default package */
public final class uqz implements wig<uqy> {
    private final wzi<Resources> a;

    private uqz(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static uqz a(wzi<Resources> wzi) {
        return new uqz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uqy((Resources) this.a.get());
    }
}
