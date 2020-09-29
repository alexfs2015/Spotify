package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.b;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerView;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.R;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import java.lang.ref.WeakReference;
import java.util.Set;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: iwn reason: default package */
public class iwn extends jrd implements iwu, ixh, uqq {
    public ixk T;
    public gtb U;
    public rqb V;
    public ixn W;
    public ttf X;
    public ixg Y;
    public Player Z;
    public fqn a;
    public rpa aa;
    public tmu ab;
    public ixr ac;
    public unq ad;
    public SpSharedPreferences<Object> ae;
    public kbd af;
    public rxt ag;
    public gto ah;
    public jtd ai;
    public iwp aj;
    /* access modifiers changed from: private */
    public final iwo ak = new iwo();
    private a al;
    private MiniPlayerView am;
    private iwl an;
    private CarouselView ao;
    private tid ap;
    public hhc b;

    /* renamed from: iwn$a */
    static class a extends Handler {
        private final WeakReference<iwn> a;

        public a(iwn iwn) {
            this.a = new WeakReference<>(iwn);
        }

        public final void handleMessage(Message message) {
            iwn iwn = (iwn) this.a.get();
            if (iwn != null) {
                for (defpackage.iwo.a a2 : iwn.ak.a) {
                    a2.a();
                }
                removeMessages(0);
                sendEmptyMessageDelayed(0, 5000);
            }
        }
    }

    public static iwn a(fqn fqn) {
        iwn iwn = new iwn();
        fqo.a((Fragment) iwn, (fqn) fbp.a(fqn));
        return iwn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        iwp iwp = this.aj;
        iwp.a.b();
        iwp.b.a();
        iwp.g();
    }

    public final void B() {
        iwp iwp = this.aj;
        iwp.l = null;
        iwp.e();
        iwp.m = null;
        this.U.b();
        super.B();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        this.am = (MiniPlayerView) layoutInflater.inflate(R.layout.player_preview_new, viewGroup, false);
        this.ao = this.am.a;
        iwl iwl = new iwl(p(), new $$Lambda$iwn$Mn5t30XWsHB3r2uHybaFLC6jP4Y(this), this.ak, this.ah, this.a);
        this.an = iwl;
        this.ao.a((androidx.recyclerview.widget.RecyclerView.a) this.an);
        this.ap = new tid(this.ao, new defpackage.tid.a() {
            public final void a() {
                iwn.this.aj.b();
            }

            public final void b() {
                iwp a2 = iwn.this.aj;
                a2.b.b(a2.j);
                ixs ixs = a2.f;
                if (ixs.a.getLastPlayerState() != null) {
                    ixs.a.skipToPreviousTrackAndDisableSeeking();
                }
                a2.l.a(true);
            }
        });
        this.am.j = new com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerView.a() {
            public final void a() {
                iwp a2 = iwn.this.aj;
                a2.n = true;
                a2.a();
            }

            public final void b() {
                iwp a2 = iwn.this.aj;
                a2.n = false;
                a2.a();
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c() {
                /*
                    r19 = this;
                    r0 = r19
                    iwn r1 = defpackage.iwn.this
                    iwp r1 = r1.aj
                    iwn r2 = defpackage.iwn.this
                    rqb r2 = r2.V
                    iwn r3 = defpackage.iwn.this
                    fqn r3 = r3.a
                    boolean r2 = r2.a(r3)
                    if (r2 == 0) goto L_0x005b
                    iws r2 = r1.j
                    if (r2 == 0) goto L_0x0021
                    iws r2 = r1.j
                    com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = r2.a()
                    goto L_0x0022
                L_0x0021:
                    r2 = 0
                L_0x0022:
                    if (r2 == 0) goto L_0x005b
                    ixn r4 = r1.d
                    iws r5 = r1.j
                    boolean r5 = r5.g()
                    java.lang.String r13 = r2.uri()
                    iws r2 = r1.j
                    java.lang.String r9 = r2.e()
                    if (r5 == 0) goto L_0x003b
                    java.lang.String r2 = "play"
                    goto L_0x003d
                L_0x003b:
                    java.lang.String r2 = "pause"
                L_0x003d:
                    r15 = r2
                    jlr r2 = r4.a
                    hdr$bg r5 = new hdr$bg
                    r7 = 0
                    java.lang.String r8 = r4.b
                    r11 = 0
                    jtz r4 = defpackage.jtp.a
                    long r3 = r4.a()
                    double r3 = (double) r3
                    java.lang.String r10 = "play-button"
                    java.lang.String r14 = "hit"
                    r6 = r5
                    r16 = r3
                    r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15, r16)
                    r2.a(r5)
                L_0x005b:
                    ixr r2 = r1.b
                    iws r3 = r1.j
                    r2.a(r3)
                    ixs r1 = r1.f
                    com.spotify.mobile.android.cosmos.player.v2.Player r2 = r1.a
                    com.spotify.mobile.android.cosmos.player.v2.PlayerState r3 = r2.getLastPlayerState()
                    r2 = 0
                    if (r3 != 0) goto L_0x0077
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    java.lang.String r4 = "Cannot toggle pause: lastPlayerState is null."
                    com.spotify.base.java.logging.Logger.d(r4, r3)
                L_0x0074:
                    r18 = 0
                    goto L_0x0087
                L_0x0077:
                    boolean r4 = r3.isPlaying()
                    if (r4 != 0) goto L_0x0085
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    java.lang.String r4 = "Cannot toggle pause: isPlaying is false."
                    com.spotify.base.java.logging.Logger.d(r4, r3)
                    goto L_0x0074
                L_0x0085:
                    r18 = r3
                L_0x0087:
                    if (r18 == 0) goto L_0x00c6
                    boolean r3 = r18.isPaused()
                    if (r3 == 0) goto L_0x00ab
                    com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r3 = r18.restrictions()
                    java.util.Set r3 = r3.disallowResumingReasons()
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto L_0x00a3
                    com.spotify.mobile.android.cosmos.player.v2.Player r1 = r1.a
                    r1.resume()
                    goto L_0x00c6
                L_0x00a3:
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    java.lang.String r2 = "Cannot toggle pause: disallowResuming."
                    com.spotify.base.java.logging.Logger.d(r2, r1)
                    return
                L_0x00ab:
                    com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r3 = r18.restrictions()
                    java.util.Set r3 = r3.disallowPausingReasons()
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto L_0x00bf
                    com.spotify.mobile.android.cosmos.player.v2.Player r1 = r1.a
                    r1.pause()
                    return
                L_0x00bf:
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    java.lang.String r2 = "Cannot toggle pause: disallowPausing."
                    com.spotify.base.java.logging.Logger.d(r2, r1)
                L_0x00c6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.iwn.AnonymousClass2.c():void");
            }

            public final void d() {
                iwn.this.aj.b();
            }

            public final void e() {
                iwn.this.aj.f();
            }

            public final void f() {
                iwn.this.aj.f();
            }

            public final void g() {
                iwp a2 = iwn.this.aj;
                a2.e.a();
                a2.g.a(a2.h);
            }

            public final void h() {
                ixg ixg = iwn.this.Y;
                wit.a((xfk<T>) ixg.b).e(ixg.a).c().a(ixg.c).c((xii<? extends T>) ScalarSynchronousObservable.d(ixj.a)).a((xij<? super T>) new xij<ixj>() {
                    public final void onCompleted() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        ixj ixj = (ixj) obj;
                        boolean z = ixj.d;
                        String str = ixj.c;
                        String str2 = ixj.b == null ? "unknown_context_in_heart_presenter" : ixj.b;
                        if (!"empty_track".equals(str)) {
                            ixg.this.e.k(!z);
                            if (z) {
                                ixg.this.f.a(str, true);
                                ixg.this.i.a(true, str, str2);
                                return;
                            }
                            ixg.this.f.a(str, str2, true);
                            ixg.this.i.a(false, str, str2);
                        }
                    }
                });
            }
        };
        this.am.l = this.V;
        iwm iwm = r1;
        iwm iwm2 = new iwm(this.U, new gsw());
        new iwq();
        fqn fqn = this.a;
        fqn fqn2 = fqn;
        hhc hhc = this.b;
        miw miw = new miw(this.ak, new mjc(this.am.i, 1, this.ah, this.a));
        ixr ixr = this.ac;
        ixk ixk = this.T;
        ixk ixk2 = ixk;
        ixn ixn = this.W;
        ttf ttf = this.X;
        Player player = this.Z;
        rpa rpa = this.aa;
        unq unq = this.ad;
        unq unq2 = unq;
        rxt rxt = this.ag;
        hhc hhc2 = hhc;
        SpSharedPreferences<Object> spSharedPreferences = this.ae;
        miw miw2 = miw;
        unq unq3 = unq;
        gto gto = this.ah;
        Player player2 = player;
        iwm iwm3 = iwm;
        mmw mmw = new mmw(miw2, ixk, unq3, rxt);
        ixz ixz = r2;
        ixz ixz2 = new ixz(fqn, spSharedPreferences);
        ixk ixk3 = ixk;
        iwr iwr = r3;
        iwr iwr2 = new iwr();
        Bundle bundle3 = bundle;
        iww iww = r3;
        iww iww2 = new iww(this, ixk3);
        iwp iwp = r0;
        iwp iwp2 = new iwp(hhc2, this, player2, iwm3, iwr, null, mmw, ixr, ixk2, iww, ixn, ttf, rpa, unq2, gto, fqn2, ixz);
        this.aj = iwp;
        iwp iwp3 = this.aj;
        Bundle bundle4 = bundle;
        if (bundle4 != null) {
            iwm iwm4 = iwp3.c;
            if (bundle4 != null) {
                iwm4.c = bundle4.getBoolean("key_device_discovery_requested");
            }
            iwp3.p = bundle4.getBoolean("key_was_in_background");
            iwp3.k = (PlayerState) bundle4.getParcelable("key_last_state");
            if (iwp3.k != null) {
                iwp3.onPlayerStateReceived(iwp3.k);
            }
        }
        return this.am;
    }

    public final void a(MiniPlayerDisplayRule miniPlayerDisplayRule) {
        iwo iwo = this.ak;
        fbp.a(miniPlayerDisplayRule);
        for (defpackage.iwo.a a2 : iwo.a) {
            a2.a(miniPlayerDisplayRule);
        }
        iwo.b = miniPlayerDisplayRule;
        boolean z = true;
        if (miniPlayerDisplayRule.a.size() <= 1 && (miniPlayerDisplayRule.a.size() != 1 || ((b) fbp.a(((ho) miniPlayerDisplayRule.a.get(0)).b)).a == -1)) {
            z = false;
        }
        if (z) {
            this.al.removeMessages(0);
            this.al.sendEmptyMessageDelayed(0, 5000);
        }
    }

    public final void a(iws iws) {
        Drawable drawable;
        int i;
        Drawable drawable2;
        Drawable b2;
        MiniPlayerView miniPlayerView = this.am;
        fqn fqn = this.a;
        boolean isEmpty = iws.d().disallowSkippingNextReasons().isEmpty();
        boolean a2 = MiniPlayerView.a(iws);
        Set disallowSkippingPrevReasons = iws.d().disallowSkippingPrevReasons();
        String str = DisallowReasons.MFT;
        boolean contains = disallowSkippingPrevReasons.contains(str);
        boolean contains2 = iws.d().disallowSkippingNextReasons().contains(str);
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) fbp.a((CarouselLayoutManager) miniPlayerView.a.d());
        carouselLayoutManager.c = contains;
        carouselLayoutManager.d = contains2;
        miniPlayerView.m.a(iws.i(), iws.j(), iws.k());
        int i2 = 0;
        boolean a3 = miniPlayerView.l != null ? miniPlayerView.l.a(fqn) : false;
        if (iws.g()) {
            if (a3) {
                Context context = miniPlayerView.getContext();
                drawable = vdd.a((Context) fbp.a(context), SpotifyIcon.PLAY_32, context.getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size));
            } else {
                drawable = vdd.a(miniPlayerView.getContext());
            }
            i = R.string.player_content_description_play;
        } else {
            if (a3) {
                Context context2 = miniPlayerView.getContext();
                b2 = vdd.a((Context) fbp.a(context2), SpotifyIcon.PAUSE_32, context2.getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size));
            } else {
                b2 = vdd.b(miniPlayerView.getContext());
            }
            i = R.string.player_content_description_pause;
        }
        miniPlayerView.b.setImageDrawable(drawable);
        miniPlayerView.b.setContentDescription(miniPlayerView.getContext().getString(i));
        miniPlayerView.setEnabled(true);
        if (jvi.c(miniPlayerView.getContext())) {
            ImageButton imageButton = miniPlayerView.c;
            if (a2) {
                i2 = 8;
            }
            imageButton.setVisibility(i2);
            miniPlayerView.c.setEnabled(isEmpty);
            if (contains2) {
                miniPlayerView.c.setEnabled(true);
                drawable2 = vdd.g(miniPlayerView.getContext());
            } else {
                drawable2 = vdd.f(miniPlayerView.getContext());
            }
            miniPlayerView.c.setImageDrawable(drawable2);
        }
    }

    public final void a(boolean z) {
        this.ao.L = z;
    }

    public final void a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        this.ap.a(playerTrackArr, playerTrack, playerTrackArr2);
    }

    public final void aP_() {
        super.aP_();
        this.aj.c();
        this.Y.a();
        MiniPlayerView miniPlayerView = this.am;
        kbd kbd = this.af;
        miniPlayerView.h.d = miniPlayerView.k;
        kbd.a(miniPlayerView.h);
    }

    public final void ae() {
        MiniPlayerView miniPlayerView = this.am;
        miniPlayerView.h.setVisibility(8);
        miniPlayerView.e.setVisibility(0);
        miniPlayerView.i.setVisibility(8);
        miniPlayerView.d.setVisibility(0);
    }

    public final void af() {
        jtd jtd = this.ai;
        if (jtd != null) {
            jtd.a(true);
        }
    }

    public final void ag() {
        jtd jtd = this.ai;
        if (jtd != null) {
            jtd.a(false);
        }
    }

    public final void ah() {
        iwl iwl = this.an;
        iwl.a(null, iwl.a, null, new Handler());
        this.ao.d(0);
    }

    public final void ai() {
        this.am.a();
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
        }
        this.al = new a(this);
    }

    public final void c() {
        this.ab.a();
    }

    public final void e() {
        MiniPlayerView miniPlayerView = this.am;
        miniPlayerView.h.setVisibility(0);
        miniPlayerView.e.setVisibility(8);
        miniPlayerView.i.setVisibility(8);
        miniPlayerView.d.setVisibility(0);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        iwp iwp = this.aj;
        bundle.putBoolean("key_device_discovery_requested", iwp.c.c);
        bundle.putBoolean("key_was_in_background", iwp.p);
        bundle.putParcelable("key_last_state", iwp.k);
    }

    public final void h() {
        super.h();
        this.al.removeMessages(0);
        iwp iwp = this.aj;
        iwp.e();
        iwm iwm = iwp.c;
        iwm.b.b(iwm);
        iwm.a.clear();
        if (iwm.b.c()) {
            iwm.b.b();
        }
        iwp.i.unsubscribe();
        ixg ixg = this.Y;
        if (ixg.d != null) {
            ixg.d.unsubscribe();
        }
        MiniPlayerView miniPlayerView = this.am;
        this.af.b(miniPlayerView.h);
        miniPlayerView.h.d = null;
        this.am.m.a();
    }

    public final void i(boolean z) {
        this.ap.e = z;
    }

    public final void j(boolean z) {
        this.ap.d = z;
    }

    public final void k(boolean z) {
        this.am.g.setActivated(z);
    }

    public final void l(boolean z) {
        MiniPlayerView miniPlayerView = this.am;
        if (z) {
            miniPlayerView.g.setVisibility(0);
            miniPlayerView.f.setVisibility(8);
            return;
        }
        miniPlayerView.g.setVisibility(8);
        miniPlayerView.f.setVisibility(0);
    }

    public final void m(boolean z) {
        MiniPlayerView miniPlayerView = this.am;
        if (z) {
            miniPlayerView.g.setVisibility(0);
        } else {
            miniPlayerView.g.setVisibility(4);
        }
    }
}
