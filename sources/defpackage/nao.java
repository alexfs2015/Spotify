package defpackage;

import com.jakewharton.rxrelay2.PublishRelay;

/* renamed from: nao reason: default package */
public final class nao implements vua<foa<Boolean>> {
    private static final nao a = new nao();

    public static nao a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (foa) vuf.a(PublishRelay.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
