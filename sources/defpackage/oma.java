package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.base.Optional;
import com.spotify.libs.glue.custom.playbutton.CirclePlayButtonView;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.music.R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.spotify.playlist.models.Covers.Size;
import com.squareup.picasso.Picasso;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: oma reason: default package */
final class oma implements oly, olz {
    private final ols b;
    private final ohg c;
    private final Picasso d;
    /* access modifiers changed from: private */
    public final Context e;
    private final a f;
    private RecyclerView g;
    private glf h;
    private fxn i;
    private CoordinatorLayout j;
    /* access modifiers changed from: private */
    public AppBarLayout k;
    private ViewGroup l;
    private Optional<Boolean> m;
    private jql n;
    private oln o;
    private Drawable p;

    public oma(Picasso picasso, Context context, olt olt, a aVar, ohg ohg) {
        this(picasso, context, olt, aVar, ohg, Optional.e());
    }

    public oma(Picasso picasso, Context context, olt olt, a aVar, ohg ohg, Optional<olw> optional) {
        olt olt2 = olt;
        ohg ohg2 = ohg;
        this.m = Optional.e();
        ols ols = new ols((ois) olt.a(olt2.a.get(), 1), (olo) olt.a(olt2.b.get(), 2), (spi) olt.a(olt2.c.get(), 3), (uxt) olt.a(olt2.d.get(), 4), (ofa) olt.a(olt2.e.get(), 5), (olv) olt.a(olt2.f.get(), 6), (ofh) olt.a(olt2.g.get(), 7), (String) olt.a(olt2.h.get(), 8), (Scheduler) olt.a(olt2.i.get(), 9), (ohg) olt.a(ohg2, 10), (Optional) olt.a(optional, 11));
        this.b = ols;
        this.f = aVar;
        this.c = ohg2;
        this.d = picasso;
        this.e = context;
    }

    public final Completable a() {
        return this.b.e;
    }

    public final void a(Bundle bundle) {
        ols ols = this.b;
        if (bundle != null) {
            ols.g = Boolean.valueOf(bundle.getBoolean(ols.class.getName()));
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a((olz) this);
    }

    public final void c() {
        this.b.a((olz) null);
    }

    public final void d() {
        this.b.a.c();
    }

    public final void b(Bundle bundle) {
        ols ols = this.b;
        if (ols.f != null) {
            bundle.putBoolean(ols.class.getName(), ols.f.f());
        }
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsf fsf) {
        glf glf;
        this.j = (CoordinatorLayout) layoutInflater.inflate(R.layout.playlist_header, viewGroup, false);
        this.g = (RecyclerView) this.j.findViewById(R.id.recycler_view);
        this.k = (AppBarLayout) this.j.findViewById(R.id.header_view);
        this.l = (ViewGroup) this.j.findViewById(R.id.accessory);
        this.g.a((i) new LinearLayoutManager(this.e));
        if (this.c.h()) {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.j.findViewById(R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.a(this.g);
            recyclerViewFastScroller.setEnabled(true);
            this.g.setVerticalScrollBarEnabled(false);
        }
        gaa.a(this.e);
        this.i = fsf.b();
        boolean z = this.e.getResources().getBoolean(R.bool.showPlayButtonInHeader);
        this.i.a(0.0f);
        if (!this.c.b() || !z) {
            h(false);
        } else {
            if (this.c.c().c()) {
                glf = this.f.a(new CirclePlayButtonView(this.e));
            } else {
                a aVar = this.f;
                fzz.a();
                glf = aVar.a(a.a(this.e));
            }
            glf.a((OnClickListener) new $$Lambda$oma$NgBXwn5en2B3lh9ud2g46ZGyWrI(this));
            this.l.addView(glf.a());
            this.h = glf;
            h(true);
        }
        this.o = new oln(this.e, this.k, this.c.f());
        oln oln = this.o;
        View view = oln.getView();
        this.k.addView(view);
        this.k.a((b) new $$Lambda$oma$spncRnYl6o9ksAzfZjzyKFJ9RR0(this, view, oln));
        oln.b.setOnClickListener(new $$Lambda$oma$3rJUg6xKXqXlfa4H9HnQHDaoG4(this));
        this.p = fzg.e(this.e);
        oln.b.setImageDrawable(this.p);
        oln.f.setOnClickListener(new $$Lambda$oma$xUnWUpra7hrf4ObkzE_t4mOlqTU(this));
        this.n = oln.e;
        if (this.n != null) {
            Drawable f2 = fzg.f(this.e);
            this.n.a((OnClickListener) new $$Lambda$oma$aX6vj5A_qbGOdJ2r1hXKKdrUfU(this));
            ((ImageView) fay.a(this.n.b)).setImageDrawable(f2);
        }
        if (this.m.b()) {
            this.k.a(((Boolean) this.m.c()).booleanValue(), false, true);
            this.m = Optional.e();
        }
        return Collections.singletonList(this.j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, oln oln, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        oln.a(abs, height);
        oln.getView().setTranslationY(f2);
        this.i.a(height);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        ols ols = this.b;
        ols.b.c(ols.d);
        uyz a = ols.h.a();
        ols.f.b(a.getImageUri(Size.LARGE), a.getImageUri(Size.XLARGE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ols ols = this.b;
        ols.b.d(ols.d);
        uzd d2 = ols.h.a().d();
        if (d2 != null) {
            ols.c.a(d2.a());
        }
    }

    private int g() {
        return gaa.c(this.e) + uuu.c(this.e, R.attr.actionBarSize);
    }

    private void h(boolean z) {
        int g2 = g();
        int i2 = 0;
        if (z) {
            float f2 = (float) ((this.c.c().c() ? 6 : 0) + 24);
            this.k.setPadding(0, g2, 0, uts.c(f2, this.e.getResources()));
            this.k.setClipToPadding(false);
            this.g.setPadding(0, uts.c(f2, this.e.getResources()), 0, 0);
            this.g.setClipToPadding(false);
        } else {
            this.k.setPadding(0, g2, 0, 0);
            this.g.setPadding(0, 0, 0, 0);
        }
        ViewGroup viewGroup = this.l;
        if (!z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }

    public final RecyclerView i() {
        return this.g;
    }

    public final void a(boolean z) {
        oln oln = this.o;
        if (oln != null) {
            oln.f.setVisibility(z ? 0 : 8);
        }
    }

    public final void b(boolean z) {
        oln oln = this.o;
        if (oln != null) {
            oln.f.setChecked(z);
        }
    }

    public final void a(String str, long j2, int i2, String str2) {
        jql jql = this.n;
        if (jql != null) {
            jql.a.setText(jrw.a(str));
            this.n.a(true);
            jql jql2 = this.n;
            if (!(!TextUtils.isEmpty(str))) {
                jql2.a.setVisibility(8);
            } else {
                jql2.a.setVisibility(0);
                jql2.a.setMaxLines(4);
                jql2.a.setEllipsize(TruncateAt.END);
                LayoutParams layoutParams = jql2.b.getLayoutParams();
                int dimensionPixelSize = jql2.getResources().getDimensionPixelSize(R.dimen.header_info_page_image_size_small);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                jql2.b.setLayoutParams(layoutParams);
            }
            this.n.a(j2);
            this.n.a(i2);
            this.n.b(str2.toUpperCase(Locale.getDefault()));
        }
    }

    public final void c(boolean z) {
        oln oln = this.o;
        if (oln != null) {
            oln.d.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(String str, boolean z) {
        oln oln = this.o;
        if (oln != null) {
            oln.d.setText(str);
            oln.d.setVisibility(fax.a(str) ? 8 : 0);
            if (z) {
                oln.d.setCompoundDrawablesWithIntrinsicBounds(fqx.a(oln.d.getContext()), null, null, null);
                oln.d.setCompoundDrawablePadding(oln.a);
                return;
            }
            oln.d.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(ojc ojc, olw olw) {
        oln oln = this.o;
        if (oln != null) {
            c(olw.a(ojc, oln.d));
        }
    }

    public final void a(String str) {
        oln oln = this.o;
        if (oln != null) {
            oln.c.setText(str);
        }
        this.i.a(str);
    }

    public final void b(String str) {
        if (this.n != null) {
            this.d.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(uvt.a(this.n.b));
        }
    }

    public final void a(String str, String str2) {
        oln oln = this.o;
        ImageView imageView = oln == null ? new ImageView(this.e) : oln.b;
        Uri uri = (fax.a(str2) || !this.e.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) ? !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY : !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
        vsl a = this.d.a(uri);
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.p;
        }
        a.a(drawable).b(drawable).a(uvt.a(imageView, (uvj) new uvj() {
            public final void a(int i) {
                ip.a((View) oma.this.k, (Drawable) fwf.a((Drawable) new ColorDrawable(i), (Drawable) new fwe(oma.this.e)));
            }
        }));
    }

    public final void b(String str, String str2) {
        oln oln = this.o;
        if (oln != null) {
            ImageView imageView = (ImageView) fay.a(oln.b);
            Uri uri = (fax.a(str2) || !this.e.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) ? !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY : !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
            Uri uri2 = uri;
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            CoverImageActivity.a(this.e, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri2, this.e.getResources().getConfiguration().orientation);
        }
    }

    public final void a(int i2) {
        this.g.post(new $$Lambda$oma$xaCFZYjMhpRNIsodDZnBPrtvf60(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i2) {
        this.j.post(new $$Lambda$oma$hXTH8jxlTIzLREwtA7c17wzkmuU(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.k.a(false, false, true);
        i d2 = this.g.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    public final void d(boolean z) {
        glf glf = this.h;
        if (glf != null) {
            glf.a(z);
        }
    }

    public final void e(boolean z) {
        glf glf = this.h;
        if (glf != null) {
            glf.b(z);
        }
    }

    public final void f(boolean z) {
        boolean z2 = true;
        boolean z3 = z && this.h != null;
        if (this.l.getVisibility() != 0) {
            z2 = false;
        }
        if (z3 != z2) {
            h(z3);
        }
    }

    public final void e() {
        if (this.l != null) {
            ShufflePlayHeaderView.a(new jri(), this.l);
        }
    }

    public final boolean f() {
        AppBarLayout appBarLayout = this.k;
        if (appBarLayout == null || appBarLayout.getHeight() - this.k.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public final void g(boolean z) {
        AppBarLayout appBarLayout = this.k;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.m = Optional.b(Boolean.valueOf(z));
        }
    }

    public final boolean l() {
        return jtc.b(this.e) && !this.e.getResources().getBoolean(R.bool.showPlayButtonInHeader);
    }
}
