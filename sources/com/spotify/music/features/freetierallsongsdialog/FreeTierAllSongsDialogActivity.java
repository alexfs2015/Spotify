package com.spotify.music.features.freetierallsongsdialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.music.ubi.interactions.InteractionAction;
import java.util.ArrayList;
import java.util.List;

public class FreeTierAllSongsDialogActivity extends lbm implements jor<nax>, b, nbc, nbg, a, a, uqq {
    public nbf g;
    public nay h;
    public ToastieManager i;
    public jpc j;
    private RecyclerView k;
    /* access modifiers changed from: private */
    public View l;
    private Parcelable m;
    private fsy n;
    /* access modifiers changed from: private */
    public fzm o;
    private vhx p;
    private LoadingView q;
    private ArrayList<rov> r;
    private String s;
    private String t;
    private Optional<Boolean> u = Optional.e();
    private TextView v;
    private TextView w;
    private final OnClickListener x = new OnClickListener() {
        public final void onClick(View view) {
            nbf nbf = FreeTierAllSongsDialogActivity.this.g;
            nbf.c.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.CLOSE);
            nbf.b();
        }
    };

    public static Intent a(Context context, fqn fqn, ArrayList<rov> arrayList, String str, String str2) {
        if (fbo.a(str)) {
            Assertion.a("No title provided. A title MUST be provided.");
        }
        Intent intent = new Intent(context, FreeTierAllSongsDialogActivity.class);
        fqo.a(intent, fqn);
        intent.putExtra("tracks_title", str);
        intent.putParcelableArrayListExtra("tracks", arrayList);
        intent.putExtra("context_uri", str2);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.k.d();
        if (d != null) {
            d.a(parcelable);
        }
    }

    public final void a(String str) {
        this.v.setText(str);
        this.o.a(str);
    }

    public final void a(List<rov> list) {
        if (!list.isEmpty()) {
            nay nay = this.h;
            nay.a = list;
            nay.e();
            this.p.a(true, 2, 1);
            return;
        }
        this.p.a(false, 1, 2);
    }

    public final void a(rov rov, int i2) {
        nbf nbf = this.g;
        nbf.c.a(rov.a(), "list-of-tracks", i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        nbf.a(rov);
    }

    public final void a(boolean z) {
        this.w.setVisibility(0);
    }

    public final sso ae_() {
        return ViewUris.H;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREE_TIER_ALL_SONGS_DIALOG, ViewUris.H.toString());
    }

    public final uqm ag() {
        return uqo.ac;
    }

    public final gkq aj() {
        return PageIdentifiers.FREE_TIER_ALL_SONGS_DIALOG;
    }

    public final void b(rov rov, int i2) {
        nbf nbf = this.g;
        nbf.c.a(rov.a(), "list-of-tracks", i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        nbf.a(rov);
    }

    public final void b(boolean z) {
        nay nay = this.h;
        if (nay.h != z) {
            nay.h = z;
            if (nay.b() > 0) {
                nay.e();
            }
        }
    }

    public final void c(rov rov, int i2) {
        nbf nbf = this.g;
        boolean e = rov.e();
        FreeTierAllSongsDialogLogger freeTierAllSongsDialogLogger = nbf.c;
        String a = rov.a();
        UserIntent userIntent = e ? UserIntent.LIKE_DISABLE : UserIntent.LIKE_ENABLE;
        InteractionAction a2 = e ? vao.a(a, false) : vao.a(a, true);
        freeTierAllSongsDialogLogger.a.a(a, "list-of-tracks", i2, InteractionType.HIT, userIntent.toString(), a2);
        if (e) {
            nbf.g.a(rov.a(), true);
        } else {
            nbf.g.a(rov.a(), nbf.c(), true);
        }
    }

    public final void d(rov rov, int i2) {
        nbf nbf = this.g;
        boolean f = rov.f();
        nbf.c.a(rov.a(), "list-of-tracks", i2, InteractionType.HIT, f ? UserIntent.BAN_DISABLE : UserIntent.BAN_ENABLE);
        if (f) {
            nbf.e.b(rov.a(), nbf.d(), true);
            return;
        }
        nbf.e.a(rov.a(), nbf.d(), true);
        nbf.d.c(nav.a(rov));
    }

    public final void k() {
        finish();
    }

    public final void l() {
        if (this.q.d()) {
            this.q.b();
        }
        Parcelable parcelable = this.m;
        if (parcelable != null) {
            this.k.post(new Runnable(parcelable) {
                private final /* synthetic */ Parcelable f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    FreeTierAllSongsDialogActivity.this.a(this.f$1);
                }
            });
            this.m = null;
        }
    }

    public final ArrayList<rov> m() {
        return this.r;
    }

    public final String n() {
        return this.s;
    }

    public void onBackPressed() {
        nbf nbf = this.g;
        nbf.c.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        nbf.b();
    }

    public void onCreate(Bundle bundle) {
        String str = "tracks";
        String str2 = "context_uri";
        String str3 = "tracks_title";
        String str4 = "available_tracks_only";
        if (bundle != null) {
            this.s = bundle.getString(str3, null);
            this.t = bundle.getString(str2, null);
            this.m = bundle.getParcelable("list");
            this.r = bundle.getParcelableArrayList(str);
            if (bundle.containsKey(str4)) {
                this.u = Optional.b(Boolean.valueOf(bundle.getBoolean(str4)));
            }
        } else {
            this.s = getIntent().getStringExtra(str3);
            this.t = getIntent().getStringExtra(str2);
            this.r = getIntent().getParcelableArrayListExtra(str);
            if (getIntent().hasExtra(str4)) {
                this.u = Optional.b(Boolean.valueOf(getIntent().getBooleanExtra(str4, false)));
            }
        }
        super.onCreate(bundle);
        if (this.r == null) {
            Assertion.a("A list of tracks provided. Did you use createIntent()?");
        }
        setContentView((int) R.layout.activity_all_songs);
        gau.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        this.k = (RecyclerView) findViewById(R.id.recycler_view);
        this.k.a((i) new LinearLayoutManager(this));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.toolbar_wrapper);
        this.n = ftc.a(this, frameLayout);
        gav.a(this.n.getView(), this);
        frameLayout.addView(this.n.getView(), 0);
        this.o = new fzm(this, this.n, this.x);
        this.o.c(true);
        this.o.b(true);
        this.o.a(0.0f);
        View inflate = LayoutInflater.from(this).inflate(R.layout.free_tier_all_songs_header, this.k, false);
        this.v = (TextView) inflate.findViewById(R.id.title);
        this.w = (TextView) inflate.findViewById(R.id.subtitle);
        this.w.setVisibility(8);
        this.l = inflate;
        this.p = new vhx();
        this.p.a((a<H>) new jog<H>(this.l, true), 0);
        this.p.a(false, 0);
        fsm c = fqv.e().c(this, null);
        c.a((CharSequence) getString(R.string.free_tier_section_header_includes));
        this.p.a((a<H>) new jog<H>(c.getView(), true), 1);
        this.p.a((a<H>) this.h, 2);
        this.p.a(true, 0);
        this.p.a(false, 1, 2);
        this.k.a((a) this.p);
        this.k.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i, int i2) {
                FreeTierAllSongsDialogActivity.this.o.a(Math.min(((float) recyclerView.computeVerticalScrollOffset()) / ((float) FreeTierAllSongsDialogActivity.this.l.getHeight()), 1.0f));
            }
        });
        this.q = LoadingView.a(getLayoutInflater(), this, this.k);
        viewGroup.addView(this.q);
        this.q.a();
        this.k.setVisibility(4);
    }

    public /* synthetic */ jpe onCreateContextMenu(Object obj) {
        nax nax = (nax) obj;
        nbf nbf = this.g;
        jpc jpc = this.j;
        int c = nax.c();
        String a = nax.a();
        String b = nax.b();
        String str = a;
        nbf.c.a(str, "list-of-tracks", c, InteractionType.HIT, UserIntent.TRACK_CONTEXT_MENU_CLICKED);
        if (jva.a(a).b == LinkType.TRACK) {
            return jpc.a(a, b, nbf.d()).a(nbf.a).a(false).b(true).c(true).d(false).g(false).h(true).e(false).j(!nbf.f.a(nbf.h)).a();
        }
        StringBuilder sb = new StringBuilder("Unsupported uri for building context menu. Only track and episode supported. was: ");
        sb.append(a);
        Assertion.a(sb.toString());
        return null;
    }

    public void onResume() {
        super.onResume();
        this.i.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.k;
        if (recyclerView != null) {
            bundle.putParcelable("list", ((i) fbp.a(recyclerView.d())).d());
        }
        bundle.putString("tracks_title", this.s);
        bundle.putParcelableArrayList("tracks", this.r);
        bundle.putString("context_uri", this.t);
        if (this.u.b()) {
            bundle.putBoolean("available_tracks_only", ((Boolean) this.u.a(Boolean.FALSE)).booleanValue());
        }
    }

    public void onStart() {
        super.onStart();
        this.g.a();
    }

    public void onStop() {
        this.g.b.a();
        super.onStop();
    }

    public final String q() {
        return this.t;
    }
}
