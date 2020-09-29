package defpackage;

import android.content.Context;

/* renamed from: uhj reason: default package */
public final class uhj implements wig<uhi> {
    private final wzi<Context> a;

    private uhj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static uhj a(wzi<Context> wzi) {
        return new uhj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uhi((Context) this.a.get());
    }
}
