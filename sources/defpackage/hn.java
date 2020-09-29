package defpackage;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: hn reason: default package */
public final class hn {
    public static int a(Object... objArr) {
        return VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    public static boolean a(Object obj, Object obj2) {
        return VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
