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

/* renamed from: osc reason: default package */
final class osc implements osa, osb {
    private static int a = osc.class.hashCode();
    private final orx b;
    private final oml c;
    private vhx d;
    private hff e;

    public osc(ory ory, oml oml, gkq gkq) {
        orx orx = new orx((Scheduler) ory.a(ory.a.get(), 1), (omc) ory.a(ory.b.get(), 2), (hfg) ory.a(ory.c.get(), 3), (lbi) ory.a(ory.d.get(), 4), (owh) ory.a(ory.e.get(), 5), (gkq) ory.a(gkq, 6));
        this.b = orx;
        this.c = oml;
    }

    public final Completable a() {
        return this.b.c;
    }

    public final void a(Bundle bundle) {
        this.b.g = bundle;
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, vhx vhx) {
        this.d = vhx;
        this.e = this.b.b;
        hff hff = this.e;
        hez hez = hff.g;
        hey hey = new hey((Activity) hez.a(hez.a.get(), 1), (sso) hez.a(hez.b.get(), 2), (fqn) hez.a(hez.c.get(), 3), ((Integer) hez.a(hez.d.get(), 4)).intValue(), (jpc) hez.a(hez.e.get(), 5), (b) hez.a(new b() {
            public final void a(int i) {
                hff.a(hff.this, i);
            }
        }, 6));
        hff.i = hey;
        hff.i.g = hff.q;
        hff.i.b(!hff.d.b());
        fsw fsw = hff.h;
        fso c2 = fsw.a.c(hff.e, viewGroup);
        fqz.a(c2);
        fqw.a(c2.getView());
        hff.k = c2;
        hff.k.a((CharSequence) hff.e.getString(R.string.playlist_extended_tracks_section_title));
        hff.k.a(hff.s);
        ip.a(hff.k.getView(), (Drawable) new jsv(new int[]{fr.c(hff.e, R.color.gray_layer), 0}, new float[]{0.0f, 1.0f}));
        LinearLayout linearLayout = new LinearLayout(hff.e);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        int dimensionPixelSize = hff.e.getResources().getDimensionPixelSize(R.dimen.playlist_extender_refresh_bottom_padding);
        linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        hff.l = gat.e(hff.e);
        hff.l.setCompoundDrawablePadding(vfj.a(10.0f, hff.e.getResources()));
        hff.l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                hff.s(hff.this);
            }
        });
        linearLayout.addView(hff.l);
        LinearLayout linearLayout2 = new LinearLayout(hff.e);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        int dimensionPixelSize2 = hff.e.getResources().getDimensionPixelSize(R.dimen.playlist_extender_loading_view_padding);
        linearLayout2.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
        linearLayout2.setLayoutParams(new LayoutParams(-1, -2));
        LoadingView a2 = LoadingView.a(LayoutInflater.from(hff.e));
        a2.a(0);
        linearLayout2.addView(a2);
        fqv.f();
        fvd a3 = fvg.a(hff.e, null);
        a3.a(false);
        a3.b().setSingleLine(false);
        a3.b().setEllipsize(null);
        a3.c().setSingleLine(false);
        a3.c().setEllipsize(null);
        a3.b().setVisibility(8);
        a3.b((CharSequence) null);
        hff.m = a3;
        hff.j = new vhx();
        hff.j.a((a<H>) new jog<H>(hff.k.getView(), true), 0);
        hff.j.a((a<H>) hff.i, 1);
        hff.j.a((a<H>) new jog<H>(linearLayout2, false), 2);
        hff.j.a((a<H>) new jog<H>(hff.m.getView(), true), 3);
        hff.j.a((a<H>) new jog<H>(linearLayout, true), 4);
        hff.j.a(0, 1, 2, 3, 4);
        this.d.a((a<H>) this.e.j, a);
        this.d.a(a);
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void a(boolean z) {
        if (z) {
            this.d.a(true, a);
        } else {
            this.d.a(false, a);
        }
        this.e.d();
    }

    public final void ay_() {
        this.b.a((osb) this);
    }

    public final void b(Bundle bundle) {
        hff hff = this.b.b;
        Extender extender = hff.b;
        bundle.putSerializable("ignored_track_ids", extender.b);
        bundle.putStringArrayList("added_track_ids", extender.c);
        bundle.putBoolean("got_first_response", hff.o);
        if (hff.i != null) {
            try {
                bundle.putString("tracks", hff.c.writeValueAsString(ImmutableList.a((Collection<? extends E>) hff.i.d)));
            } catch (JsonProcessingException e2) {
                Logger.e(e2, "Failed ro save extended tracks.", new Object[0]);
            }
        }
    }

    public final void c() {
        this.b.a((osb) null);
    }

    public final void d() {
        this.b.a.a(Disposables.a());
    }

    public final void e() {
        this.c.a(a, this.e.j.b());
    }
}
