package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.music.features.queue.logging.QueueLogConstants.SectionId;
import com.spotify.music.features.queue.logging.QueueLogConstants.UserIntent;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: pvm reason: default package */
public final class pvm implements PlayerStateObserver {
    private final Player a;
    private final pvc b;
    private final pvo c;

    public pvm(Player player, pvc pvc, pvo pvo) {
        this.a = (Player) fbp.a(player);
        this.b = (pvc) fbp.a(pvc);
        this.c = (pvo) fbp.a(pvo);
    }

    private PlayerState d() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (lastPlayerState == null || !lastPlayerState.isPlaying()) {
            return null;
        }
        return lastPlayerState;
    }

    public final void a() {
        this.b.a(null, SectionId.PREVIOUS_BUTTON, UserIntent.SKIP_TO_PREVIOUS, InteractionType.HIT);
        if (this.a.getLastPlayerState() != null) {
            this.a.skipToPreviousTrack();
        }
    }

    public final void b() {
        PlayerState d = d();
        if (d != null) {
            pvc pvc = this.b;
            pvc.a(PlayerStateUtil.getTrackUri(pvc.a()), SectionId.PLAY_BUTTON, d.isPaused() ? UserIntent.PLAY : UserIntent.PAUSE, InteractionType.HIT);
        }
        PlayerState d2 = d();
        if (d2 != null) {
            if (d2.isPaused()) {
                this.a.resume();
            } else {
                this.a.pause();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r5 = this;
            pvc r0 = r5.b
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r1 = r0.a()
            if (r1 == 0) goto L_0x0017
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r1 = r1.future()
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0017
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = r1.uri()
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            com.spotify.music.features.queue.logging.QueueLogConstants$SectionId r2 = com.spotify.music.features.queue.logging.QueueLogConstants.SectionId.NEXT_BUTTON
            com.spotify.music.features.queue.logging.QueueLogConstants$UserIntent r3 = com.spotify.music.features.queue.logging.QueueLogConstants.UserIntent.SKIP_TO_NEXT
            com.spotify.music.loggers.InteractionLogger$InteractionType r4 = com.spotify.music.loggers.InteractionLogger.InteractionType.HIT
            r0.a(r1, r2, r3, r4)
            com.spotify.mobile.android.cosmos.player.v2.Player r0 = r5.a
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r0 = r0.getLastPlayerState()
            if (r0 != 0) goto L_0x002a
            return
        L_0x002a:
            com.spotify.mobile.android.cosmos.player.v2.Player r0 = r5.a
            r0.skipToNextTrack()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvm.c():void");
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.c.a(playerState.isPaused());
        PlayerRestrictions restrictions = playerState.restrictions();
        if (playerState.isPaused()) {
            this.c.b(restrictions.disallowResumingReasons().isEmpty());
        } else {
            this.c.b(restrictions.disallowPausingReasons().isEmpty());
        }
        boolean isEmpty = playerState.restrictions().disallowSkippingPrevReasons().isEmpty() | playerState.restrictions().disallowSeekingReasons().isEmpty();
        this.c.d(playerState.restrictions().disallowSkippingNextReasons().isEmpty());
        this.c.c(isEmpty);
        this.c.e(playerState.restrictions().disallowSeekingReasons().isEmpty());
        long currentPlaybackPosition = playerState.currentPlaybackPosition();
        long duration = playerState.playbackSpeed() == 0.0f ? currentPlaybackPosition : playerState.duration();
        this.c.a(playerState.duration());
        this.c.a(currentPlaybackPosition, duration, playerState.playbackSpeed());
    }
}
