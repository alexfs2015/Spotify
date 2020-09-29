package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetPresenter;
import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetPresenter.ContentLoadedState;
import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetView;
import com.squareup.picasso.Picasso;

/* renamed from: tfp reason: default package */
public final class tfp implements NowPlayingWidget {
    private final StorylinesWidgetPresenter a;
    private final Picasso b;
    private final jld c;
    private StorylinesWidgetView d;

    public tfp(StorylinesWidgetPresenter storylinesWidgetPresenter, Picasso picasso, jld jld) {
        this.a = storylinesWidgetPresenter;
        this.b = picasso;
        this.c = jld;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = (StorylinesWidgetView) layoutInflater.inflate(R.layout.storylines_widget, viewGroup, false);
        return this.d;
    }

    public final Type a() {
        return Type.STORYLINES;
    }

    public final void b() {
        this.a.a((jlf) this.d);
        StorylinesWidgetView storylinesWidgetView = this.d;
        storylinesWidgetView.k = this.b;
        storylinesWidgetView.i = this.c;
        storylinesWidgetView.j.a((a) storylinesWidgetView.i);
    }

    public final void c() {
        StorylinesWidgetPresenter storylinesWidgetPresenter = this.a;
        storylinesWidgetPresenter.a = true;
        if (storylinesWidgetPresenter.b == ContentLoadedState.LOADED_MANY_CARDS) {
            storylinesWidgetPresenter.d.a(true, true);
        }
    }

    public final void d() {
        StorylinesWidgetPresenter storylinesWidgetPresenter = this.a;
        storylinesWidgetPresenter.c.a();
        storylinesWidgetPresenter.a = false;
        storylinesWidgetPresenter.b = ContentLoadedState.NOT_LOADED;
    }
}
