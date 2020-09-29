package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import rx.subjects.PublishSubject;

/* renamed from: kux reason: default package */
public final class kux {
    public static final Set<String> a = new HashSet();
    public final wuk b;
    public final PublishSubject<kui> c = PublishSubject.e();

    public kux(Flowable<PlayerState> flowable, jjf jjf) {
        wud a2 = vun.a((wrf<T>) flowable);
        wud b2 = wud.b(this.c.a(a2, (wuu<? super T, ? super U, ? extends R>) $$Lambda$kux$MxHgyC4GRIkZWqHKR7gSCo0.INSTANCE).c((wut<? super T, Boolean>) $$Lambda$kux$dF1P7TssrAfqGeXolHZVq4usnw8.INSTANCE), a2.c((wut<? super T, Boolean>) $$Lambda$kux$Idbzm9EOACrZn3aFyisLBPWgNE.INSTANCE).a((b<? extends R, ? super T>) new wwg<Object,Object>($$Lambda$kux$V_U7j0mRAZr56Oyh7r_tMG8m21A.INSTANCE)).b().f($$Lambda$kux$iMKjLLNRv8oC2GckPS_F3L0CI.INSTANCE)).b();
        jjf.getClass();
        this.b = b2.a((wun<? super T>) new $$Lambda$1Y6tGHRvurqrZYjQnXpqU8zJFvc<Object>(jjf), (wun<Throwable>) $$Lambda$kux$tpgyDAIdlW5rEYVoFjryDWBxxFw.INSTANCE);
    }

    public final void a(String str) {
        this.c.onNext(new kui(str, false));
    }

    public final void b(String str) {
        a.add(str);
        this.c.onNext(new kui(str, true));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ n a(kui kui, PlayerState playerState) {
        if (a(playerState.track()).equals(kui.a)) {
            return a(playerState, kui.b);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(n nVar) {
        return Boolean.valueOf(nVar != null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(PlayerState playerState) {
        Map map;
        PlayerTrack track = playerState.track();
        if (track != null) {
            map = track.metadata();
        } else {
            map = new HashMap();
        }
        return Boolean.valueOf(track != null && map.containsKey("canvas.id"));
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
        byte[] a2 = juq.a(playbackId);
        if (track != null) {
            str = (String) track.metadata().get("canvas.id");
        }
        n nVar = new n(a2, str, a(track), (double) playerState.timestamp(), (double) playerState.positionAsOfTimestamp(), Double.valueOf(str2).doubleValue(), "visible_full", playerState.isPaused() ? "paused" : "playing", "foreground", "controls", z ? "loaded" : "not_loaded", "spotify:app:canvas", false, false);
        return nVar;
    }

    private static String a(PlayerTrack playerTrack) {
        return playerTrack != null ? playerTrack.uri() : "";
    }
}
