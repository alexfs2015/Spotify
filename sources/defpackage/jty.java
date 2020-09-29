package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.net.Uri;
import com.google.common.hash.Hashing;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;

/* renamed from: jty reason: default package */
public interface jty {

    /* renamed from: jty$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String $default$a(jty jty, Context context) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (packageInfo.signatures != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Signature byteArray : packageInfo.signatures) {
                        arrayList.add(Hashing.d().a(byteArray.toByteArray()).toString());
                    }
                    return fbl.a(':').a(arrayList.toArray());
                }
            } catch (NameNotFoundException e) {
                Logger.c(e, "Failed to get the application signatures", new Object[0]);
            }
            return "";
        }

        public static String $default$a(jty jty, String str) {
            return fbh.a((CharSequence) "0123456789.").f(str);
        }

        public static String $default$b(jty jty) {
            return jty.a(jty.a());
        }
    }

    String a();

    String a(Context context);

    String a(String str);

    String b();

    String c();

    String d();

    String e();

    String f();

    boolean g();

    Uri h();
}
