package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: rzg reason: default package */
public final class rzg implements wig<rzf> {
    private final wzi<Context> a;
    private final wzi<Handler> b;

    private rzg(wzi<Context> wzi, wzi<Handler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rzg a(wzi<Context> wzi, wzi<Handler> wzi2) {
        return new rzg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rzf((Context) this.a.get(), (Handler) this.b.get());
    }
}
