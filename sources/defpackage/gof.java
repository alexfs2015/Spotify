package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gof reason: default package */
public final class gof implements wig<Boolean> {
    private final wzi<PreSignupExperimentHelper> a;

    private gof(wzi<PreSignupExperimentHelper> wzi) {
        this.a = wzi;
    }

    public static gof a(wzi<PreSignupExperimentHelper> wzi) {
        return new gof(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_BOOTSTRAP));
    }
}
