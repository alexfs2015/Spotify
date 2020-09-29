package defpackage;

import android.content.res.Resources;

/* renamed from: ioh reason: default package */
public final class ioh implements wig<iog> {
    private final wzi<ioe> a;
    private final wzi<Resources> b;

    private ioh(wzi<ioe> wzi, wzi<Resources> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ioh a(wzi<ioe> wzi, wzi<Resources> wzi2) {
        return new ioh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iog((ioe) this.a.get(), (Resources) this.b.get());
    }
}
