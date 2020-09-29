package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aoj reason: default package */
public final class aoj {
    public static Bundle a(aop aop) {
        Bundle a = a((aon) aop);
        amw.a(a, "href", aop.h);
        amw.a(a, "quote", aop.d);
        return a;
    }

    public static Bundle a(aow aow) {
        Bundle a = a((aon) aow);
        amw.a(a, "action_type", aow.a.b("og:type"));
        try {
            JSONObject a2 = aoi.a(aoi.a(aow), false);
            if (a2 != null) {
                amw.a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }

    public static Bundle a(aon aon) {
        Bundle bundle = new Bundle();
        aoo aoo = aon.m;
        if (aoo != null) {
            amw.a(bundle, "hashtag", aoo.a);
        }
        return bundle;
    }
}
