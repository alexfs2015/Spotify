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
import com.squareup.picasso.Picasso;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: pad reason: default package */
final class pad implements pab, pac {
    private final pag a;
    private final ozy b;
    /* access modifiers changed from: private */
    public final Picasso c;
    private final Context d;
    /* access modifiers changed from: private */
    public final omc e;
    /* access modifiers changed from: private */
    public vhx f;
    /* access modifiers changed from: private */
    public RecyclerView g;
    private LoadingView h;
    private fvd i;
    private FrameLayout j;
    private ViewGroup k;
    private ViewGroup l;
    private Parcelable m;

    public pad(pag pag, Context context, Picasso picasso, omc omc, oml oml, ozz ozz) {
        this.a = pag;
        ozy ozy = new ozy((a) ozz.a(ozz.a.get(), 1), (ozw) ozz.a(ozz.b.get(), 2), (Scheduler) ozz.a(ozz.c.get(), 3), (oml) ozz.a(ozz.d.get(), 4), (Completable) ozz.a(ozz.e.get(), 5));
        this.b = ozy;
        this.d = context;
        this.c = picasso;
        this.e = omc;
        oml.a((a) new $$Lambda$pad$CLLcrNruO2xU2K1UDZXLeH5PV4(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int a(int i2) {
        vhx vhx = this.f;
        if (vhx != null) {
            return vhx.g(i2);
        }
        return -1;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.k = (ViewGroup) layoutInflater.inflate(R.layout.playlist_root, viewGroup, false);
        this.f = new vhx(true);
        this.j = (FrameLayout) this.k.findViewById(R.id.container);
        fqv.f();
        this.i = fvg.a(this.d, viewGroup);
        this.i.a().b().setImageDrawable(gaa.b(this.d, SpotifyIconV2.WARNING, Float.NaN, true, true, (float) vfj.b(32.0f, this.d.getResources())));
        this.i.a().a(true);
        this.i.a(false);
        this.i.b().setSingleLine(false);
        this.i.b().setEllipsize(null);
        this.i.a((CharSequence) this.d.getString(R.string.error_general_title));
        this.i.c().setSingleLine(false);
        this.i.c().setEllipsize(null);
        this.i.b((CharSequence) this.d.getString(R.string.error_general_body));
        this.i.getView().setVisibility(8);
        this.j.addView(this.i.getView());
        this.h = LoadingView.a(layoutInflater, this.d, this.j);
        this.k.addView(this.h);
        this.l = (ViewGroup) this.k.findViewById(R.id.toolbar_container);
        ozy ozy = this.b;
        ozy.c = this;
        if (!ozy.b.a()) {
            ozy.b.a(ozy.c.c());
        }
        return this.k;
    }

    public final vhx a() {
        return this.f;
    }

    public final void a(Bundle bundle) {
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            i d2 = recyclerView.d();
            if (d2 != null) {
                bundle.putParcelable(pad.class.getName(), d2.d());
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        this.g = recyclerView;
        this.g.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i, int i2) {
                Optional<Integer> optional = pad.this.e.a;
                if (optional.b()) {
                    Integer num = (Integer) optional.c();
                    if (pad.this.f.c(num.intValue())) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pad.this.g.d();
                        if (linearLayoutManager != null) {
                            pad.this.e.a(((pad.this.f.g(num.intValue()) + pad.this.f.f(num.intValue())) - linearLayoutManager.l()) - 1);
                        }
                    }
                }
            }
        });
        this.g.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                super.a(recyclerView, i);
                Integer valueOf = Integer.valueOf(R.id.image_on_item_in_list_loaded_with_picasso);
                if (i == 0 || i == 1) {
                    pad.this.c.c(valueOf);
                } else {
                    pad.this.c.b((Object) valueOf);
                }
            }
        });
    }

    public final void a(String str) {
        this.i.getView().setVisibility(0);
        if (!fbo.a((String) null)) {
            this.i.b((CharSequence) null);
        }
    }

    public final void a(List<View> list) {
        for (View addView : list) {
            this.j.addView(addView);
        }
    }

    public final void a(ozo ozo, List<View> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.j.addView((View) list.get(i2), i2);
        }
        LayoutParams layoutParams = (LayoutParams) this.j.getLayoutParams();
        layoutParams.topMargin = 0;
        this.j.setLayoutParams(layoutParams);
    }

    public final void a(boolean z) {
        if (z) {
            this.j.setVisibility(4);
            this.h.c();
            this.h.a();
            return;
        }
        this.h.b();
    }

    public final ViewGroup b() {
        return this.l;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.m = bundle.getParcelable(pad.class.getName());
        }
    }

    public final View c() {
        return this.k;
    }

    public final void d() {
        if (this.g.c() == null) {
            this.g.a((RecyclerView.a) this.f);
        }
        i d2 = this.g.d();
        Parcelable parcelable = this.m;
        if (parcelable != null && d2 != null) {
            d2.a(parcelable);
            this.m = null;
        }
    }
}
