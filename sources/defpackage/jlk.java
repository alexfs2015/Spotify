package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: jlk reason: default package */
public final class jlk {
    public static void a(jqx jqx, Intent intent, uqm uqm) {
        if (intent != null) {
            String str = "referer";
            if (intent.hasExtra(str)) {
                sso sso = (sso) intent.getParcelableExtra(str);
                Assertion.a((Object) sso, "Did you pass the referrer as a string by mistake?");
                Bundle bundle = new Bundle();
                bundle.putParcelable(str, sso);
                jlg.a(jqx, bundle);
            }
        }
        if (!jqx.equals(jqx.d) && !jqx.equals(jqx.c)) {
            a.a(jqx.ae(), (rta.w.equals(a.a(intent)) || uqm == null) ? gkm.a(jqx.ag()) : gkm.a(uqm));
        }
    }
}
