package defpackage;

import android.os.Bundle;
import com.facebook.LoggingBehavior;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ani reason: default package */
public final class ani {
    public static final Collection<String> a = ank.a((T[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});
    public static final Collection<String> b = ank.a((T[]) new String[]{"access_denied", "OAuthAccessDeniedException"});
    private static final String c = ani.class.getName();

    public static Bundle a(String str, int i, Bundle bundle) {
        String c2 = akq.c(akq.g());
        if (ank.a(c2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("android_key_hash", c2);
        bundle2.putString("app_id", akq.k());
        bundle2.putInt("version", i);
        bundle2.putString("display", "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", str);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            JSONObject a2 = amk.a(bundle3);
            JSONObject a3 = amk.a(bundle);
            bundle2.putString("bridge_args", a2.toString());
            bundle2.putString("method_args", a3.toString());
        } catch (JSONException e) {
            LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
            String str2 = c;
            StringBuilder sb = new StringBuilder("Error creating Url -- ");
            sb.append(e);
            and.a(loggingBehavior, 6, str2, sb.toString());
            bundle2 = null;
        }
        return bundle2;
    }

    public static final String a() {
        return String.format("m.%s", new Object[]{akq.f()});
    }

    public static final String b() {
        return String.format("https://graph.%s", new Object[]{akq.f()});
    }

    public static final String c() {
        return String.format("http://=", new Object[]{akq.f()});
    }

    public static final String d() {
        return "v3.3";
    }
}
