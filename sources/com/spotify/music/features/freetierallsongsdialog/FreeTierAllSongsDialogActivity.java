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
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.music.ubi.interactions.InteractionAction;
import java.util.ArrayList;
import java.util.List;

public class FreeTierAllSongsDialogActivity extends kyd implements jmf<mvw>, b, mwb, mwf, a, a, udv {
    public mwe g;
    public mvx h;
    public ToastieManager i;
    public jmq j;
    private RecyclerView k;
    /* access modifiers changed from: private */
    public View l;
    private Parcelable m;
    private fse n;
    /* access modifiers changed from: private */
    public fys o;
    private uwh p;
    private LoadingView q;
    private ArrayList<rft> r;
    private String s;
    private String t;
    private Optional<Boolean> u = Optional.e();
    private TextView v;
    private TextView w;
    private final OnClickListener x = new OnClickListener() {
        public final void onClick(View view) {
            mwe mwe = FreeTierAllSongsDialogActivity.this.g;
            mwe.c.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.CLOSE);
            mwe.b();
        }
    };

    public /* synthetic */ jms onCreateContextMenu(Object obj) {
        mvw mvw = (mvw) obj;
        mwe mwe = this.g;
        jmq jmq = this.j;
        int c = mvw.c();
        String a = mvw.a();
        String b = mvw.b();
        String str = a;
        mwe.c.a(str, "list-of-tracks", c, InteractionType.HIT, UserIntent.TRACK_CONTEXT_MENU_CLICKED);
        if (jst.a(a).b == LinkType.TRACK) {
            return jmq.a(a, b, mwe.d()).a(mwe.a).a(false).b(true).c(true).d(false).g(false).h(true).e(false).j(!mwe.f.a(mwe.h)).a();
        }
        StringBuilder sb = new StringBuilder("Unsupported uri for building context menu. Only track and episode supported. was: ");
        sb.append(a);
        Assertion.a(sb.toString());
        return null;
    }

    public void onStart() {
        super.onStart();
        this.g.a();
    }

    public void onStop() {
        this.g.b.a();
        super.onStop();
    }

    public void onResume() {
        super.onResume();
        this.i.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.k;
        if (recyclerView != null) {
            bundle.putParcelable("list", ((i) fay.a(recyclerView.d())).d());
        }
        bundle.putString("tracks_title", this.s);
        bundle.putParcelableArrayList("tracks", this.r);
        bundle.putString("context_uri", this.t);
        if (this.u.b()) {
            bundle.putBoolean("available_tracks_only", ((Boolean) this.u.a(Boolean.FALSE)).booleanValue());
        }
    }

    public void onBackPressed() {
        mwe mwe = this.g;
        mwe.c.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        mwe.b();
    }

    public final sih ae_() {
        return ViewUris.I;
    }

    public final gjf aj() {
        return PageIdentifiers.FREE_TIER_ALL_SONGS_DIALOG;
    }

    public final udr ag() {
        return udt.ac;
    }

    public final void a(rft rft, int i2) {
        mwe mwe = this.g;
        mwe.c.a(rft.a(), "list-of-tracks", i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        mwe.a(rft);
    }

    public final void b(rft rft, int i2) {
        mwe mwe = this.g;
        mwe.c.a(rft.a(), "list-of-tracks", i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        mwe.a(rft);
    }

    public final void c(rft rft, int i2) {
        UserIntent userIntent;
        InteractionAction interactionAction;
        mwe mwe = this.g;
        boolean e = rft.e();
        FreeTierAllSongsDialogLogger freeTierAllSongsDialogLogger = mwe.c;
        String a = rft.a();
        if (e) {
            userIntent = UserIntent.LIKE_DISABLE;
        } else {
            userIntent = UserIntent.LIKE_ENABLE;
        }
        if (e) {
            interactionAction = upj.a(a, false);
        } else {
            interactionAction = upj.a(a, true);
        }
        InteractionAction interactionAction2 = interactionAction;
        InteractionType interactionType = InteractionType.HIT;
        InteractionLogger interactionLogger = freeTierAllSongsDialogLogger.a;
        String userIntent2 = userIntent.toString();
        interactionLogger.a(a, "list-of-tracks", i2, interactionType, userIntent2, interactionAction2);
        if (e) {
            mwe.g.a(rft.a(), true);
        } else {
            mwe.g.a(rft.a(), mwe.c(), true);
        }
    }

    public final void d(rft rft, int i2) {
        mwe mwe = this.g;
        boolean f = rft.f();
        mwe.c.a(rft.a(), "list-of-tracks", i2, InteractionType.HIT, f ? UserIntent.BAN_DISABLE : UserIntent.BAN_ENABLE);
        if (f) {
            mwe.e.b(rft.a(), mwe.d(), true);
            return;
        }
        mwe.e.a(rft.a(), mwe.d(), true);
        mwe.d.c(mvu.a(rft));
    }

    public final void k() {
        finish();
    }

    public final void a(String str) {
        this.v.setText(str);
        this.o.a(str);
    }

    public final void a(boolean z) {
        this.w.setVisibility(0);
    }

    public final void a(List<rft> list) {
        if (!list.isEmpty()) {
            mvx mvx = this.h;
            mvx.a = list;
            mvx.e();
            this.p.a(true, 2, 1);
            return;
        }
        this.p.a(false, 1, 2);
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

    public final void b(boolean z) {
        mvx mvx = this.h;
        if (mvx.h != z) {
            mvx.h = z;
            if (mvx.b() > 0) {
                mvx.e();
            }
        }
    }

    public final ArrayList<rft> m() {
        return this.r;
    }

    public final String n() {
        return this.s;
    }

    public final String q() {
        return this.t;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.k.d();
        if (d != null) {
            d.a(parcelable);
        }
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
        gaa.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        this.k = (RecyclerView) findViewById(R.id.recycler_view);
        this.k.a((i) new LinearLayoutManager(this));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.toolbar_wrapper);
        this.n = fsi.a(this, frameLayout);
        gab.a(this.n.getView(), this);
        frameLayout.addView(this.n.getView(), 0);
        this.o = new fys(this, this.n, this.x);
        this.o.c(true);
        this.o.b(true);
        this.o.a(0.0f);
        View inflate = LayoutInflater.from(this).inflate(R.layout.free_tier_all_songs_header, this.k, false);
        this.v = (TextView) inflate.findViewById(R.id.title);
        this.w = (TextView) inflate.findViewById(R.id.subtitle);
        this.w.setVisibility(8);
        this.l = inflate;
        this.p = new uwh();
        this.p.a((a<H>) new jlu<H>(this.l, true), 0);
        this.p.a(false, 0);
        frs c = fqb.e().c(this, null);
        c.a((CharSequence) getString(R.string.free_tier_section_header_includes));
        this.p.a((a<H>) new jlu<H>(c.getView(), true), 1);
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

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREE_TIER_ALL_SONGS_DIALOG, ViewUris.I.toString());
    }

    public static Intent a(Context context, fpt fpt, ArrayList<rft> arrayList, String str, String str2) {
        if (fax.a(str)) {
            Assertion.a("No title provided. A title MUST be provided.");
        }
        Intent intent = new Intent(context, FreeTierAllSongsDialogActivity.class);
        fpu.a(intent, fpt);
        intent.putExtra("tracks_title", str);
        intent.putParcelableArrayListExtra("tracks", arrayList);
        intent.putExtra("context_uri", str2);
        return intent;
    }
}
