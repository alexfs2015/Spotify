package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: vbg reason: default package */
public final class vbg {
    public static boolean a(SessionState sessionState) {
        return sessionState.loggedIn() && !TextUtils.isEmpty(sessionState.currentUser()) && !TextUtils.isEmpty(sessionState.countryCode()) && !TextUtils.isEmpty(sessionState.productType());
    }
}
