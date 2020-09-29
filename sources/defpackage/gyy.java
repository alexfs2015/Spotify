package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gyy reason: default package */
public final class gyy {
    public static PlayerContext a(gzq gzq) {
        gzq bundle = gzq.bundle("player");
        if (bundle != null) {
            return gza.a(bundle.bundle("context"));
        }
        return null;
    }

    public static PlayOptions b(gzq gzq) {
        gzq bundle = gzq.bundle("player");
        if (bundle != null) {
            return gyz.a(bundle.bundle("options"));
        }
        return null;
    }

    public static gzq a(PlayerContext playerContext) {
        gzq gzq = null;
        if (playerContext == null) {
            return null;
        }
        String str = "url";
        String str2 = "metadata";
        a a = HubsImmutableComponentBundle.builder().a("uri", playerContext.uri()).a(str, playerContext.url()).a(str2, gzc.a(playerContext.metadata()));
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
            gzq = HubsImmutableComponentBundle.builder().a("disallow_peeking_prev_reasons", gzd.a(restrictions.disallowPeekingPrevReasons())).a(str3, gzd.a(restrictions.disallowPeekingNextReasons())).a(str4, gzd.a(restrictions.disallowSkippingPrevReasons())).a(str5, gzd.a(restrictions.disallowSkippingNextReasons())).a(str6, gzd.a(restrictions.disallowPausingReasons())).a(str7, gzd.a(restrictions.disallowResumingReasons())).a(str8, gzd.a(restrictions.disallowTogglingRepeatContextReasons())).a(str9, gzd.a(restrictions.disallowTogglingRepeatTrackReasons())).a(str10, gzd.a(restrictions.disallowTogglingShuffleReasons())).a(str11, gzd.a(restrictions.disallowSeekingReasons())).a(str12, gzd.a(restrictions.disallowTransferringPlaybackReasons())).a(str13, gzd.a(restrictions.disallowRemoteControlReasons())).a(str14, gzd.a(restrictions.disallowInsertingIntoNextTracksReasons())).a(str15, gzd.a(restrictions.disallowInsertingIntoContextTracksReasons())).a(str16, gzd.a(restrictions.disallowReorderingInNextTracksReasons())).a(str17, gzd.a(restrictions.disallowReorderingInContextTracksReasons())).a(str18, gzd.a(restrictions.disallowRemovingFromNextTracksReasons())).a(str19, gzd.a(restrictions.disallowRemovingFromContextTracksReasons())).a(str20, gzd.a(restrictions.disallowUpdatingContextReasons())).a(str21, gzd.a(restrictions.disallowSetQueueReasons())).a();
        }
        return a.a("restrictions", gzq).a("pages", gzb.a(playerContext.pages())).a("fallback_pages", gzb.a(playerContext.fallbackPages())).a();
    }
}
