package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import rx.internal.util.ScalarSynchronousObservable;

public final class StorylinesWidgetPresenter implements a {
    public boolean a;
    public ContentLoadedState b;
    public final xag c = new xag();
    public jip d;
    private final uog e;
    private final uoe f;
    private final spi g;
    private final FollowManager h;
    private final wug i;
    private final hvk<svp> j;
    private final uom k;
    private final rcu l;
    private final wud<PlayerTrack> m;
    private final wlc<PlayerState> n;
    private String o;
    private String p;

    public enum ContentLoadedState {
        NOT_LOADED,
        LOADED_ONE_CARD,
        LOADED_MANY_CARDS
    }

    public StorylinesWidgetPresenter(Flowable<PlayerTrack> flowable, wlc<PlayerState> wlc, uog uog, uoe uoe, spi spi, FollowManager followManager, hvk<svp> hvk, wug wug, uom uom, rcu rcu) {
        this.m = vun.a((wrf<T>) flowable).b((wut<? super T, ? extends U>) $$Lambda$hS9MV1oOuY_qdOyMr9UoVuXvVFk.INSTANCE);
        this.n = wlc;
        this.e = uog;
        this.f = uoe;
        this.g = spi;
        this.h = followManager;
        this.j = hvk;
        this.i = wug;
        this.k = uom;
        this.l = rcu;
    }

    public final void a(int i2, double d2) {
        this.g.a(this.o);
        this.e.a(this.o, this.p, "hit", "go_to_artist_profile", i2, d2);
    }

    public final void b(int i2, double d2) {
        if (!fax.a(this.o)) {
            a a2 = this.h.a(this.o);
            if (a2 != null) {
                boolean z = a2.d;
                a(this.o, !z, a2);
                if (z) {
                    this.e.a(this.o, this.p, "hit", "unfollow_artist", i2, d2);
                    return;
                }
                this.e.a(this.o, this.p, "hit", "follow_artist", i2, d2);
            }
        }
    }

    public final void c(int i2, double d2) {
        if (this.a) {
            this.e.a("", this.p, "hit", "go_to_next_storylines_card", i2, d2);
            this.d.b(i2 + 1);
        }
    }

    public final void d(int i2, double d2) {
        if (this.a) {
            this.e.a("", this.p, "hit", "go_to_previous_storylines_card", i2, d2);
            this.d.b(i2 - 1);
        }
    }

    public final void e(int i2, double d2) {
        uog uog = this.e;
        String str = this.p;
        jjf jjf = uog.a;
        bf bfVar = new bf(uog.a(), "nowplaying/scroll", str, "storylines", (long) i2, "", "storylines_card", "", d2);
        jjf.a(bfVar);
    }

    public final void f(int i2, double d2) {
        this.e.a("", this.p, "hold", "pause_storylines_card", i2, d2);
    }

    public final void a(jil jil) {
        this.f.a(jil.c(), jil.b(), jil.d(), "image", "loading", "", "", jil.a());
    }

    public final void b(jil jil) {
        this.f.a(jil.c(), jil.b(), jil.d(), "image", "success", "library", "", jil.a());
    }

    public final void c(jil jil) {
        uoe uoe = this.f;
        String c2 = jil.c();
        String d2 = jil.d();
        uoe.a(c2, jil.b(), d2, "image", LogMessage.SEVERITY_ERROR, "library", "", jil.a());
    }

    public final void a(jip jip) {
        this.d = (jip) fay.a(jip);
        this.d.a((a) this);
        this.c.a(this.m.b((wun<? super T>) new wun() {
            public final void call(Object obj) {
                StorylinesWidgetPresenter.this.b((PlayerTrack) obj);
            }
        }).i(new wut() {
            public final Object call(Object obj) {
                return StorylinesWidgetPresenter.this.a((PlayerTrack) obj);
            }
        }).a(this.i).a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                StorylinesWidgetPresenter.this.a((svq) obj);
            }
        }, (wun<Throwable>) $$Lambda$StorylinesWidgetPresenter$Bk0MeC47AGlLrHy5bpbsZ5qHD6o.INSTANCE));
    }

    /* access modifiers changed from: private */
    public wud<svq> a(PlayerTrack playerTrack) {
        String uri = playerTrack.uri();
        return wud.a(this.k.a(uri, a()).f($$Lambda$iv6FLBH7dWZwQCoo_72AgzW0TDo.INSTANCE).c(new c()).a((this.k.a.get(uri) != null) ^ true ? this.j : new heu<>()).h($$Lambda$hJrGOWNEqtFYiT8HKfVsMrrVY.INSTANCE).a((b<? extends R, ? super T>) new wwc<Object,Object>(new wut() {
            public final Object call(Object obj) {
                return StorylinesWidgetPresenter.this.a((svp) obj);
            }
        }, $$Lambda$StorylinesWidgetPresenter$GQNkkdss7BJtv3m8VnKog7oc0I.INSTANCE)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ svq a(svp svp, Optional optional) {
        return (svq) svp.a($$Lambda$StorylinesWidgetPresenter$3rWu1c0COqs1mCT_91Uiu1PVVvo.INSTANCE, new gct() {
            public final Object apply(Object obj) {
                return StorylinesWidgetPresenter.a(Optional.this, (b) obj);
            }
        }, $$Lambda$StorylinesWidgetPresenter$VZSXY40Zynr6I2TkUz3i4fr8P_0.INSTANCE);
    }

    private void a(String str, boolean z, a aVar) {
        this.h.a(aVar);
        if (aVar.d != z) {
            this.h.a(str, z);
        }
    }

    /* access modifiers changed from: private */
    public wud<Optional<a>> a(svp svp) {
        return (wud) svp.a($$Lambda$StorylinesWidgetPresenter$wnO_sNChdMmx26DlCP6g_WL2CBs.INSTANCE, new gct() {
            public final Object apply(Object obj) {
                return StorylinesWidgetPresenter.this.a((b) obj);
            }
        }, $$Lambda$StorylinesWidgetPresenter$_unEkLUxfefPAGc97yaRQhTLO5k.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(b bVar) {
        return vun.a((ObservableSource<T>) this.l.a(bVar.a.getArtistUri()), BackpressureStrategy.BUFFER).a(1).f($$Lambda$hys9OUZ45Nx1v_kTIDxggj1pKZw.INSTANCE).c((wud<? extends T>) ScalarSynchronousObservable.d(Optional.e()));
    }

    /* access modifiers changed from: private */
    public void a(svq svq) {
        svq.a(new gcs() {
            public final void accept(Object obj) {
                StorylinesWidgetPresenter.this.a((c) obj);
            }
        }, new gcs() {
            public final void accept(Object obj) {
                StorylinesWidgetPresenter.this.a((b) obj);
            }
        }, new gcs() {
            public final void accept(Object obj) {
                StorylinesWidgetPresenter.this.a((a) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.d.b();
    }

    private String a() {
        PlayerState playerState = (PlayerState) this.n.get();
        String playbackId = playerState != null ? playerState.playbackId() : null;
        return playbackId != null ? playbackId : "";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Throwable th = aVar.a;
        this.d.c();
        Logger.e(th, "Storylines subscription error.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        StorylinesCardContent storylinesCardContent = (StorylinesCardContent) fay.a(bVar.a);
        this.o = storylinesCardContent.getArtistUri();
        this.p = storylinesCardContent.getEntityUri();
        this.d.a(storylinesCardContent.getArtistName());
        this.d.b(storylinesCardContent.getAvatarUri());
        this.d.a(storylinesCardContent.getImages(), new a().a(this.p).b(storylinesCardContent.getStorylineGid()).c(a()).d("").a());
        this.d.b(true);
        this.b = storylinesCardContent.getImages().size() > 1 ? ContentLoadedState.LOADED_MANY_CARDS : ContentLoadedState.LOADED_ONE_CARD;
        if (!this.a || this.b != ContentLoadedState.LOADED_MANY_CARDS) {
            this.d.a(false, false);
        } else {
            this.d.a(true, true);
        }
        Optional optional = (Optional) fay.a(bVar.b);
        if (optional.b()) {
            boolean z = ((a) optional.c()).d;
            this.d.a(z);
            a(this.o, z, (a) optional.c());
            return;
        }
        this.d.a(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ svq b(a aVar) {
        return new a(aVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ svq a(Optional optional, b bVar) {
        return new b(bVar.a, optional);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ svq b(c cVar) {
        return new c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerTrack playerTrack) {
        if (this.b != ContentLoadedState.NOT_LOADED) {
            this.d.b(false);
            if (this.a && this.b == ContentLoadedState.LOADED_MANY_CARDS) {
                this.d.a(false, false);
            }
        }
        this.a = false;
        this.b = ContentLoadedState.NOT_LOADED;
    }
}
