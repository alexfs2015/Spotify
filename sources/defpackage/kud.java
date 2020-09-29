package defpackage;

import com.google.common.collect.ImmutableSet;

/* renamed from: kud reason: default package */
public final class kud {
    public static ImmutableSet<String> a(kue kue) {
        String str = (String) kue.b().get("scopes");
        if (str != null) {
            return ImmutableSet.a(fba.a(",").a().a((CharSequence) str));
        }
        return ImmutableSet.h();
    }
}
