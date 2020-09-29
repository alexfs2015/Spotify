package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: lmr reason: default package */
public final class lmr implements wig<Set<wgs>> {
    private static final lmr a = new lmr();

    public static lmr a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Set) wil.a(ImmutableSet.h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
