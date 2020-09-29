package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;

/* renamed from: hnd reason: default package */
public final class hnd implements wig<vxw> {
    private final wzi<PreSignupExperimentHelper> a;

    private hnd(wzi<PreSignupExperimentHelper> wzi) {
        this.a = wzi;
    }

    public static hnd a(wzi<PreSignupExperimentHelper> wzi) {
        return new hnd(wzi);
    }

    public static vxw a(PreSignupExperimentHelper preSignupExperimentHelper) {
        return (vxw) wil.a(CC.a(preSignupExperimentHelper), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((PreSignupExperimentHelper) this.a.get());
    }
}
