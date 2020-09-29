package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: lgr reason: default package */
public interface lgr {

    /* renamed from: lgr$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean a(Context context, jxz jxz) {
            return jxz.a(context, "android.permission.RECORD_AUDIO");
        }

        public static boolean a(Resources resources) {
            return resources.getConfiguration().orientation == 1;
        }
    }
}
