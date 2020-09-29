package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.VideoSurfaceView.ScaleType;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.List;

/* renamed from: oud reason: default package */
final class oud implements oub, ouc {
    private final oty b;
    private final Picasso c;
    /* access modifiers changed from: private */
    public final Context d;
    private final otr e;
    private final jxn f;
    private fxn g;
    private CoordinatorLayout h;
    /* access modifiers changed from: private */
    public AppBarLayout i;
    private ViewGroup j;
    private Optional<Boolean> k = Optional.e();
    private otq l;
    private RecyclerView m;
    private Button n;
    private jxm o;
    private Drawable p;

    public final boolean l() {
        return false;
    }

    public oud(Picasso picasso, Context context, otz otz, jxn jxn, otr otr, fpt fpt) {
        otz otz2 = otz;
        otr otr2 = otr;
        oty oty = new oty((rsj) otz.a(otz2.a.get(), 1), (ois) otz.a(otz2.b.get(), 2), (ott) otz.a(otz2.c.get(), 3), (uxt) otz.a(otz2.d.get(), 4), (otw) otz.a(otz2.e.get(), 5), (ofh) otz.a(otz2.f.get(), 6), (String) otz.a(otz2.g.get(), 7), (Scheduler) otz.a(otz2.h.get(), 8), (ots) otz.a(otz2.i.get(), 9), (otr) otz.a(otr2, 10), (fpt) otz.a(fpt, 11));
        this.b = oty;
        this.c = picasso;
        this.d = context;
        this.e = otr2;
        this.f = jxn;
    }

    public final Completable a() {
        return this.b.b;
    }

    public final void a(Bundle bundle) {
        oty oty = this.b;
        if (bundle != null) {
            oty.d = Boolean.valueOf(bundle.getBoolean(oty.class.getName()));
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a((ouc) this);
    }

    public final void c() {
        this.b.a((ouc) null);
    }

    public final void d() {
        this.b.a.c();
        jxm jxm = this.o;
        if (jxm != null) {
            jxm.am_();
            this.o.al_();
            this.o = null;
        }
    }

    public final void b(Bundle bundle) {
        oty oty = this.b;
        if (oty.c != null) {
            bundle.putBoolean(oty.class.getName(), oty.c.g());
        }
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsf fsf) {
        this.h = (CoordinatorLayout) layoutInflater.inflate(R.layout.story_header, viewGroup, false);
        this.m = (RecyclerView) this.h.findViewById(R.id.recycler_view);
        this.i = (AppBarLayout) this.h.findViewById(R.id.header_view);
        this.j = (ViewGroup) this.h.findViewById(R.id.accessory);
        this.m.a((i) new LinearLayoutManager(this.d));
        gaa.a(this.d);
        this.g = fsf.b();
        this.g.a(0.0f);
        if (this.e.a()) {
            fzz.a();
            this.n = a.a(this.d);
            this.n.setOnClickListener(new $$Lambda$oud$YIW8jVQo6RROhXmeuNTl_sni8xo(this));
            this.j.addView(this.n);
            c(true);
        } else {
            c(false);
        }
        this.p = fzg.f(this.d);
        this.l = new otq(this.d, this.i);
        otq otq = this.l;
        View view = otq.getView();
        this.i.addView(view);
        this.i.a((b) new $$Lambda$oud$0GykScFPekOeZap0o2bOZA74Uw(this, view, otq));
        if (this.e.c()) {
            otq.e.setVisibility(0);
            otq.e.setOnClickListener(new $$Lambda$oud$mmRwmZYzHxsI7sNpAPuVUXyPSbU(this));
        }
        if (this.k.b()) {
            this.i.a(((Boolean) this.k.c()).booleanValue(), false, true);
            this.k = Optional.e();
        }
        return Collections.singletonList(this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, otq otq, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        otq.a(abs, height);
        otq.getView().setTranslationY(f2);
        this.g.a(height);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.b();
    }

    private int h() {
        return gaa.c(this.d) + uuu.c(this.d, R.attr.actionBarSize);
    }

    private void c(boolean z) {
        int h2 = h();
        int i2 = 0;
        if (z) {
            this.i.setPadding(0, h2, 0, uts.c(24.0f, this.d.getResources()));
            this.i.setClipToPadding(false);
            this.m.setPadding(0, uts.c(24.0f, this.d.getResources()), 0, 0);
            this.m.setClipToPadding(false);
        } else {
            this.i.setPadding(0, h2, 0, 0);
            this.m.setPadding(0, 0, 0, 0);
        }
        ViewGroup viewGroup = this.j;
        if (!z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }

    public final RecyclerView i() {
        return (RecyclerView) fay.a(this.m);
    }

    public final void a(int i2) {
        this.m.post(new $$Lambda$oud$hz9dE9nhiA6RZrO2DV0IDheqssA(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i2) {
        this.h.post(new $$Lambda$oud$Sadt1OpGI2imFa8klgQ9gy1iOEY(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.i.a(false, false, true);
        i d2 = this.m.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    public final void a(boolean z) {
        otq otq = this.l;
        if (otq != null) {
            otq.e.setChecked(z);
        }
    }

    public final void a(CharSequence charSequence) {
        otq otq = this.l;
        if (otq != null) {
            otq.c.setText(charSequence);
        }
    }

    public final void a(String str, boolean z) {
        otq otq = this.l;
        if (otq != null) {
            otq.b.setVisibility(0);
            otq.b.setText(str);
            if (z) {
                otq.b.setCompoundDrawablesWithIntrinsicBounds(fqx.a(otq.b.getContext()), null, null, null);
                otq.b.setCompoundDrawablePadding(otq.a);
                return;
            }
            otq.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(String str) {
        otq otq = this.l;
        if (otq != null) {
            otq.d.setText(str);
        }
        this.g.a(str);
    }

    public final void b(String str) {
        AnonymousClass1 r0 = new vsr() {
            public final void a(Drawable drawable) {
            }

            public final void b(Drawable drawable) {
            }

            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fay.a(!bitmap.isRecycled());
                BitmapDrawable bitmapDrawable = new BitmapDrawable(oud.this.d.getResources(), bitmap);
                fwd fwd = new fwd();
                fwd.a((Drawable) bitmapDrawable, (Drawable) new ColorDrawable());
                fwd.a = true;
                ip.a((View) oud.this.i, (Drawable) fwf.a((Drawable) fwd, (Drawable) new fwe(oud.this.d)));
                fay.a(!bitmap.isRecycled());
            }
        };
        this.i.setTag(r0);
        this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((vsr) r0);
    }

    public final void e() {
        Button button = this.n;
        if (button != null) {
            button.setText(R.string.header_shuffle_play);
            this.n.requestLayout();
        }
    }

    public final void f() {
        Button button = this.n;
        if (button != null) {
            button.setText(R.string.header_pause);
            this.n.requestLayout();
        }
    }

    public final boolean g() {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout == null || appBarLayout.getHeight() - this.i.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z) {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.k = Optional.b(Boolean.valueOf(z));
        }
    }

    public final void c(String str) {
        ImageView imageView = this.l.f;
        if (imageView == null) {
            imageView = new ImageView(this.d);
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.p;
        }
        this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(drawable).b(drawable).a((vst) new uvi()).a(imageView, (vrt) new vrt() {
            public final void a() {
                oud.c(oud.this);
            }

            public final void b() {
                oud.c(oud.this);
            }
        });
        imageView.setOnClickListener(new $$Lambda$oud$OPdxiVPHEp04NhDdB1ag2AhyOp4(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.c();
    }

    public final void d(String str) {
        if (!fax.a(str)) {
            VideoSurfaceView videoSurfaceView = this.l.h;
            ImageView imageView = this.l.f;
            videoSurfaceView.setVisibility(0);
            imageView.setVisibility(4);
            videoSurfaceView.setOnClickListener(new $$Lambda$oud$KqzcbJ0WgTtbZcsNx48tWWz41vE(this));
            videoSurfaceView.a(ScaleType.ASPECT_FILL);
            jyb c2 = jyb.e().a(kbq.a(str)).a(false).b(false).c();
            if (this.o == null) {
                VideoSurfaceView videoSurfaceView2 = this.l.h;
                jxn jxn = this.f;
                jxn.d = "Playlist Story Header";
                jxn.e = false;
                jxn.a = videoSurfaceView2;
                this.o = jxn.a();
            }
            this.o.a_(true);
            this.o.c(true);
            this.o.a(c2);
        }
    }

    static /* synthetic */ void c(oud oud) {
        otq otq = oud.l;
        if (otq != null) {
            Animatable animatable = (Animatable) otq.g.getDrawable();
            otq.g.setVisibility(0);
            animatable.start();
        }
    }
}
