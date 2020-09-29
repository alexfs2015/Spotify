package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

class StatefulPlayerQueue {
    private static final long TRACK_CHANGE_GRACE_PERIOD_MILLISECONDS = 500;
    private final jtz mClock;
    private PlayerContextIndex mIndex;
    private PlayerTrack[] mOffsetFuture;
    private PlayerTrack[] mOffsetReverse;
    private PlayerTrack mOffsetTrack;
    private String mPlaybackId;
    private int mPosition;
    private int mPositionOffset;
    private long mPositionOffsetTimestamp;
    private PlayerTrack[] mQueue;

    public StatefulPlayerQueue() {
        this(jtp.a);
    }

    public StatefulPlayerQueue(jtz jtz) {
        this.mQueue = new PlayerTrack[1];
        this.mPositionOffsetTimestamp = -1;
        this.mClock = jtz;
    }

    private static PlayerTrack[] buildQueue(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        PlayerTrack[] playerTrackArr3 = new PlayerTrack[(playerTrackArr.length + 1 + playerTrackArr2.length)];
        System.arraycopy(playerTrackArr, 0, playerTrackArr3, 0, playerTrackArr.length);
        playerTrackArr3[playerTrackArr.length] = playerTrack;
        for (int i = 0; i < playerTrackArr2.length; i++) {
            playerTrackArr3[playerTrackArr.length + 1 + i] = playerTrackArr2[i];
        }
        return playerTrackArr3;
    }

    private boolean isInjectedTrack(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return true;
        }
        String provider = playerTrack.provider();
        String str = "xcsetnt";
        if (!"context".equals(provider)) {
            String str2 = "uqume";
            if (!"queue".equals(provider)) {
                return true;
            }
        }
        return false;
    }

    private void updateReverseAndFuture() {
        int i = this.mPosition + this.mPositionOffset;
        fbp.b(i, this.mQueue.length, "index");
        boolean z = (!true) & false;
        boolean z2 = this.mQueue[this.mPosition] != null;
        int max = Math.max(0, (this.mQueue.length - i) - 1);
        this.mOffsetReverse = new PlayerTrack[i];
        System.arraycopy(this.mQueue, 0, this.mOffsetReverse, 0, i);
        this.mOffsetTrack = z2 ? this.mQueue[i] : null;
        this.mOffsetFuture = new PlayerTrack[max];
        for (int i2 = 0; i2 < max; i2++) {
            this.mOffsetFuture[i2] = this.mQueue[i + 1 + i2];
        }
    }

    public PlayerTrack[] getFuture() {
        return this.mOffsetFuture;
    }

    public PlayerContextIndex getIndex() {
        if (isInSync()) {
            return this.mIndex;
        }
        return null;
    }

    public String getPlaybackId() {
        if (isInSync()) {
            return this.mPlaybackId;
        }
        return null;
    }

    public PlayerTrack[] getReverse() {
        return this.mOffsetReverse;
    }

    public PlayerTrack getTrack() {
        return this.mOffsetTrack;
    }

    public boolean isInSync() {
        return this.mPositionOffsetTimestamp == -1;
    }

    public void setPlayerState(PlayerState playerState, boolean z) {
        String str;
        String str2 = "aungorke tcsOrqaueiil";
        jwy.a("Original queue tracks", playerState.reverse(), playerState.track(), playerState.future());
        int i = 6 << 0;
        String str3 = "iotfnbfO sieP=t% dom";
        Logger.b("mPositionOffset = %d", Integer.valueOf(this.mPositionOffset));
        String str4 = "ootsdTbi%t nmiseOmfPai= spfmt";
        Logger.b("mPositionOffsetTimestamp = %d", Long.valueOf(this.mPositionOffsetTimestamp));
        String str5 = "ttpemast et(=)t sd.%ma";
        Logger.b("state.timestamp() = %d", Long.valueOf(playerState.timestamp()));
        Logger.b("mOffsetTrack = %s", jwy.a(this.mOffsetTrack));
        if (!isInSync()) {
            if (playerState.timestamp() < this.mPositionOffsetTimestamp) {
                String str6 = "or_d g,epnci0/n0utc/0l0ia.su gtaaO";
                Logger.b("ಠ_ಠ Old state, ignoring.", new Object[0]);
                return;
            }
            PlayerTrack track = playerState.track();
            PlayerTrack playerTrack = this.mOffsetTrack;
            String uri = playerTrack != null ? playerTrack.uri() : null;
            if (track != null) {
                str = track.uri();
            } else {
                String str7 = "";
                str = "";
            }
            boolean isInjectedTrack = isInjectedTrack(playerState.track());
            if (!z && uri != null && !uri.equals(str) && playerState.timestamp() < this.mPositionOffsetTimestamp + TRACK_CHANGE_GRACE_PERIOD_MILLISECONDS && !isInjectedTrack) {
                Logger.b("ಠ_ಠ Wrong expected track, ignoring.", new Object[0]);
                return;
            }
        }
        this.mQueue = buildQueue(playerState.reverse(), playerState.track(), playerState.future());
        this.mPosition = playerState.reverse().length;
        this.mPositionOffset = 0;
        this.mPositionOffsetTimestamp = -1;
        this.mPlaybackId = playerState.playbackId();
        this.mIndex = playerState.index();
        updateReverseAndFuture();
    }

    public void skipToNextTrack() {
        int i = this.mPosition;
        int i2 = this.mPositionOffset;
        if (i + i2 + 1 < this.mQueue.length) {
            this.mPositionOffset = i2 + 1;
            this.mPositionOffsetTimestamp = this.mClock.a();
            updateReverseAndFuture();
        }
    }

    public void skipToPreviousTrack() {
        int i = this.mPosition;
        int i2 = this.mPositionOffset;
        if (i + i2 > 0) {
            this.mPositionOffset = i2 - 1;
            this.mPositionOffsetTimestamp = this.mClock.a();
            updateReverseAndFuture();
        }
    }
}
