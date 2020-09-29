package defpackage;

import android.content.res.Resources;

/* renamed from: qkw reason: default package */
public final class qkw implements vua<qkv> {
    private final wlc<Resources> a;

    private qkw(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static qkw a(wlc<Resources> wlc) {
        return new qkw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qkv((Resources) this.a.get());
    }
}
