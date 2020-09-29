package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
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
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.List;

/* renamed from: ouj reason: default package */
final class ouj implements ouh, oui {
    private final oue b;
    private final Picasso c;
    /* access modifiers changed from: private */
    public final Context d;
    private final a e;
    private final ool f;
    private CoordinatorLayout g;
    private fyh h;
    /* access modifiers changed from: private */
    public AppBarLayout i;
    private otw j;
    private ViewGroup k;
    private gmu l;
    private RecyclerView m;
    private Optional<Boolean> n;
    private Drawable o;

    public ouj(Picasso picasso, Context context, ouf ouf, a aVar, ool ool) {
        this(picasso, context, ouf, aVar, ool, Optional.e());
    }

    private ouj(Picasso picasso, Context context, ouf ouf, a aVar, ool ool, Optional<oub> optional) {
        ouf ouf2 = ouf;
        ool ool2 = ool;
        this.n = Optional.e();
        oue oue = new oue((opw) ouf.a(ouf2.a.get(), 1), (ouc) ouf.a(ouf2.b.get(), 2), (otx) ouf.a(ouf2.c.get(), 3), (vjv) ouf.a(ouf2.d.get(), 4), (tmu) ouf.a(ouf2.e.get(), 5), (oml) ouf.a(ouf2.f.get(), 6), (String) ouf.a(ouf2.g.get(), 7), (Scheduler) ouf.a(ouf2.h.get(), 8), (ool) ouf.a(ool2, 9), (Optional) ouf.a(optional, 10));
        this.b = oue;
        this.c = picasso;
        this.d = context;
        this.e = aVar;
        this.f = ool2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float min = Math.min(f2 / ((float) this.j.a.getHeight()), 1.0f);
        this.j.a(abs, min);
        this.j.b.setTranslationY(f2);
        this.h.a(min);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.g.post(new $$Lambda$ouj$t3P4TCkHQHCC2q6Cd1CWhQh3BAU(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        oue oue = this.b;
        oue.b.c(oue.c);
        oue.e.b(oue.g.getImageUri(Size.LARGE), oue.g.getImageUri(Size.XLARGE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i2) {
        this.i.a(false, false, true);
        i d2 = this.m.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    private void d(String str) {
        otw otw = this.j;
        ImageView imageView = otw == null ? new ImageView(this.d) : otw.b;
        imageView.setVisibility(0);
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.o;
        }
        this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(drawable).b(drawable).a(vhj.a(imageView, (vha) new vha() {
            public final void a(int i) {
                ip.a((View) ouj.this.i, (Drawable) fwz.a((Drawable) new ColorDrawable(i), (Drawable) new fwy(ouj.this.d)));
            }
        }));
    }

    private int f() {
        return gau.c(this.d) + vgl.c(this.d, R.attr.actionBarSize);
    }

    private void h(boolean z) {
        int i2 = 0;
        this.i.setPadding(0, f(), 0, 0);
        this.i.setClipToPadding(false);
        ViewGroup viewGroup = this.k;
        if (!z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }

    public final Completable a() {
        return this.b.d;
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsz fsz) {
        this.g = (CoordinatorLayout) layoutInflater.inflate(R.layout.refresh_header, viewGroup, false);
        this.i = (AppBarLayout) this.g.findViewById(R.id.app_bar_layout);
        this.k = (ViewGroup) this.g.findViewById(R.id.accessory);
        this.m = (RecyclerView) this.g.findViewById(R.id.recycler_view);
        this.j = new otw(this.d, this.i);
        this.i.addView(this.j.getView());
        gau.a(this.d);
        this.h = fsz.b();
        this.h.a(0.0f);
        this.i.a((b) new $$Lambda$ouj$dAwA0B8uX3qUTVNkoX7wux48U4(this));
        this.m.a((i) new LinearLayoutManager(this.d));
        if (this.f.g()) {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.g.findViewById(R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.a(this.m);
            recyclerViewFastScroller.setEnabled(true);
            this.m.setVerticalScrollBarEnabled(false);
        }
        this.o = gaa.e(this.d);
        this.j.b.setImageDrawable(this.o);
        this.j.b.setOnClickListener(new $$Lambda$ouj$zteuNWzwt5LAGhGKZ2Ovh0fCvzc(this));
        this.j.e.setOnClickListener(new $$Lambda$ouj$uSmUfk1cTBHrbyhrRGMomomx0Os(this));
        boolean z = this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
        if (!this.f.b() || !z) {
            h(false);
        } else {
            gmu a = this.e.a(this.d);
            this.k.addView(a.a());
            a.a((OnClickListener) new $$Lambda$ouj$yH0b6XvKOxCFFZ3I6w9UNHulXWg(this));
            this.l = a;
            h(true);
        }
        if (this.n.b()) {
            this.i.a(((Boolean) this.n.c()).booleanValue(), false, true);
            this.n = Optional.e();
        }
        return Collections.singletonList(this.g);
    }

    public final void a(int i2) {
        this.m.post(new $$Lambda$ouj$C_PD5ePOVmze177WNed7L5wTzM(this, i2));
    }

    public final void a(Bundle bundle) {
        oue oue = this.b;
        if (bundle != null) {
            oue.f = Boolean.valueOf(bundle.getBoolean(oue.class.getName()));
        }
    }

    public final void a(CharSequence charSequence) {
        otw otw = this.j;
        if (otw != null) {
            otw.d.setText(charSequence);
            otw.d.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        }
    }

    public final void a(String str) {
        fyh fyh = this.h;
        if (fyh != null) {
            fyh.a(str);
        }
    }

    public final void a(String str, String str2) {
        if (fbo.a(str2) || !this.d.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) {
            d(str);
        } else {
            d(str2);
        }
    }

    public final void a(String str, String str2, final int i2) {
        if (this.d.getResources().getBoolean(R.bool.fullBleed)) {
            this.j.b.setVisibility(4);
            AnonymousClass2 r4 = new wgx() {
                public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                    fbp.a(!bitmap.isRecycled());
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(ouj.this.d.getResources(), bitmap);
                    fwx fwx = new fwx();
                    fwx.a((Drawable) bitmapDrawable, (Drawable) new ColorDrawable(i2));
                    fwx.a = true;
                    ip.a((View) ouj.this.i, (Drawable) fwz.a((Drawable) fwx, (Drawable) new fwy(ouj.this.d)));
                    fbp.a(!bitmap.isRecycled());
                }

                public final void a(Drawable drawable) {
                }

                public final void b(Drawable drawable) {
                }
            };
            this.i.setTag(r4);
            this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((wgx) r4);
            return;
        }
        d(str2);
    }

    public final void a(String str, boolean z) {
        otw otw = this.j;
        if (otw != null) {
            otw.c.setText(str);
            otw.c.setVisibility(fbo.a(str) ? 8 : 0);
            if (z) {
                otw.c.setCompoundDrawablesWithIntrinsicBounds(frr.a(otw.c.getContext()), null, null, null);
                otw.c.setCompoundDrawablePadding(otw.f);
                return;
            }
            otw.c.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void a(oqg oqg, oub oub) {
        if (this.j != null) {
            a(oub.a());
        }
    }

    public final void a(boolean z) {
        otw otw = this.j;
        if (otw != null) {
            otw.c.setVisibility(z ? 0 : 8);
        }
    }

    public final void ay_() {
        this.b.a((oui) this);
    }

    public final void b(int i2) {
        if (this.i.getBackground() == null) {
            ip.a((View) this.i, (Drawable) fwz.a(this.d, i2));
        }
    }

    public final void b(Bundle bundle) {
        oue oue = this.b;
        if (oue.e != null) {
            bundle.putBoolean(oue.class.getName(), oue.e.e());
        }
    }

    public final void b(String str) {
        otw otw = this.j;
        if (otw != null) {
            otw.a(str);
            this.j.b(null);
        }
    }

    public final void b(String str, String str2) {
        otw otw = this.j;
        if (otw != null) {
            ImageView imageView = (ImageView) fbp.a(otw.b);
            Uri uri = (fbo.a(str2) || !this.d.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) ? !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY : !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
            Uri uri2 = uri;
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            CoverImageActivity.a(this.d, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri2, this.d.getResources().getConfiguration().orientation);
        }
    }

    public final void b(boolean z) {
        gmu gmu = this.l;
        if (gmu != null) {
            gmu.a(z);
        }
    }

    public final void c() {
        this.b.a((oui) null);
    }

    public final void c(String str) {
        if (this.j != null) {
            if (this.d.getResources().getBoolean(R.bool.fullBleed)) {
                this.j.b(str);
                this.j.a(null);
                return;
            }
            b(str);
        }
    }

    public final void c(boolean z) {
        gmu gmu = this.l;
        if (gmu != null) {
            gmu.b(z);
        }
    }

    public final void d() {
        this.b.a.c();
    }

    public final void d(boolean z) {
        otw otw = this.j;
        if (otw != null) {
            otw.e.setChecked(z);
        }
    }

    public final void e(boolean z) {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.n = Optional.b(Boolean.valueOf(z));
        }
    }

    public final boolean e() {
        AppBarLayout appBarLayout = this.i;
        return appBarLayout != null && appBarLayout.getHeight() - this.i.getBottom() == 0;
    }

    public final void f(boolean z) {
        boolean z2 = true;
        boolean z3 = z && this.l != null;
        if (this.k.getVisibility() != 0) {
            z2 = false;
        }
        if (z3 != z2) {
            h(z3);
        }
    }

    public final void g(boolean z) {
        otw otw = this.j;
        if (otw != null) {
            otw.e.setVisibility(z ? 0 : 8);
        }
    }

    public final RecyclerView i() {
        return this.m;
    }

    public final boolean l() {
        return jvi.b(this.d) && !this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
    }
}
