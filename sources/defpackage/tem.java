package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.widgets.lyrics.LyricsCardView;

/* renamed from: tem reason: default package */
public final class tem implements NowPlayingWidget {
    private final teh a;
    private LyricsCardView b;

    public tem(teh teh) {
        this.a = teh;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = (LyricsCardView) layoutInflater.inflate(R.layout.lyrics_card_view, viewGroup, false);
        return this.b;
    }

    public final Type a() {
        return Type.LYRICS;
    }

    public final void b() {
        this.a.a((tej) this.b);
    }

    public final void c() {
    }

    public final void d() {
        this.a.a.c();
    }
}
