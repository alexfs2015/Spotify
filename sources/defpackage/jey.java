package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: jey reason: default package */
public final class jey implements taa {
    /* access modifiers changed from: private */
    public static /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        String str2;
        String b = qoh.b((String) fbp.a(jva.h()));
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        if (jva.s() != null) {
            StringBuilder sb2 = new StringBuilder("#");
            sb2.append(jva.s());
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return qol.a(sb.toString(), b, fqn);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tad a(Intent intent, fqn fqn, SessionState sessionState) {
        return isu.b(fqn) ? tad.a((jqx) qnz.a((String) fbp.a(jva.a(intent.getDataString()).h()), qol.b(intent))) : new a();
    }

    public final void a(szz szz) {
        $$Lambda$jey$csbHjPUyits6CD36HwBIjBFyuSg r0 = $$Lambda$jey$csbHjPUyits6CD36HwBIjBFyuSg.INSTANCE;
        $$Lambda$jey$kDiPhFH0FmXMR85Wn1C0CIJXjiA r1 = $$Lambda$jey$kDiPhFH0FmXMR85Wn1C0CIJXjiA.INSTANCE;
        $$Lambda$jey$rdvPCFEKOu4KfXa1yVxbATgzKug r2 = $$Lambda$jey$rdvPCFEKOu4KfXa1yVxbATgzKug.INSTANCE;
        $$Lambda$jey$IdBI1y3JGQcP7DhmKWrgpVgebRI r3 = $$Lambda$jey$IdBI1y3JGQcP7DhmKWrgpVgebRI.INSTANCE;
        szz.a(LinkType.SHOW_SHOW, "Handle show link resolved to unified podcast & video entity", (tae) r0);
        szz.a(LinkType.SHOW_PODCAST, "Handle routing to podcast specific entity page", (szh) r1);
        szz.a(LinkType.SHOW_VIDEO, "Handle routing to video specific entity page", (szh) r2);
        szz.a(LinkType.VIDEO_EPISODE, "Handle routing to video episode", (szh) r3);
    }
}
