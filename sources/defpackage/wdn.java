package defpackage;

import java.util.UUID;

/* renamed from: wdn reason: default package */
public final class wdn implements wig<String> {
    private static final wdn a = new wdn();

    public static wdn a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(UUID.randomUUID().toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
