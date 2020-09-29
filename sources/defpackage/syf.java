package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;

/* renamed from: syf reason: default package */
public final class syf extends iqu<PlayerTrack> implements defpackage.uvz.a {
    private final VideoSurfaceView a = ((VideoSurfaceView) fay.a(this.o.findViewById(R.id.video_surface)));
    private final jzd b;
    private final ViewGroup c;
    private final int d;

    /* renamed from: syf$a */
    static final class a implements jxy {
        private final PlayerTrack a;
        private final syf b;

        a(PlayerTrack playerTrack, syf syf) {
            this.b = syf;
            this.a = (PlayerTrack) fay.a(playerTrack);
        }

        public final boolean a(jya jya) {
            fay.a(jya);
            return PlayerTrackUtil.areUidsOrUrisEqual(this.a, jzg.a(jya), jzg.b(jya)) && ((uvz) this.b.o.getTag(R.id.paste_carousel_tag)).a;
        }
    }

    public final /* synthetic */ void a(Object obj, int i) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (!jtc.b(this.a.getContext())) {
            View findViewById = this.c.findViewById(R.id.player_overlay_header);
            View findViewById2 = this.c.findViewById(R.id.player_overlay_footer);
            if (findViewById == null || findViewById2 == null) {
                throw new NullPointerException("The Player Fragment layout is missing player_overlay_header and/or player_overlay_footer views, needed to position the video in between.");
            }
            int bottom = findViewById.getBottom() + uts.b(8.0f, this.c.getResources());
            int top = this.d - findViewById2.getTop();
            LayoutParams layoutParams = (LayoutParams) this.a.getLayoutParams();
            int i2 = ((this.d - bottom) - layoutParams.height) - top;
            if (i2 <= 0) {
                layoutParams.height += i2;
            } else {
                int i3 = i2 / 2;
                bottom += i3;
                top += i3;
            }
            layoutParams.setMargins(0, bottom, 0, top);
            this.a.setLayoutParams(layoutParams);
        }
        this.a.c = new a(playerTrack, this);
    }

    public syf(LayoutInflater layoutInflater, int i, jzd jzd, DisplayMetrics displayMetrics, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        this.c = (ViewGroup) viewGroup.getParent();
        this.b = jzd;
        this.d = displayMetrics.heightPixels;
    }

    public final void v() {
        this.b.a(this.a);
        uvz uvz = (uvz) this.o.getTag(R.id.paste_carousel_tag);
        if (uvz != null) {
            uvz.d = this;
        }
    }

    public final void y() {
        this.a.a();
    }

    public final void w() {
        VideoSurfaceView videoSurfaceView = this.a;
        videoSurfaceView.d = null;
        this.b.b(videoSurfaceView);
        uvz uvz = (uvz) this.o.getTag(R.id.paste_carousel_tag);
        if (uvz != null) {
            uvz.d = null;
        }
    }
}
