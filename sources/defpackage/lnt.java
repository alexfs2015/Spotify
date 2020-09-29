package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lnt reason: default package */
public final class lnt implements taa {
    private final rqb a;
    private final vbn b;

    public lnt(rqb rqb, vbn vbn) {
        this.a = rqb;
        this.b = vbn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        return (this.a.a(fqn) || vbn.a(fqn)) ? rbj.a(fqn, sessionState.currentUser(), (String) fbp.a(jva.h()), str) : iqb.a(fqn, sessionState.currentUser(), ((Boolean) fqn.a(gwf.d)).booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tad a(Intent intent, fqn fqn, SessionState sessionState) {
        return (!isu.a(fqn) || !vbn.a(fqn)) ? new a() : tad.a((jqx) rab.a(fqn, sessionState.currentUser(), jva.a(ViewUris.bm.toString())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx b(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        return (this.a.a(fqn) || vbn.a(fqn)) ? rab.a(fqn, sessionState.currentUser(), jva) : ipy.a(fqn, sessionState.currentUser(), ((Boolean) fqn.a(gwf.d)).booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tad b(Intent intent, fqn fqn, SessionState sessionState) {
        return (!isu.a(fqn) || !vbn.a(fqn)) ? new a() : tad.a((jqx) rab.a(fqn, sessionState.currentUser(), jva.a(intent.getDataString())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx c(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        return (this.a.a(fqn) || vbn.a(fqn)) ? rab.a(fqn, sessionState.currentUser(), jva) : ipv.a(fqn, ((Boolean) fqn.a(gwf.d)).booleanValue(), sessionState.currentUser());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tad c(Intent intent, fqn fqn, SessionState sessionState) {
        return (!isu.a(fqn) || !vbn.a(fqn)) ? new a() : tad.a((jqx) rab.a(fqn, sessionState.currentUser(), jva.a(ViewUris.bl.toString())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx d(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        return (this.a.a(fqn) || vbn.a(fqn)) ? rab.a(fqn, sessionState.currentUser(), jva) : ipr.a(fqn);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tad d(Intent intent, fqn fqn, SessionState sessionState) {
        if (!vbn.a(fqn)) {
            return new a();
        }
        return tad.a((jqx) rbj.a(fqn, sessionState.currentUser(), (String) fbp.a(jva.a(intent.getDataString()).h()), ""));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tad e(Intent intent, fqn fqn, SessionState sessionState) {
        if (!this.a.a(fqn) && !vbn.a(fqn)) {
            return new a();
        }
        return tad.a((jqx) rab.a(fqn, sessionState.currentUser(), jva.a(intent.getDataString())));
    }

    public final void a(szz szz) {
        $$Lambda$lnt$Qr0pzaKRBjwKYxm4Ajy1HZ4ipoI r0 = new $$Lambda$lnt$Qr0pzaKRBjwKYxm4Ajy1HZ4ipoI(this);
        $$Lambda$lnt$K8bfzxPMYvKsBtoYbsPzJT9yteo r1 = new $$Lambda$lnt$K8bfzxPMYvKsBtoYbsPzJT9yteo(this);
        $$Lambda$lnt$za1iJZXOeKPKFKb_Vt9Dvzm2Qc r2 = new $$Lambda$lnt$za1iJZXOeKPKFKb_Vt9Dvzm2Qc(this);
        $$Lambda$lnt$hZfYz5wMHJo3csELi3SP9q9f1wM r3 = new $$Lambda$lnt$hZfYz5wMHJo3csELi3SP9q9f1wM(this);
        $$Lambda$lnt$P3GCgMYIrmWljV5_L5xoQ9qr5pA r4 = new $$Lambda$lnt$P3GCgMYIrmWljV5_L5xoQ9qr5pA(this);
        $$Lambda$lnt$7kGEjGFZqPn3rkPvWhRabOv7p1s r5 = new $$Lambda$lnt$7kGEjGFZqPn3rkPvWhRabOv7p1s(this);
        $$Lambda$lnt$8vixoa_p3f7tjkUdF1QVJfHztXg r6 = new $$Lambda$lnt$8vixoa_p3f7tjkUdF1QVJfHztXg(this);
        $$Lambda$lnt$Luj4mxfTqGAxdKoDdg6J8nYwa9A r7 = new $$Lambda$lnt$Luj4mxfTqGAxdKoDdg6J8nYwa9A(this);
        $$Lambda$lnt$H3vsO3LbB8RvY2UphlL9B7tt1yc r8 = new $$Lambda$lnt$H3vsO3LbB8RvY2UphlL9B7tt1yc(this);
        szz.a(LinkType.COLLECTION_ROOT, "Collection root: old your library, free tier likes or new your library.", (szh) r0);
        szz.a(LinkType.COLLECTION_ROOTLIST, "Collecion rootlist: playlists or a playlists tab in your library or free tier likes.", (tae) r1);
        szz.a(LinkType.COLLECTION_ALBUM_OVERVIEW, "Collecion album overview: albums or an albums tab in free tier likes or the new your library.", (szh) r2);
        szz.a(LinkType.COLLECTION_ARTIST_OVERVIEW, "Collecion artist overview: artists or an artists tab in free tier likes or the new your library.", (szh) r3);
        szz.a(LinkType.COLLECTION_TRACKS, "Collecion tracks: collection songs or Free tier favorite songs or Favorite songs in the new library.", (szh) r4);
        szz.a(LinkType.COLLECTION_PLAYLIST_FOLDER, "Collection playlist folders: Folder Fragment or Music pages drill down in the new library.", (tae) r5);
        szz.a(LinkType.COLLECTION_PODCASTS_EPISODES, "Collection podcasts episodes: episodes tab", (tae) r7);
        String str = "Collection podcasts downloads: downloads tab or old library downloads page";
        szz.a(LinkType.COLLECTION_PODCASTS_DOWNLOADS, str, (tae) r7);
        szz.a(LinkType.COLLECTION_PODCASTS_FOLLOWING, "Collection podcasts following: following tab or old library following page", (tae) r7);
        String str2 = "Collection podcasts tab";
        szz.a(LinkType.COLLECTION_PODCASTS, str2, (tae) r6);
        szz.a(LinkType.COLLECTION_PODCASTS_EPISODES_UNFINISHED, "Old unfinished uri fallback navigate to episodes tab", (tae) r6);
        String str3 = "Old unplayed uri fallback navigate to episodes tab";
        szz.a(LinkType.COLLECTION_UNPLAYED_PODCASTS_EPISODES, str3, (tae) r6);
        szz.a(LinkType.COLLECTION_UNPLAYED_EPISODES, str3, (tae) r6);
        String str4 = "Old downloads uri fallback navigate to downloads tab";
        szz.a(LinkType.COLLECTION_OFFLINED_EPISODES, str4, (tae) r8);
        szz.a(LinkType.COLLECTION_OFFLINE_EPISODES, str4, (tae) r8);
        szz.a(LinkType.COLLECTION_SHOWS, str2, (tae) r6);
        szz.a(LinkType.COLLECTION_LISTENLATER_EPISODES, str, (tae) r6);
        szz.a(LinkType.COLLECTION_UNPLAYED_VIDEOS, str, (tae) r6);
    }
}
