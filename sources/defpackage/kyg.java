package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import rx.subjects.PublishSubject;

/* renamed from: kyg reason: default package */
public final class kyg {
    public static final Set<String> a = new HashSet();
    public final xip b;
    public final PublishSubject<kxr> c = PublishSubject.e();

    public kyg(Flowable<PlayerState> flowable, jlr jlr) {
        xii a2 = wit.a((xfk<T>) flowable);
        xii b2 = xii.b(this.c.a(a2, (xiz<? super T, ? super U, ? extends R>) $$Lambda$kyg$SmHNZfwD8iJsbxgmCmvpI45JFSg.INSTANCE).c((xiy<? super T, Boolean>) $$Lambda$kyg$Dk0l_O7SFHxNRovQrQCjNUXhV4.INSTANCE), a2.c((xiy<? super T, Boolean>) $$Lambda$kyg$l3MnSnHuw7x_L6wiDlEOipmI.INSTANCE).a((b<? extends R, ? super T>) new xkl<Object,Object>($$Lambda$kyg$bPE0a2YHVqLAE1wPefqjHdSz74o.INSTANCE)).b().e((xiy<? super T, ? extends R>) $$Lambda$kyg$Ib9oC_HzeDtahdgRY0Jd5vYmwDU.INSTANCE)).b();
        jlr.getClass();
        this.b = b2.a((xis<? super T>) new $$Lambda$xJU1wkMBqCkn607ttcuKKX1OYJw<Object>(jlr), (xis<Throwable>) $$Lambda$kyg$kpRSctdUOvO6gjb0ZeI0dmEQc6Y.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PlayerState a(PlayerState playerState, PlayerState playerState2) {
        return (a(playerState.track()).equals(a(playerState2.track())) && playerState.isPaused() == playerState2.isPaused()) ? playerState : playerState2;
    }

    /* access modifiers changed from: private */
    public static n a(PlayerState playerState, boolean z) {
        PlayerTrack track = playerState.track();
        String playbackId = playerState.playbackId();
        String str = "";
        if (playbackId == null) {
            playbackId = str;
        }
        String str2 = track != null ? (String) track.metadata().get("duration") : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        byte[] a2 = jwy.a(playbackId);
        if (track != null) {
            str = (String) track.metadata().get("canvas.id");
        }
        n nVar = new n(a2, str, a(track), (double) playerState.timestamp(), (double) playerState.positionAsOfTimestamp(), Double.valueOf(str2).doubleValue(), "visible_full", playerState.isPaused() ? "paused" : "playing", "foreground", "controls", z ? "loaded" : "not_loaded", "spotify:app:canvas", false, false);
        return nVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ n a(kxr kxr, PlayerState playerState) {
        if (a(playerState.track()).equals(kxr.a)) {
            return a(playerState, kxr.b);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(n nVar) {
        return Boolean.valueOf(nVar != null);
    }

    private static String a(PlayerTrack playerTrack) {
        return playerTrack != null ? playerTrack.uri() : "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        return Boolean.valueOf(track != null && (track != null ? track.metadata() : new HashMap()).containsKey("canvas.id"));
    }

    public final void a(String str) {
        this.c.onNext(new kxr(str, false));
    }

    public final void b(String str) {
        a.add(str);
        this.c.onNext(new kxr(str, true));
    }
}
