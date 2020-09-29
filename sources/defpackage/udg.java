package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: udg reason: default package */
public final class udg implements udf {
    final Resources a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.metadata));
    private final ImageView e = ((ImageView) this.b.findViewById(R.id.podcast_cover_art));
    private final ImageView f = ((ImageView) this.b.findViewById(R.id.episode_cover_art));
    private final ProgressBar g = ((ProgressBar) this.b.findViewById(R.id.progress_bar));
    private udw h;
    private final udh i = new udh(this.a, R.dimen.episode_card_podcast_corner_radius);
    private final SpotifyIconDrawable j;
    private udd k;
    private udi l;

    public udg(udc udc, Context context, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(R.layout.episode_image_card, viewGroup, false);
        this.a = context.getResources();
        this.i.a(-10395295);
        this.e.setBackground(this.i);
        if (VERSION.SDK_INT >= 21) {
            this.e.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) udg.this.a.getDimensionPixelSize(R.dimen.episode_card_podcast_corner_radius));
                }
            });
        }
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.episode_image_card_description, (ViewGroup) this.b, false);
        this.b.getLayoutParams().width = udc.a();
        LayoutParams layoutParams = this.e.getLayoutParams();
        layoutParams.width = udc.c();
        layoutParams.height = udc.c();
        textView.setTextSize(0, (float) udc.b());
        jm.a(this.c, udc.e());
        this.c.setTextColor(fr.c(this.b.getContext(), udc.f()));
        this.d.setVisibility(udc.g());
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.setMargins(0, udc.i(), 0, 0);
        this.c.setLayoutParams(layoutParams2);
        udd udd = new udd(this.b.getContext(), textView.getPaint(), udc.h());
        this.k = udd;
        this.l = new udi();
        this.k = udd;
        this.f.setImageDrawable(this.k);
        this.j = new SpotifyIconDrawable(this.e.getContext(), SpotifyIconV2.PODCASTS, (float) udc.d());
        vfz.a(this.b).b(this.f, this.e).a(this.c, this.d).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.l.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.l.a();
        c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        c();
        udi udi = this.l;
        udi.a();
        udi.a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        udi.a.setDuration(800);
        udi.a.setInterpolator(fuh.e);
        udi.a.setRepeatMode(2);
        udi.a.addUpdateListener(new udj(-11316397, 0.125f, this) {
            private /* synthetic */ udf a;

            {
                this.a = r4;
            }

            /* access modifiers changed from: 0000 */
            public final void a(int i) {
                this.a.a(i);
            }
        });
        udi.a.setRepeatCount(-1);
        udi.a.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(udw udw, c cVar) {
        if (!(this.h.e() instanceof c)) {
            vgt vgt = new vgt(cVar.a, (float) this.a.getDimensionPixelSize(R.dimen.episode_card_podcast_corner_radius));
            this.e.setImageDrawable(vgt);
            this.e.setScaleType(ScaleType.CENTER_CROP);
            if (cVar.b) {
                udi udi = this.l;
                udi.a();
                udi.a = ObjectAnimator.ofInt(vgt, "alpha", new int[]{0, 255});
                udi.a.setDuration(200);
                udi.a.start();
            }
        }
        udt h2 = udw.h();
        if ((h2 instanceof a) || (h2 instanceof b)) {
            int f2 = udw.f();
            boolean z = true;
            if ((udw.i() >= 0) && gd.b(f2, -1) < 2.0d) {
                z = false;
            }
            if (z) {
                this.k.a(f2, udw.g(), cVar.b);
                return;
            }
            this.k.b(f2, udw.g(), cVar.b);
        }
    }

    private void c() {
        this.e.setImageDrawable(this.j);
        this.e.setScaleType(ScaleType.CENTER);
        this.i.a(-10395295);
    }

    public final View a() {
        return this.b;
    }

    public final void a(int i2) {
        this.i.a(i2);
    }

    public final void a(udw udw) {
        udw udw2 = this.h;
        if (udw2 == null || !udw2.equals(udw)) {
            this.c.setText(udw.d() ? frl.a(udw.a(), frr.b(this.c.getContext())) : udw.a());
            udd udd = this.k;
            if (udd.a.a(udw.b())) {
                udd.invalidateSelf();
            }
            this.d.setText(udw.c());
            int i2 = udw.i();
            boolean z = true;
            if (i2 >= 0 && i2 <= 100) {
                this.g.setProgress(udw.i());
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
            udw.e().a(new $$Lambda$udg$EnbTAiOO2Gv949Yc5t72xdqzNM(this), new $$Lambda$udg$3zBdsekzVjst7C9BYM1w6Jt5THo(this, udw), new $$Lambda$udg$h2Ugrq1JVOj3qPfeSMxbFz3bXbM(this), new $$Lambda$udg$a9gxzZzeSQ6I_xqgw8rFGuFY(this));
            if (!(udw.h() instanceof c) || (this.h.h() instanceof c)) {
                z = false;
            }
            if (z) {
                c cVar = (c) udw.h();
                this.k.a(cVar.a, cVar.b);
            }
            this.h = udw;
        }
    }

    public final void b() {
        udd udd = this.k;
        udd.a();
        udd.a.b();
        udd.b.b();
        udd.b();
        udd.invalidateSelf();
        this.f.setImageDrawable(this.k);
    }
}
