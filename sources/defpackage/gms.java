package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gms reason: default package */
public final class gms implements vua<Boolean> {
    private final wlc<PreSignupExperimentHelper> a;

    private gms(wlc<PreSignupExperimentHelper> wlc) {
        this.a = wlc;
    }

    public static gms a(wlc<PreSignupExperimentHelper> wlc) {
        return new gms(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_LOGIN5));
    }
}
