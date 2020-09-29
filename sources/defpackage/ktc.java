package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import io.reactivex.Flowable;

/* renamed from: ktc reason: default package */
public final class ktc implements wig<ktb> {
    private final wzi<Flowable<ShortcutInfo>> a;
    private final wzi<ShortcutManager> b;
    private final wzi<Integer> c;

    private ktc(wzi<Flowable<ShortcutInfo>> wzi, wzi<ShortcutManager> wzi2, wzi<Integer> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ktc a(wzi<Flowable<ShortcutInfo>> wzi, wzi<ShortcutManager> wzi2, wzi<Integer> wzi3) {
        return new ktc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ktb((Flowable) this.a.get(), (ShortcutManager) this.b.get(), ((Integer) this.c.get()).intValue());
    }
}
