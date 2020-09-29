package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: pua reason: default package */
public final class pua implements spt {
    public final void a(sps sps) {
        sps.a(LinkType.RADIO_ROOT, "Displays Radio Hub page.", (spx) $$Lambda$pua$TZ2L1Sy2J0MIaLqPAgDFnGdDato.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ spw a(Intent intent, fpt fpt, SessionState sessionState) {
        if (((Boolean) fpt.a(ptu.a)).booleanValue()) {
            return spw.a(puo.ah());
        }
        return spw.a((jol) ptd.a((String) null, fpt, sessionState.currentUser()));
    }
}
