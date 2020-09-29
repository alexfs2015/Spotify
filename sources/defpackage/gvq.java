package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;

@Deprecated
/* renamed from: gvq reason: default package */
public final class gvq implements guo {
    private static final gzq a;
    private static final gzq b;
    private final FollowManager c;

    public gvq(FollowManager followManager) {
        this.c = followManager;
    }

    public final gzt decorate(gzt gzt) {
        gzq gzq;
        gzy target = gzt.target();
        if (target == null || !a(target)) {
            return gzt;
        }
        a a2 = this.c.a(target.uri());
        boolean z = a2 != null && a2.d;
        if (a(gzt) == z) {
            return gzt;
        }
        a builder = gzt.toBuilder();
        if (z) {
            gzq = a;
        } else {
            gzq = b;
        }
        return builder.f(gzq).a();
    }

    public static boolean a(gzt gzt) {
        return gzt.custom().boolValue("following", false);
    }

    public static boolean a(gzy gzy) {
        return gzy.actions().contains("toggle-follow");
    }

    static {
        String str = "following";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }
}
