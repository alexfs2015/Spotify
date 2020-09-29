package defpackage;

import android.content.Context;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: sri reason: default package */
public final class sri {
    private final Context a;
    private final jnq b;
    private final uab c;
    private final uai d;
    private final jsz e;

    sri(Context context, jnq jnq, uab uab, uai uai, jsz jsz) {
        this.a = context;
        this.b = jnq;
        this.c = uab;
        this.d = uai;
        this.e = jsz;
    }

    public final void a(String str, String str2) {
        jly.a(this.a, new $$Lambda$sri$NSZdTOm82anFIaSVCevOIXkxix8(this, str, str2), null, sih.a("spotify:contextmenu:episode:podcast:speedcontrol"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(String str, String str2, Void voidR) {
        jnq jnq = this.b;
        return jms.a(joc.a(PageIdentifiers.CONTEXTMENU_EPISODE_SPEEDCONTROL, str, str2), jnq.a, jnq.b);
    }

    public final void a(String str) {
        jly.a(this.a, new $$Lambda$sri$zH0O1wdsuCVXMho5MMUVnseXq5g(this, str, jst.a(str).b), null, sih.a("spotify:contextmenu:sleeptimer"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(String str, LinkType linkType, Object obj) {
        uab uab = this.c;
        uar uar = new uar(uab, uah.a, this.e, str, this.d);
        return jms.a(new uaq(new uas(this.a, uar, uab, linkType)).a);
    }
}
