package com.spotify.mobile.android.cosmos.player.v2;

import java.util.List;
import java.util.Set;

public interface Player {

    public interface ActionCallback {
        void onActionForbidden(List<String> list);

        void onActionSuccess();
    }

    public interface PlayerStateObserver {
        void onPlayerStateReceived(PlayerState playerState);
    }

    public interface PreparePlayCallback {
        void onPreparePlayFailed();

        void onPreparePlaySuccess(PlayerSession playerSession);
    }

    void fetchState(PlayerStateObserver playerStateObserver);

    void fetchState(PlayerStateObserver playerStateObserver, int i, int i2);

    String getFeatureIdentifier();

    PlayerState getLastPlayerState();

    String getViewUri();

    void pause();

    void pause(ActionCallback actionCallback);

    void play(PlayerContext playerContext, PlayOptions playOptions);

    void play(PlayerContext playerContext, PlayOptions playOptions, ActionCallback actionCallback);

    void play(PlayerContext playerContext, PlayOptions playOptions, Set<String> set, String str);

    void play(PlayerContext playerContext, PlayOptions playOptions, Set<String> set, String str, ActionCallback actionCallback);

    void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str);

    void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str, ActionCallback actionCallback);

    void preparePlay(PlayerContext playerContext, PlayOptions playOptions, PreparePlayCallback preparePlayCallback);

    void preparePlay(PlayerContext playerContext, PlayOptions playOptions, String str, PreparePlayCallback preparePlayCallback);

    void registerPlayerStateObserver(PlayerStateObserver playerStateObserver);

    void registerPlayerStateObserver(PlayerStateObserver playerStateObserver, int i, int i2);

    void resume();

    void resume(ActionCallback actionCallback);

    void seekTo(long j);

    void setRepeatingContext(boolean z);

    void setRepeatingTrack(boolean z);

    void setShufflingContext(boolean z);

    void skipToFutureTrack(PlayerTrack playerTrack, ActionCallback actionCallback);

    void skipToFutureTrack(PlayerTrack playerTrack, boolean z);

    void skipToNextTrack();

    void skipToNextTrack(ActionCallback actionCallback);

    void skipToNextTrack(boolean z);

    void skipToPastTrack(PlayerTrack playerTrack);

    void skipToPreviousTrack();

    void skipToPreviousTrack(ActionCallback actionCallback);

    void skipToPreviousTrackAndDisableSeeking();

    void skipToPreviousTrackAndDisableSeeking(ActionCallback actionCallback);

    void skipToPreviousTrackAndOverrideRestrictions();

    void unregisterPlayerStateObserver(PlayerStateObserver playerStateObserver);

    void updateWithContext(PlayerContext playerContext);

    void updateWithContext(PlayerContext playerContext, ActionCallback actionCallback);
}
