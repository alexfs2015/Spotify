package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.mobile.android.video.model.PlayerError;
import java.util.GregorianCalendar;
import java.util.List;

/* renamed from: kzh reason: default package */
public final class kzh {
    static final b<Object, Long> c = b.b("capped_ondemand:has_seen_ondemand_Last_time_initiate_dialog");
    static final b<Object, Integer> d = b.b("capped_ondemand:initial_dialog_count");
    static final b<Object, Long> e = b.b("capped_ondemand:has_seen_cap_reached_dialog_last_time");
    static final b<Object, Integer> f = b.b("capped_ondemand:cap_reached_dialog_count");
    final SpSharedPreferences<Object> a;
    final jtz b;

    public kzh(SpSharedPreferences<Object> spSharedPreferences, jtz jtz) {
        this.a = (SpSharedPreferences) fbp.a(spSharedPreferences);
        this.b = (jtz) fbp.a(jtz);
    }

    public static hci a(hcs hcs) {
        if (hcs == null) {
            return null;
        }
        return a(hcs.body());
    }

    private static hci a(List<? extends hcm> list) {
        for (hcm hcm : list) {
            hci hci = (hci) hcm.events().get("click");
            if (hci != null) {
                if ("playFromContext".equals(hci.name())) {
                    return hci;
                }
            }
            if (!hcm.children().isEmpty()) {
                hci a2 = a(hcm.children());
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public static hci a(PlayerTrack[] playerTrackArr, String str, String str2) {
        PlayerContext create = PlayerContext.create(str2, playerTrackArr, PlayerRestrictions.empty(), ImmutableMap.b("context_description", str));
        hcj hcj = null;
        PlayOptions build = new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build();
        a builder = HubsImmutableComponentBundle.builder();
        a a2 = HubsImmutableComponentBundle.builder().a("context", hbr.a(create));
        if (build != null) {
            String str3 = "allow_seeking";
            a a3 = HubsImmutableComponentBundle.builder().a("initially_paused", build.initiallyPaused()).a(str3, build.allowSeeking());
            Long seekTo = build.seekTo();
            if (seekTo != null) {
                a3 = a3.a("seek_to", seekTo.longValue());
            }
            PlayOptionsSkipTo skipTo = build.skipTo();
            if (skipTo != null) {
                String str4 = "page_index";
                String str5 = "track_uid";
                a3 = a3.a("skip_to", HubsImmutableComponentBundle.builder().a("page_url", skipTo.pageUrl()).a(str4, (long) skipTo.pageIndex()).a(str5, skipTo.trackUid()).a(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, skipTo.trackUri()).a("track_index", (long) skipTo.trackIndex()));
            }
            PlayerOptionsOverrides playerOptionsOverride = build.playerOptionsOverride();
            if (playerOptionsOverride != null) {
                a builder2 = HubsImmutableComponentBundle.builder();
                Boolean shufflingContext = playerOptionsOverride.shufflingContext();
                if (shufflingContext != null) {
                    builder2 = builder2.a("shuffling_context", shufflingContext.booleanValue());
                }
                Boolean repeatingContext = playerOptionsOverride.repeatingContext();
                if (repeatingContext != null) {
                    builder2 = builder2.a("repeating_context", repeatingContext.booleanValue());
                }
                Boolean repeatingTrack = playerOptionsOverride.repeatingTrack();
                if (repeatingTrack != null) {
                    builder2 = builder2.a("repeating_track", repeatingTrack.booleanValue());
                }
                a3 = a3.a("player_options_override", builder2);
            }
            PlayerSuppressions suppressions = build.suppressions();
            if (suppressions != null) {
                String str6 = "providers";
                a3 = a3.a("suppressions", HubsImmutableComponentBundle.builder().a(str6, (String[]) suppressions.providers().toArray(new String[0])));
            }
            hcj = a3.a();
        }
        return hct.builder().b(builder.a("player", a2.a("options", hcj).a()).a()).a();
    }

    static boolean a(long j, long j2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar2.setTimeInMillis(j2);
        return gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(2) == gregorianCalendar2.get(2) && gregorianCalendar.get(5) == gregorianCalendar2.get(5);
    }
}
