package defpackage;

import android.app.Activity;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.music.moderation.ModerationReportActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: sod reason: default package */
public final class sod implements ruz {
    private final Activity a;
    private final PlayerStateCompat b;

    public sod(Activity activity, PlayerStateCompat playerStateCompat) {
        this.a = (Activity) fay.a(activity);
        this.b = (PlayerStateCompat) fay.a(playerStateCompat);
    }

    public final void a(sih sih, String str, List<String> list) {
        Activity activity = this.a;
        ArrayList a2 = Lists.a();
        a2.add(str);
        a2.addAll(list);
        activity.startActivity(ModerationReportActivity.a(activity, soj.c().a(sih).a((List<String>) a2).a()));
    }

    public final void a(sih sih, String str) {
        String str2 = str;
        Activity activity = this.a;
        PlayerStateCompat playerStateCompat = this.b;
        a a2 = soj.c().a(sih);
        ArrayList a3 = Lists.a();
        PlayerState mostRecentPlayerState = playerStateCompat.getMostRecentPlayerState();
        if (mostRecentPlayerState != null) {
            PlayerTrack track = mostRecentPlayerState.track();
            boolean z = true;
            if (track != null && track.uri().equals(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                long currentPlaybackPosition = mostRecentPlayerState.currentPlaybackPosition();
                String format = String.format(Locale.US, "%02d:%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(currentPlaybackPosition)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(currentPlaybackPosition) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(currentPlaybackPosition) % TimeUnit.MINUTES.toSeconds(1))});
                StringBuilder sb2 = new StringBuilder("#");
                sb2.append(format);
                sb.append(sb2.toString());
                a3.add(sb.toString());
                PlayerTrack track2 = mostRecentPlayerState.track();
                if (track2 == null || track2.metadata().get("canvas.type") == null) {
                    z = false;
                }
                if (z) {
                    PlayerTrack track3 = mostRecentPlayerState.track();
                    a3.add(track3 != null ? (String) track3.metadata().get("canvas.canvasUri") : "");
                }
                activity.startActivity(ModerationReportActivity.a(activity, a2.a((List<String>) a3).a()));
            }
        }
        a3.add(str2);
        activity.startActivity(ModerationReportActivity.a(activity, a2.a((List<String>) a3).a()));
    }
}
