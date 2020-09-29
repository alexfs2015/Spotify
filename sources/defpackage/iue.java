package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import java.util.List;

/* renamed from: iue reason: default package */
public final class iue implements PlayerStateObserver {
    final ive a;
    final ivg b;
    final iub c;
    final ivc d;
    /* access modifiers changed from: 0000 */
    public final men e;
    final ivh f;
    wuk g = xaj.b();
    iuh h;
    PlayerState i;
    iuj j;
    /* access modifiers changed from: 0000 */
    public Player k;
    boolean l;
    public boolean m;
    public boolean n = true;
    private final heg o;
    private final rfy p;
    private final tin q;
    private final iug r;
    private final iul s;
    private final uav t;
    private final ivo u;
    private final wue<ho<gsd, uax>> v = new wue<ho<gsd, uax>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            ho hoVar = (ho) obj;
            if (iue.this.k != null) {
                gsd gsd = (gsd) fay.a(hoVar.a);
                iue.this.e.a(gsd.a(), gsd.c(), gsd.d(), gsd.b(), (uax) fay.a(hoVar.b));
                iue.this.d();
                iue.this.a();
            }
        }
    };

    public iue(heg heg, iuj iuj, Player player, iub iub, iug iug, ivi ivi, men men, ivg ivg, ive ive, iul iul, ivc ivc, tin tin, rfy rfy, uav uav, ivo ivo) {
        this.a = (ive) fay.a(ive);
        this.b = (ivg) fay.a(ivg);
        this.o = (heg) fay.a(heg);
        this.j = (iuj) fay.a(iuj);
        this.k = (Player) fay.a(player);
        this.u = ivo;
        ivi ivi2 = ivi;
        this.f = (ivh) fay.a(new ivh(this.k, ivi));
        this.c = (iub) fay.a(iub);
        this.r = (iug) fay.a(iug);
        this.e = men;
        this.s = iul;
        this.d = (ivc) fay.a(ivc);
        this.q = (tin) fay.a(tin);
        this.p = rfy;
        this.t = uav;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        iuh iuh = this.h;
        if (iuh != null) {
            PlayerTrack a2 = iuh.a();
            if (a2 == null || !PlayerTrackUtil.isVideo(a2) || !this.l) {
                if (a2 != null) {
                    this.j.ae();
                }
                return;
            }
            this.j.e();
        }
    }

    public final void b() {
        this.b.c(this.h);
        this.f.a();
        this.p.a.b();
        this.j.a(true);
        iuh iuh = this.h;
        if (iuh != null && iuh.d().disallowPeekingNextReasons().contains(DisallowReasons.MFT) && !PlayerTrackUtil.isAd(this.h.a())) {
            this.q.a();
        }
    }

    public final void c() {
        this.g = wud.a(this.c.a(), this.t.a(), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$OZx3AXXokTBtKu8xn4m6Ygv0spA.INSTANCE).a(vun.a(this.o.c())).a(this.v);
        iub iub = this.c;
        iub.b.a(iub);
        iub.b.a();
        this.k.registerPlayerStateObserver(this, 2, 2);
        this.k.fetchState(this);
        ivo ivo = this.u;
        boolean z = false;
        if (ivo.b.b(iuu.a) && !ivo.c.a(ivo.a, false)) {
            z = true;
        }
        if (z) {
            this.j.ai();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.j.a(iug.a(this.e.b(), false));
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.k.unregisterPlayerStateObserver(this);
    }

    public final void f() {
        this.a.a();
        g();
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        if (this.s.b) {
            this.j.c();
            this.m = true;
            this.u.a();
        }
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        boolean z = false;
        iuh a2 = iuh.a(playerState.track(), Lists.a((E[]) playerState.reverse()), Lists.a((E[]) playerState.future()), playerState.restrictions(), playerState.contextUri(), playerState.entityUri(), playerState.isPaused(), PlayerStateUtil.isInLoadingState(playerState) || PlayerTrackUtil.hasIncompleteMetadata(playerState.track()), playerState.currentPlaybackPosition(), playerState.duration(), playerState.playbackSpeed());
        if (!a2.equals(this.h)) {
            iuh iuh = this.h;
            this.h = a2;
            PlayerRestrictions restrictions = playerState.restrictions();
            this.e.a(restrictions.disallowTransferringPlaybackReasons().isEmpty());
            if (PlayerStateUtil.isEmptyContext(playerState)) {
                iul iul = this.s;
                if (iul.b) {
                    iul.b = false;
                    iul.a.ag();
                }
                return;
            }
            this.j.a(this.h);
            if (this.h.h()) {
                this.j.ah();
            } else if (iuh == null || !iuh.b().equals(a2.b()) || !faw.a(iuh.a(), a2.a()) || !iuh.c().equals(a2.c())) {
                List b2 = a2.b();
                List c2 = a2.c();
                this.j.a((PlayerTrack[]) b2.toArray(new PlayerTrack[b2.size()]), a2.a(), (PlayerTrack[]) c2.toArray(new PlayerTrack[c2.size()]));
            }
            iul iul2 = this.s;
            if (!iul2.b) {
                iul2.b = true;
                iul2.a.af();
            }
            d();
            a();
            iuj iuj = this.j;
            if (!restrictions.disallowSkippingPrevReasons().isEmpty() && !restrictions.disallowSkippingNextReasons().isEmpty()) {
                z = true;
            }
            iuj.a(z);
            boolean z2 = !restrictions.disallowPeekingNextReasons().isEmpty();
            this.j.i(!restrictions.disallowPeekingPrevReasons().isEmpty());
            this.j.j(z2);
        }
    }
}
