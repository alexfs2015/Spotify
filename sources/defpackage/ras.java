package defpackage;

import android.app.Activity;

/* renamed from: ras reason: default package */
public final class ras {
    public final wzi<Activity> a;

    public ras(wzi<Activity> wzi) {
        this.a = (wzi) a(wzi, 1);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
