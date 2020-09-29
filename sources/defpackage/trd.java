package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Typeface;
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

/* renamed from: trd reason: default package */
public final class trd implements trc {
    final Resources a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.metadata));
    private final ImageView e = ((ImageView) this.b.findViewById(R.id.podcast_cover_art));
    private final ImageView f = ((ImageView) this.b.findViewById(R.id.episode_cover_art));
    private final ProgressBar g = ((ProgressBar) this.b.findViewById(R.id.progress_bar));
    private trt h;
    private final tre i = new tre(this.a, R.dimen.episode_card_podcast_corner_radius);
    private final SpotifyIconDrawable j;
    private tra k;
    private trf l;

    public trd(tqz tqz, Context context, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(R.layout.episode_image_card, viewGroup, false);
        this.a = context.getResources();
        this.i.a(-10395295);
        this.e.setBackground(this.i);
        if (VERSION.SDK_INT >= 21) {
            this.e.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) trd.this.a.getDimensionPixelSize(R.dimen.episode_card_podcast_corner_radius));
                }
            });
        }
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.episode_image_card_description, (ViewGroup) this.b, false);
        this.b.getLayoutParams().width = tqz.a();
        LayoutParams layoutParams = this.e.getLayoutParams();
        layoutParams.width = tqz.c();
        layoutParams.height = tqz.c();
        textView.setTextSize(0, (float) tqz.b());
        jm.a(this.c, tqz.e());
        Typeface a2 = utw.a(this.c.getContext(), tqz.e());
        if (a2 != null) {
            this.c.setTypeface(a2);
        }
        this.c.setTextColor(fr.c(this.b.getContext(), tqz.f()));
        this.d.setVisibility(tqz.g());
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.setMargins(0, tqz.i(), 0, 0);
        this.c.setLayoutParams(layoutParams2);
        tra tra = new tra(this.b.getContext(), textView.getPaint(), tqz.h());
        this.k = tra;
        this.l = new trf();
        this.k = tra;
        this.f.setImageDrawable(this.k);
        this.j = new SpotifyIconDrawable(this.e.getContext(), SpotifyIconV2.PODCASTS, (float) this.a.getDimensionPixelSize(tqz.d()));
        uui.a(this.b).b(this.f, this.e).a(this.c, this.d).a();
    }

    public final void a(trt trt) {
        CharSequence charSequence;
        trt trt2 = this.h;
        if (trt2 == null || !trt2.equals(trt)) {
            TextView textView = this.c;
            if (trt.d()) {
                charSequence = fqr.a(trt.a(), fqx.b(this.c.getContext()));
            } else {
                charSequence = trt.a();
            }
            textView.setText(charSequence);
            tra tra = this.k;
            if (tra.a.a(trt.b())) {
                tra.invalidateSelf();
            }
            this.d.setText(trt.c());
            int i2 = trt.i();
            boolean z = true;
            if (i2 >= 0 && i2 <= 100) {
                this.g.setProgress(trt.i());
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
            trt.e().a(new $$Lambda$trd$mdGkthV3Ig9dVF3yPU6yx9iKcVA(this), new $$Lambda$trd$lrrFWEaoy0yyZzxkW78CoNNdfrA(this, trt), new $$Lambda$trd$DG2gfCvcl_GrSIvVJxpvxMeod64(this), new $$Lambda$trd$wp1CAXAT8fhugCpNmqNyPp4tU(this));
            if (!(trt.h() instanceof c) || (this.h.h() instanceof c)) {
                z = false;
            }
            if (z) {
                c cVar = (c) trt.h();
                this.k.a(cVar.a, cVar.b);
            }
            this.h = trt;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.l.a();
    }

    private void c() {
        this.e.setImageDrawable(this.j);
        this.e.setScaleType(ScaleType.CENTER);
        this.i.a(-10395295);
    }

    public final void a(int i2) {
        this.i.a(i2);
    }

    public final void b() {
        tra tra = this.k;
        tra.a();
        tra.a.b();
        tra.b.b();
        tra.b();
        tra.invalidateSelf();
        this.f.setImageDrawable(this.k);
    }

    public final View a() {
        return this.b;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.l.a();
        c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(trt trt, c cVar) {
        if (!(this.h.e() instanceof c)) {
            uvc uvc = new uvc(cVar.a, (float) this.a.getDimensionPixelSize(R.dimen.episode_card_podcast_corner_radius));
            this.e.setImageDrawable(uvc);
            this.e.setScaleType(ScaleType.CENTER_CROP);
            if (cVar.b) {
                trf trf = this.l;
                trf.a();
                trf.a = ObjectAnimator.ofInt(uvc, "alpha", new int[]{0, 255});
                trf.a.setDuration(200);
                trf.a.start();
            }
        }
        trq h2 = trt.h();
        if ((h2 instanceof a) || (h2 instanceof b)) {
            int f2 = trt.f();
            boolean z = true;
            if ((trt.i() >= 0) && gd.b(f2, -1) < 2.0d) {
                z = false;
            }
            if (z) {
                this.k.a(f2, trt.g(), cVar.b);
                return;
            }
            this.k.b(f2, trt.g(), cVar.b);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        c();
        trf trf = this.l;
        trf.a();
        trf.a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        trf.a.setDuration(800);
        trf.a.setInterpolator(ftn.e);
        trf.a.setRepeatMode(2);
        trf.a.addUpdateListener(new trg(-11316397, 0.125f, this) {
            private /* synthetic */ trc a;

            {
                this.a = r4;
            }

            /* access modifiers changed from: 0000 */
            public final void a(int i) {
                this.a.a(i);
            }
        });
        trf.a.setRepeatCount(-1);
        trf.a.start();
    }
}
