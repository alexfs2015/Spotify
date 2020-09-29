package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: sna reason: default package */
public final class sna implements spt {
    sna() {
    }

    public final void a(sps sps) {
        sps.a(LinkType.GOLDEN_PATH, "Golden path features", (spa) $$Lambda$sna$huwUxUqUQPlKOjJ933QEv5Wic3E.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        String str2 = (String) fay.a(jst.h());
        if (str2.endsWith("goldenpathtutorialstep01")) {
            return fzj.c();
        }
        if (str2.endsWith("goldenpathtutorialstep02")) {
            return fzk.c();
        }
        if (str2.endsWith("toptracks")) {
            return uow.c();
        }
        StringBuilder sb = new StringBuilder("Fragment for Golden Path URI not resolved: ");
        sb.append(str2);
        throw new RuntimeException(sb.toString());
    }
}
