package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;

/* renamed from: alz reason: default package */
public final class alz {

    /* renamed from: alz$a */
    public interface a {
        Bundle a();

        Bundle b();
    }

    public static boolean a(aly aly) {
        return b(aly).b != -1;
    }

    public static void a(alt alt, FacebookException facebookException) {
        if (facebookException != null) {
            amx.b(akc.g());
            Intent intent = new Intent();
            intent.setClass(akc.g(), FacebookActivity.class);
            intent.setAction(FacebookActivity.g);
            amr.a(intent, alt.a.toString(), (String) null, amr.a(), amr.a(facebookException));
            alt.b = intent;
        }
    }

    public static void a(alt alt, String str, Bundle bundle) {
        amx.b(akc.g());
        amx.a(akc.g());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        amr.a(intent, alt.a.toString(), str, amr.a(), bundle2);
        intent.setClass(akc.g(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        alt.b = intent;
    }

    public static void a(alt alt, a aVar, aly aly) {
        Bundle bundle;
        Context g = akc.g();
        String a2 = aly.a();
        f b = b(aly);
        int i = b.b;
        if (i != -1) {
            if (amr.a(i)) {
                bundle = aVar.a();
            } else {
                bundle = aVar.b();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intent a3 = amr.a(g, alt.a.toString(), a2, b, bundle);
            if (a3 != null) {
                alt.b = a3;
                return;
            }
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    private static f b(aly aly) {
        String k = akc.k();
        String a2 = aly.a();
        return amr.a(a2, a(k, a2, aly));
    }

    private static int[] a(String str, String str2, aly aly) {
        defpackage.amg.a a2 = amg.a(str, str2, aly.name());
        if (a2 != null) {
            return a2.d;
        }
        return new int[]{aly.b()};
    }
}
