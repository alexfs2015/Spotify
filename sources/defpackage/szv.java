package defpackage;

import android.content.Context;
import com.spotify.music.navigation.SimpleNavigationManager;

/* renamed from: szv reason: default package */
public final class szv implements wig<SimpleNavigationManager> {
    private final wzi<Context> a;
    private final wzi<szt> b;
    private final wzi<kk> c;
    private final wzi<szu> d;
    private final wzi<Integer> e;

    private szv(wzi<Context> wzi, wzi<szt> wzi2, wzi<kk> wzi3, wzi<szu> wzi4, wzi<Integer> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static szv a(wzi<Context> wzi, wzi<szt> wzi2, wzi<kk> wzi3, wzi<szu> wzi4, wzi<Integer> wzi5) {
        szv szv = new szv(wzi, wzi2, wzi3, wzi4, wzi5);
        return szv;
    }

    public final /* synthetic */ Object get() {
        SimpleNavigationManager simpleNavigationManager = new SimpleNavigationManager((Context) this.a.get(), (szt) this.b.get(), (kk) this.c.get(), (szu) this.d.get(), ((Integer) this.e.get()).intValue());
        return simpleNavigationManager;
    }
}
