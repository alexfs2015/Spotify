package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.player.model.ContextTrack;

/* renamed from: vif reason: default package */
public final class vif {
    public static boolean a(ContextTrack contextTrack) {
        return Boolean.valueOf((String) contextTrack.metadata().get("is_advertisement")).booleanValue();
    }

    public static boolean b(ContextTrack contextTrack) {
        return contextTrack.uri().startsWith(InterruptionUtil.INTERRUPTION_PREFIX) && c(contextTrack);
    }

    private static boolean c(ContextTrack contextTrack) {
        return !fbo.a((String) contextTrack.metadata().get("ad_id"));
    }
}
