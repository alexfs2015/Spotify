package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.List;

/* renamed from: quf reason: default package */
public class quf extends jrd implements jqx, lbp, b, qva, a, uqq {
    /* access modifiers changed from: private */
    public qvk T;
    private RecyclerView U;
    private fvh V;
    private final a W = new a() {
        public final void a(boolean z) {
        }

        public final void ah() {
            quf.this.a.d(gkr.a(quf.this.T.a.b));
        }

        public final void c(String str) {
            quf.this.a.c(str);
        }

        public final void onQueryChanged(String str) {
            quf.this.a.b(str);
        }
    };
    public a a;
    public qtp b;

    public static quf a(fqn fqn) {
        quf quf = new quf();
        fqo.a((Fragment) quf, fqn);
        return quf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, View view, TasteOnboardingItem tasteOnboardingItem) {
        this.a.a(i, tasteOnboardingItem, gkr.a(view));
    }

    private static void a(fvh fvh) {
        fvh.c().setVisibility(0);
    }

    private static void a(fvh fvh, int i) {
        fvh.b().setText(i);
    }

    private void ah() {
        this.U.setVisibility(8);
        this.V.getView().setVisibility(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean ak() {
        return this.a.a(gkr.a(this.T.a.c));
    }

    private static void b(fvh fvh) {
        fvh.c().setVisibility(4);
    }

    private static void b(fvh fvh, int i) {
        fvh.c().setText(i);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_free_tier_taste_onboarding_search_artist_sthlm_blk, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.container);
        Context context = (Context) fbp.a(n());
        this.T = new qvk(context, (ToolbarSearchFieldView) linearLayout.findViewById(R.id.search_toolbar));
        this.T.a.d.setVisibility(8);
        this.T.a((b) new $$Lambda$quf$c24rK2wZjsVswAZphOLGddVR0M(this));
        this.U = new RecyclerView(context);
        this.b.e = (a) fbp.a(new $$Lambda$quf$aOoaRXeJbeRRswZFwjIS8jH1pM(this));
        this.U.a((i) new LinearLayoutManager(context));
        this.U.a((a) this.b);
        this.U.a((m) new itd() {
            public final int a() {
                return 6;
            }

            public final void a(int i, int i2) {
                quf.this.a.c();
            }

            public final boolean b() {
                return quf.this.a.b();
            }
        });
        linearLayout.addView(this.U);
        this.V = fvm.a(context, linearLayout);
        linearLayout.addView(this.V.getView());
        fvh fvh = this.V;
        fvh.getView().setBackgroundColor(0);
        fvh.b().setTextSize(2, 24.0f);
        int a2 = vfj.a(16.0f, o().getResources());
        View view = fvh.getView();
        view.setPadding(a2, view.getPaddingTop(), a2, view.getPaddingBottom());
        a();
        return inflate;
    }

    public final void a() {
        a(this.V, (int) R.string.free_tier_taste_onboarding_search_empty_state_no_query_title);
        b(this.V);
        ah();
    }

    public final void a(String str) {
        fvh fvh = this.V;
        fvh.b().setText(a((int) R.string.free_tier_taste_onboarding_search_empty_state_no_result_title, str));
        b(this.V, R.string.free_tier_taste_onboarding_search_empty_state_no_result_body);
        a(this.V);
        ah();
    }

    public final void a(List<TasteOnboardingItem> list, boolean z) {
        if (z) {
            this.b.a(ImmutableList.g().b((Iterable<? extends E>) this.b.a).b((Iterable<? extends E>) list).a());
        } else {
            this.b.a(list);
        }
        this.b.e();
    }

    public final void aK_() {
        this.V.getView().setVisibility(8);
        this.U.setVisibility(0);
    }

    public final void aP_() {
        super.aP_();
        this.a.a((b) this);
        this.T.a(this.W);
        this.T.a(250);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.K;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTSEARCH, ViewUris.K.toString());
    }

    public final uqm ag() {
        return uqo.ad;
    }

    public final List<String> ai() {
        return ImmutableList.a("search_field");
    }

    public final gkq aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTSEARCH;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b() {
        a(this.V, (int) R.string.free_tier_taste_onboarding_error_view_general_title);
        b(this.V, R.string.free_tier_taste_onboarding_error_view_general_subtitle);
        a(this.V);
        ah();
    }

    public final boolean d(String str) {
        return "search_field".equals(str);
    }

    public final View e(String str) {
        if ("search_field".equals(str)) {
            qvk qvk = this.T;
            if (qvk != null) {
                return qvk.a.findViewById(R.id.search_toolbar);
            }
        }
        return null;
    }

    public final String e() {
        return uqo.ad.a();
    }

    public final void f() {
        View currentFocus = ((kf) fbp.a(p())).getCurrentFocus();
        if (currentFocus != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) ((Context) fbp.a(n())).getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public final void h() {
        super.h();
        this.T.b(this.W);
        this.a.a();
    }

    public boolean onBackPressed() {
        this.a.d();
        return true;
    }
}
