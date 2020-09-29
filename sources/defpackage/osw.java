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

/* renamed from: osw reason: default package */
final class osw implements osu, osv {
    private final osz a;
    private final osr b;
    /* access modifiers changed from: private */
    public final Picasso c;
    private final Context d;
    /* access modifiers changed from: private */
    public final oew e;
    /* access modifiers changed from: private */
    public uwh f;
    /* access modifiers changed from: private */
    public RecyclerView g;
    private LoadingView h;
    private fuj i;
    private FrameLayout j;
    private ViewGroup k;
    private ViewGroup l;
    private Parcelable m;

    public osw(osz osz, Context context, Picasso picasso, oew oew, ofh ofh, oss oss) {
        this.a = osz;
        osr osr = new osr((a) oss.a(oss.a.get(), 1), (uxh) oss.a(oss.b.get(), 2), (osp) oss.a(oss.c.get(), 3), (String) oss.a(oss.d.get(), 4), (Scheduler) oss.a(oss.e.get(), 5), (ofh) oss.a(oss.f.get(), 6), (Completable) oss.a(oss.g.get(), 7));
        this.b = osr;
        this.d = context;
        this.c = picasso;
        this.e = oew;
        ofh.a((a) new $$Lambda$osw$CHOayrxf0VQYoxyxbSea7hNCcE(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int a(int i2) {
        uwh uwh = this.f;
        if (uwh != null) {
            return uwh.g(i2);
        }
        return -1;
    }

    public final void a(RecyclerView recyclerView) {
        this.g = recyclerView;
        this.g.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i, int i2) {
                Optional<Integer> optional = osw.this.e.a;
                if (optional.b()) {
                    Integer num = (Integer) optional.c();
                    uwh b = osw.this.f;
                    boolean z = false;
                    int[] iArr = {num.intValue()};
                    if (!b.a.isEmpty()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 > 0) {
                                z = true;
                                break;
                            } else if (b.f(iArr[0]) == null) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (z) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) osw.this.g.d();
                        if (linearLayoutManager != null) {
                            osw.this.e.b.onNext(Integer.valueOf(((osw.this.f.g(num.intValue()) + ((a) fay.a(osw.this.f.f(num.intValue()))).a.b()) - linearLayoutManager.l()) - 1));
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
                    osw.this.c.c(valueOf);
                } else {
                    osw.this.c.b((Object) valueOf);
                }
            }
        });
    }

    public final void a(osi osi, List<View> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.j.addView((View) list.get(i2), i2);
        }
        LayoutParams layoutParams = (LayoutParams) this.j.getLayoutParams();
        layoutParams.topMargin = 0;
        this.j.setLayoutParams(layoutParams);
    }

    public final void a(List<View> list) {
        for (View addView : list) {
            this.j.addView(addView);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.k = (ViewGroup) layoutInflater.inflate(R.layout.playlist_root, viewGroup, false);
        this.f = new uwh(true);
        this.j = (FrameLayout) this.k.findViewById(R.id.container);
        fqb.f();
        this.i = fum.a(this.d, viewGroup);
        this.i.a().b().setImageDrawable(fzg.b(this.d, SpotifyIconV2.WARNING, Float.NaN, true, true, (float) uts.b(32.0f, this.d.getResources())));
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
        osr osr = this.b;
        osr.b = this;
        if (!osr.a.a()) {
            osr.a.a(osr.b.c());
        }
        return this.k;
    }

    public final uwh a() {
        return this.f;
    }

    public final ViewGroup b() {
        return this.l;
    }

    public final View c() {
        return this.k;
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

    public final void a(Bundle bundle) {
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            i d2 = recyclerView.d();
            if (d2 != null) {
                bundle.putParcelable(osw.class.getName(), d2.d());
            }
        }
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.m = bundle.getParcelable(osw.class.getName());
        }
    }

    public final void a(String str) {
        this.i.getView().setVisibility(0);
        if (!fax.a((String) null)) {
            this.i.b((CharSequence) null);
        }
    }
}
