package defpackage;

import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.cosmos.session.model.LoginOptions.Builder;
import com.spotify.cosmos.session.model.LoginOptions.PreAuthenticationSetting;
import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: hib reason: default package */
final class hib implements wzi<LoginOptions> {
    private final boolean a;

    hib(boolean z) {
        this.a = z;
    }

    public final /* synthetic */ Object get() {
        Builder builder = LoginOptions.builder();
        if (this.a) {
            builder.preAuthenticationSetting(PreAuthenticationSetting.PERFORMBUTIGNORE);
        }
        DebugFlag debugFlag = DebugFlag.LOGIN5_AUTOLOGIN_PERFORM_BUT_IGNORE_RESULT;
        DebugFlag debugFlag2 = DebugFlag.LOGIN5_AUTOLOGIN_REQUIRE_SUCCESS;
        return builder.build();
    }
}
