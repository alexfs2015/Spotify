package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tgv reason: default package */
public final class tgv implements tgn {
    private static ImmutableSet<String> a = ImmutableSet.a("spotify:playlist:37i9dQZF1DX4lrR2M7pz8g", "spotify:playlist:37i9dQZF1DXceoY2iR0gJi", "spotify:playlist:37i9dQZF1DWV14dFygn22S", "spotify:playlist:37i9dQZF1DX6UGlf3At34l", "spotify:playlist:37i9dQZF1DX2mwUndqWeZs", "spotify:playlist:37i9dQZF1DX6SembpOCuX3", "spotify:playlist:37i9dQZF1DXapxm4cjW9Al", "spotify:playlist:37i9dQZF1DWToorbm3mdzq", "spotify:playlist:37i9dQZF1DX6EKcTn3el8O", "spotify:playlist:37i9dQZF1DXbHCif87D7oA", "spotify:playlist:37i9dQZF1DXa3StZzcb8bV", "spotify:playlist:37i9dQZF1DX6xVxkvAtt29", "spotify:playlist:37i9dQZF1DX2WjPC67c6uL");
    private final boolean b;

    private tgv(boolean z) {
        this.b = z;
    }

    public final boolean a(fpt fpt, PlayerTrack playerTrack) {
        if (!this.b || !tgm.a(fpt)) {
            return false;
        }
        return a.contains((String) playerTrack.metadata().get("context_uri"));
    }

    public tgv(Context context) {
        boolean z = true;
        if (!(((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) || jtc.c(context)) {
            z = false;
        }
        this(z);
    }
}
