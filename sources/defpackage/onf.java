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
import com.spotify.libs.glue.custom.playbutton.CirclePlayButtonView;
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

/* renamed from: onf reason: default package */
final class onf implements ond, one {
    private final ona b;
    private final Picasso c;
    /* access modifiers changed from: private */
    public final Context d;
    private final a e;
    private final ohh f;
    private CoordinatorLayout g;
    private fxn h;
    /* access modifiers changed from: private */
    public AppBarLayout i;
    private oms j;
    private ViewGroup k;
    private glf l;
    private RecyclerView m;
    private Optional<Boolean> n;
    private Drawable o;

    public onf(Picasso picasso, Context context, onb onb, a aVar, ohh ohh) {
        this(picasso, context, onb, aVar, ohh, Optional.e());
    }

    private onf(Picasso picasso, Context context, onb onb, a aVar, ohh ohh, Optional<omx> optional) {
        onb onb2 = onb;
        ohh ohh2 = ohh;
        this.n = Optional.e();
        ona ona = new ona((ois) onb.a(onb2.a.get(), 1), (omy) onb.a(onb2.b.get(), 2), (omt) onb.a(onb2.c.get(), 3), (uxt) onb.a(onb2.d.get(), 4), (tcn) onb.a(onb2.e.get(), 5), (ofh) onb.a(onb2.f.get(), 6), (String) onb.a(onb2.g.get(), 7), (Scheduler) onb.a(onb2.h.get(), 8), (ohh) onb.a(ohh2, 9), (Optional) onb.a(optional, 10));
        this.b = ona;
        this.c = picasso;
        this.d = context;
        this.e = aVar;
        this.f = ohh2;
    }

    public final Completable a() {
        return this.b.d;
    }

    public final void a(Bundle bundle) {
        ona ona = this.b;
        if (bundle != null) {
            ona.f = Boolean.valueOf(bundle.getBoolean(ona.class.getName()));
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a((one) this);
    }

    public final void c() {
        this.b.a((one) null);
    }

    public final void d() {
        this.b.a.c();
    }

    public final void b(Bundle bundle) {
        ona ona = this.b;
        if (ona.e != null) {
            bundle.putBoolean(ona.class.getName(), ona.e.e());
        }
    }

    public final RecyclerView i() {
        return this.m;
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsf fsf) {
        this.g = (CoordinatorLayout) layoutInflater.inflate(R.layout.refresh_header, viewGroup, false);
        this.i = (AppBarLayout) this.g.findViewById(R.id.app_bar_layout);
        this.k = (ViewGroup) this.g.findViewById(R.id.accessory);
        this.m = (RecyclerView) this.g.findViewById(R.id.recycler_view);
        this.j = new oms(this.d, this.i);
        this.i.addView(this.j.getView());
        gaa.a(this.d);
        this.h = fsf.b();
        this.h.a(0.0f);
        this.i.a((b) new $$Lambda$onf$O8ZOEqqzQAW7IIILTk6MAEx244(this));
        this.m.a((i) new LinearLayoutManager(this.d));
        if (this.f.g()) {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.g.findViewById(R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.a(this.m);
            recyclerViewFastScroller.setEnabled(true);
            this.m.setVerticalScrollBarEnabled(false);
        }
        this.o = fzg.e(this.d);
        this.j.b.setImageDrawable(this.o);
        this.j.b.setOnClickListener(new $$Lambda$onf$8DFncQKc6bO9Wg9ApQo_uRxKob0(this));
        this.j.e.setOnClickListener(new $$Lambda$onf$WXES9kwsVswNvx6OADOGgR7Z7DA(this));
        boolean z = this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
        if (!this.f.b() || !z) {
            h(false);
        } else {
            glf a = this.e.a(new CirclePlayButtonView(this.d));
            this.k.addView(a.a());
            a.a((OnClickListener) new $$Lambda$onf$lVigamRFu7H352YH9K90cnfoSsg(this));
            this.l = a;
            h(true);
        }
        if (this.n.b()) {
            this.i.a(((Boolean) this.n.c()).booleanValue(), false, true);
            this.n = Optional.e();
        }
        return Collections.singletonList(this.g);
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
    public /* synthetic */ void c(View view) {
        ona ona = this.b;
        ona.b.c(ona.c);
        ona.e.b(ona.g.getImageUri(Size.LARGE), ona.g.getImageUri(Size.XLARGE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.a();
    }

    public final void b(String str) {
        oms oms = this.j;
        if (oms != null) {
            oms.a(str);
            this.j.b(null);
        }
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

    public final void a(String str) {
        fxn fxn = this.h;
        if (fxn != null) {
            fxn.a(str);
        }
    }

    public final void a(boolean z) {
        oms oms = this.j;
        if (oms != null) {
            oms.c.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(String str, boolean z) {
        oms oms = this.j;
        if (oms != null) {
            oms.c.setText(str);
            oms.c.setVisibility(fax.a(str) ? 8 : 0);
            if (z) {
                oms.c.setCompoundDrawablesWithIntrinsicBounds(fqx.a(oms.c.getContext()), null, null, null);
                oms.c.setCompoundDrawablePadding(oms.f);
                return;
            }
            oms.c.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(ojc ojc, omx omx) {
        if (this.j != null) {
            a(omx.a());
        }
    }

    public final void a(CharSequence charSequence) {
        oms oms = this.j;
        if (oms != null) {
            oms.d.setText(charSequence);
            oms.d.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        }
    }

    private void d(String str) {
        oms oms = this.j;
        ImageView imageView = oms == null ? new ImageView(this.d) : oms.b;
        imageView.setVisibility(0);
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.o;
        }
        this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(drawable).b(drawable).a(uvt.a(imageView, (uvj) new uvj() {
            public final void a(int i) {
                ip.a((View) onf.this.i, (Drawable) fwf.a((Drawable) new ColorDrawable(i), (Drawable) new fwe(onf.this.d)));
            }
        }));
    }

    public final void a(String str, String str2, final int i2) {
        if (this.d.getResources().getBoolean(R.bool.fullBleed)) {
            this.j.b.setVisibility(4);
            AnonymousClass2 r4 = new vsr() {
                public final void a(Drawable drawable) {
                }

                public final void b(Drawable drawable) {
                }

                public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                    fay.a(!bitmap.isRecycled());
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(onf.this.d.getResources(), bitmap);
                    fwd fwd = new fwd();
                    fwd.a((Drawable) bitmapDrawable, (Drawable) new ColorDrawable(i2));
                    fwd.a = true;
                    ip.a((View) onf.this.i, (Drawable) fwf.a((Drawable) fwd, (Drawable) new fwe(onf.this.d)));
                    fay.a(!bitmap.isRecycled());
                }
            };
            this.i.setTag(r4);
            this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((vsr) r4);
            return;
        }
        d(str2);
    }

    public final void b(int i2) {
        if (this.i.getBackground() == null) {
            ip.a((View) this.i, (Drawable) fwf.a(this.d, i2));
        }
    }

    public final void b(String str, String str2) {
        oms oms = this.j;
        if (oms != null) {
            ImageView imageView = (ImageView) fay.a(oms.b);
            Uri uri = (fax.a(str2) || !this.d.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) ? !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY : !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
            Uri uri2 = uri;
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            CoverImageActivity.a(this.d, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri2, this.d.getResources().getConfiguration().orientation);
        }
    }

    public final void b(boolean z) {
        glf glf = this.l;
        if (glf != null) {
            glf.a(z);
        }
    }

    public final void c(boolean z) {
        glf glf = this.l;
        if (glf != null) {
            glf.b(z);
        }
    }

    public final void g(boolean z) {
        oms oms = this.j;
        if (oms != null) {
            oms.e.setVisibility(z ? 0 : 8);
        }
    }

    public final void d(boolean z) {
        oms oms = this.j;
        if (oms != null) {
            oms.e.setChecked(z);
        }
    }

    public final void a(int i2) {
        this.m.post(new $$Lambda$onf$dJPtWe8fHQ_C7exbjbiVDxB5I(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.g.post(new $$Lambda$onf$VNhRboyoz1FQr2WXZRiKcDlHSM(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i2) {
        this.i.a(false, false, true);
        i d2 = this.m.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    public final boolean e() {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout == null || appBarLayout.getHeight() - this.i.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public final void e(boolean z) {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.n = Optional.b(Boolean.valueOf(z));
        }
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

    public final boolean l() {
        return jtc.b(this.d) && !this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
    }

    private int f() {
        return gaa.c(this.d) + uuu.c(this.d, R.attr.actionBarSize);
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

    public final void a(String str, String str2) {
        if (fax.a(str2) || !this.d.getResources().getBoolean(R.bool.useLargerPlaylistImageResolution)) {
            d(str);
        } else {
            d(str2);
        }
    }
}
