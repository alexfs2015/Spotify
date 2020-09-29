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
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.List;

/* renamed from: ott reason: default package */
final class ott implements otr, ots {
    private final oto b;
    private final Picasso c;
    /* access modifiers changed from: private */
    public final Context d;
    private final oog e;
    private final a f;
    private fyh g;
    private CoordinatorLayout h;
    /* access modifiers changed from: private */
    public AppBarLayout i;
    private ViewGroup j;
    private Optional<Boolean> k = Optional.e();
    private oth l;
    private RecyclerView m;
    private gmu n;
    private Drawable o;

    public ott(Picasso picasso, Context context, otp otp, a aVar, oog oog) {
        otp otp2 = otp;
        oog oog2 = oog;
        oto oto = new oto((opw) otp.a(otp2.a.get(), 1), (oti) otp.a(otp2.b.get(), 2), (vjv) otp.a(otp2.c.get(), 3), (otm) otp.a(otp2.d.get(), 4), (tmu) otp.a(otp2.e.get(), 5), (oml) otp.a(otp2.f.get(), 6), (String) otp.a(otp2.g.get(), 7), (Scheduler) otp.a(otp2.h.get(), 8), (oog) otp.a(oog2, 9));
        this.b = oto;
        this.c = picasso;
        this.d = context;
        this.e = oog2;
        this.f = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, oth oth, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        oth.a(abs, height);
        oth.getView().setTranslationY(f2);
        this.g.a(height);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.h.post(new $$Lambda$ott$RZv_kAyJEHnmJlmyIkkzilrl8I(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i2) {
        this.i.a(false, false, true);
        i d2 = this.m.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    private void e(boolean z) {
        int f2 = f();
        int i2 = 0;
        if (z) {
            float f3 = (float) ((this.e.b().c() ? 6 : 0) + 24);
            this.i.setPadding(0, f2, 0, vfj.c(f3, this.d.getResources()));
            this.i.setClipToPadding(false);
            this.m.setPadding(0, vfj.c(f3, this.d.getResources()), 0, 0);
            this.m.setClipToPadding(false);
        } else {
            this.i.setPadding(0, f2, 0, 0);
            this.m.setPadding(0, 0, 0, 0);
        }
        ViewGroup viewGroup = this.j;
        if (!z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }

    private int f() {
        return gau.c(this.d) + vgl.c(this.d, R.attr.actionBarSize);
    }

    public final Completable a() {
        return this.b.b;
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsz fsz) {
        gmu gmu;
        this.h = (CoordinatorLayout) layoutInflater.inflate(R.layout.p2s_header, viewGroup, false);
        this.m = (RecyclerView) this.h.findViewById(R.id.recycler_view);
        this.i = (AppBarLayout) this.h.findViewById(R.id.header_view);
        this.j = (ViewGroup) this.h.findViewById(R.id.accessory);
        this.m.a((i) new LinearLayoutManager(this.d));
        gau.a(this.d);
        this.g = fsz.b();
        boolean z = this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
        this.g.a(0.0f);
        if (!this.e.a() || !z) {
            e(false);
        } else {
            if (this.e.b().c()) {
                gmu = this.f.a(this.d);
            } else {
                a aVar = this.f;
                gat.a();
                gmu = aVar.a(a.a(this.d));
            }
            gmu.a((OnClickListener) new $$Lambda$ott$h1QMKVbUMQQCiN3cf3K0sk3OXg(this));
            this.j.addView(gmu.a());
            this.n = gmu;
            e(true);
        }
        this.o = gaa.e(this.d);
        this.l = new oth(this.d, this.i);
        oth oth = this.l;
        View view = oth.getView();
        this.i.addView(view);
        this.i.a((b) new $$Lambda$ott$B_4LarPTB3PrzaN1WEKJRz7AYUg(this, view, oth));
        if (this.e.d()) {
            oth.f.setVisibility(0);
            oth.f.setOnClickListener(new $$Lambda$ott$Z7eK9RjC6Or48FFlocaLPiIA35s(this));
        }
        if (this.k.b()) {
            this.i.a(((Boolean) this.k.c()).booleanValue(), false, true);
            this.k = Optional.e();
        }
        return Collections.singletonList(this.h);
    }

    public final void a(int i2) {
        this.m.post(new $$Lambda$ott$Rb3jyCFkY1ZBhftxFQU55O23CYw(this, i2));
    }

    public final void a(final int i2, String str, String str2) {
        if (this.d.getResources().getBoolean(R.bool.fullBleed)) {
            AnonymousClass1 r0 = new wgx() {
                public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                    fbp.a(!bitmap.isRecycled());
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(ott.this.d.getResources(), bitmap);
                    fwx fwx = new fwx();
                    fwx.a((Drawable) bitmapDrawable, (Drawable) new ColorDrawable(i2));
                    fwx.a = true;
                    ip.a((View) ott.this.i, (Drawable) fwz.a((Drawable) fwx, (Drawable) new fwy(ott.this.d)));
                    fbp.a(!bitmap.isRecycled());
                }

                public final void a(Drawable drawable) {
                }

                public final void b(Drawable drawable) {
                }
            };
            this.i.setTag(r0);
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((wgx) r0);
            return;
        }
        ImageView imageView = this.l.g;
        if (imageView == null) {
            imageView = new ImageView(this.d);
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.o;
        }
        this.c.a(!TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY).a(drawable).b(drawable).a(vhj.a(imageView, (vha) new vha() {
            public final void a(int i) {
                ip.a((View) ott.this.i, (Drawable) fwz.a((Drawable) new ColorDrawable(i), (Drawable) new fwy(ott.this.d)));
            }
        }));
    }

    public final void a(Bundle bundle) {
        oto oto = this.b;
        if (bundle != null) {
            oto.d = Boolean.valueOf(bundle.getBoolean(oto.class.getName()));
        }
    }

    public final void a(CharSequence charSequence, String str) {
        oth oth = this.l;
        if (oth != null) {
            oth.c.setText(charSequence);
            oth oth2 = this.l;
            oth2.d.setText(str);
            oth2.d.setVisibility(fbo.a(str) ? 8 : 0);
        }
    }

    public final void a(String str) {
        oth oth = this.l;
        if (oth != null) {
            oth.e.setText(str);
        }
        this.g.a(str);
    }

    public final void a(String str, boolean z) {
        oth oth = this.l;
        if (oth != null) {
            oth.b.setVisibility(0);
            oth.b.setText(str);
            if (z) {
                oth.b.setCompoundDrawablesWithIntrinsicBounds(frr.a(oth.b.getContext()), null, null, null);
                oth.b.setCompoundDrawablePadding(oth.a);
                return;
            }
            oth.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void a(boolean z) {
        oth oth = this.l;
        if (oth != null) {
            oth.f.setChecked(z);
        }
    }

    public final void ay_() {
        this.b.a((ots) this);
    }

    public final void b(int i2) {
        oth oth = this.l;
        if (oth != null) {
            oth.e.setTextColor(i2);
        }
        if (this.i.getBackground() == null) {
            ip.a((View) this.i, (Drawable) fwz.a(this.d, i2));
        }
    }

    public final void b(Bundle bundle) {
        oto oto = this.b;
        if (oto.c != null) {
            bundle.putBoolean(oto.class.getName(), oto.c.e());
        }
    }

    public final void b(boolean z) {
        gmu gmu = this.n;
        if (gmu != null) {
            gmu.a(z);
        }
    }

    public final void c() {
        this.b.a((ots) null);
    }

    public final void c(boolean z) {
        gmu gmu = this.n;
        if (gmu != null) {
            gmu.b(z);
        }
    }

    public final void d() {
        this.b.a.c();
    }

    public final void d(boolean z) {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.k = Optional.b(Boolean.valueOf(z));
        }
    }

    public final boolean e() {
        AppBarLayout appBarLayout = this.i;
        return appBarLayout != null && appBarLayout.getHeight() - this.i.getBottom() == 0;
    }

    public final RecyclerView i() {
        return (RecyclerView) fbp.a(this.m);
    }

    public final boolean l() {
        return jvi.b(this.d) && !this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
    }
}
