package defpackage;

import com.google.common.collect.ImmutableSet;

/* renamed from: kxm reason: default package */
public final class kxm {
    public static ImmutableSet<String> a(kxn kxn) {
        String str = (String) kxn.b().get("scopes");
        return str != null ? ImmutableSet.a(fbr.a(",").a().a((CharSequence) str)) : ImmutableSet.h();
    }
}
