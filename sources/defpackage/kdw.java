package defpackage;

import io.reactivex.functions.Consumer;

/* renamed from: kdw reason: default package */
public final class kdw implements vua<Consumer<kei>> {
    private final wlc<kej> a;

    public static Consumer<kei> a(kej kej) {
        return (Consumer) vuf.a(CC.a(kej), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((kej) this.a.get());
    }
}
