package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.functions.BiFunction;
import java.util.List;

/* renamed from: nng reason: default package */
public final class nng implements BiFunction<ojc, SessionState, nni> {
    private final HomeMixFormatListAttributesHelper a;
    private final fpt b;

    public nng(HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, fpt fpt) {
        this.a = homeMixFormatListAttributesHelper;
        this.b = fpt;
    }

    /* renamed from: a */
    public final nni apply(ojc ojc, SessionState sessionState) {
        HomeMix homeMix = (HomeMix) fay.a(this.a.a(ojc.a()));
        if (homeMix.isFamilyMember()) {
            if (homeMix.needsTasteOnboarding()) {
                if (!nom.c(this.b)) {
                    DebugFlag debugFlag = DebugFlag.HOME_MIX_SHOW_TASTE_ONBOARDING_CTA_SHOW;
                } else if (homeMix.isUserEnabled()) {
                    return new a();
                } else {
                    return new e();
                }
            }
            if (homeMix.isUserEnabled()) {
                if (homeMix.needsWelcome()) {
                    if (nom.b(this.b)) {
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
            } else if (ojc.o()) {
                return new d();
            } else {
                return new g();
            }
        }
        return ojc.o() ? new b() : new f();
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
}
