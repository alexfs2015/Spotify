package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.lyrics.LyricsCardView;

/* renamed from: suf reason: default package */
public final class suf implements NowPlayingWidget {
    private final sua a;
    private LyricsCardView b;

    public final void c() {
    }

    public suf(sua sua) {
        this.a = sua;
    }

    public final Type a() {
        return Type.LYRICS;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = (LyricsCardView) layoutInflater.inflate(R.layout.lyrics_card_view, viewGroup, false);
        return this.b;
    }

    public final void b() {
        this.a.a((suc) this.b);
    }

    public final void d() {
        this.a.a.c();
    }
}
