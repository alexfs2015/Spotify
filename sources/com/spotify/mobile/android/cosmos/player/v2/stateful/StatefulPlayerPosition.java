package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

class StatefulPlayerPosition {
    private final jtz mClock;
    private long mPendingSeekPosition;
    private long mPendingSeekTimestamp;
    private final Player mPlayer;
    private PlayerState mPlayerState;

    public StatefulPlayerPosition(Player player) {
        this(player, jtp.a);
    }

    public StatefulPlayerPosition(Player player, jtz jtz) {
        this.mPendingSeekPosition = -1;
        this.mPlayer = player;
        this.mClock = jtz;
    }

    public long currentPlaybackPosition(long j) {
        PlayerState playerState = this.mPlayerState;
        if (!(playerState == null || playerState.positionAsOfTimestamp() == -1)) {
            if (this.mPlayerState.duration() != -1) {
                long j2 = this.mPendingSeekPosition;
                return j2 != -1 ? j2 : this.mPlayerState.currentPlaybackPosition(j);
            }
        }
        return -1;
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

    public boolean isSeekPending() {
        return this.mPendingSeekPosition != -1;
    }

    public boolean isSeekingDisallowed() {
        long duration = getDuration();
        if (duration != 0) {
            if (duration != -1) {
                return !this.mPlayerState.restrictions().disallowSeekingReasons().isEmpty();
            }
        }
        return true;
    }

    public void seekTo(long j) {
        if (!isSeekingDisallowed()) {
            this.mPendingSeekPosition = j;
            this.mPendingSeekTimestamp = this.mClock.a();
            this.mPlayer.seekTo(j);
        }
    }

    public void setPlayerState(PlayerState playerState) {
        if (!isSeekPending() || this.mPendingSeekTimestamp < playerState.timestamp()) {
            this.mPlayerState = playerState;
            this.mPendingSeekPosition = -1;
            this.mPendingSeekTimestamp = 0;
        }
    }
}
