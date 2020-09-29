package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.btl.BtlWidgetView;

/* renamed from: stn reason: default package */
public final class stn implements NowPlayingWidget {
    private final stq a;
    private final ssa b;
    private BtlWidgetView c;

    public final void c() {
    }

    public stn(stq stq, ssa ssa) {
        this.a = stq;
        this.b = ssa;
    }

    public final Type a() {
        return Type.BEHIND_THE_LYRICS;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c = (BtlWidgetView) layoutInflater.inflate(R.layout.btl_widget, viewGroup, false);
        return this.c;
    }

    public final void b() {
        this.a.a((kst) this.c);
        this.b.a((urx) this.c);
    }

    public final void d() {
        this.a.a.unsubscribe();
        this.b.a();
    }
}
