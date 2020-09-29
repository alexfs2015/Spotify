package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.VideoSurfaceView.ScaleType;
import com.spotify.music.R;

/* renamed from: syk reason: default package */
public final class syk extends sye implements defpackage.uvz.a {
    private final jzd b;
    /* access modifiers changed from: private */
    public final VideoSurfaceView c = ((VideoSurfaceView) fay.a(this.o.findViewById(R.id.video_surface)));
    private final View d = this.o.findViewById(R.id.content);

    /* renamed from: syk$a */
    static final class a implements jxy {
        private final PlayerTrack a;
        private final syk b;

        a(PlayerTrack playerTrack, syk syk) {
            this.a = (PlayerTrack) fay.a(playerTrack);
            this.b = (syk) fay.a(syk);
        }

        public final boolean a(jya jya) {
            fay.a(jya);
            return PlayerTrackUtil.areUidsOrUrisEqual(this.a, jzg.a(jya), jzg.b(jya)) && ((uvz) this.b.o.getTag(R.id.paste_carousel_tag)).a;
        }
    }

    public syk(LayoutInflater layoutInflater, int i, uvf uvf, jzd jzd, ViewGroup viewGroup) {
        super(layoutInflater, i, uvf, viewGroup);
        this.b = jzd;
    }

    public final void a(PlayerTrack playerTrack, int i) {
        ScaleType scaleType;
        super.a(playerTrack, i);
        VideoSurfaceView videoSurfaceView = this.c;
        String str = (String) playerTrack.metadata().get("context_uri");
        if (str == null || !str.contains("spotify:user:spotify:playlist:37i9dQZF1DWVhx3Jw2ZqKI")) {
            scaleType = ScaleType.ASPECT_FILL;
        } else {
            scaleType = ScaleType.ASPECT_FIT;
        }
        videoSurfaceView.a(scaleType);
        this.c.c = new a(playerTrack, this);
    }

    public final void v() {
        this.c.d = new jzc() {
            public final void a() {
                syk.this.a.setVisibility(8);
            }

            public final void b() {
                syk.this.a.setVisibility(0);
            }

            public final void c() {
                syk.this.c.requestLayout();
            }
        };
        this.b.a(this.c);
        uvz uvz = (uvz) this.o.getTag(R.id.paste_carousel_tag);
        if (uvz != null) {
            uvz.d = this;
        }
    }

    private void B() {
        VideoSurfaceView videoSurfaceView = this.c;
        videoSurfaceView.d = null;
        this.b.b(videoSurfaceView);
        uvz uvz = (uvz) this.o.getTag(R.id.paste_carousel_tag);
        if (uvz != null) {
            uvz.d = null;
        }
    }

    public final void w() {
        B();
    }

    public final void x() {
        B();
    }

    public final void y() {
        this.c.a();
    }

    /* access modifiers changed from: protected */
    public final View A() {
        return this.d;
    }
}
