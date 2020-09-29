package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: lns reason: default package */
public final class lns implements wig<Random> {
    private static final lns a = new lns();

    public static lns a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Random) wil.a(new Random(new SecureRandom().nextLong()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
