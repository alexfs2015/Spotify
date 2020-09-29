package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: gok reason: default package */
public final class gok implements wig<Integer> {
    private final wzi<PreSignupExperimentHelper> a;

    private gok(wzi<PreSignupExperimentHelper> wzi) {
        this.a = wzi;
    }

    public static gok a(wzi<PreSignupExperimentHelper> wzi) {
        return new gok(wzi);
    }

    public final /* synthetic */ Object get() {
        PreSignupExperimentFlags a2 = ((PreSignupExperimentHelper) this.a.get()).a();
        int i = a2.isEnabled(PreSignupExperimentFlags.FLAG_MULTIPLE_VALUE_PROPS_VARIANT_1) ? 1 : a2.isEnabled(PreSignupExperimentFlags.FLAG_MULTIPLE_VALUE_PROPS_VARIANT_2) ? 2 : a2.isEnabled(PreSignupExperimentFlags.FLAG_MULTIPLE_VALUE_PROPS_VARIANT_3) ? 3 : -1;
        return Integer.valueOf(i);
    }
}
