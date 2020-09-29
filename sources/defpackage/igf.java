package defpackage;

import android.os.Handler;

/* renamed from: igf reason: default package */
public final class igf implements vua<Handler> {
    private static final igf a = new igf();

    public static igf a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) vuf.a(new Handler(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
