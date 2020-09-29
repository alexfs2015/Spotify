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
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.List;

/* renamed from: omp reason: default package */
final class omp implements omn, omo {
    private final omk b;
    private final Picasso c;
    /* access modifiers changed from: private */
    public final Context d;
    private final ohc e;
    private final a f;
    private fxn g;
    private CoordinatorLayout h;
    /* access modifiers changed from: private */
    public AppBarLayout i;
    private ViewGroup j;
    private Optional<Boolean> k = Optional.e();
    private omd l;
    private RecyclerView m;
    private glf n;
    private Drawable o;

    public omp(Picasso picasso, Context context, oml oml, a aVar, ohc ohc) {
        oml oml2 = oml;
        ohc ohc2 = ohc;
        omk omk = new omk((ois) oml.a(oml2.a.get(), 1), (ome) oml.a(oml2.b.get(), 2), (uxt) oml.a(oml2.c.get(), 3), (ofa) oml.a(oml2.d.get(), 4), (omi) oml.a(oml2.e.get(), 5), (tcn) oml.a(oml2.f.get(), 6), (ofh) oml.a(oml2.g.get(), 7), (String) oml.a(oml2.h.get(), 8), (Scheduler) oml.a(oml2.i.get(), 9), (ohc) oml.a(ohc2, 10));
        this.b = omk;
        this.c = picasso;
        this.d = context;
        this.e = ohc2;
        this.f = aVar;
    }

    public final Completable a() {
        return this.b.b;
    }

    public final void a(Bundle bundle) {
        omk omk = this.b;
        if (bundle != null) {
            omk.d = Boolean.valueOf(bundle.getBoolean(omk.class.getName()));
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a((omo) this);
    }

    public final void c() {
        this.b.a((omo) null);
    }

    public final void d() {
        this.b.a.c();
    }

    public final void b(Bundle bundle) {
        omk omk = this.b;
        if (omk.c != null) {
            bundle.putBoolean(omk.class.getName(), omk.c.f());
        }
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsf fsf) {
        glf glf;
        this.h = (CoordinatorLayout) layoutInflater.inflate(R.layout.p2s_header, viewGroup, false);
        this.m = (RecyclerView) this.h.findViewById(R.id.recycler_view);
        this.i = (AppBarLayout) this.h.findViewById(R.id.header_view);
        this.j = (ViewGroup) this.h.findViewById(R.id.accessory);
        this.m.a((i) new LinearLayoutManager(this.d));
        gaa.a(this.d);
        this.g = fsf.b();
        boolean z = this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
        this.g.a(0.0f);
        if (!this.e.a() || !z) {
            e(false);
        } else {
            if (this.e.b().c()) {
                glf = this.f.a(new CirclePlayButtonView(this.d));
            } else {
                a aVar = this.f;
                fzz.a();
                glf = aVar.a(a.a(this.d));
            }
            glf.a((OnClickListener) new $$Lambda$omp$KT83nC3SJMepOtylrwfyfmM1hWs(this));
            this.j.addView(glf.a());
            this.n = glf;
            e(true);
        }
        this.o = fzg.e(this.d);
        this.l = new omd(this.d, this.i);
        omd omd = this.l;
        View view = omd.getView();
        this.i.addView(view);
        this.i.a((b) new $$Lambda$omp$DN3ZRCaH9mIDcGltdIVYtSQgeGE(this, view, omd));
        if (this.e.d()) {
            omd.f.setVisibility(0);
            omd.f.setOnClickListener(new $$Lambda$omp$iz7DT0WY8NKZGT5eBde2xX9Tts(this));
        }
        if (this.k.b()) {
            this.i.a(((Boolean) this.k.c()).booleanValue(), false, true);
            this.k = Optional.e();
        }
        return Collections.singletonList(this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, omd omd, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        omd.a(abs, height);
        omd.getView().setTranslationY(f2);
        this.g.a(height);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.b();
    }

    private int g() {
        return gaa.c(this.d) + uuu.c(this.d, R.attr.actionBarSize);
    }

    private void e(boolean z) {
        int g2 = g();
        int i2 = 0;
        if (z) {
            float f2 = (float) ((this.e.b().c() ? 6 : 0) + 24);
            this.i.setPadding(0, g2, 0, uts.c(f2, this.d.getResources()));
            this.i.setClipToPadding(false);
            this.m.setPadding(0, uts.c(f2, this.d.getResources()), 0, 0);
            this.m.setClipToPadding(false);
        } else {
            this.i.setPadding(0, g2, 0, 0);
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
        this.m.post(new $$Lambda$omp$k2AQV4Na9pqD4vm1fpwbuFJxFWU(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.h.post(new $$Lambda$omp$C3Sm4VFB90N96J4LZZm_Cz5Su78(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i2) {
        this.i.a(false, false, true);
        i d2 = this.m.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    public final void a(boolean z) {
        omd omd = this.l;
        if (omd != null) {
            omd.f.setChecked(z);
        }
    }

    public final void a(CharSequence charSequence, String str) {
        omd omd = this.l;
        if (omd != null) {
            omd.c.setText(charSequence);
            omd omd2 = this.l;
            omd2.d.setText(str);
            omd2.d.setVisibility(fax.a(str) ? 8 : 0);
        }
    }

    public final void a(String str, boolean z) {
        omd omd = this.l;
        if (omd != null) {
            omd.b.setVisibility(0);
            omd.b.setText(str);
            if (z) {
                omd.b.setCompoundDrawablesWithIntrinsicBounds(fqx.a(omd.b.getContext()), null, null, null);
                omd.b.setCompoundDrawablePadding(omd.a);
                return;
            }
            omd.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(String str) {
        omd omd = this.l;
        if (omd != null) {
            omd.e.setText(str);
        }
        this.g.a(str);
    }

    public final void a(final int i2, String str, String str2) {
        if (this.d.getResources().getBoolean(R.bool.fullBleed)) {
            AnonymousClass1 r0 = new vsr() {
                public final void a(Drawable drawable) {
                }

                public final void b(Drawable drawable) {
                }

                public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                    fay.a(!bitmap.isRecycled());
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(omp.this.d.getResources(), bitmap);
                    fwd fwd = new fwd();
                    fwd.a((Drawable) bitmapDrawable, (Drawable) new ColorDrawable(i2));
                    fwd.a = true;
                    ip.a((View) omp.this.i, (Drawable) fwf.a((Drawable) fwd, (Drawable) new fwe(omp.this.d)));
                    fay.a(!bitmap.isRecycled());
                }
            };
            this.i.setTag(r0);
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((vsr) r0);
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
        this.c.a(!TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY).a(drawable).b(drawable).a(uvt.a(imageView, (uvj) new uvj() {
            public final void a(int i) {
                ip.a((View) omp.this.i, (Drawable) fwf.a((Drawable) new ColorDrawable(i), (Drawable) new fwe(omp.this.d)));
            }
        }));
    }

    public final void b(int i2) {
        omd omd = this.l;
        if (omd != null) {
            omd.e.setTextColor(i2);
        }
        if (this.i.getBackground() == null) {
            ip.a((View) this.i, (Drawable) fwf.a(this.d, i2));
        }
    }

    public final void b(boolean z) {
        glf glf = this.n;
        if (glf != null) {
            glf.a(z);
        }
    }

    public final void c(boolean z) {
        glf glf = this.n;
        if (glf != null) {
            glf.b(z);
        }
    }

    public final void e() {
        if (this.j != null) {
            ShufflePlayHeaderView.a(new jri(), this.j);
        }
    }

    public final boolean f() {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout == null || appBarLayout.getHeight() - this.i.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public final void d(boolean z) {
        AppBarLayout appBarLayout = this.i;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.k = Optional.b(Boolean.valueOf(z));
        }
    }

    public final boolean l() {
        return jtc.b(this.d) && !this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader);
    }
}
