package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.album.logger.AlbumLogger;
import com.spotify.music.features.album.logger.AlbumLogger.SectionId;
import com.spotify.music.features.album.logger.AlbumLogger.UserIntent;
import com.spotify.music.libs.album.model.Album;
import com.spotify.music.libs.album.model.AlbumArtist;
import com.spotify.music.libs.album.model.AlbumRelease;
import com.spotify.music.libs.album.model.AlbumTrack;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import com.spotify.music.ubi.interactions.InteractionAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lrt reason: default package */
public final class lrt implements lsd {
    final sso a;
    final lav b;
    final ttc c;
    final ttd d;
    lsj e;
    xip f = xon.b();
    xip g = xon.b();
    xip h = xon.b();
    lss i;
    private final xii<lsj> j;
    private final lru k;
    private final lrq l;
    private final hhc m;
    private final xii<Boolean> n;
    private final lar o;
    private final lon p;
    private final szp q;
    private final fsz r;
    private final AlbumLogger s;
    private PlayerContext t;

    public lrt(sso sso, xii<lsj> xii, lru lru, lrq lrq, hhc hhc, xii<Boolean> xii2, lar lar, lon lon, szp szp, fsz fsz, AlbumLogger albumLogger, lav lav, ttd ttd) {
        this.a = sso;
        this.q = szp;
        this.r = fsz;
        this.j = xii.d().e();
        this.k = lru;
        this.l = lrq;
        this.m = hhc;
        this.n = xii2;
        this.o = lar;
        this.p = lon;
        this.s = albumLogger;
        this.b = lav;
        this.d = ttd;
        this.c = new ttb(new $$Lambda$lrt$HZBpuN3uUZmS09ynQvJoUG72EXA(this), new tsz() {
            public final void a(boolean z) {
                String str = lrt.this.e.e().a;
                if (z) {
                    lrt.this.b.a(str);
                } else {
                    lrt.this.b.b(str);
                }
                OffliningLogger.a(lrt.this.a, lrt.this.a.toString(), SourceElement.HEADER_TOGGLE, z);
            }

            public final void b(boolean z) {
                lrt.this.a(z, false);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Album album) {
        return this.k.a(album.getUri(), album.getReleases());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        this.i.b((String) fbp.a(hoVar.a));
        this.i.c((String) fbp.a(hoVar.b));
    }

    private void a(String str, String str2) {
        this.q.a(szk.a(str).b(str2).a());
    }

    /* access modifiers changed from: private */
    public void a(lsj lsj) {
        if (this.e == null || !lsj.a().equals(this.e.a())) {
            Album a2 = lsj.a();
            String uri = a2.getUri();
            String uri2 = a2.getUri();
            List<AlbumTrack> tracks = a2.getTracks();
            ArrayList arrayList = new ArrayList(tracks.size());
            for (AlbumTrack albumTrack : tracks) {
                if (!albumTrack.getArtists().isEmpty()) {
                    arrayList.add(PlayerTrack.create(albumTrack.getUri(), uri2, ((AlbumArtist) albumTrack.getArtists().get(0)).getUri()));
                }
            }
            this.t = PlayerContext.create(uri, (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]));
            this.l.a(this.t, a2.getTracks());
            this.i.a(a2.getName());
            this.i.a(a2);
            this.i.b(a2);
            this.i.c(true);
            this.i.e();
            this.r.ao_();
        }
        this.i.a(lsj.c());
        this.i.b(lsj.d());
        if (this.e == null || !lsj.e().equals(this.e.e())) {
            this.c.a((tsy) lsj.e());
        }
        this.e = lsj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vli vli) {
        this.i.a(vli);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.i.d();
    }

    /* access modifiers changed from: private */
    public void c(boolean z) {
        if (!z) {
            lsj lsj = this.e;
            if (lsj != null) {
                this.i.c(lsj.e().b instanceof a);
                this.i.d(false);
                return;
            }
            this.i.c();
        } else if (this.e != null) {
            this.i.c(true);
            this.i.d(true);
        } else {
            this.i.b();
            this.f.unsubscribe();
            this.f = d();
        }
    }

    public final void a() {
        lsj lsj = this.e;
        if (lsj == null) {
            String str = "Album model is null.";
            Assertion.a(str, (Throwable) new RuntimeException(str));
            return;
        }
        this.s.a((String) fbp.a(lsj.a().getFirstArtistUri()), SectionId.ALBUM_HEADER, -1, InteractionType.HIT, UserIntent.OPEN_ARTIST, null);
        a(this.e.a().getFirstArtistUri(), this.e.a().getFirstArtistName());
    }

    public final void a(int i2) {
        this.s.a(null, SectionId.ALBUM_HEADER, i2, i2 == 0 ? InteractionType.SWIPE_RIGHT : InteractionType.SWIPE_LEFT, UserIntent.SWIPE_META_DATA, null);
    }

    public final void a(AlbumRelease albumRelease, int i2) {
        this.s.a((String) fbp.a(albumRelease.getUri()), SectionId.RELATED_ALBUMS, i2, InteractionType.HIT, UserIntent.OPEN_RELATED_ALBUM, null);
        a(albumRelease.getUri(), albumRelease.getName());
    }

    public final void a(AlbumTrack albumTrack, int i2) {
        this.s.a((String) fbp.a(albumTrack.getUri()), SectionId.TRACKS, i2, InteractionType.HIT, UserIntent.PLAY, null);
        if (!albumTrack.isExplicit() || !this.e.d()) {
            this.k.a(this.t, i2);
        } else {
            this.p.a(albumTrack.getUri(), this.a.toString());
        }
    }

    public final void a(String str, int i2) {
        this.s.a((String) fbp.a(str), SectionId.TRACKS, i2, InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU, null);
    }

    public final void a(boolean z) {
        this.s.a(null, SectionId.SAVE_BUTTON, -1, InteractionType.HIT, z ? UserIntent.SAVE : UserIntent.UNSAVE, z ? InteractionAction.LIKE : InteractionAction.UNLIKE);
        a(z, true);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, boolean z2) {
        if (z) {
            this.o.a(this.a.toString(), this.a.toString(), z2);
        } else {
            this.o.a(this.a.toString(), z2);
        }
    }

    public final void b() {
        if (this.e == null) {
            String str = "Album model is null.";
            Assertion.a(str, (Throwable) new RuntimeException(str));
            return;
        }
        this.s.a(null, SectionId.HEADER_BUTTON, -1, InteractionType.HIT, UserIntent.PLAY, null);
        lru lru = this.k;
        PlayerContext playerContext = this.t;
        Builder builder = new Builder();
        builder.playerOptionsOverride(Boolean.TRUE, null, null);
        lru.a.play((PlayerContext) fbp.a(playerContext), builder.build());
    }

    public final void b(String str, int i2) {
        this.s.a((String) fbp.a(str), SectionId.RELATED_ALBUMS, i2, InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU, null);
    }

    public final void b(boolean z) {
        this.c.a(z);
    }

    public final void c() {
        this.q.a("spotify:internal:preferences");
    }

    /* access modifiers changed from: 0000 */
    public xip d() {
        return this.j.a(wit.a(this.m.c())).a((xis<? super T>) new $$Lambda$lrt$qFvIz2ALZ78eejWaeTmZXyWI<Object>(this), (xis<Throwable>) new $$Lambda$lrt$2IhVvEhInVT6Y9F0Qd9u24Iopk<Throwable>(this));
    }

    /* access modifiers changed from: 0000 */
    public xip e() {
        return this.n.a(wit.a(this.m.c())).a((xis<? super T>) new $$Lambda$lrt$bcpTGnrCyeWVlozNLNCdGucc28<Object>(this), (xis<Throwable>) $$Lambda$lrt$6j0svzN83EdaKqyEG7Jb99QpNgk.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public xip f() {
        return this.j.e((xiy<? super T, ? extends R>) $$Lambda$dRFYi_Hi0Wi5G3cIpmdHKlG2aDk.INSTANCE).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$lrt$u5c80fcdO_s_OOJmoHR9Sq7b4o<Object,Object>(this)).a(wit.a(this.m.c())).a((xis<? super T>) new $$Lambda$lrt$F7OYTMA4hyA8S3Ak2XqpDL_ppVk<Object>(this), (xis<Throwable>) $$Lambda$lrt$uoUvHUudwBpBueP9ivHyMvefI4.INSTANCE);
    }
}
