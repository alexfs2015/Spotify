package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.example.ExampleWidgetView;

/* renamed from: stt reason: default package */
public final class stt implements NowPlayingWidget {
    private final stw a;
    private final ssa b;
    private ExampleWidgetView c;

    public final void c() {
    }

    public stt(stw stw, ssa ssa) {
        this.a = stw;
        this.b = ssa;
    }

    public final Type a() {
        return Type.EXAMPLE;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c = (ExampleWidgetView) layoutInflater.inflate(R.layout.example_widget, viewGroup, false);
        return this.c;
    }

    public final void b() {
        stw stw = this.a;
        stw.a = (sty) fay.a(this.c);
        stw.a.a((a) stw);
        stw.b.a(stw.a());
        this.b.a((urx) this.c);
    }

    public final void d() {
        this.a.b.a();
        this.b.a();
    }
}
