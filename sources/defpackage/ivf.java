package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: ivf reason: default package */
public final class ivf implements taa {
    /* access modifiers changed from: private */
    public static /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        ivg a = ivg.a(fqn);
        if (ivg.b(intent)) {
            jlg.a((jqx) a, intent);
        }
        return a;
    }

    public final void a(szz szz) {
        szz.a(LinkType.EVENTS_CONCERT_GROUP, "List of concerts", (szh) $$Lambda$ivf$e_vFwYG0g4mWdnqoXFLASf_8_w.INSTANCE);
    }
}
