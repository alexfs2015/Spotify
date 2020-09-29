package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gmv reason: default package */
public final class gmv implements vua<Integer> {
    private final wlc<PreSignupExperimentHelper> a;

    private gmv(wlc<PreSignupExperimentHelper> wlc) {
        this.a = wlc;
    }

    public static gmv a(wlc<PreSignupExperimentHelper> wlc) {
        return new gmv(wlc);
    }

    public final /* synthetic */ Object get() {
        PreSignupExperimentFlags a2 = ((PreSignupExperimentHelper) this.a.get()).a();
        int i = a2.isEnabled(PreSignupExperimentFlags.FLAG_MULTIPLE_VALUE_PROPS_VARIANT_1) ? 1 : a2.isEnabled(PreSignupExperimentFlags.FLAG_MULTIPLE_VALUE_PROPS_VARIANT_2) ? 2 : a2.isEnabled(PreSignupExperimentFlags.FLAG_MULTIPLE_VALUE_PROPS_VARIANT_3) ? 3 : -1;
        return Integer.valueOf(i);
    }
}
