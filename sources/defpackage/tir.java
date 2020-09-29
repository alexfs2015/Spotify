package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.VideoSurfaceView.ScaleType;
import com.spotify.music.R;

/* renamed from: tir reason: default package */
public final class tir extends til implements defpackage.vhp.a {
    private final kbd b;
    /* access modifiers changed from: private */
    public final VideoSurfaceView c = ((VideoSurfaceView) fbp.a(this.o.findViewById(R.id.video_surface)));
    private final View d = this.o.findViewById(R.id.content);

    /* renamed from: tir$a */
    static final class a implements jzy {
        private final PlayerTrack a;
        private final tir b;

        a(PlayerTrack playerTrack, tir tir) {
            this.a = (PlayerTrack) fbp.a(playerTrack);
            this.b = (tir) fbp.a(tir);
        }

        public final boolean a(kaa kaa) {
            fbp.a(kaa);
            return PlayerTrackUtil.areUidsOrUrisEqual(this.a, kbg.a(kaa), kbg.b(kaa)) && ((vhp) this.b.o.getTag(R.id.paste_carousel_tag)).a;
        }
    }

    public tir(LayoutInflater layoutInflater, int i, vgw vgw, kbd kbd, ViewGroup viewGroup) {
        super(layoutInflater, i, vgw, viewGroup);
        this.b = kbd;
    }

    private void C() {
        VideoSurfaceView videoSurfaceView = this.c;
        videoSurfaceView.d = null;
        this.b.b(videoSurfaceView);
        vhp vhp = (vhp) this.o.getTag(R.id.paste_carousel_tag);
        if (vhp != null) {
            vhp.d = null;
        }
    }

    /* access modifiers changed from: protected */
    public final View B() {
        return this.d;
    }

    public final void a(PlayerTrack playerTrack, int i) {
        super.a(playerTrack, i);
        String str = (String) playerTrack.metadata().get("context_uri");
        this.c.a((str == null || !str.contains("spotify:user:spotify:playlist:37i9dQZF1DWVhx3Jw2ZqKI")) ? ScaleType.ASPECT_FILL : ScaleType.ASPECT_FIT);
        this.c.c = new a(playerTrack, this);
    }

    public final void w() {
        this.c.d = new kbc() {
            public final void a() {
                tir.this.a.setVisibility(8);
            }

            public final void b() {
                tir.this.a.setVisibility(0);
            }

            public final void c() {
                tir.this.c.requestLayout();
            }
        };
        this.b.a(this.c);
        vhp vhp = (vhp) this.o.getTag(R.id.paste_carousel_tag);
        if (vhp != null) {
            vhp.d = this;
        }
    }

    public final void x() {
        C();
    }

    public final void y() {
        C();
    }

    public final void z() {
        this.c.a();
    }
}
