package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: nht reason: default package */
public final class nht implements wig<nhs> {
    private final wzi<lon> a;
    private final wzi<a> b;

    private nht(wzi<lon> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nht a(wzi<lon> wzi, wzi<a> wzi2) {
        return new nht(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nhs((lon) this.a.get(), (a) this.b.get());
    }
}
