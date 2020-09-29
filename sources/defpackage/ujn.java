package defpackage;

import android.content.Context;

/* renamed from: ujn reason: default package */
public final class ujn implements wig<a> {
    private final wzi<Context> a;

    private ujn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ujn a(wzi<Context> wzi) {
        return new ujn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (a) wil.a(new bck((Context) this.a.get(), "previewplayer"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
