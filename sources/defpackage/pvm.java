package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: pvm reason: default package */
public final class pvm implements spt {
    private final rgz a;
    private final sgr b;

    public pvm(rgz rgz, sgr sgr) {
        this.a = rgz;
        this.b = sgr;
    }

    public final void a(sps sps) {
        $$Lambda$pvm$1mEU4QDtlxmFOWGV3TSpfpFk6Gc r0 = new $$Lambda$pvm$1mEU4QDtlxmFOWGV3TSpfpFk6Gc(this);
        sps.a(LinkType.SEARCH_ROOT, "Page presenting the main search and drilldown with or without a given query", (spa) r0);
        sps.a(LinkType.SEARCH_QUERY, "Page presenting the main search with a given query", (spa) r0);
        sps.a.a(new spy("android.media.action.MEDIA_PLAY_FROM_SEARCH"), sps.b.a(sps.a((spx) new $$Lambda$pvm$6kBi9DuO4EOb6VpxGGdkA7eoPro(this)), "Page presenting the main search in autoplay"));
    }

    /* access modifiers changed from: private */
    public spw a(Intent intent, fpt fpt, SessionState sessionState) {
        String stringExtra = intent.getStringExtra("query");
        intent.putExtra("tag", "SearchFragment");
        intent.setData(Uri.parse("spotify:search"));
        return spw.a(pvk.a(stringExtra, true, false, sessionState.currentUserName(), fpt, (shj) null, sessionState.connected(), sessionState.productType(), this.a.a(fpt), sgr.a(fpt)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        intent.putExtra("tag", sgq.a(jst.h()) ? "SearchDrillDownFragment" : "SearchFragment");
        return pvk.a(jst, false, false, sessionState.connected(), sessionState.productType(), sessionState.currentUserName(), fpt, (shj) intent.getParcelableExtra("EXTRA_TRANSITION_PARAMS"), this.a.a(fpt), sgr.a(fpt));
    }
}
