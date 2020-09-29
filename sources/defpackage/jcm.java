package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: jcm reason: default package */
public final class jcm implements spt {
    public final void a(sps sps) {
        $$Lambda$jcm$VUgvg3oaFf7uLEZbuqt_qWvllV8 r0 = $$Lambda$jcm$VUgvg3oaFf7uLEZbuqt_qWvllV8.INSTANCE;
        $$Lambda$jcm$j5MXhisEmefONXlvTqkG5pCwF4Q r1 = $$Lambda$jcm$j5MXhisEmefONXlvTqkG5pCwF4Q.INSTANCE;
        $$Lambda$jcm$1ROfvXZ805bDpd38fhUrR96cPIk r2 = $$Lambda$jcm$1ROfvXZ805bDpd38fhUrR96cPIk.INSTANCE;
        $$Lambda$jcm$oe_3LD_BuK0T40OOyy_yDyIuiyo r3 = $$Lambda$jcm$oe_3LD_BuK0T40OOyy_yDyIuiyo.INSTANCE;
        sps.a(LinkType.SHOW_SHOW, "Handle show link resolved to unified podcast & video entity", (spx) r0);
        sps.a(LinkType.SHOW_PODCAST, "Handle routing to podcast specific entity page", (spa) r1);
        sps.a(LinkType.SHOW_VIDEO, "Handle routing to video specific entity page", (spa) r2);
        sps.a(LinkType.VIDEO_EPISODE, "Handle routing to video episode", (spa) r3);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ spw a(Intent intent, fpt fpt, SessionState sessionState) {
        jst a = jst.a(intent.getDataString());
        if (!iqh.b(fpt)) {
            return new a();
        }
        if (fpt.a(rxd.b) == RolloutFlag.CONTROL) {
            return spw.a((jol) qfi.a((String) fay.a(a.h()), fpt, qfi.b(intent)));
        }
        return spw.a((jol) qew.a((String) fay.a(a.h()), qfi.b(intent)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        String str2;
        String b = qfe.b((String) fay.a(jst.h()));
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        if (jst.s() != null) {
            StringBuilder sb2 = new StringBuilder("#");
            sb2.append(jst.s());
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return qfi.a(sb.toString(), b, fpt);
    }
}
