package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: ukz reason: default package */
public final class ukz {
    public static final b<Object, Boolean> a = b.b("voice_onboarding_completed_2");
    private static b<Object, Boolean> b = b.b("voice_mic_tooltip_1");

    public static boolean a(SpSharedPreferences<Object> spSharedPreferences) {
        boolean a2 = spSharedPreferences.a(b, false);
        if (!a2) {
            spSharedPreferences.a().a(b, true).b();
        }
        return !a2 && !spSharedPreferences.a(a, false);
    }

    public static boolean a(Context context, Boolean bool, SessionState sessionState) {
        SpSharedPreferences a2 = ((jvy) ggw.a(jvy.class)).a(context, sessionState.currentUserName());
        if (bool == null) {
            return a2.a(a, false);
        }
        a2.a().a(a, bool.booleanValue()).b();
        return bool.booleanValue();
    }
}
