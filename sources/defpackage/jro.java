package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.net.Uri;
import com.google.common.hash.Hashing;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;

/* renamed from: jro reason: default package */
public interface jro {

    /* renamed from: jro$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String $default$b(jro _this) {
            return _this.a(_this.a());
        }

        public static String $default$a(jro _this, Context context) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (packageInfo.signatures != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Signature byteArray : packageInfo.signatures) {
                        arrayList.add(Hashing.d().a(byteArray.toByteArray()).toString());
                    }
                    return fau.a(':').a(arrayList.toArray());
                }
            } catch (NameNotFoundException e) {
                Logger.c(e, "Failed to get the application signatures", new Object[0]);
            }
            return "";
        }

        public static String $default$a(jro _this, String str) {
            return faq.a((CharSequence) "0123456789.").f(str);
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
