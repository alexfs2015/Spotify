package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;

/* renamed from: goe reason: default package */
public interface goe {

    /* renamed from: goe$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean a(PreSignupExperimentHelper preSignupExperimentHelper) {
            return preSignupExperimentHelper.a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_MULTIPLE_VALUE_AUTO_SCROLL);
        }

        public static boolean b(PreSignupExperimentHelper preSignupExperimentHelper) {
            return preSignupExperimentHelper.a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_SAMSUNG_LOGIN);
        }
    }
}
