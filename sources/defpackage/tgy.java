package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import com.spotify.music.nowplaying.videoads.overlay.VideoAdOverlayHidingFrameLayout;

/* renamed from: tgy reason: default package */
public final class tgy implements defpackage.uru.a<Boolean> {
    final thm a;
    a b;
    VideoAdOverlayHidingFrameLayout c;
    ConstraintLayout d;
    ConstraintLayout e;
    ViewGroup f;

    /* renamed from: tgy$a */
    interface a {
        void a();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            a(this.d, R.layout.video_ads_renderer_layout_fullscreen);
            b(this.e, R.layout.video_ads_player_overlay_fullscreen);
            a(this.e, this.f, true);
            this.c.setFitsSystemWindows(false);
            this.c.setPadding(0, 0, 0, 0);
            this.e.setPadding(0, 0, 0, 0);
        } else {
            a(this.d, R.layout.video_ads_renderer_layout);
            b(this.e, R.layout.video_ads_player_overlay);
            a(this.e, this.f, false);
            this.c.setFitsSystemWindows(true);
        }
        this.b.a();
    }

    public tgy(thm thm) {
        this.a = thm;
    }

    private static void a(ConstraintLayout constraintLayout, int i) {
        et etVar = new et();
        etVar.a(constraintLayout.getContext(), i);
        etVar.b(constraintLayout);
    }

    private static void b(ConstraintLayout constraintLayout, int i) {
        View findViewById = constraintLayout.findViewById(R.id.ad_call_to_action);
        int visibility = findViewById.getVisibility();
        View findViewById2 = constraintLayout.findViewById(R.id.video_ads_info);
        int visibility2 = findViewById2.getVisibility();
        View findViewById3 = constraintLayout.findViewById(R.id.skip_ad_button);
        int visibility3 = findViewById3.getVisibility();
        et etVar = new et();
        etVar.a(constraintLayout.getContext(), i);
        etVar.b(constraintLayout);
        findViewById.setVisibility(visibility);
        findViewById2.setVisibility(visibility2);
        findViewById3.setVisibility(visibility3);
    }

    private static void a(ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        if (z) {
            viewGroup.setBackground(fr.a(viewGroup.getContext(), (int) R.drawable.vertical_video_ads_overlay_gradient));
            viewGroup2.setBackground(null);
            return;
        }
        viewGroup.setBackground(null);
        viewGroup2.setBackgroundColor(fr.c(viewGroup2.getContext(), R.color.cat_black_60));
    }
}
