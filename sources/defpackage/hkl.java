package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;

/* renamed from: hkl reason: default package */
public final class hkl implements vua<vkq> {
    private final wlc<PreSignupExperimentHelper> a;

    private hkl(wlc<PreSignupExperimentHelper> wlc) {
        this.a = wlc;
    }

    public static hkl a(wlc<PreSignupExperimentHelper> wlc) {
        return new hkl(wlc);
    }

    public static vkq a(PreSignupExperimentHelper preSignupExperimentHelper) {
        return (vkq) vuf.a(CC.a(preSignupExperimentHelper), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((PreSignupExperimentHelper) this.a.get());
    }
}
