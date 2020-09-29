package defpackage;

import android.os.Bundle;

/* renamed from: lwn reason: default package */
public final class lwn implements vua<lum> {
    private final wlc<Bundle> a;
    private final wlc<fpt> b;
    private final wlc<rgz> c;
    private final wlc<twu> d;
    private final wlc<veg> e;

    private lwn(wlc<Bundle> wlc, wlc<fpt> wlc2, wlc<rgz> wlc3, wlc<twu> wlc4, wlc<veg> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static lwn a(wlc<Bundle> wlc, wlc<fpt> wlc2, wlc<rgz> wlc3, wlc<twu> wlc4, wlc<veg> wlc5) {
        lwn lwn = new lwn(wlc, wlc2, wlc3, wlc4, wlc5);
        return lwn;
    }

    public final /* synthetic */ Object get() {
        fpt fpt = (fpt) this.b.get();
        twu twu = (twu) this.d.get();
        return (lum) vuf.a(lum.a.f().a(((Bundle) this.a.get()).getString("view_uri", "")).a(((rgz) this.c.get()).a(fpt)).b(twu.a(fpt)).a((veg) this.e.get()).c(ukr.b(fpt)).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
