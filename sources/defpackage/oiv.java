package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: oiv reason: default package */
public final class oiv implements wig<gnz<ohl, ohn>> {
    private final wzi<a> a;

    private oiv(wzi<a> wzi) {
        this.a = wzi;
    }

    public static oiv a(wzi<a> wzi) {
        return new oiv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gnz) wil.a(new gnz((a) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
