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

/* renamed from: oyb reason: default package */
public final class oyb implements oye {
    private final Context a;
    private final oxu b;
    private final AppBarLayout c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final View g;
    private final float h = this.a.getResources().getDimension(R.dimen.podcast_entity_image_corner_radius);
    private final TransformationSet i;
    private oxx j;

    public oyb(LayoutInflater layoutInflater, Context context, AppBarLayout appBarLayout, oxu oxu) {
        View inflate = layoutInflater.inflate(R.layout.podcast_entity_header_v3, appBarLayout, false);
        this.c = appBarLayout;
        this.a = context;
        this.b = oxu;
        this.c.addView(inflate);
        this.g = ip.c(inflate, (int) R.id.image_frame);
        this.d = (ImageView) ip.c(inflate, (int) R.id.header_image);
        this.e = (TextView) ip.c(inflate, (int) R.id.podcast_title);
        this.f = (TextView) ip.c(inflate, (int) R.id.podcast_creator);
        uui.a(this.d).b(this.d).a();
        View view = this.g;
        this.i = ((d) fwq.a(0.0f, 0.4f).a().a(1.0f, 0.0f).a(fwo.a(view, View.ALPHA)).a(1.0f, 0.8f).a(fwo.a(view, Arrays.asList(new Property[]{View.SCALE_X, View.SCALE_Y}))).a()).a;
        this.c.a((b) new $$Lambda$oyb$bb7aaHM1ezECp0G97pERDTM67ic(this));
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
        oxx oxx = this.j;
        if (oxx != null) {
            oxx.onTitleOffsetChanged(Math.min(a2, 1.0f));
        }
    }

    public final void a(oyj oyj) {
        this.e.setText(oyj.a());
        this.f.setText(oyj.b());
        this.d.setOnClickListener(new $$Lambda$oyb$r_nUxe2abj_uGtv1Y6RD63exIQ(this, oyj));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oyj oyj, View view) {
        this.b.a(this.a, this.d, oyj.e());
    }

    public final void a(rxs rxs) {
        Bitmap c2 = rxs.c();
        int b2 = rxs.b();
        Drawable d2 = rxs.d();
        if (c2 != null) {
            this.d.setImageDrawable(new uvc(c2, this.h));
        }
        if (d2 != null) {
            this.d.setImageDrawable(d2);
        }
        ip.a((View) this.c, (Drawable) fwf.a(this.a, b2));
        this.f.setTextColor(rxs.a());
    }

    public final void a(oxx oxx) {
        this.j = oxx;
    }

    public final View getView() {
        return this.c;
    }

    private static float a(View view, int i2) {
        int max = Math.max(i2 - view.getTop(), 0);
        int height = view.getHeight();
        if (height <= 0) {
            return 1.0f;
        }
        return ((float) max) / ((float) height);
    }

    private static float a(float f2) {
        return 1.0f - Math.min(f2, 1.0f);
    }
}
