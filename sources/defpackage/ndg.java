package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: ndg reason: default package */
public final class ndg implements spt {
    private final rgz a;
    private final twu b;

    public ndg(rgz rgz, twu twu) {
        this.a = rgz;
        this.b = twu;
    }

    public final void a(sps sps) {
        $$Lambda$ndg$ySIGMNKEJgul5IJnuENLZph6abM r0 = new $$Lambda$ndg$ySIGMNKEJgul5IJnuENLZph6abM(this);
        sps.a(LinkType.HOME_ROOT, "Client Home Page", (spa) r0);
        sps.a(LinkType.ACTIVATE, "Default routing for activate", (spa) r0);
        sps.a(LinkType.HOME_DRILLDOWN, "Client Home drill down destinations", (spa) r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        String str2 = null;
        String stringExtra = intent != null ? intent.getStringExtra("space-id") : null;
        if (intent != null) {
            str2 = intent.getStringExtra("redirect_uri");
        }
        if (fpt.b(nge.c)) {
            return nhh.a(fpt, sessionState.currentUser());
        }
        if (!this.a.a(fpt) || twu.a(fpt)) {
            return nin.a(fpt, sessionState.currentUser(), stringExtra);
        }
        return ngl.a(fpt, sessionState.currentUser(), stringExtra, str2);
    }
}
