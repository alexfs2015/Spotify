package defpackage;

import android.view.LayoutInflater;
import android.view.Window;

/* renamed from: lcs reason: default package */
public final class lcs implements wig<LayoutInflater> {
    private final wzi<Window> a;

    private lcs(wzi<Window> wzi) {
        this.a = wzi;
    }

    public static lcs a(wzi<Window> wzi) {
        return new lcs(wzi);
    }

    public final /* synthetic */ Object get() {
        return (LayoutInflater) wil.a(((Window) this.a.get()).getLayoutInflater(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
