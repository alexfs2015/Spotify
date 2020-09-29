package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aok reason: default package */
public final class aok {
    private static Bundle a(apb apb, boolean z) {
        Bundle bundle = new Bundle();
        ank.a(bundle, "com.facebook.platform.extra.LINK", apb.h);
        ank.a(bundle, "com.facebook.platform.extra.PLACE", apb.j);
        ank.a(bundle, "com.facebook.platform.extra.REF", apb.l);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = apb.i;
        if (!ank.a((Collection<T>) list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(list));
        }
        return bundle;
    }

    public static Bundle a(UUID uuid, apb apb, boolean z) {
        anl.a((Object) apb, "shareContent");
        anl.a((Object) uuid, "callId");
        if (apb instanceof apd) {
            apd apd = (apd) apb;
            Bundle a = a(apd, z);
            ank.a(a, "com.facebook.platform.extra.TITLE", apd.b);
            ank.a(a, "com.facebook.platform.extra.DESCRIPTION", apd.a);
            ank.a(a, "com.facebook.platform.extra.IMAGE", apd.c);
            return a;
        } else if (apb instanceof apo) {
            apo apo = (apo) apb;
            List a2 = aow.a(apo, uuid);
            Bundle a3 = a(apo, z);
            a3.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(a2));
            return a3;
        } else if ((apb instanceof apr) || !(apb instanceof apk)) {
            return null;
        } else {
            apk apk = (apk) apb;
            try {
                JSONObject a4 = aow.a(uuid, apk);
                Bundle a5 = a(apk, z);
                ank.a(a5, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", apk.b);
                ank.a(a5, "com.facebook.platform.extra.ACTION_TYPE", apk.a.b("og:type"));
                ank.a(a5, "com.facebook.platform.extra.ACTION", a4.toString());
                return a5;
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                sb.append(e.getMessage());
                throw new FacebookException(sb.toString());
            }
        }
    }
}
