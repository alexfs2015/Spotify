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
    public final xok c = new xok();
    public jlf d;
    private final uzk e;
    private final uzi f;
    private final szp g;
    private final FollowManager h;
    private final xil i;
    private final hxw<tfw> j;
    private final uzq k;
    private final rls l;
    private final xii<PlayerTrack> m;
    private final wzi<PlayerState> n;
    private String o;
    private String p;

    public enum ContentLoadedState {
        NOT_LOADED,
        LOADED_ONE_CARD,
        LOADED_MANY_CARDS
    }

    public StorylinesWidgetPresenter(Flowable<PlayerTrack> flowable, wzi<PlayerState> wzi, uzk uzk, uzi uzi, szp szp, FollowManager followManager, hxw<tfw> hxw, xil xil, uzq uzq, rls rls) {
        this.m = wit.a((xfk<T>) flowable).b((xiy<? super T, ? extends U>) $$Lambda$UffjuocpeZXFAba747XMf6nEuyg.INSTANCE);
        this.n = wzi;
        this.e = uzk;
        this.f = uzi;
        this.g = szp;
        this.h = followManager;
        this.j = hxw;
        this.i = xil;
        this.k = uzq;
        this.l = rls;
    }

    private String a() {
        PlayerState playerState = (PlayerState) this.n.get();
        String playbackId = playerState != null ? playerState.playbackId() : null;
        return playbackId != null ? playbackId : "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tfx a(Optional optional, b bVar) {
        return new b(bVar.a, optional);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tfx a(tfw tfw, Optional optional) {
        return (tfx) tfw.a($$Lambda$StorylinesWidgetPresenter$7OBF5co1UNDFpi1r3WIXfynH4.INSTANCE, new gee() {
            public final Object apply(Object obj) {
                return StorylinesWidgetPresenter.a(Optional.this, (b) obj);
            }
        }, $$Lambda$StorylinesWidgetPresenter$4sOSnIDWplMUvABo7CsQ522jLM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public xii<tfx> a(PlayerTrack playerTrack) {
        String uri = playerTrack.uri();
        return xii.a(this.k.a(uri, a()).e((xiy<? super T, ? extends R>) $$Lambda$z3YBEpoDmG94RWUJUCMb9cbsSwQ.INSTANCE).c(new c()).a((this.k.a.get(uri) != null) ^ true ? this.j : new hhq<>()).g($$Lambda$QVdwApcAklX7cZQzuIy4uuTWK4.INSTANCE).a((b<? extends R, ? super T>) new xkh<Object,Object>(new xiy() {
            public final Object call(Object obj) {
                return StorylinesWidgetPresenter.this.a((tfw) obj);
            }
        }, $$Lambda$StorylinesWidgetPresenter$6psohxE0ON95KCVTiOHoH_OQs8k.INSTANCE)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(b bVar) {
        return wit.a((ObservableSource<T>) this.l.a(bVar.a.getArtistUri()), BackpressureStrategy.BUFFER).a(1).e((xiy<? super T, ? extends R>) $$Lambda$zdtkYeoosy8yXMjIQHdADcsaVSU.INSTANCE).c((xii<? extends T>) ScalarSynchronousObservable.d(Optional.e()));
    }

    /* access modifiers changed from: private */
    public xii<Optional<a>> a(tfw tfw) {
        return (xii) tfw.a($$Lambda$StorylinesWidgetPresenter$6LpmoAsI89GyJdS9nhRbLMylEo.INSTANCE, new gee() {
            public final Object apply(Object obj) {
                return StorylinesWidgetPresenter.this.a((b) obj);
            }
        }, $$Lambda$StorylinesWidgetPresenter$fRNw9DuZSNti_jVIsgPzyPm3v3Y.INSTANCE);
    }

    private void a(String str, boolean z, a aVar) {
        this.h.a(aVar);
        if (aVar.d != z) {
            this.h.a(str, z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Throwable th = aVar.a;
        this.d.c();
        Logger.e(th, "Storylines subscription error.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        StorylinesCardContent storylinesCardContent = (StorylinesCardContent) fbp.a(bVar.a);
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
        Optional optional = (Optional) fbp.a(bVar.b);
        if (optional.b()) {
            boolean z = ((a) optional.c()).d;
            this.d.a(z);
            a(this.o, z, (a) optional.c());
            return;
        }
        this.d.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.d.b();
    }

    /* access modifiers changed from: private */
    public void a(tfx tfx) {
        tfx.a(new ged() {
            public final void accept(Object obj) {
                StorylinesWidgetPresenter.this.a((c) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                StorylinesWidgetPresenter.this.a((b) obj);
            }
        }, new ged() {
            public final void accept(Object obj) {
                StorylinesWidgetPresenter.this.a((a) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tfx b(a aVar) {
        return new a(aVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tfx b(c cVar) {
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

    public final void a(int i2, double d2) {
        this.g.a(this.o);
        this.e.a(this.o, this.p, "hit", "go_to_artist_profile", i2, d2);
    }

    public final void a(jlb jlb) {
        this.f.a(jlb.c(), jlb.b(), jlb.d(), "image", "loading", "", "", jlb.a());
    }

    public final void a(jlf jlf) {
        this.d = (jlf) fbp.a(jlf);
        this.d.a((a) this);
        this.c.a(this.m.b((xis<? super T>) new xis() {
            public final void call(Object obj) {
                StorylinesWidgetPresenter.this.b((PlayerTrack) obj);
            }
        }).h(new xiy() {
            public final Object call(Object obj) {
                return StorylinesWidgetPresenter.this.a((PlayerTrack) obj);
            }
        }).a(this.i).a((xis<? super T>) new xis() {
            public final void call(Object obj) {
                StorylinesWidgetPresenter.this.a((tfx) obj);
            }
        }, (xis<Throwable>) $$Lambda$StorylinesWidgetPresenter$_LBPKxeWVGtZPmnx6NVKsQr3Bw.INSTANCE));
    }

    public final void b(int i2, double d2) {
        if (!fbo.a(this.o)) {
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

    public final void b(jlb jlb) {
        this.f.a(jlb.c(), jlb.b(), jlb.d(), "image", "success", "library", "", jlb.a());
    }

    public final void c(int i2, double d2) {
        if (this.a) {
            this.e.a("", this.p, "hit", "go_to_next_storylines_card", i2, d2);
            this.d.b(i2 + 1);
        }
    }

    public final void c(jlb jlb) {
        uzi uzi = this.f;
        String c2 = jlb.c();
        String d2 = jlb.d();
        uzi.a(c2, jlb.b(), d2, "image", LogMessage.SEVERITY_ERROR, "library", "", jlb.a());
    }

    public final void d(int i2, double d2) {
        if (this.a) {
            this.e.a("", this.p, "hit", "go_to_previous_storylines_card", i2, d2);
            this.d.b(i2 - 1);
        }
    }

    public final void e(int i2, double d2) {
        uzk uzk = this.e;
        String str = this.p;
        jlr jlr = uzk.a;
        be beVar = new be(uzk.a(), "nowplaying/scroll", str, "storylines", (long) i2, "", "storylines_card", "", d2);
        jlr.a(beVar);
    }

    public final void f(int i2, double d2) {
        this.e.a("", this.p, "hold", "pause_storylines_card", i2, d2);
    }
}
