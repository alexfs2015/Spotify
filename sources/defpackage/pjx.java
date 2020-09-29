package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: pjx reason: default package */
public final class pjx implements spt {
    private final rgz a;

    public pjx(rgz rgz) {
        this.a = rgz;
    }

    public final void a(sps sps) {
        sps.a(LinkType.PROFILE, "Profiles of Spotify users", (spa) new $$Lambda$pjx$N64IAqmJ6c5cpIsa1V9tH2nHjWc(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        if (fpt.b(pjw.a)) {
            return pjh.a((String) fay.a(jst.h()), sessionState.currentUser());
        }
        if (this.a.a(fpt)) {
            return rdq.a((String) fay.a(jst.h()), sessionState.currentUser());
        }
        return qop.a((String) fay.a(jst.h()), sessionState.currentUser(), str, fpt);
    }
}
