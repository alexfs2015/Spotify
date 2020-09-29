package defpackage;

import com.spotify.remoteconfig.AndroidLibsShareProperties;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jca reason: default package */
public final class jca implements vua<List<jbn>> {
    private final wlc<Set<Entry<Integer, jbn>>> a;
    private final wlc<AndroidLibsShareProperties> b;

    public static List<jbn> a(Set<Entry<Integer, jbn>> set, AndroidLibsShareProperties androidLibsShareProperties) {
        return (List) vuf.a(jbr.a(set, androidLibsShareProperties), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get(), (AndroidLibsShareProperties) this.b.get());
    }
}
