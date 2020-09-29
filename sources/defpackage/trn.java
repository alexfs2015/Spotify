package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: trn reason: default package */
public final class trn implements trf {
    private static ImmutableSet<String> a = ImmutableSet.a("spotify:playlist:37i9dQZF1DX85f92aUvhKM", "spotify:playlist:37i9dQZF1DWSeucCBlpRLm", "spotify:playlist:37i9dQZF1DX2GaemWUUQad", "spotify:playlist:37i9dQZF1DX0spmCBw8QK5", "spotify:playlist:37i9dQZF1DX6gA9DSQhFs3", "spotify:playlist:37i9dQZF1DWV6eas0o9JXU", "spotify:playlist:37i9dQZF1DWToorbm3mdzq", "spotify:playlist:37i9dQZF1DX6EKcTn3el8O", "spotify:playlist:37i9dQZF1DWYBZja50leWm", "spotify:playlist:37i9dQZF1DX7qyXF0kYnGy", "spotify:playlist:37i9dQZF1DWYh0j3CVjj3w", "spotify:playlist:37i9dQZF1DX5388Muv9Img");
    private final boolean b;

    public trn(Context context) {
        boolean z = true;
        if (!(((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) || jvi.c(context)) {
            z = false;
        }
        this(z);
    }

    private trn(boolean z) {
        this.b = z;
    }

    public final boolean a(fqn fqn, PlayerTrack playerTrack) {
        if (!this.b || !tre.a(fqn)) {
            return false;
        }
        return a.contains((String) playerTrack.metadata().get("context_uri"));
    }
}
