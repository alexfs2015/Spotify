package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.playlist.shelves.Extender;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import java.util.Collection;

/* renamed from: oky reason: default package */
final class oky implements okw, okx {
    private static int a = oky.class.hashCode();
    private final okt b;
    private final ofh c;
    private uwh d;
    private hcj e;

    public oky(oku oku, ofh ofh, gjf gjf) {
        okt okt = new okt((Scheduler) oku.a(oku.a.get(), 1), (oew) oku.a(oku.b.get(), 2), (hck) oku.a(oku.c.get(), 3), (kxz) oku.a(oku.d.get(), 4), (opb) oku.a(oku.e.get(), 5), (gjf) oku.a(gjf, 6));
        this.b = okt;
        this.c = ofh;
    }

    public final Completable a() {
        return this.b.c;
    }

    public final void a(Bundle bundle) {
        this.b.g = bundle;
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a((okx) this);
    }

    public final void c() {
        this.b.a((okx) null);
    }

    public final void d() {
        this.b.a.a(Disposables.a());
    }

    public final void b(Bundle bundle) {
        hcj hcj = this.b.b;
        Extender extender = hcj.b;
        bundle.putSerializable("ignored_track_ids", extender.b);
        bundle.putStringArrayList("added_track_ids", extender.c);
        bundle.putBoolean("got_first_response", hcj.o);
        if (hcj.i != null) {
            try {
                bundle.putString("tracks", hcj.c.writeValueAsString(ImmutableList.a((Collection<? extends E>) hcj.i.d)));
            } catch (JsonProcessingException e2) {
                Logger.e(e2, "Failed ro save extended tracks.", new Object[0]);
            }
        }
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, uwh uwh) {
        this.d = uwh;
        this.e = this.b.b;
        hcj hcj = this.e;
        hcd hcd = hcj.g;
        hcc hcc = new hcc((Activity) hcd.a(hcd.a.get(), 1), (sih) hcd.a(hcd.b.get(), 2), (fpt) hcd.a(hcd.c.get(), 3), ((Integer) hcd.a(hcd.d.get(), 4)).intValue(), (jmq) hcd.a(hcd.e.get(), 5), (b) hcd.a(new b() {
            public final void a(int i) {
                hcj.a(hcj.this, i);
            }
        }, 6));
        hcj.i = hcc;
        hcj.i.g = hcj.q;
        hcj.i.b(!hcj.d.b());
        fsc fsc = hcj.h;
        fru c2 = fsc.a.c(hcj.e, viewGroup);
        fqf.a(c2);
        fqc.a(c2.getView());
        hcj.k = c2;
        hcj.k.a((CharSequence) hcj.e.getString(R.string.playlist_extended_tracks_section_title));
        hcj.k.a(hcj.s);
        ip.a(hcj.k.getView(), (Drawable) new jqk(new int[]{fr.c(hcj.e, R.color.gray_layer), 0}, new float[]{0.0f, 1.0f}));
        LinearLayout linearLayout = new LinearLayout(hcj.e);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        int dimensionPixelSize = hcj.e.getResources().getDimensionPixelSize(R.dimen.playlist_extender_refresh_bottom_padding);
        linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        hcj.l = fzz.e(hcj.e);
        hcj.l.setCompoundDrawablePadding(uts.a(10.0f, hcj.e.getResources()));
        hcj.l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                hcj.s(hcj.this);
            }
        });
        linearLayout.addView(hcj.l);
        LinearLayout linearLayout2 = new LinearLayout(hcj.e);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        int dimensionPixelSize2 = hcj.e.getResources().getDimensionPixelSize(R.dimen.playlist_extender_loading_view_padding);
        linearLayout2.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
        linearLayout2.setLayoutParams(new LayoutParams(-1, -2));
        LoadingView a2 = LoadingView.a(LayoutInflater.from(hcj.e));
        a2.a(0);
        linearLayout2.addView(a2);
        fqb.f();
        fuj a3 = fum.a(hcj.e, null);
        a3.a(false);
        a3.b().setSingleLine(false);
        a3.b().setEllipsize(null);
        a3.c().setSingleLine(false);
        a3.c().setEllipsize(null);
        a3.b().setVisibility(8);
        a3.b((CharSequence) null);
        hcj.m = a3;
        hcj.j = new uwh();
        hcj.j.a((a<H>) new jlu<H>(hcj.k.getView(), true), 0);
        hcj.j.a((a<H>) hcj.i, 1);
        hcj.j.a((a<H>) new jlu<H>(linearLayout2, false), 2);
        hcj.j.a((a<H>) new jlu<H>(hcj.m.getView(), true), 3);
        hcj.j.a((a<H>) new jlu<H>(linearLayout, true), 4);
        hcj.j.a(0, 1, 2, 3, 4);
        this.d.a((a<H>) this.e.j, a);
        this.d.a(a);
    }

    public final void e() {
        this.c.a(a, this.e.j.b());
    }

    public final void a(boolean z) {
        if (z) {
            this.d.a(true, a);
        } else {
            this.d.a(false, a);
        }
        this.e.d();
    }
}
