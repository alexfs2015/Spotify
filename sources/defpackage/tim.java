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

/* renamed from: tim reason: default package */
public final class tim extends ith<PlayerTrack> implements defpackage.vhp.a {
    private final VideoSurfaceView a = ((VideoSurfaceView) fbp.a(this.o.findViewById(R.id.video_surface)));
    private final kbd b;
    private final ViewGroup c;
    private final int d;

    /* renamed from: tim$a */
    static final class a implements jzy {
        private final PlayerTrack a;
        private final tim b;

        a(PlayerTrack playerTrack, tim tim) {
            this.b = tim;
            this.a = (PlayerTrack) fbp.a(playerTrack);
        }

        public final boolean a(kaa kaa) {
            fbp.a(kaa);
            return PlayerTrackUtil.areUidsOrUrisEqual(this.a, kbg.a(kaa), kbg.b(kaa)) && ((vhp) this.b.o.getTag(R.id.paste_carousel_tag)).a;
        }
    }

    public tim(LayoutInflater layoutInflater, int i, kbd kbd, DisplayMetrics displayMetrics, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        this.c = (ViewGroup) viewGroup.getParent();
        this.b = kbd;
        this.d = displayMetrics.heightPixels;
    }

    public final /* synthetic */ void a(Object obj, int i) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (!jvi.b(this.a.getContext())) {
            View findViewById = this.c.findViewById(R.id.player_overlay_header);
            View findViewById2 = this.c.findViewById(R.id.player_overlay_footer);
            if (findViewById == null || findViewById2 == null) {
                throw new NullPointerException("The Player Fragment layout is missing player_overlay_header and/or player_overlay_footer views, needed to position the video in between.");
            }
            int bottom = findViewById.getBottom() + vfj.b(8.0f, this.c.getResources());
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

    public final void w() {
        this.b.a(this.a);
        vhp vhp = (vhp) this.o.getTag(R.id.paste_carousel_tag);
        if (vhp != null) {
            vhp.d = this;
        }
    }

    public final void x() {
        VideoSurfaceView videoSurfaceView = this.a;
        videoSurfaceView.d = null;
        this.b.b(videoSurfaceView);
        vhp vhp = (vhp) this.o.getTag(R.id.paste_carousel_tag);
        if (vhp != null) {
            vhp.d = null;
        }
    }

    public final void z() {
        this.a.a();
    }
}
