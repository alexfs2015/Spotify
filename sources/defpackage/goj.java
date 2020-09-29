package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.PreSignupExperimentHelper.LocalValuePropVariant;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: goj reason: default package */
public final class goj implements wig<LocalValuePropVariant> {
    private final wzi<PreSignupExperimentHelper> a;

    private goj(wzi<PreSignupExperimentHelper> wzi) {
        this.a = wzi;
    }

    public static goj a(wzi<PreSignupExperimentHelper> wzi) {
        return new goj(wzi);
    }

    public final /* synthetic */ Object get() {
        PreSignupExperimentFlags a2 = ((PreSignupExperimentHelper) this.a.get()).a();
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_DE)) {
            return LocalValuePropVariant.DE;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_BR)) {
            return LocalValuePropVariant.BR;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_JP)) {
            return LocalValuePropVariant.JP;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_PH)) {
            return LocalValuePropVariant.PH;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_ID)) {
            return LocalValuePropVariant.ID;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_TH)) {
            return LocalValuePropVariant.TH;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_VN)) {
            return LocalValuePropVariant.VN;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_TW)) {
            return LocalValuePropVariant.TW;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_HK)) {
            return LocalValuePropVariant.HK;
        }
        if (a2.isEnabled(PreSignupExperimentFlags.FLAG_LOCAL_VALUE_PROP_CONTROL)) {
            return LocalValuePropVariant.CONTROL;
        }
        return null;
    }
}
