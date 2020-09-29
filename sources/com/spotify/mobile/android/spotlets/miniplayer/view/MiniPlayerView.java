package com.spotify.mobile.android.spotlets.miniplayer.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager.MeasureMode;
import com.spotify.paste.widgets.carousel.CarouselView;

public class MiniPlayerView extends FrameLayout {
    public CarouselView a;
    public ImageButton b;
    public ImageButton c;
    public ProgressBar d;
    public View e;
    public SpotifyIconView f;
    public ImageButton g;
    public VideoSurfaceView h;
    public ConnectView i;
    public a j;
    public final kbc k = new kbc() {
        public final void a() {
            ((androidx.recyclerview.widget.RecyclerView.a) fbp.a(MiniPlayerView.this.a.c())).e();
            MiniPlayerView.this.j.a();
        }

        public final void b() {
            ((androidx.recyclerview.widget.RecyclerView.a) fbp.a(MiniPlayerView.this.a.c())).e();
            MiniPlayerView.this.j.b();
        }

        public final void c() {
        }
    };
    public rqb l;
    public jut<ProgressBar> m;
    private LinearLayout n;
    private final float o;
    private final OnClickListener p = new OnClickListener() {
        public final void onClick(View view) {
            if (MiniPlayerView.this.j != null) {
                int id = view.getId();
                if (id == R.id.playPause) {
                    MiniPlayerView.this.j.c();
                } else if (id == R.id.skipNext) {
                    MiniPlayerView.this.j.d();
                } else if (id == R.id.video_surface) {
                    MiniPlayerView.this.j.e();
                } else if (id == R.id.btn_chevron_up) {
                    MiniPlayerView.this.j.f();
                } else if (id == R.id.player_navigation_unit_container) {
                    MiniPlayerView.this.j.f();
                } else if (id == R.id.connect_view_root) {
                    MiniPlayerView.this.j.g();
                } else if (id == R.id.btn_heart) {
                    MiniPlayerView.this.j.h();
                } else {
                    String str = "epsv eIeDcexwd t Ui";
                    StringBuilder sb = new StringBuilder("Unexpected view ID ");
                    sb.append(view.getId());
                    Assertion.a(sb.toString());
                }
            }
        }
    };
    private iyb q;

    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();
    }

    public MiniPlayerView(Context context) {
        super(context);
        this.o = context.getResources().getDimension(R.dimen.npb_wiggle_animation_initial_amplitude);
    }

    public MiniPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = context.getResources().getDimension(R.dimen.npb_wiggle_animation_initial_amplitude);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.n.setTranslationY(((float) Math.sin((double) (18.849556f * animatedFraction))) * this.o * (1.0f - animatedFraction));
    }

    public static boolean a(iws iws) {
        PlayerTrack a2 = iws.a();
        if (a2 != null) {
            String str = "is_advertisement";
            if (a2.metadata().containsKey(str) && Boolean.valueOf((String) a2.metadata().get(str)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(2000);
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MiniPlayerView.this.a(valueAnimator);
            }
        });
        ofFloat.start();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        iya iya = new iya(getContext());
        ColorDrawable colorDrawable = new ColorDrawable(iya.b);
        vgs vgs = new vgs();
        vgs.a((Drawable) colorDrawable, false);
        this.q = new iyc(iya.a, vgs, colorDrawable, new ColorDrawable(iya.c));
        ip.a((View) this, (Drawable) this.q);
        this.a = (CarouselView) findViewById(R.id.carousel);
        this.b = (ImageButton) findViewById(R.id.playPause);
        this.c = (ImageButton) findViewById(R.id.skipNext);
        this.f = (SpotifyIconView) findViewById(R.id.btn_chevron_up);
        this.e = findViewById(R.id.player_navigation_unit_container);
        this.g = (ImageButton) findViewById(R.id.btn_heart);
        this.h = (VideoSurfaceView) findViewById(R.id.video_surface);
        this.i = (ConnectView) findViewById(R.id.connect_view_root);
        this.n = (LinearLayout) findViewById(R.id.view_container);
        this.i.setBackgroundColor(fr.c(getContext(), R.color.cat_grayscale_12));
        this.g.setImageDrawable(vdd.q(getContext()));
        this.d = (ProgressBar) findViewById(R.id.mini_player_progress);
        ImageButton imageButton = this.c;
        Context context = getContext();
        imageButton.setImageDrawable(vdd.a((Context) fbp.a(context), SpotifyIcon.SKIP_FORWARD_16, vfj.b(16.0f, context.getResources())));
        this.b.setOnClickListener(this.p);
        this.c.setOnClickListener(this.p);
        this.h.setOnClickListener(this.p);
        this.e.setOnClickListener(this.p);
        this.i.setOnClickListener(this.p);
        this.g.setOnClickListener(this.p);
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(MeasureMode.FILL);
        carouselLayoutManager.a = new ixv();
        this.a.a((i) carouselLayoutManager);
        this.a.a((f) null);
        this.m = new jut<>(this.d, Optional.e());
        this.q.setVisible(false, false);
        setBackgroundColor(fr.c(getContext(), R.color.cat_grayscale_15));
    }
}
