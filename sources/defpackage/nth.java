package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.functions.BiFunction;
import java.util.List;

/* renamed from: nth reason: default package */
public final class nth implements BiFunction<oqg, SessionState, ntj> {
    private final HomeMixFormatListAttributesHelper a;
    private final fqn b;

    public nth(HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, fqn fqn) {
        this.a = homeMixFormatListAttributesHelper;
        this.b = fqn;
    }

    private static boolean a(List<HomeMixUser> list, String str) {
        boolean z = true;
        for (HomeMixUser homeMixUser : list) {
            if (!homeMixUser.getUsername().equals(str) && !homeMixUser.needsTasteOnboarding()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final ntj apply(oqg oqg, SessionState sessionState) {
        HomeMix homeMix = (HomeMix) fbp.a(this.a.a(oqg.a()));
        if (homeMix.isFamilyMember()) {
            if (homeMix.needsTasteOnboarding()) {
                if (nun.c(this.b)) {
                    return homeMix.isUserEnabled() ? new a() : new e();
                }
                DebugFlag debugFlag = DebugFlag.HOME_MIX_SHOW_TASTE_ONBOARDING_CTA_SHOW;
            }
            if (!homeMix.isUserEnabled()) {
                return oqg.o() ? new d() : new g();
            }
            if (homeMix.needsWelcome()) {
                if (nun.b(this.b)) {
                    return new j();
                }
                DebugFlag debugFlag2 = DebugFlag.HOME_MIX_WELCOME_SCREEN_SHOW;
            }
            if (homeMix.isAlone()) {
                return new i();
            }
            if (a(homeMix.users(), sessionState.currentUser())) {
                return new h();
            }
        }
        return oqg.o() ? new b() : new f();
    }
}
