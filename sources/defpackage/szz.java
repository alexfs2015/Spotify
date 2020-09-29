package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: szz reason: default package */
public final class szz {
    public final a<Intent> a = new a<>();
    public final szy b;
    private final a c;
    private final gcp<Intent> d;

    public szz(a aVar, szy szy, gcp<Intent> gcp) {
        this.c = aVar;
        this.b = szy;
        this.d = gcp;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(Intent intent) {
        StringBuilder sb = new StringBuilder("triggered by intent ");
        sb.append(intent);
        return sb.toString();
    }

    public static szx a(tae tae) {
        return new $$Lambda$szz$SKjlH1Yw4fnjcPsUK_GNPjBkH8(tae);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(xiz xiz, Intent intent, fqn fqn, SessionState sessionState) {
        Intent intent2 = (Intent) xiz.call(intent, fqn);
        if (intent2 != null) {
            this.d.accept(intent2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(Intent intent) {
        StringBuilder sb = new StringBuilder("Triggered by intent with action ");
        sb.append(intent.getAction());
        return sb.toString();
    }

    public final szz a(LinkType linkType, String str, szh szh) {
        this.a.a(tag.a(taf.b(), tah.a(tah.a(linkType))), this.b.a(szh, str));
        return this;
    }

    public final szz a(LinkType linkType, String str, tae tae) {
        return a(tah.a(linkType), str, (szx) new $$Lambda$szz$SKjlH1Yw4fnjcPsUK_GNPjBkH8(tae));
    }

    public final szz a(LinkType linkType, String str, xiz<Intent, fqn, Intent> xiz) {
        this.a.a(tag.a(taf.b(), tah.a(tah.a(linkType))), this.c.a(new $$Lambda$szz$iHaLvaEF_8SIbZpr8SeHri8SkXY(this, xiz), str, $$Lambda$szz$Tm00MP9oMauz62GDVdh4rzovvo.INSTANCE));
        return this;
    }

    public final szz a(gli<jva> gli, String str, szx szx) {
        this.a.a(tag.a(taf.b(), tah.a(gli)), this.b.a(szx, str));
        return this;
    }

    public final szz a(String str, String str2, xiu<Intent, fqn, SessionState> xiu) {
        this.a.a(new taf(str), this.c.a(xiu, str2, $$Lambda$szz$UF_Zseq7x_95PltCTG_lpjESiLE.INSTANCE));
        return this;
    }
}
