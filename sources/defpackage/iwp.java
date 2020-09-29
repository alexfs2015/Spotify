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

/* renamed from: iwp reason: default package */
public final class iwp implements PlayerStateObserver {
    final ixp a;
    final ixr b;
    final iwm c;
    final ixn d;
    /* access modifiers changed from: 0000 */
    public final mix e;
    final ixs f;
    final gto g;
    final fqn h;
    xip i = xon.b();
    iws j;
    PlayerState k;
    iwu l;
    /* access modifiers changed from: 0000 */
    public Player m;
    boolean n;
    public boolean o;
    public boolean p = true;
    private final hhc q;
    private final rpa r;
    private final ttf s;
    private final iwr t;
    private final iww u;
    private final unq v;
    private final ixz w;
    private final xij<ho<gud, uns>> x = new xij<ho<gud, uns>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            ho hoVar = (ho) obj;
            if (iwp.this.m != null) {
                gud gud = (gud) fbp.a(hoVar.a);
                iwp.this.e.a(gud.a(), gud.c(), gud.d(), gud.b(), (uns) fbp.a(hoVar.b));
                iwp.this.d();
                iwp.this.a();
            }
        }
    };

    public iwp(hhc hhc, iwu iwu, Player player, iwm iwm, iwr iwr, ixt ixt, mix mix, ixr ixr, ixp ixp, iww iww, ixn ixn, ttf ttf, rpa rpa, unq unq, gto gto, fqn fqn, ixz ixz) {
        this.a = (ixp) fbp.a(ixp);
        this.b = (ixr) fbp.a(ixr);
        this.q = (hhc) fbp.a(hhc);
        this.l = (iwu) fbp.a(iwu);
        this.m = (Player) fbp.a(player);
        this.w = ixz;
        this.g = gto;
        this.h = fqn;
        ixt ixt2 = ixt;
        this.f = (ixs) fbp.a(new ixs(this.m, ixt));
        this.c = (iwm) fbp.a(iwm);
        this.t = (iwr) fbp.a(iwr);
        this.e = mix;
        this.u = iww;
        this.d = (ixn) fbp.a(ixn);
        this.s = (ttf) fbp.a(ttf);
        this.r = rpa;
        this.v = unq;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        iws iws = this.j;
        if (iws != null) {
            PlayerTrack a2 = iws.a();
            if (a2 == null || !PlayerTrackUtil.isVideo(a2) || !this.n) {
                if (a2 != null) {
                    this.l.ae();
                }
                return;
            }
            this.l.e();
        }
    }

    public final void b() {
        this.b.c(this.j);
        this.f.a();
        this.r.a.b();
        this.l.a(true);
        iws iws = this.j;
        if (iws != null && iws.d().disallowPeekingNextReasons().contains(DisallowReasons.MFT) && !PlayerTrackUtil.isAd(this.j.a())) {
            this.s.a();
        }
    }

    public final void c() {
        this.i = xii.a(this.c.a(), this.v.a(), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$yN2UW7O0411KRQxxHiWMG2V470s.INSTANCE).a(wit.a(this.q.c())).a(this.x);
        iwm iwm = this.c;
        iwm.b.a(iwm);
        iwm.b.a();
        this.m.registerPlayerStateObserver(this, 2, 2);
        this.m.fetchState(this);
        ixz ixz = this.w;
        boolean z = false;
        if (ixz.b.b(ixf.a) && !ixz.c.a(ixz.a, false)) {
            z = true;
        }
        if (z) {
            this.l.ai();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.l.a(iwr.a(this.e.b(), false));
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.m.unregisterPlayerStateObserver(this);
    }

    public final void f() {
        this.a.a();
        g();
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        if (this.u.b) {
            this.l.c();
            this.o = true;
            this.w.a();
        }
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        boolean z = false;
        iws a2 = iws.a(playerState.track(), Lists.a((E[]) playerState.reverse()), Lists.a((E[]) playerState.future()), playerState.restrictions(), playerState.contextUri(), playerState.entityUri(), playerState.isPaused(), PlayerStateUtil.isInLoadingState(playerState) || PlayerTrackUtil.hasIncompleteMetadata(playerState.track()), playerState.currentPlaybackPosition(), playerState.duration(), playerState.playbackSpeed());
        if (!a2.equals(this.j)) {
            iws iws = this.j;
            this.j = a2;
            PlayerRestrictions restrictions = playerState.restrictions();
            this.e.a(restrictions.disallowTransferringPlaybackReasons().isEmpty());
            if (PlayerStateUtil.isEmptyContext(playerState)) {
                iww iww = this.u;
                if (iww.b) {
                    iww.b = false;
                    iww.a.ag();
                }
                return;
            }
            this.l.a(this.j);
            if (this.j.h()) {
                this.l.ah();
            } else if (iws == null || !iws.b().equals(a2.b()) || !fbn.a(iws.a(), a2.a()) || !iws.c().equals(a2.c())) {
                List b2 = a2.b();
                List c2 = a2.c();
                this.l.a((PlayerTrack[]) b2.toArray(new PlayerTrack[b2.size()]), a2.a(), (PlayerTrack[]) c2.toArray(new PlayerTrack[c2.size()]));
            }
            iww iww2 = this.u;
            if (!iww2.b) {
                iww2.b = true;
                iww2.a.af();
            }
            d();
            a();
            iwu iwu = this.l;
            if (!restrictions.disallowSkippingPrevReasons().isEmpty() && !restrictions.disallowSkippingNextReasons().isEmpty()) {
                z = true;
            }
            iwu.a(z);
            boolean z2 = !restrictions.disallowPeekingNextReasons().isEmpty();
            this.l.i(!restrictions.disallowPeekingPrevReasons().isEmpty());
            this.l.j(z2);
        }
    }
}
