package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;

/* renamed from: ksu reason: default package */
public final class ksu implements wig<ShortcutManager> {
    private final wzi<Context> a;

    private ksu(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ksu a(wzi<Context> wzi) {
        return new ksu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ShortcutManager) wil.a((ShortcutManager) ((Context) this.a.get()).getSystemService(ShortcutManager.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
