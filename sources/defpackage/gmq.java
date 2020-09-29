package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gmq reason: default package */
public final class gmq implements vua<Boolean> {
    private final wlc<PreSignupExperimentHelper> a;

    private gmq(wlc<PreSignupExperimentHelper> wlc) {
        this.a = wlc;
    }

    public static gmq a(wlc<PreSignupExperimentHelper> wlc) {
        return new gmq(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_BOOTSTRAP));
    }
}
