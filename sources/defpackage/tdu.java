package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.btl.BtlWidgetView;

/* renamed from: tdu reason: default package */
public final class tdu implements NowPlayingWidget {
    private final tdx a;
    private final tch b;
    private BtlWidgetView c;

    public tdu(tdx tdx, tch tch) {
        this.a = tdx;
        this.b = tch;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c = (BtlWidgetView) layoutInflater.inflate(R.layout.btl_widget, viewGroup, false);
        return this.c;
    }

    public final Type a() {
        return Type.BEHIND_THE_LYRICS;
    }

    public final void b() {
        this.a.a((kwc) this.c);
        this.b.a((vdc) this.c);
    }

    public final void c() {
    }

    public final void d() {
        this.a.a.unsubscribe();
        this.b.a();
    }
}
