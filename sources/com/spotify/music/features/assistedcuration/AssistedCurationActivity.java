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

public class AssistedCurationActivity extends kyd implements a, lqj, ltt, a, a, udv {
    public lra g;
    public lpv h;
    public ToastieManager i;
    public jsz j;
    public lpt k;
    private final uwc l = new uwc() {
        public final void a(View view, float f) {
        }

        public final void b(View view, float f) {
        }

        public final int a() {
            return AssistedCurationActivity.this.t;
        }

        public final int b() {
            return AssistedCurationActivity.this.t;
        }
    };
    private fse m;
    private ImageButton n;
    private ToolbarSearchFieldView o;
    private CarouselView p;
    private LoadingView q;
    private fuj r;
    private Parcelable s;
    /* access modifiers changed from: private */
    public int t;
    private String u;

    public void onCreate(Bundle bundle) {
        String str = "uri";
        if (bundle != null) {
            this.u = bundle.getString(str);
        } else {
            this.u = getIntent().getStringExtra(str);
        }
        super.onCreate(bundle);
        if (fax.a(this.u)) {
            Assertion.a("No playlist uri provided. Did you use createIntent()?");
        }
        setContentView((int) R.layout.activity_assisted_curation);
        gaa.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        this.m = fsi.a(this, viewGroup);
        gab.a(this.m.getView(), this);
        viewGroup.addView(this.m.getView());
        this.n = new StateListAnimatorImageButton(this);
        ip.a((View) this.n, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) this, SpotifyIconV2.ARROW_LEFT, (float) getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(getBaseContext(), R.color.white));
        this.n.setImageDrawable(spotifyIconDrawable);
        this.n.setContentDescription(getString(R.string.generic_content_description_close));
        this.n.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                lra lra = AssistedCurationActivity.this.g;
                lra.b.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.CLOSE);
                lra.a.k();
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
                lra lra = AssistedCurationActivity.this.g;
                if (lra.k != null) {
                    lra.b.a(null, "search-box", 0, InteractionType.HIT, UserIntent.SEARCH);
                    ltt ltt = lra.a;
                    fpt fpt = lra.k;
                    Set<String> set = lra.j;
                    fay.a(set);
                    fay.a(true, (Object) "limit is negative");
                    ltt.a(fpt, ImmutableSet.a((Iterable<? extends E>) new fbx<T>(set, 100) {
                        private /* synthetic */ Iterable a;
                        private /* synthetic */ int b;

                        {
                            this.a = r1;
                            this.b = r2;
                        }

                        public final Iterator<T> iterator() {
                            Iterator it = this.a.iterator();
                            int i = this.b;
                            fay.a(it);
                            fay.a(i >= 0, (Object) "limit is negative");
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
                    }), lra.h);
                }
            }
        });
        this.t = uts.a(10.0f, getResources());
        this.p = (CarouselView) findViewById(R.id.carousel);
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(MeasureMode.FILL);
        carouselLayoutManager.a = this.l;
        this.p.a((i) carouselLayoutManager);
        lpv lpv = this.h;
        boolean a = uur.a((Context) this);
        if (lpv.e != a) {
            lpv.e = a;
            lpv.e();
        }
        this.p.a((RecyclerView.a) this.h);
        f fVar = this.p.x;
        if (fVar != null) {
            fVar.i = 500;
        }
        CarouselView carouselView = this.p;
        RecyclerView.a aVar = (RecyclerView.a) fay.a(carouselView.c());
        lpw lpw = new lpw(carouselView);
        aVar.a((c) new c(lpw, aVar) {
            private /* synthetic */ lpw a;
            private /* synthetic */ RecyclerView.a b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final void a() {
                lpw lpw = this.a;
                int b2 = this.b.b();
                if (lpw.b != b2) {
                    lpw.b = b2;
                    lpw.a.invalidate();
                }
            }
        });
        carouselView.a((CarouselView.a) new CarouselView.a(aVar, lpw) {
            private /* synthetic */ RecyclerView.a a;
            private /* synthetic */ lpw b;

            public final void a(int i) {
            }

            public final void b(int i) {
            }

            {
                this.a = r1;
                this.b = r2;
            }

            public final void a(int i, int i2, float f) {
                int min = Math.min(i2, this.a.b() - 1);
                float f2 = i == min ? (float) i : i > min ? ((float) i) - f : ((float) i) + f;
                lpw lpw = this.b;
                if (Math.abs(lpw.c - f2) > 0.001f) {
                    lpw.c = f2;
                    lpw.a.invalidate();
                }
            }
        });
        carouselView.a((h) lpw, -1);
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
        fqb.f();
        this.r = fum.a(this, viewGroup2);
        viewGroup2.addView(this.r.getView());
        this.r.a(false);
        this.r.getView().setVisibility(8);
        if (bundle != null) {
            lra lra = this.g;
            lqz a2 = lqz.a(bundle);
            lra.i.set(a2.b());
            lra.g = a2.a();
            lra.d.a(a2.c());
            this.s = bundle.getParcelable("list");
        }
    }

    public void onStart() {
        super.onStart();
        this.g.a();
    }

    public void onStop() {
        super.onStop();
        lra lra = this.g;
        if (lra.f != null) {
            lra.f.unsubscribe();
            lra.f = null;
        }
    }

    public void onResume() {
        super.onResume();
        this.i.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("uri", this.u);
        lra lra = this.g;
        a aVar = new a();
        lrl lrl = lra.d;
        ArrayList a = Lists.a();
        for (lrg b : lrl.a.values()) {
            a.add(b.b());
        }
        lqz a2 = aVar.a((List<byte[]>) a).a(lra.i.get()).a(lra.g).a();
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
            bundle.putParcelable("list", ((i) fay.a(carouselView.d())).d());
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.q.a();
        } else {
            this.q.b();
        }
    }

    public final void a(List<lqy> list, boolean z) {
        lpv lpv = this.h;
        lpv.a = list;
        lpv.d = z;
        lpv.e();
        int b = this.h.b();
        if (b > 0) {
            int min = Math.min(this.p.o(), b - 1);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.p.d();
        if (d != null) {
            d.a(parcelable);
        }
    }

    public final void a(String str) {
        this.m.a((CharSequence) str);
    }

    public final void k() {
        finish();
    }

    public final void a(fpt fpt, Set<String> set, String str) {
        lpt lpt = this.k;
        lpt.a.startActivityForResult(AssistedCurationSearchActivity.a(lpt.a, fpt, Lists.a((Iterable<? extends E>) set), str), 1);
    }

    public final void b(String str) {
        uos a = uos.a(getString(R.string.toast_added_to_playlist, new Object[]{str}), 3000).c(R.color.white).b(R.color.cat_black).a();
        if (!this.i.b()) {
            this.i.a = a;
        } else {
            this.i.a(a);
        }
    }

    public final void c(String str) {
        this.j.a(SpotifyIconV2.ADD_TO_PLAYLIST, getString(R.string.toast_added_to_playlist, new Object[]{str}), R.string.toast_added_to_playlist, 0);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void s() {
        CarouselView carouselView = this.p;
        lpv lpv = this.h;
        carouselView.i(lpv.e ? lpv.b() - 1 : 0);
    }

    public final void q() {
        this.p.post(new Runnable() {
            public final void run() {
                AssistedCurationActivity.this.s();
            }
        });
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == -1 && intent != null) {
            lra lra = this.g;
            ArrayList stringArrayListExtra = intent.getStringArrayListExtra("added_tracks");
            fay.a(stringArrayListExtra);
            fay.a(!stringArrayListExtra.isEmpty());
            if (!lra.j.containsAll(stringArrayListExtra)) {
                lra.j.addAll(stringArrayListExtra);
                String str = (String) stringArrayListExtra.get(stringArrayListExtra.size() - 1);
                String str2 = str;
                lra.b.a(str2, "search", 0, InteractionType.HIT, UserIntent.ADDED_FROM_SEARCH);
                lra.d.a(str, lra.j, lra.c);
                lra.a(stringArrayListExtra);
            }
        }
    }

    public void onBackPressed() {
        this.g.b.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        super.onBackPressed();
    }

    public final sih ae_() {
        return ViewUris.N.a(this.u);
    }

    public final gjf aj() {
        return PageIdentifiers.ASSISTED_CURATION;
    }

    public final udr ag() {
        return udt.i;
    }

    public final String r() {
        return this.u;
    }

    public final void a(lqy lqy) {
        lra lra = this.g;
        if (faw.a(lqy.b(), lra.g)) {
            lra.b.a(null, lqy.b(), 0, InteractionType.HIT, UserIntent.SHOW_MORE);
            lrl lrl = lra.d;
            Set<String> set = lra.j;
            lrg lrg = (lrg) lrl.a.get(lqy.c());
            if (lrg != null) {
                lrg.a(lqy.b(), set);
            }
        }
    }

    public final void a(lqy lqy, lqv lqv, int i2) {
        lra lra = this.g;
        if (faw.a(lqy.b(), lra.g)) {
            lra.b.a(lqv.a(), lqy.b(), i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
            lra.a(lqy, lqv);
        }
    }

    public final void b(lqy lqy, lqv lqv, int i2) {
        lra lra = this.g;
        String a = lqv.a();
        if (faw.a(lqy.b(), lra.g) && !lra.j.contains(a)) {
            lra.j.add(a);
            lra.e.c(lpu.a(lqv, lqy));
            lra.b.a(lqv.a(), lqy.b(), i2, InteractionType.HIT, UserIntent.ADD_TRACK_VIA_ACCESSORY);
            lrl lrl = lra.d;
            Set<String> set = lra.j;
            lrg lrg = (lrg) lrl.a.get(lqy.c());
            if (lrg != null) {
                lrg.a(lqy.b(), lqv, set);
            }
            lra.a(Lists.a((E[]) new String[]{a}));
        }
    }

    public final void c(lqy lqy, lqv lqv, int i2) {
        lra lra = this.g;
        if (faw.a(lqy.b(), lra.g)) {
            lra.b.a(lqv.a(), lqy.b(), i2, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
            lra.a(lqy, lqv);
        }
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, AssistedCurationActivity.class);
        intent.putExtra("uri", str);
        return intent;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ASSISTED_CURATION, ae_().toString());
    }
}
