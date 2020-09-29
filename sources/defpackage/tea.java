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
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingPivotInteractionLogger;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingPivotInteractionLogger.SectionId;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingPivotInteractionLogger.UserIntent;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: tea reason: default package */
public final class tea implements a, a {
    private String A;
    wuk a = xaj.b();
    wuk b = xaj.b();
    wuk c = xaj.b();
    wuk d = xaj.b();
    public tfj e;
    public tff f;
    public tep g;
    private final wlc<Player> h;
    private final tda i;
    private final tdz j;
    private final tec k;
    private final tmr l;
    private final wug m;
    private final ufq n;
    private final DrivingPivotInteractionLogger o;
    private final kxz p;
    private final teb q;
    private final Map<String, PlayOptions> r = new HashMap(20);
    private final Map<String, String> s = new HashMap(20);
    private final Map<String, PlayerTrack> t = new HashMap(20);
    private boolean u = true;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public tea(wlc<Player> wlc, tda tda, tdz tdz, tec tec, ufq ufq, DrivingPivotInteractionLogger drivingPivotInteractionLogger, kxz kxz, a aVar, tmr tmr, wug wug, teb teb) {
        this.h = wlc;
        this.i = tda;
        this.j = tdz;
        this.k = tec;
        this.p = kxz;
        this.n = ufq;
        this.o = drivingPivotInteractionLogger;
        this.l = tmr;
        this.m = wug;
        this.q = teb;
        aVar.a(new c() {
            public final void e() {
                tea.this.g();
            }

            public final void f() {
                tea tea = tea.this;
                if (!tea.a.isUnsubscribed()) {
                    tea.a.unsubscribe();
                }
                if (!tea.b.isUnsubscribed()) {
                    tea.b.unsubscribe();
                }
                if (!tea.c.isUnsubscribed()) {
                    tea.c.unsubscribe();
                }
                if (!tea.d.isUnsubscribed()) {
                    tea.d.unsubscribe();
                }
            }
        });
    }

    private wud<PlayerState> f() {
        return wud.a((wun<Emitter<T>>) new $$Lambda$tea$yNk_QZocwPFDnmlfnrmNyLgCAA<Emitter<T>>(this), BackpressureMode.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Emitter emitter) {
        Player player = (Player) this.h.get();
        emitter.getClass();
        player.fetchState(new $$Lambda$QPrurw829qt0OJk_vwfyQQ6_BLE(emitter));
    }

    private static PlayOptions b(PlayerState playerState) {
        PlayerContextIndex index = playerState.index();
        if (index == null) {
            return new Builder().build();
        }
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, index.page(), null, null, index.track());
        return new Builder().seekTo(Long.valueOf(playerState.currentPlaybackPosition())).skipTo(playOptionsSkipTo).build();
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

    /* access modifiers changed from: 0000 */
    public final wud<String> a(PlayerState playerState) {
        String contextUri = playerState.contextUri();
        PlayerTrack track = playerState.track();
        if (!tek.a(track)) {
            if (teb.c(contextUri) && track != null && !TextUtils.isEmpty(track.uri())) {
                return this.q.b(track.uri()).f(new $$Lambda$tea$IfBMlos7DtldB8RtRqTvEosic(this, contextUri, playerState, track));
            }
            a(playerState, contextUri, track);
        }
        return ScalarSynchronousObservable.d(contextUri);
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

    public final void a(tfg tfg, boolean z2) {
        InteractionType interactionType;
        if (!this.u) {
            DrivingPivotInteractionLogger drivingPivotInteractionLogger = this.o;
            String a2 = tfg.e().a();
            String b2 = tfg.b();
            int parseInt = Integer.parseInt(tfg.a());
            if (z2) {
                interactionType = InteractionType.SCROLL;
            } else {
                interactionType = InteractionType.TAP;
            }
            drivingPivotInteractionLogger.a.a(drivingPivotInteractionLogger.a(), a2, b2, parseInt, interactionType, UserIntent.SCROLL_ITEMS.toString());
            if (!this.b.isUnsubscribed()) {
                this.b.unsubscribe();
            }
            if (this.w) {
                this.g.a(tfg.c());
            }
            this.b = f().c().d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$7NHO1dUOkxIukQlomJc4KZ3IRAQ<Object,Object>(this)).a((wun<? super T>) new $$Lambda$tea$6ekpmkTantsveMYwYLi_sDlgeM<Object>(this, tfg), (wun<Throwable>) $$Lambda$tea$YyVLNDACuWuAf03dlQwKZ8nr1pk.INSTANCE);
        }
        this.u = false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(defpackage.tfg r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = r19.a()
            int r1 = java.lang.Integer.parseInt(r1)
            r0.z = r1
            hcz r1 = r19.e()
            java.lang.String r1 = r1.a()
            if (r1 != 0) goto L_0x0020
            java.lang.String r1 = r19.b()
            java.lang.String r2 = "Context uri was null for %s"
            com.spotify.mobile.android.util.Assertion.a(r2, r1)
            return
        L_0x0020:
            hcz r1 = r19.e()
            java.lang.String r1 = r1.a()
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack> r2 = r0.t
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r2
            if (r2 == 0) goto L_0x0037
            java.lang.String r3 = r2.uri()
            goto L_0x0039
        L_0x0037:
            java.lang.String r3 = ""
        L_0x0039:
            if (r1 == 0) goto L_0x014d
            r4 = r20
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x014d
            boolean r4 = defpackage.uhq.g(r1)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x008a
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r2 = r0.r
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r2
            if (r2 == 0) goto L_0x0061
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r3 = r2.skipTo()
            if (r3 == 0) goto L_0x0061
            int r3 = r3.trackIndex()
            r12 = r3
            goto L_0x0062
        L_0x0061:
            r12 = 0
        L_0x0062:
            r3 = 0
            if (r2 == 0) goto L_0x0070
            java.lang.Long r2 = r2.seekTo()
            if (r2 == 0) goto L_0x0070
            long r3 = r2.longValue()
        L_0x0070:
            r13 = r3
            ufq r7 = r0.n
            java.lang.String[] r8 = new java.lang.String[r5]
            r8[r6] = r1
            sih r9 = com.spotify.music.libs.viewuri.ViewUris.w
            r10 = 0
            r11 = 0
            udr r15 = defpackage.udt.P
            udr r2 = defpackage.udt.O
            gjb r16 = defpackage.gjb.a(r2)
            r17 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r15, r16, r17)
            goto L_0x014b
        L_0x008a:
            boolean r4 = defpackage.teb.c(r1)
            if (r4 == 0) goto L_0x00e6
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.s
            java.lang.Object r4 = r4.get(r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00e6
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.s
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r19.j()
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x00d4
            tmr r5 = r0.l
            wuh r5 = r5.a(r2, r3)
            wug r6 = r0.m
            wuh r5 = r5.a(r6)
            -$$Lambda$tea$0EOQs89sPUfNcWqO6N8DBKnXUE8 r6 = new -$$Lambda$tea$0EOQs89sPUfNcWqO6N8DBKnXUE8
            r6.<init>(r0, r3)
            -$$Lambda$tea$ZqZNhDMQG1ag8D1d_bwMNMBDQUQ r7 = new -$$Lambda$tea$ZqZNhDMQG1ag8D1d_bwMNMBDQUQ
            r7.<init>(r0, r2, r4, r3)
            wuk r2 = r5.a(r6, r7)
            r0.c = r2
            goto L_0x014b
        L_0x00d4:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x014b
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r3 = r0.r
            java.lang.Object r3 = r3.get(r2)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r3 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r3
            r0.a(r2, r3, r4)
            goto L_0x014b
        L_0x00e6:
            jst r3 = defpackage.jst.a(r1)
            com.spotify.mobile.android.util.LinkType r3 = r3.b
            com.spotify.mobile.android.util.LinkType r4 = com.spotify.mobile.android.util.LinkType.SEARCH_QUERY
            if (r3 != r4) goto L_0x00f2
            r3 = 1
            goto L_0x00f3
        L_0x00f2:
            r3 = 0
        L_0x00f3:
            if (r3 == 0) goto L_0x013c
            if (r2 == 0) goto L_0x013c
            java.lang.String r2 = r2.uri()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x013c
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack> r2 = r0.t
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r2
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r3 = r0.r
            java.lang.Object r3 = r3.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r3 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r3
            boolean r4 = r19.j()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r5 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[r5]
            r5[r6] = r2
            if (r4 == 0) goto L_0x012c
            java.lang.String r2 = "license"
            java.lang.String r4 = "mobile_on_demand"
            java.lang.String r6 = "autoplay_candidate"
            java.lang.String r7 = "false"
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.a(r2, r4, r6, r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r2 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext.create(r1, r5, r2)
            goto L_0x0130
        L_0x012c:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r2 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext.create(r1, r5)
        L_0x0130:
            wlc<com.spotify.mobile.android.cosmos.player.v2.Player> r4 = r0.h
            java.lang.Object r4 = r4.get()
            com.spotify.mobile.android.cosmos.player.v2.Player r4 = (com.spotify.mobile.android.cosmos.player.v2.Player) r4
            r4.play(r2, r3)
            goto L_0x014b
        L_0x013c:
            java.util.Map<java.lang.String, com.spotify.mobile.android.cosmos.player.v2.PlayOptions> r2 = r0.r
            java.lang.Object r2 = r2.get(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r2
            boolean r3 = r19.j()
            r0.a(r1, r2, r3)
        L_0x014b:
            r0.A = r1
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tea.a(tfg, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(Boolean bool) {
        if (!bool.booleanValue()) {
            return ScalarSynchronousObservable.d(new c());
        }
        return this.i.a().a((c<? super T, ? extends R>) this.j).a((c<? super T, ? extends R>) this.k).f($$Lambda$1R_3a7NavDYKykHfYnVLxScawLQ.INSTANCE).c(new b()).d(8, TimeUnit.SECONDS).h($$Lambda$_oQDu57l4eX28SaFp3ci37fz1M.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.y) {
            this.a.unsubscribe();
            this.v = false;
            this.u = true;
        }
        if (this.a.isUnsubscribed() && !this.v) {
            this.a = vun.a((ObservableSource<T>) this.p.a, BackpressureStrategy.BUFFER).f($$Lambda$FGujCMI6ooQeGJpcOdGjHBpB0Q.INSTANCE).b().i(new $$Lambda$tea$cB6ONADq0PvoWp51nnrVvm4Bg0(this)).a(this.m).b().a((wun<? super T>) new $$Lambda$tea$hIf8ehtXffJ7JbCpYVtT3oGQHM<Object>(this), (wun<Throwable>) $$Lambda$tea$2x8johwtJY9iAf6qkn7ixFUjc.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ted ted) {
        ted.a(new $$Lambda$tea$VjBywKUaSqKXOaS58_6FrY1xiA(this), new $$Lambda$tea$7dugR1gUpP5_4v2gttcbZtubLM8(this), new $$Lambda$tea$Jp7sfrdST_0ZN7g5mAeFeIR6h4(this), $$Lambda$tea$tkAQfNW55sA4wS6M3dGfOO8TE2Y.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.f.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.f.c();
        ImmutableList a2 = dVar.a.a();
        int b2 = dVar.a.b();
        this.e.a(a2, b2);
        this.A = ((tfg) a2.get(b2)).e().a();
        this.v = true;
        this.y = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        if (!this.v) {
            this.f.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue() && this.x) {
            this.y = true;
            g();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud c(PlayerState playerState) {
        return ScalarSynchronousObservable.d(Boolean.valueOf(!playerState.contextUri().equals(this.A) && !tek.a(playerState.track())));
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

    public final void b() {
        this.o.a(SectionId.OPEN_PIVOT_TOUCH_AREA, UserIntent.OPEN_PIVOT, this.z, InteractionType.DRAG);
    }

    public final void c() {
        this.o.a(SectionId.OPEN_PIVOT_TOUCH_AREA, UserIntent.OPEN_PIVOT, this.z, InteractionType.HIT);
    }

    public final void d() {
        this.o.a(SectionId.CLOSE_PIVOT_TOUCH_AREA, UserIntent.CLOSE_PIVOT, this.z, InteractionType.DRAG);
    }

    public final void e() {
        this.o.a(SectionId.CLOSE_PIVOT_TOUCH_AREA, UserIntent.CLOSE_PIVOT, this.z, InteractionType.HIT);
    }

    public final void a() {
        this.d = f().c().d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$tea$vzGcH3cHJVAnxIzWfEghpTG8Ok<Object,Object>(this)).a((wun<? super T>) new $$Lambda$tea$eBa7m3EZtVPOtM5GhEX42o_NUE4<Object>(this), (wun<Throwable>) $$Lambda$tea$nNSKt12n_LPRoAvgw0AagT88fOI.INSTANCE);
    }
}
