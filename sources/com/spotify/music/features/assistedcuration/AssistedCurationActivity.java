package com.spotify.music.features.assistedcuration;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter.a;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchActivity;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager.MeasureMode;
import com.spotify.paste.widgets.carousel.CarouselView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class AssistedCurationActivity extends lbm implements a, lui, lxs, a, a, uqq {
    public luz g;
    public ltu h;
    public ToastieManager i;
    public jvf j;
    public lts k;
    private final vhs l = new vhs() {
        public final int a() {
            return AssistedCurationActivity.this.t;
        }

        public final void a(View view, float f) {
        }

        public final int b() {
            return AssistedCurationActivity.this.t;
        }

        public final void b(View view, float f) {
        }
    };
    private fsy m;
    private ImageButton n;
    private ToolbarSearchFieldView o;
    private CarouselView p;
    private LoadingView q;
    private fvd r;
    private Parcelable s;
    /* access modifiers changed from: private */
    public int t;
    private String u;

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, AssistedCurationActivity.class);
        intent.putExtra("uri", str);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.p.d();
        if (d != null) {
            d.a(parcelable);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s() {
        CarouselView carouselView = this.p;
        ltu ltu = this.h;
        carouselView.i(ltu.e ? ltu.b() - 1 : 0);
    }

    public final void a(fqn fqn, Set<String> set, String str) {
        lts lts = this.k;
        lts.a.startActivityForResult(AssistedCurationSearchActivity.a(lts.a, fqn, Lists.a((Iterable<? extends E>) set), str), 1);
    }

    public final void a(String str) {
        this.m.a((CharSequence) str);
    }

    public final void a(List<lux> list, boolean z) {
        ltu ltu = this.h;
        ltu.a = list;
        ltu.d = z;
        ltu.e();
        int b = this.h.b();
        if (b > 0) {
            int min = Math.min(this.p.n(), b - 1);
            this.g.a(this.h.g(min), this.h.f(min));
        }
        Parcelable parcelable = this.s;
        if (parcelable != null) {
            this.p.post(new Runnable(parcelable) {
                private final /* synthetic */ Parcelable f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AssistedCurationActivity.this.a(this.f$1);
                }
            });
            this.s = null;
        }
    }

    public final void a(lux lux) {
        luz luz = this.g;
        if (fbn.a(lux.b(), luz.g)) {
            luz.b.a(null, lux.b(), 0, InteractionType.HIT, UserIntent.SHOW_MORE);
            lvk lvk = luz.d;
            Set<String> set = luz.j;
            lvf lvf = (lvf) lvk.a.get(lux.c());
            if (lvf != null) {
                lvf.a(lux.b(), set);
            }
        }
    }

    public final void a(lux lux, luu luu, int i2) {
        luz luz = this.g;
        if (fbn.a(lux.b(), luz.g)) {
            luz.b.a(luu.a(), lux.b(), i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
            luz.a(lux, luu);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.q.a();
        } else {
            this.q.b();
        }
    }

    public final sso ae_() {
        return ViewUris.M.a(this.u);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ASSISTED_CURATION, ae_().toString());
    }

    public final uqm ag() {
        return uqo.i;
    }

    public final gkq aj() {
        return PageIdentifiers.ASSISTED_CURATION;
    }

    public final void b(String str) {
        uzy a = uzy.a(getString(R.string.toast_added_to_playlist, new Object[]{str}), 3000).c(R.color.white).b(R.color.cat_black).a();
        if (!this.i.b()) {
            this.i.a = a;
        } else {
            this.i.a(a);
        }
    }

    public final void b(lux lux, luu luu, int i2) {
        luz luz = this.g;
        String a = luu.a();
        if (fbn.a(lux.b(), luz.g) && !luz.j.contains(a)) {
            luz.j.add(a);
            luz.e.c(ltt.a(luu, lux));
            luz.b.a(luu.a(), lux.b(), i2, InteractionType.HIT, UserIntent.ADD_TRACK_VIA_ACCESSORY);
            lvk lvk = luz.d;
            Set<String> set = luz.j;
            lvf lvf = (lvf) lvk.a.get(lux.c());
            if (lvf != null) {
                lvf.a(lux.b(), luu, set);
            }
            luz.a(Lists.a((E[]) new String[]{a}));
        }
    }

    public final void c(String str) {
        this.j.a(SpotifyIconV2.ADD_TO_PLAYLIST, getString(R.string.toast_added_to_playlist, new Object[]{str}), R.string.toast_added_to_playlist, 0);
    }

    public final void c(lux lux, luu luu, int i2) {
        luz luz = this.g;
        if (fbn.a(lux.b(), luz.g)) {
            luz.b.a(luu.a(), lux.b(), i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
            luz.a(lux, luu);
        }
    }

    public final void k() {
        finish();
    }

    public final void l() {
        this.r.a((CharSequence) getString(R.string.assisted_curation_empty_view_no_cards_title));
        this.r.c().setVisibility(8);
        this.r.getView().setVisibility(0);
    }

    public final void m() {
        this.r.a((CharSequence) getString(R.string.assisted_curation_empty_view_no_connection_title));
        this.r.b((CharSequence) getString(R.string.assisted_curation_empty_view_no_connection_subtitle));
        this.r.c().setVisibility(0);
        this.r.getView().setVisibility(0);
    }

    public final void n() {
        this.r.getView().setVisibility(8);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == -1 && intent != null) {
            luz luz = this.g;
            ArrayList stringArrayListExtra = intent.getStringArrayListExtra("added_tracks");
            fbp.a(stringArrayListExtra);
            fbp.a(!stringArrayListExtra.isEmpty());
            if (!luz.j.containsAll(stringArrayListExtra)) {
                luz.j.addAll(stringArrayListExtra);
                String str = (String) stringArrayListExtra.get(stringArrayListExtra.size() - 1);
                String str2 = str;
                luz.b.a(str2, "search", 0, InteractionType.HIT, UserIntent.ADDED_FROM_SEARCH);
                luz.d.a(str, luz.j, luz.c);
                luz.a(stringArrayListExtra);
            }
        }
    }

    public void onBackPressed() {
        this.g.b.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String str = "uri";
        if (bundle != null) {
            this.u = bundle.getString(str);
        } else {
            this.u = getIntent().getStringExtra(str);
        }
        super.onCreate(bundle);
        if (fbo.a(this.u)) {
            Assertion.a("No playlist uri provided. Did you use createIntent()?");
        }
        setContentView((int) R.layout.activity_assisted_curation);
        gau.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        this.m = ftc.a(this, viewGroup);
        gav.a(this.m.getView(), this);
        viewGroup.addView(this.m.getView());
        this.n = new StateListAnimatorImageButton(this);
        ip.a((View) this.n, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) this, SpotifyIconV2.ARROW_LEFT, (float) getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(getBaseContext(), R.color.white));
        this.n.setImageDrawable(spotifyIconDrawable);
        this.n.setContentDescription(getString(R.string.generic_content_description_close));
        this.n.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                luz luz = AssistedCurationActivity.this.g;
                luz.b.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.CLOSE);
                luz.a.k();
            }
        });
        this.m.a(ToolbarSide.START, this.n, R.id.toolbar_up_button);
        this.o = (ToolbarSearchFieldView) findViewById(R.id.search_toolbar);
        this.o.a((b) new b() {
            public final void a() {
            }

            public final void b() {
            }

            public final void c() {
                luz luz = AssistedCurationActivity.this.g;
                if (luz.k != null) {
                    luz.b.a(null, "search-box", 0, InteractionType.HIT, UserIntent.SEARCH);
                    lxs lxs = luz.a;
                    fqn fqn = luz.k;
                    Set<String> set = luz.j;
                    fbp.a(set);
                    fbp.a(true, (Object) "limit is negative");
                    lxs.a(fqn, ImmutableSet.a((Iterable<? extends E>) new fcp<T>(set, 100) {
                        private /* synthetic */ Iterable a;
                        private /* synthetic */ int b;

                        {
                            this.a = r1;
                            this.b = r2;
                        }

                        public final Iterator<T> iterator() {
                            Iterator it = this.a.iterator();
                            int i = this.b;
                            fbp.a(it);
                            fbp.a(i >= 0, (Object) "limit is negative");
                            return new Iterator<T>(i, it) {
                                private int a;
                                private /* synthetic */ int b;
                                private /* synthetic */ Iterator c;

                                {
                                    this.b = r1;
                                    this.c = r2;
                                }

                                public final boolean hasNext() {
                                    return this.a < this.b && this.c.hasNext();
                                }

                                public final T next() {
                                    if (hasNext()) {
                                        this.a++;
                                        return this.c.next();
                                    }
                                    throw new NoSuchElementException();
                                }

                                public final void remove() {
                                    this.c.remove();
                                }
                            };
                        }
                    }), luz.h);
                }
            }
        });
        this.t = vfj.a(10.0f, getResources());
        this.p = (CarouselView) findViewById(R.id.carousel);
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(MeasureMode.FILL);
        carouselLayoutManager.a = this.l;
        this.p.a((i) carouselLayoutManager);
        ltu ltu = this.h;
        boolean a = vgi.a((Context) this);
        if (ltu.e != a) {
            ltu.e = a;
            ltu.e();
        }
        this.p.a((RecyclerView.a) this.h);
        f fVar = this.p.x;
        if (fVar != null) {
            fVar.i = 500;
        }
        CarouselView carouselView = this.p;
        RecyclerView.a aVar = (RecyclerView.a) fbp.a(carouselView.c());
        ltv ltv = new ltv(carouselView);
        aVar.a((c) new c(ltv, aVar) {
            private /* synthetic */ ltv a;
            private /* synthetic */ RecyclerView.a b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final void a() {
                ltv ltv = this.a;
                int b2 = this.b.b();
                if (ltv.b != b2) {
                    ltv.b = b2;
                    ltv.a.invalidate();
                }
            }
        });
        carouselView.a((CarouselView.a) new CarouselView.a(aVar, ltv) {
            private /* synthetic */ RecyclerView.a a;
            private /* synthetic */ ltv b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final void a(int i) {
            }

            public final void a(int i, int i2, float f) {
                int min = Math.min(i2, this.a.b() - 1);
                float f2 = i == min ? (float) i : i > min ? ((float) i) - f : ((float) i) + f;
                ltv ltv = this.b;
                if (Math.abs(ltv.c - f2) > 0.001f) {
                    ltv.c = f2;
                    ltv.a.invalidate();
                }
            }

            public final void b(int i) {
            }
        });
        carouselView.a((h) ltv, -1);
        this.p.a((CarouselView.a) new CarouselView.a() {
            public final void a(int i) {
            }

            public final void a(int i, int i2, float f) {
            }

            public final void b(int i) {
                AssistedCurationActivity.this.g.a(AssistedCurationActivity.this.h.g(i), AssistedCurationActivity.this.h.f(i));
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.content);
        this.q = LoadingView.a(getLayoutInflater(), this, this.p);
        this.q.setLayoutParams(new LayoutParams(-1, -1));
        viewGroup2.addView(this.q);
        fqv.f();
        this.r = fvg.a(this, viewGroup2);
        viewGroup2.addView(this.r.getView());
        this.r.a(false);
        this.r.getView().setVisibility(8);
        if (bundle != null) {
            luz luz = this.g;
            luy a2 = luy.a(bundle);
            luz.i.set(a2.b());
            luz.g = a2.a();
            luz.d.a(a2.c());
            this.s = bundle.getParcelable("list");
        }
    }

    public void onResume() {
        super.onResume();
        this.i.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("uri", this.u);
        luz luz = this.g;
        a aVar = new a();
        lvk lvk = luz.d;
        ArrayList a = Lists.a();
        for (lvf b : lvk.a.values()) {
            a.add(b.b());
        }
        luy a2 = aVar.a((List<byte[]>) a).a(luz.i.get()).a(luz.g).a();
        List c = a2.c();
        for (int i2 = 0; i2 < c.size(); i2++) {
            StringBuilder sb = new StringBuilder("cards_state_item");
            sb.append(i2);
            bundle.putByteArray(sb.toString(), (byte[]) c.get(i2));
        }
        bundle.putInt("cards_state_length", c.size());
        bundle.putInt("cards_count", a2.b());
        bundle.putString("current_card_id", a2.a());
        CarouselView carouselView = this.p;
        if (carouselView != null) {
            bundle.putParcelable("list", ((i) fbp.a(carouselView.d())).d());
        }
    }

    public void onStart() {
        super.onStart();
        this.g.a();
    }

    public void onStop() {
        super.onStop();
        luz luz = this.g;
        if (luz.f != null) {
            luz.f.unsubscribe();
            luz.f = null;
        }
    }

    public final void q() {
        this.p.post(new Runnable() {
            public final void run() {
                AssistedCurationActivity.this.s();
            }
        });
    }

    public final String r() {
        return this.u;
    }
}
