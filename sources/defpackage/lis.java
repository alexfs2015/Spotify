package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: lis reason: default package */
public final class lis implements vua<Set<vsm>> {
    private static final lis a = new lis();

    public static lis a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Set) vuf.a(ImmutableSet.h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
