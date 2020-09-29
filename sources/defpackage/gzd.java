package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import java.util.Set;

/* renamed from: gzd reason: default package */
public final class gzd {
    static PlayerRestrictions a(gzq gzq) {
        gzq gzq2 = gzq;
        if (gzq2 == null) {
            return null;
        }
        PlayerRestrictions playerRestrictions = new PlayerRestrictions(a(gzq2, "disallow_peeking_prev_reasons"), a(gzq2, "disallow_peeking_next_reasons"), a(gzq2, "disallow_skipping_prev_reasons"), a(gzq2, "disallow_skipping_next_reasons"), a(gzq2, "disallow_pausing_reasons"), a(gzq2, "disallow_resuming_reasons"), a(gzq2, "disallow_toggling_repeat_context_reasons"), a(gzq2, "disallow_toggling_repeat_track_reasons"), a(gzq2, "disallow_toggling_shuffle_reasons"), a(gzq2, "disallow_seeking_reasons"), a(gzq2, "disallow_transferring_playback_reasons"), a(gzq2, "disallow_remote_control_reasons"), a(gzq2, "disallow_inserting_into_next_tracks_reasons"), a(gzq2, "disallow_inserting_into_context_tracks_reasons"), a(gzq2, "disallow_reordering_in_next_tracks_reasons"), a(gzq2, "disallow_reordering_in_context_tracks_reasons"), a(gzq2, "disallow_removing_from_next_tracks_reasons"), a(gzq2, "disallow_removing_from_context_tracks_reasons"), a(gzq2, "disallow_updating_context_reasons"), a(gzq2, "disallow_set_queue_reasons"));
        return playerRestrictions;
    }

    private static Set<String> a(gzq gzq, String str) {
        String[] stringArray = gzq.stringArray(str);
        if (stringArray == null) {
            return null;
        }
        return ImmutableSet.a((E[]) stringArray);
    }

    public static String[] a(Set<String> set) {
        if (set == null) {
            return null;
        }
        return (String[]) set.toArray(new String[0]);
    }
}
