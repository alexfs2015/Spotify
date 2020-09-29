package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.pivots.views.PivotsWidgetView;
import com.squareup.picasso.Picasso;

/* renamed from: tev reason: default package */
public final class tev implements NowPlayingWidget {
    private final tfk a;
    private final tch b;
    private final Picasso c;
    private final Type d;
    private PivotsWidgetView e;

    public tev(tfk tfk, tch tch, Picasso picasso, Type type) {
        this.a = tfk;
        this.b = tch;
        this.c = picasso;
        this.d = type;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = (PivotsWidgetView) layoutInflater.inflate(R.layout.pivots_widget, viewGroup, false);
        this.e.a.b = this.c;
        return this.e;
    }

    public final Type a() {
        return this.d;
    }

    public final void b() {
        tfk tfk = this.a;
        PivotsWidgetView pivotsWidgetView = this.e;
        tfk.d.a(tfk.a((tfo) fbp.a(pivotsWidgetView)));
        pivotsWidgetView.a((a) new a() {
            public final void a(tfb tfb) {
                tfk.this.c.a(tfb.d());
            }

            public final void a(tfb tfb, int i) {
                tfk.this.a.b(tfb.d());
                tfg tfg = tfk.this.b;
                String d = tfb.d();
                InteractionLogger interactionLogger = tfg.a;
                PlayerState playerState = (PlayerState) tfg.b.get();
                String playbackId = playerState == null ? null : playerState.playbackId();
                StringBuilder sb = new StringBuilder();
                sb.append(tfg.c);
                sb.append("pivot_play_button");
                interactionLogger.a(playbackId, d, sb.toString(), i, InteractionType.HIT, "play");
            }

            public final void b(tfb tfb) {
                tfk.this.c.a(tfb.d());
            }
        });
        this.b.a((vdc) this.e);
    }

    public final void c() {
    }

    public final void d() {
        tfk tfk = this.a;
        tfk.d.c();
        tfk.a.a();
        this.b.a();
    }
}
