package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;

/* renamed from: kpl reason: default package */
public final class kpl implements vua<ShortcutManager> {
    private final wlc<Context> a;

    private kpl(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static kpl a(wlc<Context> wlc) {
        return new kpl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ShortcutManager) vuf.a((ShortcutManager) ((Context) this.a.get()).getSystemService(ShortcutManager.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
