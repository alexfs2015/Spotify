package defpackage;

import android.view.View.OnLongClickListener;

/* renamed from: two reason: default package */
public final class two implements wig<twn> {
    private final wzi<twr> a;
    private final wzi<OnLongClickListener> b;
    private final wzi<twy> c;

    private two(wzi<twr> wzi, wzi<OnLongClickListener> wzi2, wzi<twy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static two a(wzi<twr> wzi, wzi<OnLongClickListener> wzi2, wzi<twy> wzi3) {
        return new two(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new twn((twr) this.a.get(), (OnLongClickListener) this.b.get(), (twy) this.c.get());
    }
}
