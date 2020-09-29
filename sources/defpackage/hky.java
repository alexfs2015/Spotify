package defpackage;

import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.cosmos.session.model.LoginOptions.Builder;
import com.spotify.cosmos.session.model.LoginOptions.PreAuthenticationSetting;
import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: hky reason: default package */
final class hky {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    hky(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    /* access modifiers changed from: 0000 */
    public final LoginOptions a() {
        Builder builder = LoginOptions.builder();
        if (this.a) {
            builder.preAuthenticationSetting(PreAuthenticationSetting.REQUIRESUCCESS);
            builder.bootstrapRequired(Boolean.TRUE);
        }
        DebugFlag debugFlag = DebugFlag.LOGIN5_PERFORM_BUT_IGNORE_RESULT;
        if (this.b) {
            builder.preAuthenticationSetting(PreAuthenticationSetting.PERFORMBUTIGNORE);
        }
        DebugFlag debugFlag2 = DebugFlag.LOGIN5_REQUIRE_SUCCESS;
        if (this.c) {
            builder.preAuthenticationSetting(PreAuthenticationSetting.REQUIRESUCCESS);
        }
        if (!this.d) {
            DebugFlag debugFlag3 = DebugFlag.BOOTSTRAP_REQUIRE_SUCCESS;
        } else {
            builder.bootstrapRequired(Boolean.TRUE);
        }
        return builder.build();
    }
}
