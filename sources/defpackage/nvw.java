package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber;
import defpackage.ith;

/* renamed from: nvw reason: default package */
public final class nvw<VH extends ith<T>, T extends Parcelable> implements wig<ListSubscriber<VH, T>> {
    private final wzi<hxx> a;
    private final wzi<hhc> b;
    private final wzi<itg<VH, T>> c;

    public static <VH extends ith<T>, T extends Parcelable> ListSubscriber<VH, T> a(hxx hxx, hhc hhc, itg<VH, T> itg) {
        return new ListSubscriber<>(hxx, hhc, itg);
    }

    public final /* synthetic */ Object get() {
        return new ListSubscriber((hxx) this.a.get(), (hhc) this.b.get(), (itg) this.c.get());
    }
}
