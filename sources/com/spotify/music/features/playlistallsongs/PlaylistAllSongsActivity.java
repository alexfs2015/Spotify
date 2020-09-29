package com.spotify.music.features.playlistallsongs;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.spotify.playlist.models.Show.MediaType;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Map;

public class PlaylistAllSongsActivity extends kyd implements jmf<odk>, a, oeg, oej, a, a, udv {
    public odz g;
    public odh h;
    public odm i;
    public oei j;
    public jmq k;
    public Picasso l;
    public ToastieManager m;
    private final OnClickListener n = new OnClickListener() {
        public final void onClick(View view) {
            odz odz = PlaylistAllSongsActivity.this.g;
            odz.b.b();
            odz.a();
        }
    };
    private String o;
    private AllSongsConfiguration p = AllSongsConfiguration.a;
    private oeh q;
    private RecyclerView r;
    private LoadingView s;
    private View t;
    private uwh u;
    private odl v;
    private odl w;
    /* access modifiers changed from: private */
    public AppBarLayout x;
    private fse y;
    private fuj z;

    public final void a(int i2, uzb uzb, boolean z2) {
    }

    public final void e(int i2, uzb uzb) {
    }

    public /* synthetic */ jms onCreateContextMenu(Object obj) {
        odk odk = (odk) obj;
        odz odz = this.g;
        jmq jmq = this.k;
        int e = odk.e();
        String a = odk.a();
        String b = odk.b();
        odz.b.d(a, e);
        String m2 = odz.a.m();
        LinkType linkType = jst.a(a).b;
        boolean c = odk.c();
        String f = odk.f();
        Map h2 = odk.h();
        boolean d = odz.a.n().d();
        if (linkType == LinkType.TRACK) {
            return jmq.a(a, b, m2, d, h2).a(odz.g).a(false).b(true).c(true).a(c, f).g(false).h(true).e(false).j(odk.d()).a(m2).a();
        }
        if (linkType == LinkType.SHOW_EPISODE) {
            return jmq.b(a, b, m2, d, h2).a(odk.g() != MediaType.AUDIO).a(odz.g).b(false).d(false).e(true).f(true).g(false).h(false).i(false).a(c ? Optional.b(m2) : Optional.e(), c ? Optional.c(f) : Optional.e()).l(c).k(true).a();
        }
        StringBuilder sb = new StringBuilder("Unsupported uri for building context menu. Only track and episode supported. was: ");
        sb.append(a);
        Assertion.a(sb.toString());
        return jms.a;
    }

    public void onCreate(Bundle bundle) {
        String str = "include_episodes";
        String str2 = "playlist_uri";
        if (bundle != null) {
            this.o = bundle.getString(str2);
            this.p = (AllSongsConfiguration) bundle.getSerializable(str);
        } else {
            Intent intent = getIntent();
            this.o = intent.getStringExtra(str2);
            this.p = (AllSongsConfiguration) intent.getSerializableExtra(str);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.playlist_all_songs_activity);
        gaa.a((Context) this);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.content);
        this.x = (AppBarLayout) coordinatorLayout.findViewById(R.id.header_view);
        this.x.setPadding(0, gaa.c(this) + uuu.c(this, R.attr.actionBarSize), 0, 0);
        this.q = new oeh((Context) oei.a(this, 1), (ViewGroup) oei.a(this.x, 2));
        this.q.c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                PlaylistAllSongsActivity.this.a(view);
            }
        });
        oeh oeh = this.q;
        View view = oeh.getView();
        this.x.addView(view);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.toolbar_wrapper);
        this.y = fsi.a(this, frameLayout);
        gab.a(this.y.getView(), this);
        frameLayout.addView(this.y.getView(), 0);
        fys fys = new fys(this, this.y, this.n);
        fys.c(true);
        fys.b(true);
        fys.a(0.0f);
        this.x.a((b) new b(view, oeh, fys) {
            private final /* synthetic */ View f$0;
            private final /* synthetic */ oeh f$1;
            private final /* synthetic */ fys f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                PlaylistAllSongsActivity.a(this.f$0, this.f$1, this.f$2, appBarLayout, i);
            }
        });
        this.r = (RecyclerView) findViewById(R.id.recycler_view);
        this.r.a((i) new LinearLayoutManager(this));
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) findViewById(R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.a(this.r);
        recyclerViewFastScroller.setEnabled(true);
        this.r.setVerticalScrollBarEnabled(false);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.container);
        this.s = LoadingView.a(getLayoutInflater(), this, coordinatorLayout);
        coordinatorLayout.setVisibility(4);
        viewGroup.addView(this.s);
        this.t = getLayoutInflater().inflate(R.layout.playlist_all_songs_transition_view, viewGroup, false);
        this.t.setVisibility(8);
        viewGroup.addView(this.t);
        this.u = new uwh();
        frs c = fqb.e().c(this, null);
        c.a((CharSequence) getString(R.string.free_tier_section_header_you_added));
        this.u.a((a<H>) new jlu<H>(c.getView(), true), 0);
        frs c2 = fqb.e().c(this, null);
        c2.a((CharSequence) getString(R.string.free_tier_section_header_includes));
        this.u.a((a<H>) new jlu<H>(c2.getView(), true), 1);
        this.v = this.i.a(this.h);
        this.u.a((a<H>) this.v, Integer.MIN_VALUE);
        frs c3 = fqb.e().c(this, null);
        c3.a((CharSequence) getString(R.string.free_tier_section_header_we_added));
        this.u.a((a<H>) new jlu<H>(c3.getView(), true), 2);
        this.w = this.i.a(null);
        this.w.c(false);
        this.w.d(true);
        this.u.a((a<H>) this.w, Integer.MIN_VALUE);
        this.u.a(false, 0, 1, 2);
        fqb.f();
        this.z = fum.a(this, this.r);
        this.z.b().setSingleLine(false);
        this.z.b().setEllipsize(null);
        this.z.c().setVisibility(8);
        this.u.a((a<H>) new jlu<H>(this.z.getView(), false), 3);
        this.u.a(false, 3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        odz odz = this.g;
        odz.b.c();
        odz.e.a(odz.a.m());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view, oeh oeh, fys fys, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f = (float) abs;
        float height = f / ((float) view.getHeight());
        oeh.a(abs, height);
        oeh.getView().setTranslationY(f);
        fys.a(height);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.o);
        bundle.putSerializable("include_episodes", this.p);
    }

    public void onResume() {
        super.onResume();
        this.m.a((q) this);
    }

    public void k() {
        finish();
    }

    public final void a(List<uzb> list) {
        this.v.a(list);
        if (this.r.c() == null) {
            this.r.a((a) this.u);
        }
    }

    public final void b(List<uzb> list) {
        this.w.a(list);
        if (this.r.c() == null) {
            this.r.a((a) this.u);
        }
    }

    public final void a(boolean z2) {
        if (z2) {
            this.u.a(true, 0);
            return;
        }
        this.u.a(false, 0);
    }

    public final void b(boolean z2) {
        if (z2) {
            this.u.a(true, 1);
            return;
        }
        this.u.a(false, 1);
    }

    public final void c(boolean z2) {
        if (z2) {
            this.u.a(true, 2);
            return;
        }
        this.u.a(false, 2);
    }

    public final void d(boolean z2) {
        if (z2) {
            this.s.c();
            this.s.a();
            return;
        }
        this.s.b();
    }

    public final void e(boolean z2) {
        this.z.a((CharSequence) getString(R.string.playlist_all_songs_empty_view_title_with_episodes));
        if (z2) {
            this.u.a(true, 3);
            return;
        }
        this.u.a(false, 3);
    }

    public final void a(String str) {
        this.q.a.setText(str);
        this.y.a((CharSequence) str);
    }

    public final void b(String str) {
        this.l.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(uvt.a(new ImageView(this), (uvj) new uvj() {
            public final void a(int i) {
                ip.a((View) PlaylistAllSongsActivity.this.x, (Drawable) fwf.a((Drawable) new ColorDrawable(i), (Drawable) new fwe(PlaylistAllSongsActivity.this)));
            }
        }));
    }

    public final void f(boolean z2) {
        this.q.c.setVisibility(z2 ? 0 : 8);
    }

    public final void g(boolean z2) {
        this.q.b.setVisibility(z2 ? 0 : 8);
    }

    public final void l() {
        this.t.setVisibility(0);
    }

    public final void h(boolean z2) {
        this.v.e(z2);
        this.w.e(z2);
    }

    public final void i(boolean z2) {
        this.v.b(z2);
        this.w.b(z2);
    }

    public final void j(boolean z2) {
        this.v.c(z2);
    }

    public final void k(boolean z2) {
        this.v.d(z2);
    }

    public final void l(boolean z2) {
        this.v.f(z2);
        this.w.f(z2);
    }

    public final void m(boolean z2) {
        this.v.g(z2);
        this.w.g(z2);
    }

    public final void a(int i2, uzb uzb) {
        odz odz = this.g;
        odz.b.a(uzb.getUri(), i2);
        odz.a(uzb);
    }

    public final void a(uzb uzb, int i2) {
        odz odz = this.g;
        odz.b.b(uzb.getUri(), i2);
        odz.a(uzb);
    }

    public final void b(int i2, uzb uzb) {
        odz odz = this.g;
        uzc b = uzb.b();
        if (b != null) {
            String uri = uzb.getUri();
            boolean z2 = !b.inCollection();
            odz.b.a(uzb.getUri(), i2, z2);
            if (z2) {
                odv odv = odz.d;
                fpt fpt = odz.h;
                CollectionService.a(odv.a, uri, odv.b.toString(), odz.a.m(), fpt, Messaging.ALL);
                return;
            }
            odv odv2 = odz.d;
            CollectionService.a(odv2.a, uri, odv2.b.toString(), odz.h, Messaging.ALL);
        }
    }

    public final void c(int i2, uzb uzb) {
        odz odz = this.g;
        uzc b = uzb.b();
        if (b != null) {
            String uri = uzb.getUri();
            boolean z2 = !b.isBanned();
            odz.b.b(uri, i2, z2);
            if (z2) {
                odv odv = odz.d;
                fpt fpt = odz.h;
                CollectionService.b(odv.a, uri, odv.b.toString(), odz.a.m(), fpt, Messaging.ALL);
                odz.c.c(odz.b(uzb));
                return;
            }
            odv odv2 = odz.d;
            fpt fpt2 = odz.h;
            CollectionService.c(odv2.a, uri, odv2.b.toString(), odz.a.m(), fpt2, Messaging.ALL);
        }
    }

    public final void d(int i2, uzb uzb) {
        Object obj;
        odz odz = this.g;
        uzc b = uzb.b();
        uys a = uzb.a();
        String uri = uzb.getUri();
        if (b != null) {
            obj = b.getOfflineState();
        } else if (a != null) {
            obj = a.u();
        } else {
            obj = new f();
        }
        if (obj instanceof f) {
            odz.f.a(uri);
        } else {
            odz.f.b(uri);
        }
        odz.b.c(uri, i2);
    }

    public void onBackPressed() {
        odz odz = this.g;
        odz.b.a();
        odz.a();
    }

    public final gjf aj() {
        return PageIdentifiers.PLAYLIST_ALLSONGS;
    }

    public final udr ag() {
        return udt.aC;
    }

    public final sih ae_() {
        return ViewUris.aD.a(this.o);
    }

    public final String m() {
        return this.o;
    }

    public final AllSongsConfiguration n() {
        return this.p;
    }

    public static Intent a(Context context, String str, AllSongsConfiguration allSongsConfiguration) {
        if (fax.a(str)) {
            Assertion.a("No playlistUri provided. A playlistUri MUST be provided.");
        }
        Intent intent = new Intent(context, PlaylistAllSongsActivity.class);
        intent.putExtra("playlist_uri", str);
        intent.putExtra("include_episodes", allSongsConfiguration);
        return intent;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PLAYLIST_ALLSONGS, ae_().toString());
    }
}
