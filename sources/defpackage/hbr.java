package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: hbr reason: default package */
public final class hbr {
    public static PlayerContext a(hcj hcj) {
        hcj bundle = hcj.bundle("player");
        if (bundle != null) {
            return hbt.a(bundle.bundle("context"));
        }
        return null;
    }

    public static hcj a(PlayerContext playerContext) {
        hcj hcj = null;
        if (playerContext == null) {
            return null;
        }
        String str = "url";
        String str2 = "metadata";
        a a = HubsImmutableComponentBundle.builder().a("uri", playerContext.uri()).a(str, playerContext.url()).a(str2, hbv.a(playerContext.metadata()));
        PlayerRestrictions restrictions = playerContext.restrictions();
        if (restrictions != null) {
            String str3 = "disallow_peeking_next_reasons";
            String str4 = "disallow_skipping_prev_reasons";
            String str5 = "disallow_skipping_next_reasons";
            String str6 = "disallow_pausing_reasons";
            String str7 = "disallow_resuming_reasons";
            String str8 = "disallow_toggling_repeat_context_reasons";
            String str9 = "disallow_toggling_repeat_track_reasons";
            String str10 = "disallow_toggling_shuffle_reasons";
            String str11 = "disallow_seeking_reasons";
            String str12 = "disallow_transferring_playback_reasons";
            String str13 = "disallow_remote_control_reasons";
            String str14 = "disallow_inserting_into_next_tracks_reasons";
            String str15 = "disallow_inserting_into_context_tracks_reasons";
            String str16 = "disallow_reordering_in_next_tracks_reasons";
            String str17 = "disallow_reordering_in_context_tracks_reasons";
            String str18 = "disallow_removing_from_next_tracks_reasons";
            String str19 = "disallow_removing_from_context_tracks_reasons";
            String str20 = "disallow_updating_context_reasons";
            String str21 = "disallow_set_queue_reasons";
            hcj = HubsImmutableComponentBundle.builder().a("disallow_peeking_prev_reasons", hbw.a(restrictions.disallowPeekingPrevReasons())).a(str3, hbw.a(restrictions.disallowPeekingNextReasons())).a(str4, hbw.a(restrictions.disallowSkippingPrevReasons())).a(str5, hbw.a(restrictions.disallowSkippingNextReasons())).a(str6, hbw.a(restrictions.disallowPausingReasons())).a(str7, hbw.a(restrictions.disallowResumingReasons())).a(str8, hbw.a(restrictions.disallowTogglingRepeatContextReasons())).a(str9, hbw.a(restrictions.disallowTogglingRepeatTrackReasons())).a(str10, hbw.a(restrictions.disallowTogglingShuffleReasons())).a(str11, hbw.a(restrictions.disallowSeekingReasons())).a(str12, hbw.a(restrictions.disallowTransferringPlaybackReasons())).a(str13, hbw.a(restrictions.disallowRemoteControlReasons())).a(str14, hbw.a(restrictions.disallowInsertingIntoNextTracksReasons())).a(str15, hbw.a(restrictions.disallowInsertingIntoContextTracksReasons())).a(str16, hbw.a(restrictions.disallowReorderingInNextTracksReasons())).a(str17, hbw.a(restrictions.disallowReorderingInContextTracksReasons())).a(str18, hbw.a(restrictions.disallowRemovingFromNextTracksReasons())).a(str19, hbw.a(restrictions.disallowRemovingFromContextTracksReasons())).a(str20, hbw.a(restrictions.disallowUpdatingContextReasons())).a(str21, hbw.a(restrictions.disallowSetQueueReasons())).a();
        }
        return a.a("restrictions", hcj).a("pages", hbu.a(playerContext.pages())).a("fallback_pages", hbu.a(playerContext.fallbackPages())).a();
    }

    public static PlayOptions b(hcj hcj) {
        hcj bundle = hcj.bundle("player");
        if (bundle != null) {
            return hbs.a(bundle.bundle("options"));
        }
        return null;
    }
}
