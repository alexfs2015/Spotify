package defpackage;

import android.os.Bundle;
import com.facebook.LoggingBehavior;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amu reason: default package */
public final class amu {
    public static final Collection<String> a = amw.a((T[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});
    public static final Collection<String> b = amw.a((T[]) new String[]{"access_denied", "OAuthAccessDeniedException"});
    private static final String c = amu.class.getName();

    public static final String d() {
        return "v3.3";
    }

    public static final String a() {
        return String.format("m.%s", new Object[]{akc.f()});
    }

    public static final String b() {
        return String.format("https://graph.%s", new Object[]{akc.f()});
    }

    public static final String c() {
        return String.format("https://graph-video.%s", new Object[]{akc.f()});
    }

    public static Bundle a(String str, int i, Bundle bundle) {
        String c2 = akc.c(akc.g());
        if (amw.a(c2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("android_key_hash", c2);
        bundle2.putString("app_id", akc.k());
        bundle2.putInt("version", i);
        bundle2.putString("display", "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", str);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            JSONObject a2 = alw.a(bundle3);
            JSONObject a3 = alw.a(bundle);
            bundle2.putString("bridge_args", a2.toString());
            bundle2.putString("method_args", a3.toString());
        } catch (JSONException e) {
            LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
            String str2 = c;
            StringBuilder sb = new StringBuilder("Error creating Url -- ");
            sb.append(e);
            amp.a(loggingBehavior, 6, str2, sb.toString());
            bundle2 = null;
        }
        return bundle2;
    }
}
