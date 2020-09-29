package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: qcl reason: default package */
public final class qcl implements vua<qck> {
    private final wlc<kyi> a;
    private final wlc<Fragment> b;

    private qcl(wlc<kyi> wlc, wlc<Fragment> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qcl a(wlc<kyi> wlc, wlc<Fragment> wlc2) {
        return new qcl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qck((kyi) this.a.get(), (Fragment) this.b.get());
    }
}
