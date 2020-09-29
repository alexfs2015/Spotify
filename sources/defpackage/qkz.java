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

/* renamed from: qkz reason: default package */
public class qkz extends jor implements jol, qip, qms, a, a, udv {
    private ProgressBar T;
    private fun U;
    private ViewGroup V;
    private qir W;
    private ViewGroup X;
    private ConstraintLayout Y;
    private TextView Z;
    public a a;
    private TextView aa;
    private Button ab;
    private qne ac;
    private boolean ad;
    public qle b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final void ah() {
    }

    public final String b(Context context) {
        return "";
    }

    public final void c(String str) {
    }

    public void onQueryChanged(String str) {
    }

    public static qkz a(fpt fpt) {
        qkz qkz = new qkz();
        fpu.a((Fragment) qkz, fpt);
        return qkz;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fpt a2 = fpu.a((Fragment) this);
        this.ad = qly.a(a2);
        if (this.ad) {
            this.X = (ViewGroup) layoutInflater.inflate(((Boolean) a2.a(qlx.b)).booleanValue() ? R.layout.taste_picker_fragment_stockholm_black_with_sticky_search : R.layout.taste_picker_fragment_stockholm_black, viewGroup, false);
        } else {
            this.X = (ViewGroup) layoutInflater.inflate(R.layout.taste_picker_fragment, viewGroup, false);
        }
        return this.X;
    }

    public final void a(View view, Bundle bundle) {
        this.a.a(this);
        this.V = (ViewGroup) view.findViewById(R.id.picker_container);
        this.Z = (TextView) view.findViewById(R.id.title);
        this.ab = (Button) view.findViewById(R.id.done_button);
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) ((View) fay.a(this.H)).findViewById(R.id.search_toolbar);
        this.ac = new qne(toolbarSearchFieldView.getContext(), toolbarSearchFieldView, this.ad);
        this.T = (ProgressBar) ((View) fay.a(this.H)).findViewById(R.id.loading_view);
        this.T.getIndeterminateDrawable().setColorFilter(fr.c(this.T.getContext(), R.color.white), Mode.SRC_IN);
        this.U = fus.a(this.V.getContext(), this.V);
        this.U.getView().setId(R.id.empty_view);
        this.U.getView().setVisibility(8);
        this.U.b().setTextSize(2, 24.0f);
        this.U.b().setTypeface(this.U.b().getTypeface(), 1);
        this.U.getView().setBackgroundColor(0);
        this.V.addView(this.U.getView());
        this.ab.setOnClickListener(new $$Lambda$qkz$lyE3l1c3WlBYtX1Uf6cLeCFABj0(this));
        if (this.ad) {
            this.aa = (TextView) view.findViewById(R.id.toolbar_title);
            this.Y = (ConstraintLayout) view.findViewById(R.id.done_button_container);
            ((AppBarLayout) view.findViewById(R.id.app_bar_layout)).a((b) new $$Lambda$qkz$pEj3zOyczZ_elK_JsBYkdGjkZ2M(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppBarLayout appBarLayout, int i) {
        this.aa.setAlpha(Math.abs(((float) i) / ((float) appBarLayout.b())));
    }

    public final void g() {
        super.g();
        this.ac.a((a) this);
    }

    public final void h() {
        super.h();
        this.ac.b((a) this);
    }

    public final void a(List<TasteOnboardingItem> list, PickerViewType pickerViewType, boolean z) {
        if (this.W == null) {
            qle qle = this.b;
            qir qir = (qir) ((wlc) qle.a.get(pickerViewType)).get();
            qib qib = (qib) ((wlc) qle.b.get(pickerViewType)).get();
            qib.a(list);
            qir.a(qib);
            qib.f = pickerViewType;
            this.W = qir;
            this.V.addView(this.W.d());
        }
        this.W.aL_();
        if (!z) {
            this.W.c();
        }
        Bundle bundle = this.i;
        String str = "key_item_clicked_from_search";
        TasteOnboardingItem tasteOnboardingItem = bundle != null ? (TasteOnboardingItem) bundle.getParcelable(str) : null;
        if (tasteOnboardingItem != null) {
            this.W.a(tasteOnboardingItem);
            bundle.remove(str);
        }
    }

    public final void a() {
        qir qir = this.W;
        if (qir != null) {
            qir.b();
        }
    }

    public final void b() {
        this.T.setVisibility(0);
    }

    public final void aJ_() {
        this.T.setVisibility(8);
    }

    public final void a(String str, String str2) {
        this.U.a((CharSequence) str);
        this.U.b((CharSequence) str2);
        this.U.getView().setVisibility(0);
    }

    public final void f() {
        this.U.getView().setVisibility(8);
    }

    public final void a(String str) {
        this.Z.setText(str);
        if (this.ad) {
            this.aa.setText(str);
        }
    }

    public final void b(String str) {
        this.ab.setText(str);
    }

    public final void i() {
        if (!this.ad) {
            a(this.X);
        } else {
            a((ViewGroup) this.Y);
        }
    }

    public final void j() {
        if (!this.ad) {
            b(this.X);
        } else {
            b((ViewGroup) this.Y);
        }
    }

    private void a(ViewGroup viewGroup) {
        et etVar = new et();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        etVar.a(constraintLayout);
        etVar.a(this.ab.getId(), 3);
        etVar.a(R.id.done_button, 4, R.id.done_button_start_guideline, 4);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.a((int) R.id.done_button);
        qr.a(viewGroup, changeBounds);
        etVar.b(constraintLayout);
    }

    private void b(ViewGroup viewGroup) {
        et etVar = new et();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        etVar.a(constraintLayout);
        etVar.a(this.ab.getId(), 4);
        etVar.a(R.id.done_button, 3, 0, 4);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.a((int) R.id.done_button);
        qr.a(viewGroup, changeBounds);
        etVar.b(constraintLayout);
    }

    public final void a(boolean z) {
        if (z) {
            this.a.aI_();
        }
    }

    public final List<String> ai() {
        return ImmutableList.a("search_field");
    }

    public final boolean d(String str) {
        return "search_field".equals(str);
    }

    public final View e(String str) {
        if ("search_field".equals(str)) {
            qne qne = this.ac;
            if (qne != null) {
                return qne.a.findViewById(R.id.search_toolbar);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.d();
    }

    public final udr ag() {
        return udt.ad;
    }

    public final sih ae_() {
        return ViewUris.K;
    }

    public final gjf aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER;
    }

    public final String e() {
        return udt.ad.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER, ViewUris.K.toString());
    }
}
