package defpackage;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: rgl reason: default package */
public final class rgl {
    private final ImmutableMap<MusicPageId, fbu<rda>> a;
    private final fbu<rda> b;
    private final rdx c;
    private final rdy d;

    public rgl(rdj rdj, rdx rdx, rdy rdy) {
        this.c = rdx;
        this.d = rdy;
        MusicPageId musicPageId = MusicPageId.PLAYLISTS;
        rdj.getClass();
        fbu a2 = Suppliers.a((fbu<T>) new $$Lambda$u4s9CQELg_YAn1dg9gytoxF2ZSQ<T>(rdj));
        MusicPageId musicPageId2 = MusicPageId.ALBUMS;
        rdj.getClass();
        fbu a3 = Suppliers.a((fbu<T>) new $$Lambda$qTZuV7RR5nwHEQZkByI5BESjs5Y<T>(rdj));
        MusicPageId musicPageId3 = MusicPageId.ARTISTS;
        rdj.getClass();
        fbu a4 = Suppliers.a((fbu<T>) new $$Lambda$vdkhgspRKDQTDzaAV9fDeplE<T>(rdj));
        MusicPageId musicPageId4 = MusicPageId.DOWNLOADS;
        rdj.getClass();
        fbu a5 = Suppliers.a((fbu<T>) new $$Lambda$p3bjm6BfA42kJQ7GQKF_i4C4Y<T>(rdj));
        MusicPageId musicPageId5 = MusicPageId.SONGS;
        rdj.getClass();
        this.a = ImmutableMap.a(musicPageId, a2, musicPageId2, a3, musicPageId3, a4, musicPageId4, a5, musicPageId5, Suppliers.a((fbu<T>) new $$Lambda$tmhSc92bK4wgJv5ltqcbLcUGE04<T>(rdj)));
        this.b = Suppliers.a((fbu<T>) new $$Lambda$rgl$LXoHm6sdYqBpDbP1Heb20ejTTo<T>(this, rdj));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rda a(rdj rdj) {
        String ai = this.d.ai();
        a g = ImmutableList.g();
        rdn a2 = rdj.a.a(jva.a(ai).k());
        g.c(a2);
        return rde.a(rde.a(rde.b(rde.a(a2.a(), rde.a(rdj.b.a(ai)))), rde.a(g.a())));
    }

    public final rda a() {
        MusicPageId ah = this.c.ah();
        fbu fbu = (fbu) this.a.get(ah);
        if (fbu != null) {
            return (rda) fbu.get();
        }
        if (ah == MusicPageId.FOLDER) {
            return (rda) this.b.get();
        }
        StringBuilder sb = new StringBuilder("No data source for page id ");
        sb.append(ah);
        throw new AssertionError(sb.toString());
    }
}
