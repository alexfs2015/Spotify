package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.example.ExampleWidgetView;

/* renamed from: tea reason: default package */
public final class tea implements NowPlayingWidget {
    private final ted a;
    private final tch b;
    private ExampleWidgetView c;

    public tea(ted ted, tch tch) {
        this.a = ted;
        this.b = tch;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c = (ExampleWidgetView) layoutInflater.inflate(R.layout.example_widget, viewGroup, false);
        return this.c;
    }

    public final Type a() {
        return Type.EXAMPLE;
    }

    public final void b() {
        ted ted = this.a;
        ted.a = (tef) fbp.a(this.c);
        ted.a.a((a) ted);
        ted.b.a(ted.a());
        this.b.a((vdc) this.c);
    }

    public final void c() {
    }

    public final void d() {
        this.a.b.a();
        this.b.a();
    }
}
