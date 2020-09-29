package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: jrq reason: default package */
public final class jrq {
    public static Locale a(Context context) {
        return a(context.getResources().getConfiguration());
    }

    public static Locale a(Configuration configuration) {
        if (VERSION.SDK_INT >= 24) {
            return configuration.getLocales().get(0);
        }
        return configuration.locale;
    }
}
