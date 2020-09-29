package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ljt reason: default package */
public final class ljt implements spt {
    private final rgz a;
    private final uqi b;

    public ljt(rgz rgz, uqi uqi) {
        this.a = rgz;
        this.b = uqi;
    }

    public final void a(sps sps) {
        $$Lambda$ljt$2cbi041xM26n2Xy5xyBhsK22nwE r0 = new $$Lambda$ljt$2cbi041xM26n2Xy5xyBhsK22nwE(this);
        $$Lambda$ljt$1BDoYZN9L_qc6_l1jx2N7uIh2l8 r1 = new $$Lambda$ljt$1BDoYZN9L_qc6_l1jx2N7uIh2l8(this);
        $$Lambda$ljt$GQfxjt6UdmMH1qVWZf0VxtoiWj4 r2 = new $$Lambda$ljt$GQfxjt6UdmMH1qVWZf0VxtoiWj4(this);
        $$Lambda$ljt$49hTzzvlPk8vd7hN10d4lNWpOPY r3 = new $$Lambda$ljt$49hTzzvlPk8vd7hN10d4lNWpOPY(this);
        $$Lambda$ljt$a8L8fgdI31UhLE8WzB0iYYFvg0 r4 = new $$Lambda$ljt$a8L8fgdI31UhLE8WzB0iYYFvg0(this);
        $$Lambda$ljt$zPjox8L6yanqytzfzvr2y18 r5 = new $$Lambda$ljt$zPjox8L6yanqytzfzvr2y18(this);
        $$Lambda$ljt$m1XIYycFEpmXFJCMj6P2MXRSYg4 r6 = new $$Lambda$ljt$m1XIYycFEpmXFJCMj6P2MXRSYg4(this);
        $$Lambda$ljt$oeou0AQTq6jh2B0BkDika9QOhc r7 = new $$Lambda$ljt$oeou0AQTq6jh2B0BkDika9QOhc(this);
        $$Lambda$ljt$b9QtidmkN3LXkJfipp94atlA4 r8 = new $$Lambda$ljt$b9QtidmkN3LXkJfipp94atlA4(this);
        sps.a(LinkType.COLLECTION_ROOT, "Collection root: old your library, free tier likes or new your library.", (spa) r0);
        sps.a(LinkType.COLLECTION_ROOTLIST, "Collecion rootlist: playlists or a playlists tab in your library or free tier likes.", (spx) r1);
        sps.a(LinkType.COLLECTION_ALBUM_OVERVIEW, "Collecion album overview: albums or an albums tab in free tier likes or the new your library.", (spa) r2);
        sps.a(LinkType.COLLECTION_ARTIST_OVERVIEW, "Collecion artist overview: artists or an artists tab in free tier likes or the new your library.", (spa) r3);
        sps.a(LinkType.COLLECTION_TRACKS, "Collecion tracks: collection songs or Free tier favorite songs or Favorite songs in the new library.", (spa) r4);
        sps.a(LinkType.COLLECTION_PLAYLIST_FOLDER, "Collection playlist folders: Folder Fragment or Music pages drill down in the new library.", (spx) r5);
        sps.a(LinkType.COLLECTION_PODCASTS_EPISODES, "Collection podcasts episodes: episodes tab", (spx) r7);
        String str = "Collection podcasts downloads: downloads tab or old library downloads page";
        sps.a(LinkType.COLLECTION_PODCASTS_DOWNLOADS, str, (spx) r7);
        sps.a(LinkType.COLLECTION_PODCASTS_FOLLOWING, "Collection podcasts following: following tab or old library following page", (spx) r7);
        String str2 = "Collection podcasts tab";
        sps.a(LinkType.COLLECTION_PODCASTS, str2, (spx) r6);
        sps.a(LinkType.COLLECTION_PODCASTS_EPISODES_UNFINISHED, "Old unfinished uri fallback navigate to episodes tab", (spx) r6);
        String str3 = "Old unplayed uri fallback navigate to episodes tab";
        sps.a(LinkType.COLLECTION_UNPLAYED_PODCASTS_EPISODES, str3, (spx) r6);
        sps.a(LinkType.COLLECTION_UNPLAYED_EPISODES, str3, (spx) r6);
        String str4 = "Old downloads uri fallback navigate to downloads tab";
        sps.a(LinkType.COLLECTION_OFFLINED_EPISODES, str4, (spx) r8);
        sps.a(LinkType.COLLECTION_OFFLINE_EPISODES, str4, (spx) r8);
        sps.a(LinkType.COLLECTION_SHOWS, str2, (spx) r6);
        sps.a(LinkType.COLLECTION_LISTENLATER_EPISODES, str, (spx) r6);
        sps.a(LinkType.COLLECTION_UNPLAYED_VIDEOS, str, (spx) r6);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol d(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        if (this.a.a(fpt) || this.b.a(fpt)) {
            return qrm.a(fpt, sessionState.currentUser(), jst);
        }
        return ine.a(fpt);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ spw e(Intent intent, fpt fpt, SessionState sessionState) {
        if (!this.a.a(fpt) && !this.b.a(fpt)) {
            return new a();
        }
        return spw.a((jol) qrm.a(fpt, sessionState.currentUser(), jst.a(intent.getDataString())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol c(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        if (this.a.a(fpt) || this.b.a(fpt)) {
            return qrm.a(fpt, sessionState.currentUser(), jst);
        }
        return ini.a(fpt, ((Boolean) fpt.a(guf.d)).booleanValue(), sessionState.currentUser());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol b(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        if (this.a.a(fpt) || this.b.a(fpt)) {
            return qrm.a(fpt, sessionState.currentUser(), jst);
        }
        return inl.a(fpt, sessionState.currentUser(), ((Boolean) fpt.a(guf.d)).booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        if (this.a.a(fpt) || this.b.a(fpt)) {
            return qsu.a(fpt, sessionState.currentUser(), (String) fay.a(jst.h()), str);
        }
        return ino.a(fpt, sessionState.currentUser(), ((Boolean) fpt.a(guf.d)).booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ spw d(Intent intent, fpt fpt, SessionState sessionState) {
        if (!this.b.a(fpt)) {
            return new a();
        }
        return spw.a((jol) qsu.a(fpt, sessionState.currentUser(), (String) fay.a(jst.a(intent.getDataString()).h()), ""));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ spw c(Intent intent, fpt fpt, SessionState sessionState) {
        jst a2 = jst.a(ViewUris.bm.toString());
        if (!iqh.a(fpt) || !this.b.a(fpt)) {
            return new a();
        }
        return spw.a((jol) qrm.a(fpt, sessionState.currentUser(), a2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ spw b(Intent intent, fpt fpt, SessionState sessionState) {
        jst a2 = jst.a(intent.getDataString());
        if (!iqh.a(fpt) || !this.b.a(fpt)) {
            return new a();
        }
        return spw.a((jol) qrm.a(fpt, sessionState.currentUser(), a2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ spw a(Intent intent, fpt fpt, SessionState sessionState) {
        jst a2 = jst.a(ViewUris.bn.toString());
        if (!iqh.a(fpt) || !this.b.a(fpt)) {
            return new a();
        }
        return spw.a((jol) qrm.a(fpt, sessionState.currentUser(), a2));
    }
}
