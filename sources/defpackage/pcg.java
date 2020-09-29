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

/* renamed from: pcg reason: default package */
public final class pcg implements pcd {
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
    private final tsp k;
    private final vti<fxn> l;
    private final vti<a> m;
    private final vti<a> n;
    private TransformationSet o;
    private SpotifyIconDrawable p;
    private SpotifyIconDrawable q;

    public pcg(Resources resources, tsp tsp, Picasso picasso, vti<fxn> vti, vti<a> vti2, vti<a> vti3) {
        this.h = resources;
        this.l = vti;
        this.i = picasso;
        this.k = tsp;
        this.m = vti2;
        this.n = vti3;
    }

    public final View getView() {
        return this.a;
    }

    public final void a(int i2, float f2) {
        ((fxn) this.l.get()).a(this.j.getInterpolation(f2));
        if (this.h.getConfiguration().orientation == 1) {
            this.o.a(f2);
        }
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = layoutInflater.inflate(R.layout.header_podcast_episode, viewGroup, false);
        this.k.a((a) this.n.get());
        this.o = fvv.a(this.a);
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
        ((fxn) this.l.get()).a(0.0f);
        uui.a(this.f).b(this.f).a();
        uui.b(this.d).a(this.d).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(pci pci, View view) {
        ((a) this.m.get()).b(pci.i());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(pci pci, View view) {
        ((a) this.m.get()).a(pci.i());
    }

    public final void a(Bitmap bitmap) {
        this.f.setImageDrawable(new uvc(bitmap, this.h.getDimension(R.dimen.podcast_cover_art_corner_radius)));
    }

    public final void a(Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    public final void a(int i2) {
        ((a) this.m.get()).a(i2);
    }

    public final void a(pci pci) {
        if (pci.a() == 1) {
            int d2 = pci.d();
            this.e.setMax(pci.e());
            this.e.setVisibility(0);
            this.e.setProgress(d2);
        } else {
            this.e.setVisibility(8);
        }
        if (pci.a() == 2) {
            this.g.setImageDrawable(this.p);
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
        this.b.setText(pci.b());
        this.c.setText(pci.c());
        this.d.setText(pci.f());
        ((fxn) this.l.get()).a(pci.b());
        this.i.a(pci.h()).a((Drawable) this.q).b((Drawable) this.q).a((int) R.dimen.podcast_cover_art_size, (int) R.dimen.podcast_cover_art_size).a(this.k.a());
        this.d.setOnClickListener(new $$Lambda$pcg$bUGMcrNw5vkutOtkyuMaT5k_OI(this, pci));
        this.f.setContentDescription(pci.f());
        this.f.setOnClickListener(new $$Lambda$pcg$h9qB8ZIkPDyEfmNoJwevVxAmFw(this, pci));
        jxb.a(this.c.getContext(), this.c, pci.o());
    }
}
