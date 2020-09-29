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

/* renamed from: qlw reason: default package */
public class qlw extends jor implements jol, kyf, b, qms, a, udv {
    /* access modifiers changed from: private */
    public qne T;
    private RecyclerView U;
    private fun V;
    private boolean W;
    private final a X = new a() {
        public final void a(boolean z) {
        }

        public final void onQueryChanged(String str) {
            qlw.this.a.b(str);
        }

        public final void c(String str) {
            qlw.this.a.c(str);
        }

        public final void ah() {
            qlw.this.a.d(gjg.a(qlw.this.T.a.b));
        }
    };
    public a a;
    public qlg b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static qlw a(fpt fpt) {
        qlw qlw = new qlw();
        fpu.a((Fragment) qlw, fpt);
        return qlw;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.W = qly.a(fpu.a((Fragment) this));
        if (this.W) {
            view = layoutInflater.inflate(R.layout.fragment_free_tier_taste_onboarding_search_artist_sthlm_blk, viewGroup, false);
        } else {
            view = layoutInflater.inflate(R.layout.fragment_free_tier_taste_onboarding_search_artist, viewGroup, false);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.container);
        Context context = (Context) fay.a(n());
        this.T = new qne(context, (ToolbarSearchFieldView) linearLayout.findViewById(R.id.search_toolbar), this.W);
        this.T.a.d.setVisibility(8);
        this.T.a((b) new $$Lambda$qlw$R6alfODgTJYlGJuPpuor5uAaFvY(this));
        this.U = new RecyclerView(context);
        this.b.e = (a) fay.a(new $$Lambda$qlw$zrQiHaPdWLd_gCUvwDTGsdg0JE8(this));
        this.U.a((i) new LinearLayoutManager(context));
        this.U.a((a) this.b);
        this.U.a((m) new iqq() {
            public final int a() {
                return 6;
            }

            public final boolean b() {
                return qlw.this.a.b();
            }

            public final void a(int i, int i2) {
                qlw.this.a.c();
            }
        });
        linearLayout.addView(this.U);
        this.V = fus.a(context, linearLayout);
        linearLayout.addView(this.V.getView());
        fun fun = this.V;
        fun.getView().setBackgroundColor(0);
        fun.b().setTextSize(2, 24.0f);
        int a2 = uts.a(16.0f, o().getResources());
        View view2 = fun.getView();
        view2.setPadding(a2, view2.getPaddingTop(), a2, view2.getPaddingBottom());
        a();
        return view;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean ak() {
        return this.a.a(gjg.a(this.T.a.c));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, View view, TasteOnboardingItem tasteOnboardingItem) {
        this.a.a(i, tasteOnboardingItem, gjg.a(view));
    }

    public final void g() {
        super.g();
        this.a.a((b) this);
        this.T.a(this.X);
        this.T.a(250);
    }

    public final void h() {
        super.h();
        this.T.b(this.X);
        this.a.a();
    }

    public final void a() {
        a(this.V, (int) R.string.free_tier_taste_onboarding_search_empty_state_no_query_title);
        b(this.V);
        ah();
    }

    public final void b() {
        a(this.V, (int) R.string.free_tier_taste_onboarding_error_view_general_title);
        b(this.V, R.string.free_tier_taste_onboarding_error_view_general_subtitle);
        a(this.V);
        ah();
    }

    public final void a(String str) {
        fun fun = this.V;
        fun.b().setText(a((int) R.string.free_tier_taste_onboarding_search_empty_state_no_result_title, str));
        b(this.V, R.string.free_tier_taste_onboarding_search_empty_state_no_result_body);
        a(this.V);
        ah();
    }

    public final void f() {
        View currentFocus = ((ka) fay.a(p())).getCurrentFocus();
        if (currentFocus != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) ((Context) fay.a(n())).getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public final void aM_() {
        this.V.getView().setVisibility(8);
        this.U.setVisibility(0);
    }

    public final void a(List<TasteOnboardingItem> list, boolean z) {
        if (z) {
            this.b.a(ImmutableList.g().b((Iterable<? extends E>) this.b.a).b((Iterable<? extends E>) list).a());
        } else {
            this.b.a(list);
        }
        this.b.e();
    }

    public final udr ag() {
        return udt.ad;
    }

    public final sih ae_() {
        return ViewUris.L;
    }

    public final gjf aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTSEARCH;
    }

    public final List<String> ai() {
        return ImmutableList.a("search_field");
    }

    public final boolean d(String str) {
        return "search_field".equals(str);
    }

    public final View e(String str) {
        if ("search_field".equals(str)) {
            qne qne = this.T;
            if (qne != null) {
                return qne.a.findViewById(R.id.search_toolbar);
            }
        }
        return null;
    }

    private static void a(fun fun, int i) {
        fun.b().setText(i);
    }

    private static void b(fun fun, int i) {
        fun.c().setText(i);
    }

    private void ah() {
        this.U.setVisibility(8);
        this.V.getView().setVisibility(0);
    }

    private static void a(fun fun) {
        fun.c().setVisibility(0);
    }

    private static void b(fun fun) {
        fun.c().setVisibility(4);
    }

    public boolean onBackPressed() {
        this.a.d();
        return true;
    }

    public final String e() {
        return udt.ad.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTSEARCH, ViewUris.L.toString());
    }
}
