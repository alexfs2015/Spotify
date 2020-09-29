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

public class PlaylistAllSongsActivity extends lbm implements jor<okq>, a, olm, olp, a, a, uqq {
    public olf g;
    public okn h;
    public oks i;
    public olo j;
    public jpc k;
    public Picasso l;
    public ToastieManager m;
    private final OnClickListener n = new OnClickListener() {
        public final void onClick(View view) {
            olf olf = PlaylistAllSongsActivity.this.g;
            olf.b.b();
            olf.a();
        }
    };
    private String o;
    private AllSongsConfiguration p = AllSongsConfiguration.a;
    private oln q;
    private RecyclerView r;
    private LoadingView s;
    private View t;
    private vhx u;
    private okr v;
    private okr w;
    /* access modifiers changed from: private */
    public AppBarLayout x;
    private fsy y;
    private fvd z;

    public static Intent a(Context context, String str, AllSongsConfiguration allSongsConfiguration) {
        if (fbo.a(str)) {
            Assertion.a("No playlistUri provided. A playlistUri MUST be provided.");
        }
        Intent intent = new Intent(context, PlaylistAllSongsActivity.class);
        intent.putExtra("playlist_uri", str);
        intent.putExtra("include_episodes", allSongsConfiguration);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        olf olf = this.g;
        olf.b.c();
        olf.e.a(olf.a.m());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view, oln oln, fzm fzm, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f = (float) abs;
        float height = f / ((float) view.getHeight());
        oln.a(abs, height);
        oln.getView().setTranslationY(f);
        fzm.a(height);
    }

    public final void a(int i2, vle vle) {
        olf olf = this.g;
        olf.b.a(vle.getUri(), i2);
        olf.a(vle);
    }

    public final void a(int i2, vle vle, boolean z2) {
    }

    public final void a(String str) {
        this.q.a.setText(str);
        this.y.a((CharSequence) str);
    }

    public final void a(List<vle> list) {
        this.v.a(list);
        if (this.r.c() == null) {
            this.r.a((a) this.u);
        }
    }

    public final void a(vle vle, int i2) {
        olf olf = this.g;
        olf.b.b(vle.getUri(), i2);
        olf.a(vle);
    }

    public final void a(boolean z2) {
        if (z2) {
            this.u.a(true, 0);
            return;
        }
        this.u.a(false, 0);
    }

    public final sso ae_() {
        return ViewUris.aC.a(this.o);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PLAYLIST_ALLSONGS, ae_().toString());
    }

    public final uqm ag() {
        return uqo.aC;
    }

    public final gkq aj() {
        return PageIdentifiers.PLAYLIST_ALLSONGS;
    }

    public final void b(int i2, vle vle) {
        olf olf = this.g;
        vlf b = vle.b();
        if (b != null) {
            String uri = vle.getUri();
            boolean z2 = !b.inCollection();
            olf.b.a(vle.getUri(), i2, z2);
            if (z2) {
                olb olb = olf.d;
                fqn fqn = olf.h;
                CollectionService.a(olb.a, uri, olb.b.toString(), olf.a.m(), fqn, Messaging.ALL);
                return;
            }
            olb olb2 = olf.d;
            CollectionService.a(olb2.a, uri, olb2.b.toString(), olf.h, Messaging.ALL);
        }
    }

    public final void b(String str) {
        this.l.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(vhj.a(new ImageView(this), (vha) new vha() {
            public final void a(int i) {
                ip.a((View) PlaylistAllSongsActivity.this.x, (Drawable) fwz.a((Drawable) new ColorDrawable(i), (Drawable) new fwy(PlaylistAllSongsActivity.this)));
            }
        }));
    }

    public final void b(List<vle> list) {
        this.w.a(list);
        if (this.r.c() == null) {
            this.r.a((a) this.u);
        }
    }

    public final void b(boolean z2) {
        if (z2) {
            this.u.a(true, 1);
            return;
        }
        this.u.a(false, 1);
    }

    public final void c(int i2, vle vle) {
        olf olf = this.g;
        vlf b = vle.b();
        if (b != null) {
            String uri = vle.getUri();
            boolean z2 = !b.isBanned();
            olf.b.b(uri, i2, z2);
            if (z2) {
                olb olb = olf.d;
                fqn fqn = olf.h;
                CollectionService.b(olb.a, uri, olb.b.toString(), olf.a.m(), fqn, Messaging.ALL);
                olf.c.c(olf.b(vle));
                return;
            }
            olb olb2 = olf.d;
            fqn fqn2 = olf.h;
            CollectionService.c(olb2.a, uri, olb2.b.toString(), olf.a.m(), fqn2, Messaging.ALL);
        }
    }

    public final void c(boolean z2) {
        if (z2) {
            this.u.a(true, 2);
            return;
        }
        this.u.a(false, 2);
    }

    public final void d(int i2, vle vle) {
        olf olf = this.g;
        vlf b = vle.b();
        vkv a = vle.a();
        String uri = vle.getUri();
        Object obj = b != null ? b.getOfflineState() : a != null ? a.u() : new f();
        if (obj instanceof f) {
            olf.f.a(uri);
        } else {
            olf.f.b(uri);
        }
        olf.b.c(uri, i2);
    }

    public final void d(boolean z2) {
        if (z2) {
            this.s.c();
            this.s.a();
            return;
        }
        this.s.b();
    }

    public final void e(int i2, vle vle) {
    }

    public final void e(boolean z2) {
        this.z.a((CharSequence) getString(R.string.playlist_all_songs_empty_view_title_with_episodes));
        if (z2) {
            this.u.a(true, 3);
            return;
        }
        this.u.a(false, 3);
    }

    public final void f(boolean z2) {
        this.q.c.setVisibility(z2 ? 0 : 8);
    }

    public final void g(boolean z2) {
        this.q.b.setVisibility(z2 ? 0 : 8);
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

    public void k() {
        finish();
    }

    public final void k(boolean z2) {
        this.v.d(z2);
    }

    public final void l() {
        this.t.setVisibility(0);
    }

    public final void l(boolean z2) {
        this.v.f(z2);
        this.w.f(z2);
    }

    public final String m() {
        return this.o;
    }

    public final void m(boolean z2) {
        this.v.g(z2);
        this.w.g(z2);
    }

    public final AllSongsConfiguration n() {
        return this.p;
    }

    public void onBackPressed() {
        olf olf = this.g;
        olf.b.a();
        olf.a();
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
        gau.a((Context) this);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.content);
        this.x = (AppBarLayout) coordinatorLayout.findViewById(R.id.header_view);
        this.x.setPadding(0, gau.c(this) + vgl.c(this, R.attr.actionBarSize), 0, 0);
        this.q = new oln((Context) olo.a(this, 1), (ViewGroup) olo.a(this.x, 2));
        this.q.c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                PlaylistAllSongsActivity.this.a(view);
            }
        });
        oln oln = this.q;
        View view = oln.getView();
        this.x.addView(view);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.toolbar_wrapper);
        this.y = ftc.a(this, frameLayout);
        gav.a(this.y.getView(), this);
        frameLayout.addView(this.y.getView(), 0);
        fzm fzm = new fzm(this, this.y, this.n);
        fzm.c(true);
        fzm.b(true);
        fzm.a(0.0f);
        this.x.a((b) new b(view, oln, fzm) {
            private final /* synthetic */ View f$0;
            private final /* synthetic */ oln f$1;
            private final /* synthetic */ fzm f$2;

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
        this.u = new vhx();
        fsm c = fqv.e().c(this, null);
        c.a((CharSequence) getString(R.string.free_tier_section_header_you_added));
        this.u.a((a<H>) new jog<H>(c.getView(), true), 0);
        fsm c2 = fqv.e().c(this, null);
        c2.a((CharSequence) getString(R.string.free_tier_section_header_includes));
        this.u.a((a<H>) new jog<H>(c2.getView(), true), 1);
        this.v = this.i.a(this.h);
        this.u.a((a<H>) this.v, Integer.MIN_VALUE);
        fsm c3 = fqv.e().c(this, null);
        c3.a((CharSequence) getString(R.string.free_tier_section_header_we_added));
        this.u.a((a<H>) new jog<H>(c3.getView(), true), 2);
        this.w = this.i.a(null);
        this.w.c(false);
        this.w.d(true);
        this.u.a((a<H>) this.w, Integer.MIN_VALUE);
        this.u.a(false, 0, 1, 2);
        fqv.f();
        this.z = fvg.a(this, this.r);
        this.z.b().setSingleLine(false);
        this.z.b().setEllipsize(null);
        this.z.c().setVisibility(8);
        this.u.a((a<H>) new jog<H>(this.z.getView(), false), 3);
        this.u.a(false, 3);
    }

    public /* synthetic */ jpe onCreateContextMenu(Object obj) {
        okq okq = (okq) obj;
        olf olf = this.g;
        jpc jpc = this.k;
        int e = okq.e();
        String a = okq.a();
        String b = okq.b();
        olf.b.d(a, e);
        String m2 = olf.a.m();
        LinkType linkType = jva.a(a).b;
        boolean c = okq.c();
        String f = okq.f();
        Map h2 = okq.h();
        boolean d = olf.a.n().d();
        if (linkType == LinkType.TRACK) {
            return jpc.a(a, b, m2, d, h2).a(olf.g).a(false).b(true).c(true).a(c, f).g(false).h(true).e(false).j(okq.d()).a(m2).a();
        }
        if (linkType == LinkType.SHOW_EPISODE) {
            return jpc.b(a, b, m2, d, h2).a(okq.g() != MediaType.AUDIO).a(olf.g).b(false).d(false).e(true).f(true).g(false).h(false).i(false).a(c ? Optional.b(m2) : Optional.e(), c ? Optional.c(f) : Optional.e()).l(c).k(true).a();
        }
        StringBuilder sb = new StringBuilder("Unsupported uri for building context menu. Only track and episode supported. was: ");
        sb.append(a);
        Assertion.a(sb.toString());
        return jpe.a;
    }

    public void onResume() {
        super.onResume();
        this.m.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.o);
        bundle.putSerializable("include_episodes", this.p);
    }
}
