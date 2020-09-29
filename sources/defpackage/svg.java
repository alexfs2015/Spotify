package defpackage;

import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.lyrics.fullscreen.views.LyricsFullscreenHeaderView;
import com.squareup.picasso.Picasso;

/* renamed from: svg reason: default package */
public class svg {
    private final vcq a;
    private final Picasso b;
    private LyricsFullscreenHeaderView c;

    public svg(vcq vcq, Picasso picasso) {
        this.a = vcq;
        this.b = picasso;
    }

    /* access modifiers changed from: 0000 */
    public void a(PlayerState playerState) {
        String str;
        Class<svg> cls = svg.class;
        PlayerTrack track = playerState.track();
        if (track != null) {
            Drawable a2 = gaa.a(this.c.getContext(), SpotifyIconV2.TRACK, (float) vfj.b(32.0f, this.c.getContext().getResources()));
            this.b.a((Object) cls.getName());
            Picasso picasso = this.b;
            String str2 = "image_small_url";
            if (track.metadata().containsKey(str2)) {
                str = (String) track.metadata().get(str2);
            } else {
                String str3 = "image_url";
                str = track.metadata().containsKey(str3) ? (String) track.metadata().get(str3) : null;
            }
            picasso.a(str).a(a2).b(a2).a((Object) cls.getName()).a(this.c.a);
            LyricsFullscreenHeaderView lyricsFullscreenHeaderView = this.c;
            String str4 = (String) track.metadata().get("artist_name");
            String str5 = (String) track.metadata().get("title");
            lyricsFullscreenHeaderView.b.setText(str4);
            lyricsFullscreenHeaderView.c.setText(str5);
        }
    }

    public final void a(LyricsFullscreenHeaderView lyricsFullscreenHeaderView) {
        this.c = lyricsFullscreenHeaderView;
        this.a.a((a<T>) new $$Lambda$JwyeHRzyNEuFm7wAMgFvpPRQfg<T>(this));
    }
}
