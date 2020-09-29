package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: niv reason: default package */
public final class niv implements taa {
    private final rqb a;
    private final uix b;

    public niv(rqb rqb, uix uix) {
        this.a = rqb;
        this.b = uix;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        String str2 = null;
        String stringExtra = intent != null ? intent.getStringExtra("space-id") : null;
        if (intent != null) {
            str2 = intent.getStringExtra("redirect_uri");
        }
        return fqn.b(nlt.c) ? nnd.a(fqn, sessionState.currentUser()) : (!this.a.a(fqn) || uix.a(fqn)) ? noj.a(fqn, sessionState.currentUser(), stringExtra) : nmh.a(fqn, sessionState.currentUser(), stringExtra, str2);
    }

    public final void a(szz szz) {
        $$Lambda$niv$cKzu6TKkAWSl8zADFxi0Ky7U8A8 r0 = new $$Lambda$niv$cKzu6TKkAWSl8zADFxi0Ky7U8A8(this);
        szz.a(LinkType.HOME_ROOT, "Client Home Page", (szh) r0);
        szz.a(LinkType.ACTIVATE, "Default routing for activate", (szh) r0);
        szz.a(LinkType.HOME_DRILLDOWN, "Client Home drill down destinations", (szh) r0);
    }
}
