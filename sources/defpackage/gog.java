package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gog reason: default package */
public final class gog implements wig<Boolean> {
    private final wzi<PreSignupExperimentHelper> a;

    private gog(wzi<PreSignupExperimentHelper> wzi) {
        this.a = wzi;
    }

    public static gog a(wzi<PreSignupExperimentHelper> wzi) {
        return new gog(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_LOGIN5_DARK_LOADING));
    }
}
