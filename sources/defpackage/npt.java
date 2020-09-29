package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber;
import defpackage.iqu;

/* renamed from: npt reason: default package */
public final class npt<VH extends iqu<T>, T extends Parcelable> implements vua<ListSubscriber<VH, T>> {
    private final wlc<hvl> a;
    private final wlc<heg> b;
    private final wlc<iqt<VH, T>> c;

    public static <VH extends iqu<T>, T extends Parcelable> ListSubscriber<VH, T> a(hvl hvl, heg heg, iqt<VH, T> iqt) {
        return new ListSubscriber<>(hvl, heg, iqt);
    }

    public final /* synthetic */ Object get() {
        return new ListSubscriber((hvl) this.a.get(), (heg) this.b.get(), (iqt) this.c.get());
    }
}
