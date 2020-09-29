package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: goh reason: default package */
public final class goh implements wig<Boolean> {
    private final wzi<PreSignupExperimentHelper> a;

    private goh(wzi<PreSignupExperimentHelper> wzi) {
        this.a = wzi;
    }

    public static goh a(wzi<PreSignupExperimentHelper> wzi) {
        return new goh(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PreSignupExperimentHelper) this.a.get()).a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_LOGIN5));
    }
}
