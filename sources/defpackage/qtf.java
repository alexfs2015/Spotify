package defpackage;

import android.content.res.Resources;

/* renamed from: qtf reason: default package */
public final class qtf implements wig<qte> {
    private final wzi<Resources> a;

    private qtf(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static qtf a(wzi<Resources> wzi) {
        return new qtf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qte((Resources) this.a.get());
    }
}
