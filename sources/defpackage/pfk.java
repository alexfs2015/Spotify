package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.collect.Lists;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.music.R;
import com.spotify.paste.widgets.ViewPagerIndicator;
import com.squareup.picasso.Picasso;

/* renamed from: pfk reason: default package */
public final class pfk implements pfq {
    public jsr a;
    private final Context b;
    private final Picasso c;
    private final pfg d;
    private final AppBarLayout e;
    private final View f;
    private final TransformationSet g = fwp.a(this.f);
    private ImageView h;
    private TextView i;
    private TextView j;
    private pfj k;

    public pfk(LayoutInflater layoutInflater, Context context, AppBarLayout appBarLayout, Picasso picasso, pfg pfg) {
        this.b = context;
        this.c = picasso;
        this.d = pfg;
        this.e = appBarLayout;
        this.f = layoutInflater.inflate(R.layout.podcast_entity_header_content, appBarLayout, false);
        this.e.addView(this.f);
        this.e.a((b) new $$Lambda$pfk$f94s5anbkk9ACEQM3vUfLwuUR4(this));
        ViewPager viewPager = (ViewPager) ip.d(this.f, (int) R.id.view_pager);
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_entity_header_first_page, viewPager, false);
        this.h = (ImageView) ip.d(inflate, (int) R.id.header_image);
        this.j = (TextView) ip.d(inflate, (int) R.id.header_title);
        this.i = (TextView) ip.d(inflate, (int) R.id.header_subtitle);
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) ip.d(getView(), (int) R.id.page_indicator);
        this.a = new jsr(context);
        this.a.b.setGravity(17);
        viewPagerIndicator.setVisibility(0);
        viewPagerIndicator.a(viewPager);
        jsr jsr = this.a;
        final TextView textView = jsr.a;
        final TextView textView2 = this.a.b;
        final int c2 = vgl.c(inflate.getContext(), R.attr.actionBarSize);
        final View view = inflate;
        AnonymousClass1 r0 = new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                int height = (view.getHeight() - textView2.getHeight()) - c2;
                int lineHeight = textView.getLineHeight();
                if (lineHeight > 0) {
                    textView.setMaxLines(height / lineHeight);
                }
            }
        };
        inflate.addOnLayoutChangeListener(r0);
        pem pem = new pem(Lists.a((E[]) new View[]{inflate, jsr}), vgi.a(context));
        viewPager.a((sf) pem);
        viewPager.b(pem.d());
        vfz.a(this.h).b(this.h).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppBarLayout appBarLayout, int i2) {
        float f2 = (float) (-i2);
        float b2 = f2 / ((float) appBarLayout.b());
        this.f.setTranslationY(f2);
        this.g.a(b2);
        pfj pfj = this.k;
        if (pfj != null) {
            pfj.onTitleOffsetChanged(b2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(pfv pfv, View view) {
        this.d.a(this.b, this.h, pfv.e());
    }

    public final void a(pfj pfj) {
        this.k = pfj;
    }

    public final void a(pfv pfv) {
        String str;
        this.j.setText(pfv.a());
        TextView textView = this.i;
        String b2 = pfv.b();
        if (!fbo.a(b2)) {
            str = this.b.getResources().getString(R.string.show_header_by_publisher, new Object[]{b2}).toUpperCase(jua.a(this.b));
        } else {
            str = "";
        }
        textView.setText(str);
        this.a.a((CharSequence) pfv.c());
        this.a.a(pfv.d());
        Drawable c2 = gaa.c(this.b);
        this.c.a(pfv.e()).a(c2).b(c2).a(this.h);
        this.h.setScaleType(ScaleType.CENTER_CROP);
        this.h.setOnClickListener(new $$Lambda$pfk$jmvWN6s_8U30ULTEXcJYzltzGxg(this, pfv));
    }

    public final void a(shc shc) {
        Bitmap c2 = shc.c();
        int b2 = shc.b();
        Drawable d2 = shc.d();
        if (c2 != null) {
            this.h.setImageBitmap(c2);
        }
        if (d2 != null) {
            this.h.setImageDrawable(d2);
        }
        ip.a((View) this.e, (Drawable) fwz.a(this.b, b2));
    }

    public final View getView() {
        return this.f;
    }
}
