package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ons reason: default package */
public final class ons implements vua<List<b>> {
    private static final ons a = new ons();

    public static ons a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (List) vuf.a(new ArrayList(1), "Cannot return null from a non-@Nullable @Provides method");
    }
}
