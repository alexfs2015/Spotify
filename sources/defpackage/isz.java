package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: isz reason: default package */
public final class isz implements spt {
    public final void a(sps sps) {
        sps.a(LinkType.EVENTS_CONCERT_GROUP, "List of concerts", (spa) $$Lambda$isz$2SbaijTVhxKTJNaLD6EQy_9gOo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        ita a = ita.a(fpt);
        if (ita.b(intent)) {
            jiu.a((jol) a, intent);
        }
        return a;
    }
}
