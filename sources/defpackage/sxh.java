package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: sxh reason: default package */
public final class sxh implements taa {
    sxh() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        String str2 = (String) fbp.a(jva.h());
        if (str2.endsWith("goldenpathtutorialstep01")) {
            return gad.c();
        }
        if (str2.endsWith("goldenpathtutorialstep02")) {
            return gae.c();
        }
        if (str2.endsWith("toptracks")) {
            return vab.c();
        }
        StringBuilder sb = new StringBuilder("Fragment for Golden Path URI not resolved: ");
        sb.append(str2);
        throw new RuntimeException(sb.toString());
    }

    public final void a(szz szz) {
        szz.a(LinkType.GOLDEN_PATH, "Golden path features", (szh) $$Lambda$sxh$nVAyScc6d0bd7p_5BkGjxYQ9uI.INSTANCE);
    }
}
