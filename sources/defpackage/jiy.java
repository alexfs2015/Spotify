package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: jiy reason: default package */
public final class jiy {
    public static void a(jol jol, Intent intent, udr udr) {
        gjb gjb;
        if (intent != null) {
            String str = "referer";
            if (intent.hasExtra(str)) {
                sih sih = (sih) intent.getParcelableExtra(str);
                Assertion.a((Object) sih, "Did you pass the referrer as a string by mistake?");
                Bundle bundle = new Bundle();
                bundle.putParcelable(str, sih);
                jiu.a(jol, bundle);
            }
        }
        if (!jol.equals(jol.d) && !jol.equals(jol.c)) {
            if (rju.w.equals(a.a(intent)) || udr == null) {
                gjb = gjb.a(jol.ag());
            } else {
                gjb = gjb.a(udr);
            }
            a.a(jol.ae(), gjb);
        }
    }
}
