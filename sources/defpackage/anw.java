package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anw reason: default package */
public final class anw {
    public static Bundle a(UUID uuid, aon aon, boolean z) {
        amx.a((Object) aon, "shareContent");
        amx.a((Object) uuid, "callId");
        if (aon instanceof aop) {
            aop aop = (aop) aon;
            Bundle a = a(aop, z);
            amw.a(a, "com.facebook.platform.extra.TITLE", aop.b);
            amw.a(a, "com.facebook.platform.extra.DESCRIPTION", aop.a);
            amw.a(a, "com.facebook.platform.extra.IMAGE", aop.c);
            return a;
        } else if (aon instanceof apa) {
            apa apa = (apa) aon;
            List a2 = aoi.a(apa, uuid);
            Bundle a3 = a(apa, z);
            a3.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(a2));
            return a3;
        } else if ((aon instanceof apd) || !(aon instanceof aow)) {
            return null;
        } else {
            aow aow = (aow) aon;
            try {
                JSONObject a4 = aoi.a(uuid, aow);
                Bundle a5 = a(aow, z);
                amw.a(a5, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", aow.b);
                amw.a(a5, "com.facebook.platform.extra.ACTION_TYPE", aow.a.b("og:type"));
                amw.a(a5, "com.facebook.platform.extra.ACTION", a4.toString());
                return a5;
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                sb.append(e.getMessage());
                throw new FacebookException(sb.toString());
            }
        }
    }

    private static Bundle a(aon aon, boolean z) {
        Bundle bundle = new Bundle();
        amw.a(bundle, "com.facebook.platform.extra.LINK", aon.h);
        amw.a(bundle, "com.facebook.platform.extra.PLACE", aon.j);
        amw.a(bundle, "com.facebook.platform.extra.REF", aon.l);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = aon.i;
        if (!amw.a((Collection<T>) list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(list));
        }
        return bundle;
    }
}
