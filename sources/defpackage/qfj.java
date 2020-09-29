package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qfj reason: default package */
public final class qfj implements spt {
    public final void a(sps sps) {
        $$Lambda$qfj$VGVfK8tdVsMDj8BZaq8rmnOQH58 r0 = $$Lambda$qfj$VGVfK8tdVsMDj8BZaq8rmnOQH58.INSTANCE;
        sps.a(LinkType.SHOW_EPISODE, "Handle show episode links", (spx) r0);
        sps.a(LinkType.SHOW_EPISODE_TIMESTAMP, "Handle show episode timestamp links", (spx) r0);
        sps.a(LinkType.EPISODE_AUTOPLAY, "Handle episode autoplay links", (spx) r0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ spw a(Intent intent, fpt fpt, SessionState sessionState) {
        jst a = jst.a(intent.getDataString());
        if (a.d()) {
            jst e = a.e();
            if (e == null) {
                return spw.a(a);
            }
            return spw.a(e);
        } else if (!iqh.b(fpt)) {
            return new a();
        } else {
            if (a.q() == null) {
                return spw.a(jst.a("spotify:startpage"));
            }
            return spw.a((jol) qew.a((String) fay.a(a.h()), qew.b(intent), intent.getExtras()));
        }
    }
}
