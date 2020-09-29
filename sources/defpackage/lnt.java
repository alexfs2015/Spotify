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

/* renamed from: lnt reason: default package */
public final class lnt implements lod {
    final sih a;
    final kxm b;
    final tik c;
    final til d;
    loj e;
    wuk f = xaj.b();
    wuk g = xaj.b();
    wuk h = xaj.b();
    los i;
    private final wud<loj> j;
    private final lnu k;
    private final lnq l;
    private final heg m;
    private final wud<Boolean> n;
    private final kxi o;
    private final lkn p;
    private final spi q;
    private final fsf r;
    private final AlbumLogger s;
    private PlayerContext t;

    public lnt(sih sih, wud<loj> wud, lnu lnu, lnq lnq, heg heg, wud<Boolean> wud2, kxi kxi, lkn lkn, spi spi, fsf fsf, AlbumLogger albumLogger, kxm kxm, til til) {
        this.a = sih;
        this.q = spi;
        this.r = fsf;
        this.j = wud.d().e();
        this.k = lnu;
        this.l = lnq;
        this.m = heg;
        this.n = wud2;
        this.o = kxi;
        this.p = lkn;
        this.s = albumLogger;
        this.b = kxm;
        this.d = til;
        this.c = new tij(new $$Lambda$lnt$H8SqcwIWztWY8deYAmj6jSznci0(this), new tih() {
            public final void a(boolean z) {
                String str = lnt.this.e.e().a;
                if (z) {
                    lnt.this.b.a(str);
                } else {
                    lnt.this.b.b(str);
                }
                OffliningLogger.a(lnt.this.a, lnt.this.a.toString(), SourceElement.HEADER_TOGGLE, z);
            }

            public final void b(boolean z) {
                lnt.this.a(z, false);
            }
        });
    }

    public final void a() {
        loj loj = this.e;
        if (loj == null) {
            String str = "Album model is null.";
            Assertion.a(str, (Throwable) new RuntimeException(str));
            return;
        }
        this.s.a((String) fay.a(loj.a().getFirstArtistUri()), SectionId.ALBUM_HEADER, -1, InteractionType.HIT, UserIntent.OPEN_ARTIST, null);
        a(this.e.a().getFirstArtistUri(), this.e.a().getFirstArtistName());
    }

    public final void b() {
        if (this.e == null) {
            String str = "Album model is null.";
            Assertion.a(str, (Throwable) new RuntimeException(str));
            return;
        }
        this.s.a(null, SectionId.HEADER_BUTTON, -1, InteractionType.HIT, UserIntent.PLAY, null);
        lnu lnu = this.k;
        PlayerContext playerContext = this.t;
        Builder builder = new Builder();
        builder.playerOptionsOverride(Boolean.TRUE, null, null);
        lnu.a.play((PlayerContext) fay.a(playerContext), builder.build());
    }

    public final void a(boolean z) {
        this.s.a(null, SectionId.SAVE_BUTTON, -1, InteractionType.HIT, z ? UserIntent.SAVE : UserIntent.UNSAVE, z ? InteractionAction.LIKE : InteractionAction.UNLIKE);
        a(z, true);
    }

    public final void c() {
        this.q.a("spotify:internal:preferences");
    }

    public final void b(boolean z) {
        this.c.a(z);
    }

    public final void a(AlbumTrack albumTrack, int i2) {
        this.s.a((String) fay.a(albumTrack.getUri()), SectionId.TRACKS, i2, InteractionType.HIT, UserIntent.PLAY, null);
        if (!albumTrack.isExplicit() || !this.e.d()) {
            this.k.a(this.t, i2);
        } else {
            this.p.a(albumTrack.getUri(), this.a.toString());
        }
    }

    public final void a(String str, int i2) {
        this.s.a((String) fay.a(str), SectionId.TRACKS, i2, InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU, null);
    }

    public final void a(AlbumRelease albumRelease, int i2) {
        this.s.a((String) fay.a(albumRelease.getUri()), SectionId.RELATED_ALBUMS, i2, InteractionType.HIT, UserIntent.OPEN_RELATED_ALBUM, null);
        a(albumRelease.getUri(), albumRelease.getName());
    }

    public final void b(String str, int i2) {
        this.s.a((String) fay.a(str), SectionId.RELATED_ALBUMS, i2, InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU, null);
    }

    public final void a(int i2) {
        this.s.a(null, SectionId.ALBUM_HEADER, i2, i2 == 0 ? InteractionType.SWIPE_RIGHT : InteractionType.SWIPE_LEFT, UserIntent.SWIPE_META_DATA, null);
    }

    private void a(String str, String str2) {
        this.q.a(spd.a(str).b(str2).a());
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, boolean z2) {
        if (z) {
            this.o.a(this.a.toString(), this.a.toString(), z2);
        } else {
            this.o.a(this.a.toString(), z2);
        }
    }

    /* access modifiers changed from: 0000 */
    public wuk d() {
        return this.j.a(vun.a(this.m.c())).a((wun<? super T>) new $$Lambda$lnt$EDfhLSnQI8c2NtdwP_YYULAxrY<Object>(this), (wun<Throwable>) new $$Lambda$lnt$lck1UN0LUqUedoB9y7NsQWS_W3A<Throwable>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.i.d();
    }

    /* access modifiers changed from: private */
    public void a(loj loj) {
        if (this.e == null || !loj.a().equals(this.e.a())) {
            Album a2 = loj.a();
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
            this.r.ap_();
        }
        this.i.a(loj.c());
        this.i.b(loj.d());
        if (this.e == null || !loj.e().equals(this.e.e())) {
            this.c.a((tig) loj.e());
        }
        this.e = loj;
    }

    /* access modifiers changed from: 0000 */
    public wuk e() {
        return this.n.a(vun.a(this.m.c())).a((wun<? super T>) new $$Lambda$lnt$DSeBRmEZt6EaN3wnB6yJI6CLXVk<Object>(this), (wun<Throwable>) $$Lambda$lnt$EDSQPhsnNKjkLIm0j408FfseKu4.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public wuk f() {
        return this.j.f($$Lambda$t_yadm5FTH6whsoWQtIQxYWBwac.INSTANCE).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$lnt$ylQUh7cOveHzpi112zKqii0rvU<Object,Object>(this)).a(vun.a(this.m.c())).a((wun<? super T>) new $$Lambda$lnt$UYwlLZ017urRKvyVm24tdxSY8Q<Object>(this), (wun<Throwable>) $$Lambda$lnt$Wz91JdraegYgJj1W7MdQsClWtU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Album album) {
        return this.k.a(album.getUri(), album.getReleases());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        this.i.b((String) fay.a(hoVar.a));
        this.i.c((String) fay.a(hoVar.b));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uzf uzf) {
        this.i.a(uzf);
    }

    /* access modifiers changed from: private */
    public void c(boolean z) {
        if (!z) {
            loj loj = this.e;
            if (loj != null) {
                this.i.c(loj.e().b instanceof a);
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
}
