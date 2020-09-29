package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;

/* renamed from: amn reason: default package */
public final class amn {

    /* renamed from: amn$a */
    public interface a {
        Bundle a();

        Bundle b();
    }

    public static void a(amh amh, a aVar, amm amm) {
        Context g = akq.g();
        String a2 = amm.a();
        f b = b(amm);
        int i = b.b;
        if (i != -1) {
            Bundle a3 = anf.a(i) ? aVar.a() : aVar.b();
            if (a3 == null) {
                a3 = new Bundle();
            }
            Intent a4 = anf.a(g, amh.a.toString(), a2, b, a3);
            if (a4 != null) {
                amh.b = a4;
                return;
            }
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    public static void a(amh amh, FacebookException facebookException) {
        if (facebookException != null) {
            anl.b(akq.g());
            Intent intent = new Intent();
            intent.setClass(akq.g(), FacebookActivity.class);
            intent.setAction(FacebookActivity.g);
            anf.a(intent, amh.a.toString(), (String) null, anf.a(), anf.a(facebookException));
            amh.b = intent;
        }
    }

    public static void a(amh amh, String str, Bundle bundle) {
        anl.b(akq.g());
        anl.a(akq.g());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        anf.a(intent, amh.a.toString(), str, anf.a(), bundle2);
        intent.setClass(akq.g(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        amh.b = intent;
    }

    public static boolean a(amm amm) {
        return b(amm).b != -1;
    }

    private static int[] a(String str, String str2, amm amm) {
        defpackage.amu.a a2 = amu.a(str, str2, amm.name());
        if (a2 != null) {
            return a2.d;
        }
        return new int[]{amm.b()};
    }

    private static f b(amm amm) {
        String k = akq.k();
        String a2 = amm.a();
        return anf.a(a2, a(k, a2, amm));
    }
}
