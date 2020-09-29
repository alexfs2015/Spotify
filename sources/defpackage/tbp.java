package defpackage;

import android.content.Context;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: tbp reason: default package */
public final class tbp {
    private final Context a;
    private final jqc b;
    private final umw c;
    private final und d;
    private final jvf e;

    tbp(Context context, jqc jqc, umw umw, und und, jvf jvf) {
        this.a = context;
        this.b = jqc;
        this.c = umw;
        this.d = und;
        this.e = jvf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(String str, LinkType linkType, Object obj) {
        umw umw = this.c;
        unm unm = new unm(umw, unc.a, this.e, str, this.d);
        return jpe.a(new unl(new unn(this.a, unm, umw, linkType)).a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(String str, String str2, Void voidR) {
        jqc jqc = this.b;
        return jpe.a(jqo.a(PageIdentifiers.CONTEXTMENU_EPISODE_SPEEDCONTROL, str, str2), jqc.a, jqc.b);
    }

    public final void a(String str) {
        jok.a(this.a, new $$Lambda$tbp$DoiGI8haS3HejGomuOgk21EuDe8(this, str, jva.a(str).b), null, sso.a("spotify:contextmenu:sleeptimer"));
    }

    public final void a(String str, String str2) {
        jok.a(this.a, new $$Lambda$tbp$IXGGlqEOmHEVEZ1SPr2gd7OaFOM(this, str, str2), null, sso.a("spotify:contextmenu:episode:podcast:speedcontrol"));
    }
}
