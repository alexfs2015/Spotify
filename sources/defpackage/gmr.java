package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gmr reason: default package */
public final class gmr implements vua<Boolean> {
    private final wlc<PreSignupExperimentHelper> a;

    private gmr(wlc<PreSignupExperimentHelper> wlc) {
        this.a = wlc;
    }

    public static gmr a(wlc<PreSignupExperimentHelper> wlc) {
        return new gmr(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_LOGIN5_DARK_LOADING));
    }
}
