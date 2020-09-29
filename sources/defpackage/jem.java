package defpackage;

import com.spotify.remoteconfig.AndroidLibsShareProperties;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jem reason: default package */
public final class jem implements wig<List<jdz>> {
    private final wzi<Set<Entry<Integer, jdz>>> a;
    private final wzi<AndroidLibsShareProperties> b;

    public static List<jdz> a(Set<Entry<Integer, jdz>> set, AndroidLibsShareProperties androidLibsShareProperties) {
        return (List) wil.a(jed.a(set, androidLibsShareProperties), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get(), (AndroidLibsShareProperties) this.b.get());
    }
}
