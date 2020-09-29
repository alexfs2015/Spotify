package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import com.squareup.picasso.Picasso;

/* renamed from: qih reason: default package */
public final class qih implements vua<qig> {
    private final wlc<LayoutInflater> a;
    private final wlc<Picasso> b;
    private final wlc<DisplayMetrics> c;
    private final wlc<Boolean> d;

    private qih(wlc<LayoutInflater> wlc, wlc<Picasso> wlc2, wlc<DisplayMetrics> wlc3, wlc<Boolean> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qih a(wlc<LayoutInflater> wlc, wlc<Picasso> wlc2, wlc<DisplayMetrics> wlc3, wlc<Boolean> wlc4) {
        return new qih(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qig((LayoutInflater) this.a.get(), (Picasso) this.b.get(), (DisplayMetrics) this.c.get(), ((Boolean) this.d.get()).booleanValue());
    }
}
