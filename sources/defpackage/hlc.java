package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: hlc reason: default package */
public final class hlc implements vkq {
    private final PreSignupExperimentHelper a;

    public hlc(PreSignupExperimentHelper preSignupExperimentHelper) {
        this.a = preSignupExperimentHelper;
    }

    public final boolean a() {
        return this.a.a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_REMOTE_PASSWORD_VALIDATION_DISABLED);
    }
}
