package com.spotify.mobile.android.cosmos.player.v2.stateful;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class StatefulPlayer implements Player {
    private static final int INCORRECT_STATE_RETRY_GRACE_PERIOD = 200;
    private static final long SKIP_TO_PREVIOUS_THRESHOLD = TimeUnit.SECONDS.toMillis(3);
    private jtz mClock = jtp.a;
    private Handler mHandler;
    private boolean mIsPaused;
    private final ActionCallback mNoOpCallback = new ActionCallback() {
        public void onActionForbidden(List<String> list) {
        }

        public void onActionSuccess() {
        }
    };
    private final Set<PlayerStateObserver> mObservers = new LinkedHashSet();
    private final Player mPlayer;
    private StatefulPlayerPosition mPlayerPosition;
    private StatefulPlayerQueue mPlayerQueue;
    /* access modifiers changed from: private */
    public PlayerState mPlayerState;
    private final PlayerStateObserver mPlayerStateObserver = new PlayerStateObserver() {
        public void onPlayerStateReceived(PlayerState playerState) {
            String str = " esatyare vesfsrUaatnO rlditbpeltrmSyme egpaPor";
            Logger.b("Updating player state from mPlayerStateObserver", new Object[0]);
            StatefulPlayer.this.updatePlayerState(playerState, StateOrigin.REMOTE);
        }
    };
    private boolean mRepeatContext;
    private boolean mRepeatTrack;
    private Runnable mRetryRunnable;
    private boolean mShuffleContext;

    enum StateOrigin {
        LOCAL,
        REMOTE
    }

    public StatefulPlayer(Player player) {
        this.mPlayer = (Player) fbp.a(player);
        this.mPlayerPosition = new StatefulPlayerPosition(this.mPlayer);
        this.mPlayerQueue = new StatefulPlayerQueue();
        this.mHandler = new Handler();
    }

    private Set<String> generateDisallowPausingReasons(PlayerRestrictions playerRestrictions) {
        HashSet hashSet = new HashSet(playerRestrictions.disallowPausingReasons());
        String str = "eesaad_adrlups";
        String str2 = "already_paused";
        if (this.mIsPaused) {
            hashSet.add(str2);
        } else {
            hashSet.remove(str2);
        }
        return hashSet;
    }

    private Set<String> generateDisallowResumingReasons(PlayerRestrictions playerRestrictions) {
        HashSet hashSet = new HashSet(playerRestrictions.disallowResumingReasons());
        String str = "u_smtoadne";
        String str2 = "not_paused";
        if (this.mIsPaused) {
            hashSet.remove(str2);
        } else {
            hashSet.add(str2);
        }
        return hashSet;
    }

    private PlayerRestrictions generateRestrictions(PlayerRestrictions playerRestrictions) {
        PlayerRestrictions playerRestrictions2 = r0;
        PlayerRestrictions playerRestrictions3 = new PlayerRestrictions(playerRestrictions.disallowPeekingPrevReasons(), playerRestrictions.disallowPeekingNextReasons(), playerRestrictions.disallowSkippingPrevReasons(), playerRestrictions.disallowSkippingNextReasons(), generateDisallowPausingReasons(playerRestrictions), generateDisallowResumingReasons(playerRestrictions), playerRestrictions.disallowTogglingRepeatContextReasons(), playerRestrictions.disallowTogglingRepeatTrackReasons(), playerRestrictions.disallowTogglingShuffleReasons(), playerRestrictions.disallowSeekingReasons(), playerRestrictions.disallowTransferringPlaybackReasons(), playerRestrictions.disallowRemoteControlReasons(), playerRestrictions.disallowInsertingIntoNextTracksReasons(), playerRestrictions.disallowInsertingIntoContextTracksReasons(), playerRestrictions.disallowReorderingInNextTracksReasons(), playerRestrictions.disallowReorderingInContextTracksReasons(), playerRestrictions.disallowRemovingFromNextTracksReasons(), playerRestrictions.disallowRemovingFromContextTracksReasons(), playerRestrictions.disallowUpdatingContextReasons(), playerRestrictions.disallowSetQueueReasons());
        return playerRestrictions3;
    }

    private void scheduleRetry(final PlayerState playerState, final StateOrigin stateOrigin) {
        this.mRetryRunnable = new Runnable() {
            public void run() {
                StatefulPlayer.this.updatePlayerState(playerState, stateOrigin, true);
            }
        };
        this.mHandler.postDelayed(this.mRetryRunnable, 200);
    }

    /* access modifiers changed from: private */
    public void updatePlayerState(PlayerState playerState, StateOrigin stateOrigin) {
        updatePlayerState(playerState, stateOrigin, false);
    }

    /* access modifiers changed from: private */
    public void updatePlayerState(PlayerState playerState, StateOrigin stateOrigin, boolean z) {
        PlayerState playerState2 = playerState;
        PlayerState playerState3 = playerState;
        boolean z2 = z;
        boolean z3 = z;
        if (playerState3 != null) {
            long a = this.mClock.a();
            StateOrigin stateOrigin2 = stateOrigin;
            if (stateOrigin == StateOrigin.REMOTE) {
                this.mIsPaused = playerState.isPaused();
                this.mRepeatTrack = playerState.options().repeatingTrack();
                this.mRepeatContext = playerState.options().repeatingContext();
                this.mShuffleContext = playerState.options().shufflingContext();
                this.mPlayerPosition.setPlayerState(playerState3);
                this.mPlayerQueue.setPlayerState(playerState3, z3);
            }
            boolean isInSync = this.mPlayerQueue.isInSync();
            this.mHandler.removeCallbacks(this.mRetryRunnable);
            if (isInSync || z3) {
                boolean isSeekPending = this.mPlayerPosition.isSeekPending();
                long j = -1;
                long currentPlaybackPosition = isInSync ? this.mPlayerPosition.currentPlaybackPosition(a) : -1;
                if (isInSync) {
                    j = this.mPlayerPosition.getDuration();
                }
                PlayerState playerState4 = r4;
                PlayerState playerState5 = new PlayerState(a, playerState.entityUri(), playerState.playOrigin(), this.mPlayerQueue.getTrack(), this.mPlayerQueue.getPlaybackId(), this.mPlayerQueue.getIndex(), (!isInSync || isSeekPending || this.mIsPaused) ? 0.0f : this.mPlayerPosition.getPlaybackSpeed(), currentPlaybackPosition, j, playerState.isPlaying(), this.mIsPaused, PlayerOptions.create(this.mShuffleContext, this.mRepeatContext, this.mRepeatTrack), generateRestrictions(playerState.restrictions()), playerState.suppressions(), this.mPlayerQueue.getFuture(), this.mPlayerQueue.getReverse(), playerState.contextMetadata(), playerState.pageMetadata(), playerState.audioStream());
                this.mPlayerState = playerState5;
                this.mPlayerState.setClock(this.mClock);
                notifyObservers();
                return;
            }
            scheduleRetry(playerState, stateOrigin);
        }
    }

    public void fetchState(final PlayerStateObserver playerStateObserver) {
        this.mPlayer.fetchState(new PlayerStateObserver() {
            public void onPlayerStateReceived(PlayerState playerState) {
                String str = "eese pdpfirttalyragto smSanftc ht at)(U";
                Logger.b("Updating player state from fetchState()", new Object[0]);
                StatefulPlayer.this.updatePlayerState(playerState, StateOrigin.REMOTE);
                playerStateObserver.onPlayerStateReceived(StatefulPlayer.this.mPlayerState);
            }
        });
    }

    public void fetchState(PlayerStateObserver playerStateObserver, int i, int i2) {
        String str = "hfncol!tpotpecietdaniitam S t we y u sltn lalepieecfrhetipeax mst";
        throw new UnsupportedOperationException("fetchState with explicit caps not implemented in stateful player!");
    }

    public PlayerState getLastPlayerState() {
        return this.mPlayerState;
    }

    public String getViewUri() {
        return this.mPlayer.getViewUri();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public final void notifyObservers() {
        int i;
        PlayerStateObserver[] playerStateObserverArr;
        synchronized (this.mObservers) {
            try {
                playerStateObserverArr = (PlayerStateObserver[]) this.mObservers.toArray(new PlayerStateObserver[0]);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        for (PlayerStateObserver onPlayerStateReceived : playerStateObserverArr) {
            onPlayerStateReceived.onPlayerStateReceived(this.mPlayerState);
        }
    }

    public void pause() {
        pause(this.mNoOpCallback);
    }

    public void pause(ActionCallback actionCallback) {
        this.mIsPaused = true;
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
        this.mPlayer.pause(actionCallback);
    }

    public void play(PlayerContext playerContext, PlayOptions playOptions) {
        this.mPlayer.play(playerContext, playOptions);
    }

    public void play(PlayerContext playerContext, PlayOptions playOptions, ActionCallback actionCallback) {
        this.mPlayer.play(playerContext, playOptions, actionCallback);
    }

    public void play(PlayerContext playerContext, PlayOptions playOptions, Set<String> set, String str) {
        this.mPlayer.play(playerContext, playOptions, set, str);
    }

    public void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str) {
        this.mPlayer.playWithViewUri(playerContext, playOptions, str);
    }

    public void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str, ActionCallback actionCallback) {
        this.mPlayer.playWithViewUri(playerContext, playOptions, str, actionCallback);
    }

    public void preparePlay(PlayerContext playerContext, PlayOptions playOptions, PreparePlayCallback preparePlayCallback) {
        this.mPlayer.preparePlay(playerContext, playOptions, preparePlayCallback);
    }

    public void registerPlayerStateObserver(PlayerStateObserver playerStateObserver) {
        synchronized (this.mObservers) {
            try {
                if (!this.mObservers.contains(playerStateObserver)) {
                    this.mObservers.add(playerStateObserver);
                    if (this.mObservers.size() == 1) {
                        this.mPlayer.registerPlayerStateObserver(this.mPlayerStateObserver);
                    }
                }
            } finally {
            }
        }
    }

    public void registerPlayerStateObserver(PlayerStateObserver playerStateObserver, int i, int i2) {
        registerPlayerStateObserver(playerStateObserver);
    }

    public void resume() {
        resume(this.mNoOpCallback);
    }

    public void resume(ActionCallback actionCallback) {
        this.mIsPaused = false;
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
        this.mPlayer.resume(actionCallback);
    }

    public void seekTo(long j) {
        this.mPlayerPosition.seekTo(j);
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
    }

    /* access modifiers changed from: 0000 */
    public void setClock(jtz jtz) {
        this.mClock = jtz;
    }

    /* access modifiers changed from: 0000 */
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    /* access modifiers changed from: 0000 */
    public void setPlayerPosition(StatefulPlayerPosition statefulPlayerPosition) {
        this.mPlayerPosition = statefulPlayerPosition;
    }

    /* access modifiers changed from: 0000 */
    public void setPlayerQueue(StatefulPlayerQueue statefulPlayerQueue) {
        this.mPlayerQueue = statefulPlayerQueue;
    }

    public void setRepeatingContext(boolean z) {
        this.mRepeatContext = z;
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
        this.mPlayer.setRepeatingContext(z);
    }

    public void setRepeatingTrack(boolean z) {
        this.mRepeatTrack = z;
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
        this.mPlayer.setRepeatingTrack(z);
    }

    public void setShufflingContext(boolean z) {
        this.mShuffleContext = z;
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
        this.mPlayer.setShufflingContext(z);
    }

    public void skipToFutureTrack(PlayerTrack playerTrack, ActionCallback actionCallback) {
        String str = "mineebtnem paeao!tPylluidr ftneSt ";
        throw new UnsupportedOperationException("not implemented in StatefulPlayer!");
    }

    public void skipToNextTrack() {
        skipToNextTrack((ActionCallback) null);
    }

    public void skipToNextTrack(ActionCallback actionCallback) {
        Logger.b("⏩ Skipping to next track", new Object[0]);
        this.mPlayerQueue.skipToNextTrack();
        this.mPlayer.skipToNextTrack(actionCallback);
        String str = "itpdaybx Nn etoeU)Toekr itatm g(larssfp";
        Logger.b("Updating player state from skipToNext()", new Object[0]);
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
    }

    public void skipToNextTrack(boolean z) {
        this.mPlayer.skipToNextTrack(z);
    }

    public void skipToPastTrack(PlayerTrack playerTrack) {
        String str = "fnSe!ett  ilnimrotteely aauPpnteld";
        throw new UnsupportedOperationException("not implemented in StatefulPlayer!");
    }

    public void skipToPreviousTrack() {
        skipToPreviousTrack(null);
    }

    public void skipToPreviousTrack(ActionCallback actionCallback) {
        if (this.mPlayerState.currentPlaybackPosition() < SKIP_TO_PREVIOUS_THRESHOLD) {
            this.mPlayerQueue.skipToPreviousTrack();
        }
        this.mPlayer.skipToPreviousTrack(actionCallback);
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
    }

    public void skipToPreviousTrackAndDisableSeeking() {
        skipToPreviousTrackAndDisableSeeking(null);
    }

    public void skipToPreviousTrackAndDisableSeeking(ActionCallback actionCallback) {
        this.mPlayerQueue.skipToPreviousTrack();
        this.mPlayer.skipToPreviousTrackAndDisableSeeking(actionCallback);
        updatePlayerState(this.mPlayerState, StateOrigin.LOCAL);
    }

    /* JADX INFO: finally extract failed */
    public void unregisterPlayerStateObserver(PlayerStateObserver playerStateObserver) {
        synchronized (this.mObservers) {
            try {
                if (this.mObservers.remove(playerStateObserver) && this.mObservers.isEmpty()) {
                    this.mPlayer.unregisterPlayerStateObserver(this.mPlayerStateObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateWithContext(PlayerContext playerContext) {
        this.mPlayer.updateWithContext(playerContext);
    }

    public void updateWithContext(PlayerContext playerContext, ActionCallback actionCallback) {
        this.mPlayer.updateWithContext(playerContext, actionCallback);
    }
}
