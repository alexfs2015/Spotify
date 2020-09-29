package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qom reason: default package */
public final class qom implements taa {
    /* access modifiers changed from: private */
    public static /* synthetic */ tad a(Intent intent, fqn fqn, SessionState sessionState) {
        jva a = jva.a(intent.getDataString());
        if (!a.d()) {
            return isu.b(fqn) ? a.q() == null ? tad.a(jva.a("spotify:startpage")) : tad.a((jqx) qnz.a((String) fbp.a(a.h()), qnz.b(intent), intent.getExtras())) : new a();
        }
        jva e = a.e();
        return e == null ? tad.a(a) : tad.a(e);
    }

    public final void a(szz szz) {
        $$Lambda$qom$sbHNMJCstVkDfhpicFgIe4q65lU r0 = $$Lambda$qom$sbHNMJCstVkDfhpicFgIe4q65lU.INSTANCE;
        szz.a(LinkType.SHOW_EPISODE, "Handle show episode links", (tae) r0);
        szz.a(LinkType.SHOW_EPISODE_TIMESTAMP, "Handle show episode timestamp links", (tae) r0);
        szz.a(LinkType.EPISODE_AUTOPLAY, "Handle episode autoplay links", (tae) r0);
    }
}
