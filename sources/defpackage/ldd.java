package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: ldd reason: default package */
public interface ldd {

    /* renamed from: ldd$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean a(Context context, jvr jvr) {
            return jvr.a(context, "android.permission.RECORD_AUDIO");
        }

        public static boolean a(Resources resources) {
            return resources.getConfiguration().orientation == 1;
        }
    }
}
