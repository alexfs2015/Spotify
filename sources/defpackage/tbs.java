package defpackage;

import android.content.res.Resources;

/* renamed from: tbs reason: default package */
public final class tbs implements wig<tbr> {
    private final wzi<Resources> a;

    private tbs(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static tbs a(wzi<Resources> wzi) {
        return new tbs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tbr((Resources) this.a.get());
    }
}
