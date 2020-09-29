package defpackage;

import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetPresenter;
import com.squareup.picasso.Picasso;

/* renamed from: svm reason: default package */
public final class svm implements vua<svi> {
    private final wlc<StorylinesWidgetPresenter> a;
    private final wlc<Picasso> b;
    private final wlc<jin> c;

    private svm(wlc<StorylinesWidgetPresenter> wlc, wlc<Picasso> wlc2, wlc<jin> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static svm a(wlc<StorylinesWidgetPresenter> wlc, wlc<Picasso> wlc2, wlc<jin> wlc3) {
        return new svm(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new svi((StorylinesWidgetPresenter) this.a.get(), (Picasso) this.b.get(), (jin) this.c.get());
    }
}
