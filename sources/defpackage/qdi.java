package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qdi reason: default package */
public final class qdi implements spt {
    public final void a(sps sps) {
        sps.a(LinkType.CONFIG, "Settings", (spa) $$Lambda$qdi$xjp17AVrg_Fk_5BXqQ1BOOsbCY.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        if (rqp.a(jst)) {
            return rqp.c();
        }
        return qda.a(fpt, sessionState);
    }
}
