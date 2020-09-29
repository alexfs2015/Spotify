package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qei reason: default package */
public final class qei implements taa {
    private final rqb a;
    private final sqy b;

    public qei(rqb rqb, sqy sqy) {
        this.a = rqb;
        this.b = sqy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        intent.putExtra("tag", sqx.a(jva.h()) ? "SearchDrillDownFragment" : "SearchFragment");
        return qeg.a(jva, false, false, sessionState.connected(), sessionState.productType(), sessionState.currentUserName(), fqn, (srq) intent.getParcelableExtra("EXTRA_TRANSITION_PARAMS"), this.a.a(fqn), sqy.a(fqn));
    }

    /* access modifiers changed from: private */
    public tad a(Intent intent, fqn fqn, SessionState sessionState) {
        String stringExtra = intent.getStringExtra("query");
        intent.putExtra("tag", "SearchFragment");
        intent.setData(Uri.parse("spotify:search"));
        return tad.a(qeg.a(stringExtra, true, false, sessionState.currentUserName(), fqn, (srq) null, sessionState.connected(), sessionState.productType(), this.a.a(fqn), sqy.a(fqn)));
    }

    public final void a(szz szz) {
        $$Lambda$qei$7_32ZyoeQdSHhctOotuYYG1ubR4 r0 = new $$Lambda$qei$7_32ZyoeQdSHhctOotuYYG1ubR4(this);
        szz.a(LinkType.SEARCH_ROOT, "Page presenting the main search and drilldown with or without a given query", (szh) r0);
        szz.a(LinkType.SEARCH_QUERY, "Page presenting the main search with a given query", (szh) r0);
        szz.a.a(new taf("android.media.action.MEDIA_PLAY_FROM_SEARCH"), szz.b.a(szz.a((tae) new $$Lambda$qei$aXOnyRcTAUqxqxa5ScH545w50(this)), "Page presenting the main search in autoplay"));
    }
}
