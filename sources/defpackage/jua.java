package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: jua reason: default package */
public final class jua {
    public static Locale a(Context context) {
        return a(context.getResources().getConfiguration());
    }

    public static Locale a(Configuration configuration) {
        return VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
    }
}
