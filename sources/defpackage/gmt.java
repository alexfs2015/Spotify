package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gmt reason: default package */
public final class gmt implements vua<Boolean> {
    private final wlc<PreSignupExperimentHelper> a;

    private gmt(wlc<PreSignupExperimentHelper> wlc) {
        this.a = wlc;
    }

    public static gmt a(wlc<PreSignupExperimentHelper> wlc) {
        return new gmt(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_MULTIPLE_VALUE_PROPOSITION));
    }
}
