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

/* renamed from: iuc reason: default package */
public class iuc extends jor implements iuj, iuw, udv {
    public klz T;
    public iuz U;
    public hip V;
    public rgz W;
    public ivc X;
    public tin Y;
    public iuv Z;
    public fpt a;
    public Player aa;
    public rfy ab;
    public tcn ac;
    public ivg ad;
    public uav ae;
    public SpSharedPreferences<Object> af;
    public jzd ag;
    public ron ah;
    public jqs ai;
    public iue aj;
    /* access modifiers changed from: private */
    public final iud ak = new iud();
    private a al;
    private MiniPlayerView am;
    private iua an;
    private CarouselView ao;
    private sxw ap;
    public heg b;

    /* renamed from: iuc$a */
    static class a extends Handler {
        private final WeakReference<iuc> a;

        public a(iuc iuc) {
            this.a = new WeakReference<>(iuc);
        }

        public final void handleMessage(Message message) {
            iuc iuc = (iuc) this.a.get();
            if (iuc != null) {
                for (defpackage.iud.a a2 : iuc.ak.a) {
                    a2.a();
                }
                removeMessages(0);
                sendEmptyMessageDelayed(0, 5000);
            }
        }
    }

    public static iuc a(fpt fpt) {
        iuc iuc = new iuc();
        fpu.a((Fragment) iuc, (fpt) fay.a(fpt));
        return iuc;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
        }
        this.al = new a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        this.am = (MiniPlayerView) layoutInflater.inflate(R.layout.player_preview_new, viewGroup, false);
        this.ao = this.am.a;
        this.an = new iua(p(), new $$Lambda$iuc$BV4ObFqUdT4Kwvayqw8Zkx5Ue8(this), this.ak);
        this.ao.a((androidx.recyclerview.widget.RecyclerView.a) this.an);
        this.ap = new sxw(this.ao, new defpackage.sxw.a() {
            public final void a() {
                iuc.this.aj.b();
            }

            public final void b() {
                iue a2 = iuc.this.aj;
                a2.b.b(a2.h);
                ivh ivh = a2.f;
                if (ivh.a.getLastPlayerState() != null) {
                    ivh.a.skipToPreviousTrackAndDisableSeeking();
                }
                a2.j.a(true);
            }
        });
        this.am.j = new com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerView.a() {
            public final void a() {
                iue a2 = iuc.this.aj;
                a2.l = true;
                a2.a();
            }

            public final void b() {
                iue a2 = iuc.this.aj;
                a2.l = false;
                a2.a();
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c() {
                /*
                    r19 = this;
                    r0 = r19
                    iuc r1 = defpackage.iuc.this
                    iue r1 = r1.aj
                    iuc r2 = defpackage.iuc.this
                    rgz r2 = r2.W
                    iuc r3 = defpackage.iuc.this
                    fpt r3 = r3.a
                    boolean r2 = r2.a(r3)
                    if (r2 == 0) goto L_0x005b
                    iuh r2 = r1.h
                    if (r2 == 0) goto L_0x0021
                    iuh r2 = r1.h
                    com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = r2.a()
                    goto L_0x0022
                L_0x0021:
                    r2 = 0
                L_0x0022:
                    if (r2 == 0) goto L_0x005b
                    ivc r4 = r1.d
                    iuh r5 = r1.h
                    boolean r5 = r5.g()
                    java.lang.String r13 = r2.uri()
                    iuh r2 = r1.h
                    java.lang.String r9 = r2.e()
                    if (r5 == 0) goto L_0x003b
                    java.lang.String r2 = "play"
                    goto L_0x003d
                L_0x003b:
                    java.lang.String r2 = "pause"
                L_0x003d:
                    r15 = r2
                    jjf r2 = r4.a
                    hay$bh r5 = new hay$bh
                    r7 = 0
                    java.lang.String r8 = r4.b
                    r11 = 0
                    jrp r4 = defpackage.jrf.a
                    long r3 = r4.a()
                    double r3 = (double) r3
                    java.lang.String r10 = "play-button"
                    java.lang.String r14 = "hit"
                    r6 = r5
                    r16 = r3
                    r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15, r16)
                    r2.a(r5)
                L_0x005b:
                    ivg r2 = r1.b
                    iuh r3 = r1.h
                    r2.a(r3)
                    ivh r1 = r1.f
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.iuc.AnonymousClass2.c():void");
            }

            public final void d() {
                iuc.this.aj.b();
            }

            public final void e() {
                iuc.this.aj.f();
            }

            public final void f() {
                iuc.this.aj.f();
            }

            public final void g() {
                iuc.this.aj.e.a();
            }

            public final void h() {
                iuv iuv = iuc.this.Z;
                vun.a((wrf<T>) iuv.b).f(iuv.a).c().a(iuv.c).c((wud<? extends T>) ScalarSynchronousObservable.d(iuy.a)).a((wue<? super T>) new wue<iuy>() {
                    public final void onCompleted() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        iuy iuy = (iuy) obj;
                        boolean z = iuy.d;
                        String str = iuy.c;
                        String str2 = iuy.b == null ? "unknown_context_in_heart_presenter" : iuy.b;
                        if (!"empty_track".equals(str)) {
                            iuv.this.e.k(!z);
                            if (z) {
                                iuv.this.f.a(str, true);
                                iuv.this.i.a(true, str, str2);
                                return;
                            }
                            iuv.this.f.a(str, str2, true);
                            iuv.this.i.a(false, str, str2);
                        }
                    }
                });
            }
        };
        this.am.l = this.W;
        iub iub = new iub(this.V, new gqx());
        new iuf();
        fpt fpt = this.a;
        heg heg = this.b;
        mem mem = new mem(this.ak, new meq(this.am.i, 1));
        ivg ivg = this.ad;
        iuz iuz = this.U;
        klz klz = this.T;
        ivc ivc = this.X;
        tin tin = this.Y;
        Player player = this.aa;
        rfy rfy = this.ab;
        uav uav = this.ae;
        ron ron = this.ah;
        tin tin2 = tin;
        SpSharedPreferences<Object> spSharedPreferences = this.af;
        uav uav2 = uav;
        rfy rfy2 = rfy;
        Player player2 = player;
        irh irh = new irh(mem, iuz, klz, fpt, uav2, ron);
        ivo ivo = new ivo(fpt, spSharedPreferences);
        iug iug = new iug();
        ivc ivc2 = ivc;
        ivg ivg2 = ivg;
        iul iul = new iul(this, iuz);
        iue iue = r0;
        iue iue2 = new iue(heg, this, player2, iub, iug, null, irh, ivg2, iuz, iul, ivc2, tin2, rfy2, uav2, ivo);
        this.aj = iue;
        iue iue3 = this.aj;
        Bundle bundle3 = bundle;
        if (bundle3 != null) {
            iub iub2 = iue3.c;
            if (bundle3 != null) {
                iub2.c = bundle3.getBoolean("key_device_discovery_requested");
            }
            iue3.n = bundle3.getBoolean("key_was_in_background");
            iue3.i = (PlayerState) bundle3.getParcelable("key_last_state");
            if (iue3.i != null) {
                iue3.onPlayerStateReceived(iue3.i);
            }
        }
        return this.am;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        iue iue = this.aj;
        iue.a.b();
        iue.b.a();
        iue.g();
    }

    public final void g() {
        super.g();
        this.aj.c();
        this.Z.a();
        MiniPlayerView miniPlayerView = this.am;
        jzd jzd = this.ag;
        miniPlayerView.h.d = miniPlayerView.k;
        jzd.a(miniPlayerView.h);
    }

    public final void h() {
        super.h();
        this.al.removeMessages(0);
        iue iue = this.aj;
        iue.e();
        iub iub = iue.c;
        iub.b.b(iub);
        iub.a.clear();
        if (iub.b.d()) {
            iub.b.b();
        }
        iue.g.unsubscribe();
        iuv iuv = this.Z;
        if (iuv.d != null) {
            iuv.d.unsubscribe();
        }
        MiniPlayerView miniPlayerView = this.am;
        this.ag.b(miniPlayerView.h);
        miniPlayerView.h.d = null;
        this.am.m.a();
    }

    public final void B() {
        iue iue = this.aj;
        iue.j = null;
        iue.e();
        iue.k = null;
        this.V.b();
        super.B();
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR;
    }

    public final void c() {
        this.ac.a();
    }

    public final void a(MiniPlayerDisplayRule miniPlayerDisplayRule) {
        iud iud = this.ak;
        fay.a(miniPlayerDisplayRule);
        for (defpackage.iud.a a2 : iud.a) {
            a2.a(miniPlayerDisplayRule);
        }
        iud.b = miniPlayerDisplayRule;
        boolean z = true;
        if (miniPlayerDisplayRule.a.size() <= 1 && (miniPlayerDisplayRule.a.size() != 1 || ((b) fay.a(((ho) miniPlayerDisplayRule.a.get(0)).b)).a == -1)) {
            z = false;
        }
        if (z) {
            this.al.removeMessages(0);
            this.al.sendEmptyMessageDelayed(0, 5000);
        }
    }

    public final void e() {
        MiniPlayerView miniPlayerView = this.am;
        miniPlayerView.h.setVisibility(0);
        miniPlayerView.e.setVisibility(8);
        miniPlayerView.i.setVisibility(8);
        miniPlayerView.d.setVisibility(0);
    }

    public final void ae() {
        MiniPlayerView miniPlayerView = this.am;
        miniPlayerView.h.setVisibility(8);
        miniPlayerView.e.setVisibility(0);
        miniPlayerView.i.setVisibility(8);
        miniPlayerView.d.setVisibility(0);
    }

    public final void a(boolean z) {
        this.ao.M = z;
    }

    public final void i(boolean z) {
        this.ap.e = z;
    }

    public final void j(boolean z) {
        this.ap.d = z;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        iue iue = this.aj;
        bundle.putBoolean("key_device_discovery_requested", iue.c.c);
        bundle.putBoolean("key_was_in_background", iue.n);
        bundle.putParcelable("key_last_state", iue.i);
    }

    public final void af() {
        jqs jqs = this.ai;
        if (jqs != null) {
            jqs.a(true);
        }
    }

    public final void ag() {
        jqs jqs = this.ai;
        if (jqs != null) {
            jqs.a(false);
        }
    }

    public final void a(iuh iuh) {
        Drawable drawable;
        int i;
        Drawable drawable2;
        Drawable b2;
        MiniPlayerView miniPlayerView = this.am;
        fpt fpt = this.a;
        boolean isEmpty = iuh.d().disallowSkippingNextReasons().isEmpty();
        boolean a2 = MiniPlayerView.a(iuh);
        Set disallowSkippingPrevReasons = iuh.d().disallowSkippingPrevReasons();
        String str = DisallowReasons.MFT;
        boolean contains = disallowSkippingPrevReasons.contains(str);
        boolean contains2 = iuh.d().disallowSkippingNextReasons().contains(str);
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) fay.a((CarouselLayoutManager) miniPlayerView.a.d());
        carouselLayoutManager.c = contains;
        carouselLayoutManager.d = contains2;
        miniPlayerView.m.a(iuh.i(), iuh.j(), iuh.k());
        int i2 = 0;
        boolean a3 = miniPlayerView.l != null ? miniPlayerView.l.a(fpt) : false;
        if (iuh.g()) {
            if (a3) {
                Context context = miniPlayerView.getContext();
                drawable = ury.a((Context) fay.a(context), SpotifyIcon.PLAY_32, context.getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size));
            } else {
                drawable = ury.a(miniPlayerView.getContext());
            }
            i = R.string.player_content_description_play;
        } else {
            if (a3) {
                Context context2 = miniPlayerView.getContext();
                b2 = ury.a((Context) fay.a(context2), SpotifyIcon.PAUSE_32, context2.getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size));
            } else {
                b2 = ury.b(miniPlayerView.getContext());
            }
            i = R.string.player_content_description_pause;
        }
        miniPlayerView.b.setImageDrawable(drawable);
        miniPlayerView.b.setContentDescription(miniPlayerView.getContext().getString(i));
        miniPlayerView.setEnabled(true);
        if (jtc.c(miniPlayerView.getContext())) {
            ImageButton imageButton = miniPlayerView.c;
            if (a2) {
                i2 = 8;
            }
            imageButton.setVisibility(i2);
            miniPlayerView.c.setEnabled(isEmpty);
            if (contains2) {
                miniPlayerView.c.setEnabled(true);
                drawable2 = ury.g(miniPlayerView.getContext());
            } else {
                drawable2 = ury.f(miniPlayerView.getContext());
            }
            miniPlayerView.c.setImageDrawable(drawable2);
        }
    }

    public final void ah() {
        iua iua = this.an;
        iua.a(null, iua.a, null, new Handler());
        this.ao.d(0);
    }

    public final void a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        this.ap.a(playerTrackArr, playerTrack, playerTrackArr2);
    }

    public final void ai() {
        this.am.a();
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
