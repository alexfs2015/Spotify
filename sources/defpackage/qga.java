package defpackage;

import io.reactivex.Flowable;

/* renamed from: qga reason: default package */
public final class qga implements wig<Flowable<sqj>> {
    private final wzi<String> a;
    private final wzi<String> b;

    private qga(wzi<String> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qga a(wzi<String> wzi, wzi<String> wzi2) {
        return new qga(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(Flowable.b(sqj.a((String) this.a.get(), (String) this.b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
