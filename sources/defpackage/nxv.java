package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.features.nowplayingbar.domain.model.Track;

/* renamed from: nxv reason: default package */
public final class nxv {
    public static nxp a(PlayerState playerState) {
        Optional optional;
        Optional optional2;
        PlayerTrack track = playerState.track();
        if (track == null || PlayerStateUtil.isInLoadingState(playerState) || PlayerTrackUtil.hasIncompleteMetadata(track)) {
            return new a();
        }
        String contextUri = playerState.contextUri();
        PlayerTrack[] reverse = playerState.reverse();
        if (reverse.length > 0) {
            optional = Optional.b(nxr.a(reverse[reverse.length - 1]));
        } else {
            optional = Optional.e();
        }
        Track a = nxr.a(track);
        PlayerTrack[] future = playerState.future();
        if (future.length > 0) {
            optional2 = Optional.b(nxr.a(future[0]));
        } else {
            optional2 = Optional.e();
        }
        nxm nxm = new nxm(optional, a, optional2);
        nxo a2 = nxo.e().a(!playerState.isPaused()).a(playerState.duration()).b(playerState.currentPlaybackPosition()).a(playerState.playbackSpeed()).a();
        PlayerRestrictions restrictions = playerState.restrictions();
        return new b(contextUri, nxm, a2, nxq.h().a(!restrictions.disallowResumingReasons().isEmpty()).b(!restrictions.disallowPausingReasons().isEmpty()).c(!restrictions.disallowSkippingNextReasons().isEmpty()).d(!restrictions.disallowSkippingPrevReasons().isEmpty()).e(!restrictions.disallowPeekingNextReasons().isEmpty()).f(!restrictions.disallowPeekingPrevReasons().isEmpty()).g(!restrictions.disallowTransferringPlaybackReasons().isEmpty()).a());
    }
}
