package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.BadgesFactory;

/* renamed from: pso reason: default package */
public final class pso {
    public final wzi<Activity> a;
    public final wzi<BadgesFactory> b;
    public final wzi<jyx> c;
    public final wzi<ppy> d;

    public pso(wzi<Activity> wzi, wzi<BadgesFactory> wzi2, wzi<jyx> wzi3, wzi<ppy> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
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
