package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

class StatefulPlayerPosition {
    private final jrp mClock;
    private long mPendingSeekPosition;
    private long mPendingSeekTimestamp;
    private final Player mPlayer;
    private PlayerState mPlayerState;

    public StatefulPlayerPosition(Player player) {
        this(player, jrf.a);
    }

    public StatefulPlayerPosition(Player player, jrp jrp) {
        this.mPendingSeekPosition = -1;
        this.mPlayer = player;
        this.mClock = jrp;
    }

    public void setPlayerState(PlayerState playerState) {
        if (!isSeekPending() || this.mPendingSeekTimestamp < playerState.timestamp()) {
            this.mPlayerState = playerState;
            this.mPendingSeekPosition = -1;
            this.mPendingSeekTimestamp = 0;
        }
    }

    public boolean isSeekPending() {
        return this.mPendingSeekPosition != -1;
    }

    public void seekTo(long j) {
        if (!isSeekingDisallowed()) {
            this.mPendingSeekPosition = j;
            this.mPendingSeekTimestamp = this.mClock.a();
            this.mPlayer.seekTo(j);
        }
    }

    public long currentPlaybackPosition(long j) {
        PlayerState playerState = this.mPlayerState;
        if (playerState == null || playerState.positionAsOfTimestamp() == -1 || this.mPlayerState.duration() == -1) {
            return -1;
        }
        long j2 = this.mPendingSeekPosition;
        if (j2 != -1) {
            return j2;
        }
        return this.mPlayerState.currentPlaybackPosition(j);
    }

    public long getDuration() {
        PlayerState playerState = this.mPlayerState;
        if (playerState == null) {
            return -1;
        }
        return playerState.duration();
    }

    public float getPlaybackSpeed() {
        PlayerState playerState = this.mPlayerState;
        if ((playerState == null || playerState.duration() == -1 || this.mPendingSeekPosition != -1) ? false : true) {
            return this.mPlayerState.playbackSpeed();
        }
        return 0.0f;
    }

    public boolean isSeekingDisallowed() {
        long duration = getDuration();
        if (duration == 0 || duration == -1 || !this.mPlayerState.restrictions().disallowSeekingReasons().isEmpty()) {
            return true;
        }
        return false;
    }
}
