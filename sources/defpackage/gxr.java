package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;

@Deprecated
/* renamed from: gxr reason: default package */
public final class gxr implements gwo {
    private static final hcj a;
    private static final hcj b;
    private final FollowManager c;

    static {
        String str = "following";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }

    public gxr(FollowManager followManager) {
        this.c = followManager;
    }

    public static boolean a(hcm hcm) {
        return hcm.custom().boolValue("following", false);
    }

    public static boolean a(hcr hcr) {
        return hcr.actions().contains("toggle-follow");
    }

    public final hcm decorate(hcm hcm) {
        hcr target = hcm.target();
        if (target == null || !a(target)) {
            return hcm;
        }
        a a2 = this.c.a(target.uri());
        boolean z = a2 != null && a2.d;
        if (a(hcm) == z) {
            return hcm;
        }
        return hcm.toBuilder().f(z ? a : b).a();
    }
}
