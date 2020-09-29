package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: ljs reason: default package */
public final class ljs implements vua<Random> {
    private static final ljs a = new ljs();

    public static ljs a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Random) vuf.a(new Random(new SecureRandom().nextLong()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
