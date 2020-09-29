package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper.LocalValuePropVariant;

/* renamed from: nse reason: default package */
public final class nse implements vua<nsd> {
    private final wlc<Boolean> a;
    private final wlc<Integer> b;
    private final wlc<LocalValuePropVariant> c;
    private final wlc<ujc> d;

    private nse(wlc<Boolean> wlc, wlc<Integer> wlc2, wlc<LocalValuePropVariant> wlc3, wlc<ujc> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static nse a(wlc<Boolean> wlc, wlc<Integer> wlc2, wlc<LocalValuePropVariant> wlc3, wlc<ujc> wlc4) {
        return new nse(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new nsd(((Boolean) this.a.get()).booleanValue(), ((Integer) this.b.get()).intValue(), (LocalValuePropVariant) this.c.get(), (ujc) this.d.get());
    }
}
