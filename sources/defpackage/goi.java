package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: goi reason: default package */
public final class goi implements wig<Boolean> {
    private final wzi<PreSignupExperimentHelper> a;

    private goi(wzi<PreSignupExperimentHelper> wzi) {
        this.a = wzi;
    }

    public static goi a(wzi<PreSignupExperimentHelper> wzi) {
        return new goi(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_MULTIPLE_VALUE_PROPOSITION));
    }
}
