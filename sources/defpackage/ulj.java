package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ulj reason: default package */
public final class ulj implements vua<wud<Long>> {
    private static final ulj a = new ulj();

    public static ulj a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(wud.a(1500, TimeUnit.MILLISECONDS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
