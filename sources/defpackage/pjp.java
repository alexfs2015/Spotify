package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

/* renamed from: pjp reason: default package */
public final class pjp implements pjm {
    private View a;
    private TextView b;
    private TextView c;
    private TextView d;
    private ProgressBar e;
    private ImageView f;
    private ImageView g;
    private final Resources h;
    private final Picasso i;
    private final Interpolator j = new AccelerateInterpolator(2.0f);
    private final ues k;
    private final who<fyh> l;
    private final who<a> m;
    private final who<a> n;
    private TransformationSet o;
    private SpotifyIconDrawable p;
    private SpotifyIconDrawable q;

    public pjp(Resources resources, ues ues, Picasso picasso, who<fyh> who, who<a> who2, who<a> who3) {
        this.h = resources;
        this.l = who;
        this.i = picasso;
        this.k = ues;
        this.m = who2;
        this.n = who3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(pjr pjr, View view) {
        ((a) this.m.get()).a(pjr.i());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(pjr pjr, View view) {
        ((a) this.m.get()).b(pjr.i());
    }

    public final void a(int i2) {
        ((a) this.m.get()).a(i2);
    }

    public final void a(int i2, float f2) {
        ((fyh) this.l.get()).a(this.j.getInterpolation(f2));
        if (this.h.getConfiguration().orientation == 1) {
            this.o.a(f2);
        }
    }

    public final void a(Bitmap bitmap) {
        this.f.setImageDrawable(new vgt(bitmap, this.h.getDimension(R.dimen.podcast_cover_art_corner_radius)));
    }

    public final void a(Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = layoutInflater.inflate(R.layout.header_podcast_episode, viewGroup, false);
        this.k.a((a) this.n.get());
        this.o = fwp.a(this.a);
        Context context = this.a.getContext();
        this.p = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK_ALT_FILL, (float) this.h.getDimensionPixelSize(R.dimen.played_icon_size));
        this.p.a(fr.c(context, R.color.green));
        this.q = new SpotifyIconDrawable(context, SpotifyIconV2.PODCASTS, (float) this.h.getDimensionPixelSize(R.dimen.podcast_placeholder));
        this.b = (TextView) this.a.findViewById(R.id.txt_title);
        this.d = (TextView) this.a.findViewById(R.id.txt_podcast_name);
        this.c = (TextView) this.a.findViewById(R.id.txt_subtitle);
        this.e = (ProgressBar) this.a.findViewById(R.id.progress_bar);
        this.f = (ImageView) this.a.findViewById(R.id.img_podcast_cover_art);
        this.g = (ImageView) this.a.findViewById(R.id.img_played);
        ((fyh) this.l.get()).a(0.0f);
        vfz.a(this.f).b(this.f).a();
        vfz.b(this.d).a(this.d).a();
    }

    public final void a(pjr pjr) {
        if (pjr.a() == 1) {
            int d2 = pjr.d();
            this.e.setMax(pjr.e());
            this.e.setVisibility(0);
            this.e.setProgress(d2);
        } else {
            this.e.setVisibility(8);
        }
        if (pjr.a() == 2) {
            this.g.setImageDrawable(this.p);
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
        this.b.setText(pjr.b());
        this.c.setText(pjr.c());
        this.d.setText(pjr.f());
        ((fyh) this.l.get()).a(pjr.b());
        this.i.a(pjr.h()).a((Drawable) this.q).b((Drawable) this.q).a((int) R.dimen.podcast_cover_art_size, (int) R.dimen.podcast_cover_art_size).a(this.k.a());
        this.d.setOnClickListener(new $$Lambda$pjp$ZJuXSFElSnVECslzrmxjDG7q0RY(this, pjr));
        this.f.setContentDescription(pjr.f());
        this.f.setOnClickListener(new $$Lambda$pjp$1rdxl25eNtjLmTaLfiTewHwGQv8(this, pjr));
        jzb.a(this.c.getContext(), this.c, pjr.o());
    }

    public final View getView() {
        return this.a;
    }
}
