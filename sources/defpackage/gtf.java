package defpackage;

import android.app.Service;
import android.content.Context;

/* renamed from: gtf reason: default package */
public final class gtf implements wig<gtb> {
    private final wzi<Context> a;
    private final wzi<Class<? extends Service>> b;
    private final wzi<a> c;
    private final wzi<hjw> d;

    private gtf(wzi<Context> wzi, wzi<Class<? extends Service>> wzi2, wzi<a> wzi3, wzi<hjw> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static gtf a(wzi<Context> wzi, wzi<Class<? extends Service>> wzi2, wzi<a> wzi3, wzi<hjw> wzi4) {
        return new gtf(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new gtb((Context) this.a.get(), (Class) this.b.get(), (a) this.c.get(), (hjw) this.d.get());
    }
}
