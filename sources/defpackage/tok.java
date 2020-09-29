package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: tok reason: default package */
public final class tok implements a, a {
    xip a = xon.b();
    xip b = xon.b();
    xip c = xon.b();
    xip d = xon.b();
    public tpt e;
    public tpp f;
    public toz g;
    private final wzi<Player> h;
    private final tnh i;
    private final toj j;
    private final tom k;
    private final tym l;
    private final xil m;
    private final ure n;
    private final tnq o;
    private final lbi p;
    private final tol q;
    private final Map<String, PlayOptions> r = new HashMap(20);
    private final Map<String, String> s = new HashMap(20);
    private final Map<String, PlayerTrack> t = new HashMap(20);
    private boolean u = true;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private String z;

    public tok(wzi<Player> wzi, tnh tnh, toj toj, tom tom, ure ure, tnq tnq, lbi lbi, a aVar, tym tym, xil xil, tol tol) {
        this.h = wzi;
        this.i = tnh;
        this.j = toj;
        this.k = tom;
        this.p = lbi;
        this.n = ure;
        this.o = tnq;
        this.l = tym;
        this.m = xil;
        this.q = tol;
        aVar.a(new c() {
            public final void e() {
                tok.this.c();
            }

            public final void f() {
                tok tok = tok.this;
                if (!tok.a.isUnsubscribed()) {
                    tok.a.unsubscribe();
                }
                if (!tok.b.isUnsubscribed()) {
                    tok.b.unsubscribe();
                }
                if (!tok.c.isUnsubscribed()) {
                    tok.c.unsubscribe();
                }
                if (!tok.d.isUnsubscribed()) {
                    tok.d.unsubscribe();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(String str, PlayerState playerState, PlayerTrack playerTrack, String str2) {
        this.s.put(str, str2);
        a(playerState, str, playerTrack);
        return str;
    }

    private void a(PlayerState playerState, String str, PlayerTrack playerTrack) {
        if (playerTrack != null && !TextUtils.isEmpty(playerTrack.uri())) {
            this.t.put(str, playerTrack);
        }
        this.r.put(str, b(playerState));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue() && this.x) {
            this.y = true;
            c();
        }
    }

    private void a(String str, PlayOptions playOptions, boolean z2) {
        PlayerContext playerContext;
        String str2 = "context://";
        if (z2) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            playerContext = PlayerContext.createFromContextUrl(str, sb.toString(), ImmutableMap.a(Metadata.LICENSE, Metadata.LICENSE_ON_DEMAND_WHEN_FREE, "autoplay_candidate", "false"));
        } else {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(str);
            playerContext = PlayerContext.createFromContextUrl(str, sb2.toString());
        }
        ((Player) this.h.get()).play(playerContext, playOptions);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, PlayerContext playerContext) {
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, str, 0);
        Player player = (Player) this.h.get();
        Builder suppressions = new Builder().skipTo(playOptionsSkipTo).suppressions(PlayerProviders.MFT);
        Boolean bool = Boolean.FALSE;
        player.play(playerContext, suppressions.playerOptionsOverride(bool, bool, Boolean.FALSE).build());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z2, String str2, Throwable th) {
        a(str, (PlayOptions) this.r.get(str), z2);
        Logger.e(th, "Failed to fetch episode context: %s", str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Emitter emitter) {
        Player player = (Player) this.h.get();
        emitter.getClass();
        player.fetchState(new $$Lambda$gY5dM9d2sPsgGBCO49dFQNIFxpc(emitter));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.f.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        if (!this.v) {
            this.f.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.f.c();
        ImmutableList a2 = dVar.a.a();
        int b2 = dVar.a.b();
        this.e.a(a2, b2);
        this.z = ((tpq) a2.get(b2)).e().a();
        this.v = true;
        this.y = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ton ton) {
        ton.a(new $$Lambda$tok$w3RYUtY_JxhadGlEqW2Lfd8ZDH4(this), new $$Lambda$tok$gUm547fW_rKKLCxvVh0A_zoKXI(this), new $$Lambda$tok$uTHan6_yR2CRsUaTIb_jChSUDKw(this), $$Lambda$tok$haBsJB5QHY6ulw44KaG4v61A3hg.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(defpackage.tpq r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            hfv r1 = r19.e()
            java.lang.String r1 = r1.a()
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r19.b()
            java.lang.String r2 = "Context uri was null for %s"
            com.spotify.mobile.android.util.Assertion.a(r2, r1)
            return
        L_0x0016:
            hfv r1 = r19.e()
            java.lang.String r1 = r1.a()
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack> r2 = r0.t
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r2
            if (r2 == 0) goto L_0x002d
            java.lang.String r3 = r2.uri()
            goto L_0x002f
        L_0x002d:
            java.lang.String r3 = ""
        L_0x002f:
            if (r1 == 0) goto L_0x0143
            r4 = r20
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0143
            boolean r4 = defpackage.ute.f(r1)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0080
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r2 = r0.r
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r2
            if (r2 == 0) goto L_0x0057
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r3 = r2.skipTo()
            if (r3 == 0) goto L_0x0057
            int r3 = r3.trackIndex()
            r12 = r3
            goto L_0x0058
        L_0x0057:
            r12 = 0
        L_0x0058:
            r3 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.Long r2 = r2.seekTo()
            if (r2 == 0) goto L_0x0066
            long r3 = r2.longValue()
        L_0x0066:
            r13 = r3
            ure r7 = r0.n
            java.lang.String[] r8 = new java.lang.String[r5]
            r8[r6] = r1
            sso r9 = com.spotify.music.libs.viewuri.ViewUris.v
            r10 = 0
            r11 = 0
            uqm r15 = defpackage.uqo.P
            uqm r2 = defpackage.uqo.O
            gkm r16 = defpackage.gkm.a(r2)
            r17 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r15, r16, r17)
            goto L_0x0141
        L_0x0080:
            boolean r4 = defpackage.tol.c(r1)
            if (r4 == 0) goto L_0x00dc
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.s
            java.lang.Object r4 = r4.get(r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00dc
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.s
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r19.j()
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x00ca
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x00ca
            tym r5 = r0.l
            xim r5 = r5.a(r2, r3)
            xil r6 = r0.m
            xim r5 = r5.a(r6)
            -$$Lambda$tok$-mFo3prqUJJtwQVQe794qUF-AiI r6 = new -$$Lambda$tok$-mFo3prqUJJtwQVQe794qUF-AiI
            r6.<init>(r0, r3)
            -$$Lambda$tok$knunIS8yrXp5WoHaW0rQyRRJxdc r7 = new -$$Lambda$tok$knunIS8yrXp5WoHaW0rQyRRJxdc
            r7.<init>(r0, r2, r4, r3)
            xip r2 = r5.a(r6, r7)
            r0.c = r2
            goto L_0x0141
        L_0x00ca:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0141
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r3 = r0.r
            java.lang.Object r3 = r3.get(r2)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r3 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r3
            r0.a(r2, r3, r4)
            goto L_0x0141
        L_0x00dc:
            jva r3 = defpackage.jva.a(r1)
            com.spotify.mobile.android.util.LinkType r3 = r3.b
            com.spotify.mobile.android.util.LinkType r4 = com.spotify.mobile.android.util.LinkType.SEARCH_QUERY
            if (r3 != r4) goto L_0x00e8
            r3 = 1
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            if (r3 == 0) goto L_0x0132
            if (r2 == 0) goto L_0x0132
            java.lang.String r2 = r2.uri()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0132
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack> r2 = r0.t
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r2
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r3 = r0.r
            java.lang.Object r3 = r3.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r3 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r3
            boolean r4 = r19.j()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r5 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[r5]
            r5[r6] = r2
            if (r4 == 0) goto L_0x0122
            java.lang.String r2 = "license"
            java.lang.String r4 = "mobile_on_demand"
            java.lang.String r6 = "autoplay_candidate"
            java.lang.String r7 = "false"
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.a(r2, r4, r6, r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r2 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext.create(r1, r5, r2)
            goto L_0x0126
        L_0x0122:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r2 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext.create(r1, r5)
        L_0x0126:
            wzi<com.spotify.mobile.android.cosmos.player.v2.Player> r4 = r0.h
            java.lang.Object r4 = r4.get()
            com.spotify.mobile.android.cosmos.player.v2.Player r4 = (com.spotify.mobile.android.cosmos.player.v2.Player) r4
            r4.play(r2, r3)
            goto L_0x0141
        L_0x0132:
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r2 = r0.r
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r2
            boolean r3 = r19.j()
            r0.a(r1, r2, r3)
        L_0x0141:
            r0.z = r1
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tok.a(tpq, java.lang.String):void");
    }

    private static PlayOptions b(PlayerState playerState) {
        PlayerContextIndex index = playerState.index();
        if (index == null) {
            return new Builder().build();
        }
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, index.page(), null, null, index.track());
        return new Builder().seekTo(Long.valueOf(playerState.currentPlaybackPosition())).skipTo(playOptionsSkipTo).build();
    }

    private xii<PlayerState> b() {
        return xii.a((xis<Emitter<T>>) new $$Lambda$tok$TYGc5QLHvxFHnY75MqoPLrRqoDc<Emitter<T>>(this), BackpressureMode.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(Boolean bool) {
        return !bool.booleanValue() ? ScalarSynchronousObservable.d(new c()) : this.i.a().a((c<? super T, ? extends R>) this.j).a((c<? super T, ? extends R>) this.k).e((xiy<? super T, ? extends R>) $$Lambda$HIuqhAR84auamtS5UXF8CyMJmaE.INSTANCE).c(new b()).d(8, TimeUnit.SECONDS).g($$Lambda$lIVlEwk4Kl5ftLkhkd_im243htY.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii c(PlayerState playerState) {
        return ScalarSynchronousObservable.d(Boolean.valueOf(!playerState.contextUri().equals(this.z) && !tou.a(playerState.track())));
    }

    /* access modifiers changed from: private */
    public void c() {
        if (this.y) {
            this.a.unsubscribe();
            this.v = false;
            this.u = true;
        }
        if (this.a.isUnsubscribed() && !this.v) {
            this.a = wit.a((ObservableSource<T>) this.p.a, BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$tlwmwQXunBJw7m4Cq_KitWeMirk.INSTANCE).b().h(new $$Lambda$tok$MdRyHXvrh8RjjCgI71XER8UraEs(this)).a(this.m).b().a((xis<? super T>) new $$Lambda$tok$qSIwNzdx9yQmAcfp8ABWShCEo<Object>(this), (xis<Throwable>) $$Lambda$tok$_OFwSAZxqo9ZalA5phxKegvpKc.INSTANCE);
        }
    }

    /* access modifiers changed from: 0000 */
    public final xii<String> a(PlayerState playerState) {
        String contextUri = playerState.contextUri();
        PlayerTrack track = playerState.track();
        if (!tou.a(track)) {
            if (tol.c(contextUri) && track != null && !TextUtils.isEmpty(track.uri())) {
                return this.q.b(track.uri()).e((xiy<? super T, ? extends R>) new $$Lambda$tok$IQD8BWsKXFg_LD_eEAm_cMnWEcQ<Object,Object>(this, contextUri, playerState, track));
            }
            a(playerState, contextUri, track);
        }
        return ScalarSynchronousObservable.d(contextUri);
    }

    public final void a() {
        this.d = b().c().d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$tok$TNivlhKqnlgD0uTr4ftg6rOyTUo<Object,Object>(this)).a((xis<? super T>) new $$Lambda$tok$2mBeHNRapIr9fq5t3ro3JZTwc7I<Object>(this), (xis<Throwable>) $$Lambda$tok$zg0hbWAFgfuRwWmbkAbKQoCg.INSTANCE);
    }

    public final void a(tpq tpq, boolean z2) {
        if (!this.u) {
            this.o.a(tpq.e().a(), tpq.b(), Integer.parseInt(tpq.a()), z2);
            if (!this.b.isUnsubscribed()) {
                this.b.unsubscribe();
            }
            if (this.w) {
                this.g.a(tpq.c());
            }
            this.b = b().c().d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$2WcvixPQW_FlWQsh5y_XLlqXzPQ<Object,Object>(this)).a((xis<? super T>) new $$Lambda$tok$gyHLbcw7yDF2jdvE6lJ8bqNtwdY<Object>(this, tpq), (xis<Throwable>) $$Lambda$tok$BMJI9a91bcqgoqvfeU_s1Ad0dk.INSTANCE);
        }
        this.u = false;
    }

    public final void a(boolean z2) {
        this.e.f_(z2);
        this.w = z2;
    }

    public final void b(boolean z2) {
        this.x = z2;
        if (z2) {
            a();
        }
    }
}
