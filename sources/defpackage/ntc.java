package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.List;

@Deprecated
/* renamed from: ntc reason: default package */
final class ntc implements nta, ntb {
    private final ntf a;
    private final nsx b;
    private final Context c;
    /* access modifiers changed from: private */
    public final omc d;
    /* access modifiers changed from: private */
    public vhx e;
    /* access modifiers changed from: private */
    public RecyclerView f;
    private LoadingView g;
    private fvd h;
    private FrameLayout i;
    private ViewGroup j;
    private ViewGroup k;
    private Parcelable l;

    public ntc(ntf ntf, Context context, omc omc, oml oml, nsy nsy) {
        this.a = ntf;
        nsx nsx = new nsx((a) nsy.a(nsy.a.get(), 1), (vjj) nsy.a(nsy.b.get(), 2), (nsv) nsy.a(nsy.c.get(), 3), (String) nsy.a(nsy.d.get(), 4), (Scheduler) nsy.a(nsy.e.get(), 5), (oml) nsy.a(nsy.f.get(), 6), (Completable) nsy.a(nsy.g.get(), 7));
        this.b = nsx;
        this.c = context;
        this.d = omc;
        oml.a((a) new $$Lambda$ntc$6Ah53N3IKtzqh3F3n0iH0mlZuiA(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int a(int i2) {
        vhx vhx = this.e;
        if (vhx != null) {
            return vhx.g(i2);
        }
        return -1;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.j = (ViewGroup) layoutInflater.inflate(R.layout.home_mix_root, viewGroup, false);
        this.e = new vhx(true);
        this.i = (FrameLayout) this.j.findViewById(R.id.container);
        fqv.f();
        this.h = fvg.a(this.c, viewGroup);
        this.h.a().b().setImageDrawable(gaa.b(this.c, SpotifyIconV2.WARNING, Float.NaN, true, true, (float) vfj.b(32.0f, this.c.getResources())));
        this.h.a().a(true);
        this.h.a(false);
        this.h.b().setSingleLine(false);
        this.h.b().setEllipsize(null);
        this.h.a((CharSequence) this.c.getString(R.string.error_general_title));
        this.h.c().setSingleLine(false);
        this.h.c().setEllipsize(null);
        this.h.b((CharSequence) this.c.getString(R.string.error_general_body));
        this.h.getView().setVisibility(8);
        this.i.addView(this.h.getView());
        this.g = LoadingView.a(layoutInflater, this.c, this.i);
        this.j.addView(this.g);
        this.k = (ViewGroup) this.j.findViewById(R.id.toolbar_container);
        nsx nsx = this.b;
        nsx.b = this;
        if (!nsx.a.a()) {
            nsx.a.a(nsx.b.c());
        }
        return this.j;
    }

    public final vhx a() {
        return this.e;
    }

    public final void a(Bundle bundle) {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            i d2 = recyclerView.d();
            if (d2 != null) {
                bundle.putParcelable(ntc.class.getName(), d2.d());
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        this.f = recyclerView;
        this.f.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i, int i2) {
                Optional<Integer> optional = ntc.this.d.a;
                if (optional.b()) {
                    Integer num = (Integer) optional.c();
                    if (ntc.this.e.c(num.intValue())) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ntc.this.f.d();
                        if (linearLayoutManager != null) {
                            ntc.this.d.a(((ntc.this.e.g(num.intValue()) + ntc.this.e.f(num.intValue())) - linearLayoutManager.l()) - 1);
                        }
                    }
                }
            }
        });
    }

    public final void a(String str) {
        this.h.getView().setVisibility(0);
        if (!fbo.a((String) null)) {
            this.h.b((CharSequence) null);
        }
    }

    public final void a(ozo ozo, List<View> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.i.addView((View) list.get(i2), i2);
        }
        LayoutParams layoutParams = (LayoutParams) this.i.getLayoutParams();
        layoutParams.topMargin = 0;
        this.i.setLayoutParams(layoutParams);
    }

    public final void a(boolean z) {
        if (z) {
            this.i.setVisibility(4);
            this.g.c();
            this.g.a();
            return;
        }
        this.g.b();
    }

    public final ViewGroup b() {
        return this.k;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.l = bundle.getParcelable(ntc.class.getName());
        }
    }

    public final View c() {
        return this.j;
    }

    public final void d() {
        if (this.f.c() == null) {
            this.f.a((RecyclerView.a) this.e);
        }
        i d2 = this.f.d();
        Parcelable parcelable = this.l;
        if (parcelable != null && d2 != null) {
            d2.a(parcelable);
            this.l = null;
        }
    }
}
