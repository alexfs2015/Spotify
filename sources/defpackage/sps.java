package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: sps reason: default package */
public final class sps {
    public final a<Intent> a = new a<>();
    public final spr b;
    private final a c;
    private final gbr<Intent> d;

    public sps(a aVar, spr spr, gbr<Intent> gbr) {
        this.c = aVar;
        this.b = spr;
        this.d = gbr;
    }

    public final sps a(LinkType linkType, String str, spa spa) {
        this.a.a(spz.a(spy.b(), sqa.a(sqa.a(linkType))), this.b.a(spa, str));
        return this;
    }

    public final sps a(String str, String str2, wup<Intent, fpt, SessionState> wup) {
        this.a.a(new spy(str), this.c.a(wup, str2, $$Lambda$sps$c3ChfecvsHAQkwMz2z1YhHXg26U.INSTANCE));
        return this;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(Intent intent) {
        StringBuilder sb = new StringBuilder("Triggered by intent with action ");
        sb.append(intent.getAction());
        return sb.toString();
    }

    public final sps a(gjx<jst> gjx, String str, spq spq) {
        this.a.a(spz.a(spy.b(), sqa.a(gjx)), this.b.a(spq, str));
        return this;
    }

    public final sps a(LinkType linkType, String str, spx spx) {
        return a(sqa.a(linkType), str, (spq) new $$Lambda$sps$_g3fuYzhjjBL9nw2Sz8Zl1DTrg(spx));
    }

    public static spq a(spx spx) {
        return new $$Lambda$sps$_g3fuYzhjjBL9nw2Sz8Zl1DTrg(spx);
    }

    public final sps a(LinkType linkType, String str, wuu<Intent, fpt, Intent> wuu) {
        this.a.a(spz.a(spy.b(), sqa.a(sqa.a(linkType))), this.c.a(new $$Lambda$sps$HKkr1YuqA_O5Gy4MGQCEL1EZrw(this, wuu), str, $$Lambda$sps$RDj2QEo1Dk4lWFBnBIGXltVb1Jo.INSTANCE));
        return this;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wuu wuu, Intent intent, fpt fpt, SessionState sessionState) {
        Intent intent2 = (Intent) wuu.call(intent, fpt);
        if (intent2 != null) {
            this.d.accept(intent2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(Intent intent) {
        StringBuilder sb = new StringBuilder("triggered by intent ");
        sb.append(intent);
        return sb.toString();
    }
}
