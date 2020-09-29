package defpackage;

import android.view.Window;

/* renamed from: tlo reason: default package */
public final class tlo implements wig<tln> {
    private final wzi<Window> a;

    private tlo(wzi<Window> wzi) {
        this.a = wzi;
    }

    public static tlo a(wzi<Window> wzi) {
        return new tlo(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tln((Window) this.a.get());
    }
}
