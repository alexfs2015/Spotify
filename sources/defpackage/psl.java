package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: psl reason: default package */
public final class psl implements taa {
    private final rqb a;
    private final vrh b;

    public psl(rqb rqb, vrh vrh) {
        this.a = rqb;
        this.b = vrh;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        return (this.b.a() || psk.a(fqn)) ? prw.a((String) fbp.a(jva.h()), sessionState.currentUser(), fqn) : this.a.a(fqn) ? rms.a((String) fbp.a(jva.h()), sessionState.currentUser()) : qwy.a((String) fbp.a(jva.h()), sessionState.currentUser(), str, fqn);
    }

    public final void a(szz szz) {
        szz.a(LinkType.PROFILE, "Profiles of Spotify users", (szh) new $$Lambda$psl$9Ut5NlR262DdtujVC1WRtorMPV4(this));
    }
}
