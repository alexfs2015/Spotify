package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: nag reason: default package */
public final class nag implements wig<naf> {
    private final wzi<a> a;
    private final wzi<mzi> b;

    private nag(wzi<a> wzi, wzi<mzi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nag a(wzi<a> wzi, wzi<mzi> wzi2) {
        return new nag(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new naf((a) this.a.get(), (mzi) this.b.get());
    }
}
