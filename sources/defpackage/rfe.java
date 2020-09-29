package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: rfe reason: default package */
public final class rfe implements wig<rfd> {
    private final wzi<lon> a;
    private final wzi<a> b;

    private rfe(wzi<lon> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rfe a(wzi<lon> wzi, wzi<a> wzi2) {
        return new rfe(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rfd((lon) this.a.get(), (a) this.b.get());
    }
}
