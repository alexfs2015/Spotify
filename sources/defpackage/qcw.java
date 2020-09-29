package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qcw reason: default package */
public final class qcw implements taa {
    /* access modifiers changed from: private */
    public static /* synthetic */ tad a(Intent intent, fqn fqn, SessionState sessionState) {
        return ((Boolean) fqn.a(qcq.a)).booleanValue() ? tad.a(qdk.ah()) : tad.a((jqx) qbz.a((String) null, fqn, sessionState.currentUser()));
    }

    public final void a(szz szz) {
        szz.a(LinkType.RADIO_ROOT, "Displays Radio Hub page.", (tae) $$Lambda$qcw$_OIyNDS1OOETIPAtJSOdje_3UA.INSTANCE);
    }
}
