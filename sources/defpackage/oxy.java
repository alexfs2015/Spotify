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

/* renamed from: oxy reason: default package */
public final class oxy implements oye {
    public jqg a;
    private final Context b;
    private final Picasso c;
    private final oxu d;
    private final AppBarLayout e;
    private final View f;
    private final TransformationSet g = fvv.a(this.f);
    private ImageView h;
    private TextView i;
    private TextView j;
    private oxx k;

    public oxy(LayoutInflater layoutInflater, Context context, AppBarLayout appBarLayout, Picasso picasso, oxu oxu) {
        this.b = context;
        this.c = picasso;
        this.d = oxu;
        this.e = appBarLayout;
        this.f = layoutInflater.inflate(R.layout.podcast_entity_header_content, appBarLayout, false);
        this.e.addView(this.f);
        this.e.a((b) new $$Lambda$oxy$UOx6kPQodvbHKHIKR78oFyoMXVg(this));
        ViewPager viewPager = (ViewPager) ip.c(this.f, (int) R.id.view_pager);
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_entity_header_first_page, viewPager, false);
        this.h = (ImageView) ip.c(inflate, (int) R.id.header_image);
        this.j = (TextView) ip.c(inflate, (int) R.id.header_title);
        this.i = (TextView) ip.c(inflate, (int) R.id.header_subtitle);
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) ip.c(getView(), (int) R.id.page_indicator);
        this.a = new jqg(context);
        this.a.b.setGravity(17);
        viewPagerIndicator.setVisibility(0);
        viewPagerIndicator.a(viewPager);
        jqg jqg = this.a;
        final TextView textView = jqg.a;
        final TextView textView2 = this.a.b;
        final int c2 = uuu.c(inflate.getContext(), R.attr.actionBarSize);
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
        owz owz = new owz(Lists.a((E[]) new View[]{inflate, jqg}), uur.a(context));
        viewPager.a((sa) owz);
        viewPager.b(owz.d());
        uui.a(this.h).b(this.h).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppBarLayout appBarLayout, int i2) {
        float f2 = (float) (-i2);
        float b2 = f2 / ((float) appBarLayout.b());
        this.f.setTranslationY(f2);
        this.g.a(b2);
        oxx oxx = this.k;
        if (oxx != null) {
            oxx.onTitleOffsetChanged(b2);
        }
    }

    public final void a(oyj oyj) {
        String str;
        this.j.setText(oyj.a());
        TextView textView = this.i;
        String b2 = oyj.b();
        if (!fax.a(b2)) {
            str = this.b.getResources().getString(R.string.show_header_by_publisher, new Object[]{b2}).toUpperCase(jrq.a(this.b));
        } else {
            str = "";
        }
        textView.setText(str);
        this.a.a((CharSequence) oyj.c());
        this.a.a(oyj.d());
        Drawable c2 = fzg.c(this.b);
        this.c.a(oyj.e()).a(c2).b(c2).a(this.h);
        this.h.setScaleType(ScaleType.CENTER_CROP);
        this.h.setOnClickListener(new $$Lambda$oxy$AbdzTtDjlnzFrcpU4NIN4aFMZVs(this, oyj));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oyj oyj, View view) {
        this.d.a(this.b, this.h, oyj.e());
    }

    public final void a(rxs rxs) {
        Bitmap c2 = rxs.c();
        int b2 = rxs.b();
        Drawable d2 = rxs.d();
        if (c2 != null) {
            this.h.setImageBitmap(c2);
        }
        if (d2 != null) {
            this.h.setImageDrawable(d2);
        }
        ip.a((View) this.e, (Drawable) fwf.a(this.b, b2));
    }

    public final void a(oxx oxx) {
        this.k = oxx;
    }

    public final View getView() {
        return this.f;
    }
}
