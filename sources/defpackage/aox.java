package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aox reason: default package */
public final class aox {
    public static Bundle a(apb apb) {
        Bundle bundle = new Bundle();
        apc apc = apb.m;
        if (apc != null) {
            ank.a(bundle, "hashtag", apc.a);
        }
        return bundle;
    }

    public static Bundle a(apd apd) {
        Bundle a = a((apb) apd);
        ank.a(a, "href", apd.h);
        ank.a(a, "quote", apd.d);
        return a;
    }

    public static Bundle a(apk apk) {
        Bundle a = a((apb) apk);
        ank.a(a, "action_type", apk.a.b("og:type"));
        try {
            JSONObject a2 = aow.a(aow.a(apk), false);
            if (a2 != null) {
                ank.a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }
}
