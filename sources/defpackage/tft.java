package defpackage;

import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetPresenter;
import com.squareup.picasso.Picasso;

/* renamed from: tft reason: default package */
public final class tft implements wig<tfp> {
    private final wzi<StorylinesWidgetPresenter> a;
    private final wzi<Picasso> b;
    private final wzi<jld> c;

    private tft(wzi<StorylinesWidgetPresenter> wzi, wzi<Picasso> wzi2, wzi<jld> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tft a(wzi<StorylinesWidgetPresenter> wzi, wzi<Picasso> wzi2, wzi<jld> wzi3) {
        return new tft(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tfp((StorylinesWidgetPresenter) this.a.get(), (Picasso) this.b.get(), (jld) this.c.get());
    }
}
