package defpackage;

import android.content.res.Resources;

/* renamed from: slg reason: default package */
public final class slg implements wig<slf> {
    private final wzi<Resources> a;

    private slg(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static slg a(wzi<Resources> wzi) {
        return new slg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new slf((Resources) this.a.get());
    }
}
