package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.transition.ChangeBounds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.List;

/* renamed from: qti reason: default package */
public class qti extends jrd implements jqx, qqz, qva, a, a, uqq {
    private ProgressBar T;
    private fvh U;
    private CoordinatorLayout V;
    private ViewGroup W;
    private qrb X;
    private ConstraintLayout Y;
    private TextView Z;
    public a a;
    private TextView aa;
    private Button ab;
    private qvk ac;
    private AppBarLayout ad;
    public qtn b;

    public static qti a(fqn fqn) {
        qti qti = new qti();
        fqo.a((Fragment) qti, fqn);
        return qti;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppBarLayout appBarLayout, int i) {
        this.aa.setAlpha(Math.abs(((float) i) / ((float) appBarLayout.b())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.taste_picker_fragment_stockholm_black_with_sticky_search, viewGroup, false);
    }

    public final void a() {
        qrb qrb = this.X;
        if (qrb != null) {
            qrb.b();
        }
    }

    public final void a(View view, Bundle bundle) {
        this.a.a(this);
        this.V = (CoordinatorLayout) view.findViewById(R.id.root_view);
        this.W = (ViewGroup) view.findViewById(R.id.picker_container);
        this.Z = (TextView) view.findViewById(R.id.title);
        this.ab = (Button) view.findViewById(R.id.done_button);
        this.aa = (TextView) view.findViewById(R.id.toolbar_title);
        this.Y = (ConstraintLayout) view.findViewById(R.id.done_button_container);
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) ((View) fbp.a(this.H)).findViewById(R.id.search_toolbar);
        this.ac = new qvk(toolbarSearchFieldView.getContext(), toolbarSearchFieldView);
        this.T = (ProgressBar) ((View) fbp.a(this.H)).findViewById(R.id.loading_view);
        this.T.getIndeterminateDrawable().setColorFilter(fr.c(this.T.getContext(), R.color.white), Mode.SRC_IN);
        this.U = fvm.a(this.V.getContext(), this.V);
        this.U.getView().setId(R.id.empty_view);
        this.U.getView().setVisibility(8);
        this.U.b().setTextSize(2, 24.0f);
        this.U.b().setTypeface(this.U.b().getTypeface(), 1);
        this.U.getView().setBackgroundColor(0);
        this.V.addView(this.U.getView());
        this.ab.setOnClickListener(new $$Lambda$qti$Lfhco9lbUeXbnXx46gPwqQqK4tY(this));
        this.ad = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        this.ad.a((b) new $$Lambda$qti$1z_iYlpDKTbYT6CwlyhA5FO2XP0(this));
    }

    public final void a(String str) {
        this.Z.setText(str);
        this.aa.setText(str);
    }

    public final void a(String str, String str2) {
        this.U.a((CharSequence) str);
        this.U.b((CharSequence) str2);
        this.U.getView().setVisibility(0);
        this.ad.setVisibility(8);
    }

    public final void a(List<TasteOnboardingItem> list, PickerViewType pickerViewType, boolean z) {
        if (this.X == null) {
            qtn qtn = this.b;
            qrb qrb = (qrb) ((wzi) qtn.a.get(pickerViewType)).get();
            qql qql = (qql) ((wzi) qtn.b.get(pickerViewType)).get();
            qql.a(list);
            qrb.a(qql);
            qql.f = pickerViewType;
            this.X = qrb;
            this.W.addView(this.X.d());
        }
        this.X.aJ_();
        if (!z) {
            this.X.c();
        }
        Bundle bundle = this.i;
        String str = "key_item_clicked_from_search";
        TasteOnboardingItem tasteOnboardingItem = bundle != null ? (TasteOnboardingItem) bundle.getParcelable(str) : null;
        if (tasteOnboardingItem != null) {
            this.X.a(tasteOnboardingItem);
            bundle.remove(str);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.a.aG_();
        }
    }

    public final void aH_() {
        this.T.setVisibility(8);
    }

    public final void aP_() {
        super.aP_();
        this.ac.a((a) this);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.J;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER, ViewUris.J.toString());
    }

    public final uqm ag() {
        return uqo.ad;
    }

    public final void ah() {
    }

    public final List<String> ai() {
        return ImmutableList.a("search_field");
    }

    public final gkq aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b() {
        this.T.setVisibility(0);
    }

    public final void b(String str) {
        this.ab.setText(str);
    }

    public final void c(String str) {
    }

    public final boolean d(String str) {
        return "search_field".equals(str);
    }

    public final View e(String str) {
        if ("search_field".equals(str)) {
            qvk qvk = this.ac;
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
        this.U.getView().setVisibility(8);
        this.ad.setVisibility(0);
    }

    public final void h() {
        super.h();
        this.ac.b((a) this);
    }

    public final void i() {
        ConstraintLayout constraintLayout = this.Y;
        et etVar = new et();
        ConstraintLayout constraintLayout2 = constraintLayout;
        etVar.a(constraintLayout2);
        etVar.a(this.ab.getId(), 3);
        etVar.a(R.id.done_button, 4, R.id.done_button_start_guideline, 4);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.a((int) R.id.done_button);
        qw.a(constraintLayout, changeBounds);
        etVar.b(constraintLayout2);
    }

    public final void j() {
        ConstraintLayout constraintLayout = this.Y;
        et etVar = new et();
        ConstraintLayout constraintLayout2 = constraintLayout;
        etVar.a(constraintLayout2);
        etVar.a(this.ab.getId(), 4);
        etVar.a(R.id.done_button, 3, 0, 4);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.a((int) R.id.done_button);
        qw.a(constraintLayout, changeBounds);
        etVar.b(constraintLayout2);
    }

    public void onQueryChanged(String str) {
    }
}
