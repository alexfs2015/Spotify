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

/* renamed from: suo reason: default package */
public final class suo implements NowPlayingWidget {
    private final svd a;
    private final ssa b;
    private final Picasso c;
    private final Type d;
    private PivotsWidgetView e;

    public final void c() {
    }

    public suo(svd svd, ssa ssa, Picasso picasso, Type type) {
        this.a = svd;
        this.b = ssa;
        this.c = picasso;
        this.d = type;
    }

    public final Type a() {
        return this.d;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = (PivotsWidgetView) layoutInflater.inflate(R.layout.pivots_widget, viewGroup, false);
        this.e.a.b = this.c;
        return this.e;
    }

    public final void b() {
        svd svd = this.a;
        PivotsWidgetView pivotsWidgetView = this.e;
        svd.d.a(svd.a((svh) fay.a(pivotsWidgetView)));
        pivotsWidgetView.a((a) new a() {
            public final void a(suu suu, int i) {
                String str;
                svd.this.a.b(suu.d());
                suz suz = svd.this.b;
                String d = suu.d();
                InteractionLogger interactionLogger = suz.a;
                PlayerState playerState = (PlayerState) suz.b.get();
                if (playerState == null) {
                    str = null;
                } else {
                    str = playerState.playbackId();
                }
                String str2 = str;
                StringBuilder sb = new StringBuilder();
                sb.append(suz.c);
                sb.append("pivot_play_button");
                interactionLogger.a(str2, d, sb.toString(), i, InteractionType.HIT, "play");
            }

            public final void a(suu suu) {
                svd.this.c.a(suu.d());
            }

            public final void b(suu suu) {
                svd.this.c.a(suu.d());
            }
        });
        this.b.a((urx) this.e);
    }

    public final void d() {
        svd svd = this.a;
        svd.d.c();
        svd.a.a();
        this.b.a();
    }
}
