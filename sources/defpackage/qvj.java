package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.updatetaste.view.ProgressIndicator;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qvj reason: default package */
public class qvj extends jrd implements jqx, lbp, a, uqq {
    public a a;
    /* access modifiers changed from: private */
    public TextView b;

    public static qvj a(fqn fqn) {
        qvj qvj = new qvj();
        fqo.a((Fragment) qvj, fqn);
        return qvj;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View inflate = layoutInflater.inflate(R.layout.fragment_free_tier_taste_onboarding_update_taste_stockholm_black, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.textview);
        inflate.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                inflate.removeOnLayoutChangeListener(this);
                TextView textView = (TextView) inflate.findViewById(R.id.textview);
                ProgressIndicator progressIndicator = (ProgressIndicator) inflate.findViewById(R.id.progress_indicator);
                float f = -((float) qvj.this.b.getLayout().getLineDescent(1));
                progressIndicator.setTranslationX(textView.getLayout().getPrimaryHorizontal(textView.getText().length()) - progressIndicator.getX());
                progressIndicator.setTranslationY(f);
            }
        });
        return inflate;
    }

    public final void aP_() {
        super.aP_();
        this.a.a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.L;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREETIER_TASTEONBOARDING_UPDATETASTE, ViewUris.L.toString());
    }

    public final uqm ag() {
        return uqo.ad;
    }

    public final gkq aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_UPDATETASTE;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return uqo.ad.a();
    }

    public final void h() {
        super.h();
        this.a.b();
    }

    public boolean onBackPressed() {
        return true;
    }
}
