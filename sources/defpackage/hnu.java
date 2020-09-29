package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: hnu reason: default package */
public final class hnu implements vxw {
    private final PreSignupExperimentHelper a;

    public hnu(PreSignupExperimentHelper preSignupExperimentHelper) {
        this.a = preSignupExperimentHelper;
    }

    public final boolean a() {
        return this.a.a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_REMOTE_PASSWORD_VALIDATION_DISABLED);
    }
}
