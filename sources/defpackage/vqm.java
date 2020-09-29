package defpackage;

import java.util.UUID;

/* renamed from: vqm reason: default package */
public final class vqm implements vua<String> {
    private static final vqm a = new vqm();

    public static vqm a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(UUID.randomUUID().toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
