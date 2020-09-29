package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ouy reason: default package */
public final class ouy implements wig<List<b>> {
    private static final ouy a = new ouy();

    public static ouy a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (List) wil.a(new ArrayList(1), "Cannot return null from a non-@Nullable @Provides method");
    }
}
