package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.music.R;
import java.util.Arrays;

/* renamed from: pfn reason: default package */
public final class pfn implements pfq {
    private final Context a;
    private final pfg b;
    private final AppBarLayout c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final View g;
    private final float h = this.a.getResources().getDimension(R.dimen.podcast_entity_image_corner_radius);
    private final TransformationSet i;
    private pfj j;

    public pfn(LayoutInflater layoutInflater, Context context, AppBarLayout appBarLayout, pfg pfg) {
        View inflate = layoutInflater.inflate(R.layout.podcast_entity_header_v3, appBarLayout, false);
        this.c = appBarLayout;
        this.a = context;
        this.b = pfg;
        this.c.addView(inflate);
        this.g = ip.d(inflate, (int) R.id.image_frame);
        this.d = (ImageView) ip.d(inflate, (int) R.id.header_image);
        this.e = (TextView) ip.d(inflate, (int) R.id.podcast_title);
        this.f = (TextView) ip.d(inflate, (int) R.id.podcast_creator);
        vfz.a(this.d).b(this.d).a();
        View view = this.g;
        this.i = ((d) fxk.a(0.0f, 0.4f).a().a(1.0f, 0.0f).a(fxi.a(view, View.ALPHA)).a(1.0f, 0.8f).a(fxi.a(view, Arrays.asList(new Property[]{View.SCALE_X, View.SCALE_Y}))).a()).a;
        this.c.a((b) new $$Lambda$pfn$y4cIsJ7xOLcqmOQYlQkGDnYdTx0(this));
    }

    private static float a(float f2) {
        return 1.0f - Math.min(f2, 1.0f);
    }

    private static float a(View view, int i2) {
        int max = Math.max(i2 - view.getTop(), 0);
        int height = view.getHeight();
        if (height <= 0) {
            return 1.0f;
        }
        return ((float) max) / ((float) height);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppBarLayout appBarLayout, int i2) {
        int i3 = -i2;
        float f2 = (float) i3;
        float b2 = f2 / ((float) appBarLayout.b());
        this.g.setTranslationY(f2);
        this.i.a(b2);
        float a2 = a((View) this.e, i3);
        float a3 = a((View) this.f, i3);
        this.e.setAlpha(a(a2));
        this.f.setAlpha(a(a3));
        pfj pfj = this.j;
        if (pfj != null) {
            pfj.onTitleOffsetChanged(Math.min(a2, 1.0f));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(pfv pfv, View view) {
        this.b.a(this.a, this.d, pfv.e());
    }

    public final void a(pfj pfj) {
        this.j = pfj;
    }

    public final void a(pfv pfv) {
        this.e.setText(pfv.a());
        this.f.setText(pfv.b());
        this.d.setOnClickListener(new $$Lambda$pfn$2s6bqtzMvE9J0ulGaM_ISnpzLV0(this, pfv));
    }

    public final void a(shc shc) {
        Bitmap c2 = shc.c();
        int b2 = shc.b();
        Drawable d2 = shc.d();
        if (c2 != null) {
            this.d.setImageDrawable(new vgt(c2, this.h));
        }
        if (d2 != null) {
            this.d.setImageDrawable(d2);
        }
        ip.a((View) this.c, (Drawable) fwz.a(this.a, b2));
        this.f.setTextColor(shc.a());
    }

    public final View getView() {
        return this.c;
    }
}
