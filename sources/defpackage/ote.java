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
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.music.R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.spotify.playlist.models.Covers.Size;
import com.squareup.picasso.Picasso;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: ote reason: default package */
final class ote implements otc, otd {
    private final osw b;
    private final ook c;
    private final Picasso d;
    /* access modifiers changed from: private */
    public final Context e;
    private final a f;
    private final jtz g;
    private RecyclerView h;
    private gmu i;
    private fyh j;
    private CoordinatorLayout k;
    /* access modifiers changed from: private */
    public AppBarLayout l;
    private ViewGroup m;
    private Optional<Boolean> n;
    private jsw o;
    private osr p;
    private Drawable q;

    public ote(Picasso picasso, Context context, osx osx, a aVar, jtz jtz, ook ook) {
        this(picasso, context, osx, aVar, jtz, ook, Optional.e());
    }

    public ote(Picasso picasso, Context context, osx osx, a aVar, jtz jtz, ook ook, Optional<ota> optional) {
        osx osx2 = osx;
        ook ook2 = ook;
        this.n = Optional.e();
        osw osw = new osw((opw) osx.a(osx2.a.get(), 1), (oss) osx.a(osx2.b.get(), 2), (szp) osx.a(osx2.c.get(), 3), (vjv) osx.a(osx2.d.get(), 4), (osz) osx.a(osx2.e.get(), 5), (oml) osx.a(osx2.f.get(), 6), (String) osx.a(osx2.g.get(), 7), (Scheduler) osx.a(osx2.h.get(), 8), (ook) osx.a(ook2, 9), (Optional) osx.a(optional, 10));
        this.b = osw;
        this.f = aVar;
        this.c = ook2;
        this.d = picasso;
        this.e = context;
        this.g = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        osw osw = this.b;
        osw.b.d(osw.d);
        vlg d2 = osw.h.a().d();
        if (d2 != null) {
            osw.c.a(d2.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, osr osr, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        osr.a(abs, height);
        osr.getView().setTranslationY(f2);
        this.j.a(height);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i2) {
        this.k.post(new $$Lambda$ote$x44yOHk7Qm5bfo5C0FIPjsR97w(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.l.a(false, false, true);
        i d2 = this.h.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        osw osw = this.b;
        if (osw.f != null) {
            osw.b.c(osw.d);
            vlc a = osw.h.a();
            osw.f.b(a.getImageUri(Size.LARGE), a.getImageUri(Size.XLARGE));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.b.a();
    }

    private int f() {
        return gau.c(this.e) + vgl.c(this.e, R.attr.actionBarSize);
    }

    private void h(boolean z) {
        int f2 = f();
        int i2 = 0;
        if (z) {
            float f3 = (float) ((this.c.c().c() ? 6 : 0) + 24);
            this.l.setPadding(0, f2, 0, vfj.c(f3, this.e.getResources()));
            this.l.setClipToPadding(false);
            this.h.setPadding(0, vfj.c(f3, this.e.getResources()), 0, 0);
            this.h.setClipToPadding(false);
        } else {
            this.l.setPadding(0, f2, 0, 0);
            this.h.setPadding(0, 0, 0, 0);
        }
        ViewGroup viewGroup = this.m;
        if (!z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }

    public final Completable a() {
        return this.b.e;
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsz fsz) {
        gmu gmu;
        this.k = (CoordinatorLayout) layoutInflater.inflate(R.layout.playlist_header, viewGroup, false);
        this.h = (RecyclerView) this.k.findViewById(R.id.recycler_view);
        this.l = (AppBarLayout) this.k.findViewById(R.id.header_view);
        this.m = (ViewGroup) this.k.findViewById(R.id.accessory);
        this.h.a((i) new LinearLayoutManager(this.e));
        if (this.c.h()) {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.k.findViewById(R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.a(this.h);
            recyclerViewFastScroller.setEnabled(true);
            this.h.setVerticalScrollBarEnabled(false);
        }
        gau.a(this.e);
        this.j = fsz.b();
        boolean z = this.e.getResources().getBoolean(R.bool.showPlayButtonInHeader);
        this.j.a(0.0f);
        if (!this.c.b() || !z) {
            h(false);
        } else {
            if (this.c.c().c()) {
                gmu = this.f.a(this.e);
            } else {
                a aVar = this.f;
                gat.a();
                gmu = aVar.a(a.a(this.e));
            }
            gmu.a((OnClickListener) new $$Lambda$ote$F8NaryzbfeNHYUIMjGh1OfHxNM4(this));
            this.m.addView(gmu.a());
            this.i = gmu;
            h(true);
        }
        this.p = new osr(this.e, this.l, this.c.f());
        osr osr = this.p;
        View view = osr.getView();
        this.l.addView(view);
        this.l.a((b) new $$Lambda$ote$L4SPQmHhdwKABOLQADOs77MFOwc(this, view, osr));
        osr.b.setOnClickListener(new $$Lambda$ote$rg1LkSyQwPIE5cHq0sQq8Hi2bY4(this));
        this.q = gaa.e(this.e);
        osr.b.setImageDrawable(this.q);
        osr.f.setOnClickListener(new $$Lambda$ote$ige2zpkEGmMaZwjWegCGdDnC6I(this));
        this.o = osr.e;
        if (this.o != null) {
            Drawable f2 = gaa.f(this.e);
            this.o.a((OnClickListener) new $$Lambda$ote$ippAyY0WE9_gJJfhcgvxzS_s7fQ(this));
            ((ImageView) fbp.a(this.o.b)).setImageDrawable(f2);
        }
        if (this.n.b()) {
            this.l.a(((Boolean) this.n.c()).booleanValue(), false, true);
            this.n = Optional.e();
        }
        return Collections.singletonList(this.k);
    }

    public final void a(int i2) {
        this.h.post(new $$Lambda$ote$2WojNleZiXmTSKOxniD2jTEUDoU(this, i2));
    }

    public final void a(Bundle bundle) {
        osw osw = this.b;
        if (bundle != null) {
            osw.g = Boolean.valueOf(bundle.getBoolean(osw.class.getName()));
        }
    }

    public final void a(String str) {
        osr osr = this.p;
        if (osr != null) {
            osr.c.setText(str);
        }
        this.j.a(str);
    }

    public final void a(String str, long j2, int i2, String str2) {
        jsw jsw = this.o;
        if (jsw != null) {
            jsw.a.setText(jug.a(str));
            this.o.a(true);
            jsw jsw2 = this.o;
            if (!(!TextUtils.isEmpty(str))) {
                jsw2.a.setVisibility(8);
            } else {
                jsw2.a.setVisibility(0);
                jsw2.a.setMaxLines(4);
                jsw2.a.setEllipsize(TruncateAt.END);
                LayoutParams layoutParams = jsw2.b.getLayoutParams();
                int dimensionPixelSize = jsw2.getResources().getDimensionPixelSize(R.dimen.header_info_page_image_size_small);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                jsw2.b.setLayoutParams(layoutParams);
            }
            this.o.a(this.g, j2);
            this.o.a(i2);
            this.o.b(str2.toUpperCase(Locale.getDefault()));
        }
    }

    public final void a(String str, String str2) {
        osr osr = this.p;
        ImageView imageView = osr == null ? new ImageView(this.e) : osr.b;
        Uri uri = (fbo.a(str2) || !this.e.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) ? !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY : !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
        wgr a = this.d.a(uri);
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.q;
        }
        a.a(drawable).b(drawable).a(vhj.a(imageView, (vha) new vha() {
            public final void a(int i) {
                ip.a((View) ote.this.l, (Drawable) fwz.a((Drawable) new ColorDrawable(i), (Drawable) new fwy(ote.this.e)));
            }
        }));
    }

    public final void a(String str, boolean z) {
        osr osr = this.p;
        if (osr != null) {
            osr.d.setText(str);
            osr.d.setVisibility(fbo.a(str) ? 8 : 0);
            if (z) {
                osr.d.setCompoundDrawablesWithIntrinsicBounds(frr.a(osr.d.getContext()), null, null, null);
                osr.d.setCompoundDrawablePadding(osr.a);
                return;
            }
            osr.d.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void a(oqg oqg, ota ota) {
        osr osr = this.p;
        if (osr != null) {
            c(ota.a(oqg, osr.d));
        }
    }

    public final void a(boolean z) {
        osr osr = this.p;
        if (osr != null) {
            osr.f.setVisibility(z ? 0 : 8);
        }
    }

    public final void ay_() {
        this.b.a((otd) this);
    }

    public final void b(Bundle bundle) {
        osw osw = this.b;
        if (osw.f != null) {
            bundle.putBoolean(osw.class.getName(), osw.f.e());
        }
    }

    public final void b(String str) {
        if (this.o != null) {
            this.d.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(vhj.a(this.o.b));
        }
    }

    public final void b(String str, String str2) {
        osr osr = this.p;
        if (osr != null) {
            ImageView imageView = (ImageView) fbp.a(osr.b);
            Uri uri = (fbo.a(str2) || !this.e.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) ? !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY : !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
            Uri uri2 = uri;
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            CoverImageActivity.a(this.e, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri2, this.e.getResources().getConfiguration().orientation);
        }
    }

    public final void b(boolean z) {
        osr osr = this.p;
        if (osr != null) {
            osr.f.setChecked(z);
        }
    }

    public final void c() {
        this.b.a((otd) null);
    }

    public final void c(boolean z) {
        osr osr = this.p;
        if (osr != null) {
            osr.d.setVisibility(z ? 0 : 8);
        }
    }

    public final void d() {
        this.b.a.c();
    }

    public final void d(boolean z) {
        gmu gmu = this.i;
        if (gmu != null) {
            gmu.a(z);
        }
    }

    public final void e(boolean z) {
        gmu gmu = this.i;
        if (gmu != null) {
            gmu.b(z);
        }
    }

    public final boolean e() {
        AppBarLayout appBarLayout = this.l;
        return appBarLayout != null && appBarLayout.getHeight() - this.l.getBottom() == 0;
    }

    public final void f(boolean z) {
        boolean z2 = true;
        boolean z3 = z && this.i != null;
        if (this.m.getVisibility() != 0) {
            z2 = false;
        }
        if (z3 != z2) {
            h(z3);
        }
    }

    public final void g(boolean z) {
        AppBarLayout appBarLayout = this.l;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.n = Optional.b(Boolean.valueOf(z));
        }
    }

    public final RecyclerView i() {
        return this.h;
    }

    public final boolean l() {
        return jvi.b(this.e) && !this.e.getResources().getBoolean(R.bool.showPlayButtonInHeader);
    }
}
