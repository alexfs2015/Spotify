package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.updatetaste.view.ProgressIndicator;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qnd reason: default package */
public class qnd extends jor implements jol, kyf, b, a, udv {
    private ProgressBar T;
    /* access modifiers changed from: private */
    public TextView U;
    private boolean V;
    public a a;
    public qhz b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public boolean onBackPressed() {
        return true;
    }

    public static qnd a(fpt fpt) {
        qnd qnd = new qnd();
        fpu.a((Fragment) qnd, fpt);
        return qnd;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.V = qly.a(fpu.a((Fragment) this));
        if (this.V) {
            final View inflate = layoutInflater.inflate(R.layout.fragment_free_tier_taste_onboarding_update_taste_stockholm_black, viewGroup, false);
            this.U = (TextView) inflate.findViewById(R.id.textview);
            inflate.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    inflate.removeOnLayoutChangeListener(this);
                    TextView textView = (TextView) inflate.findViewById(R.id.textview);
                    ProgressIndicator progressIndicator = (ProgressIndicator) inflate.findViewById(R.id.progress_indicator);
                    float f = -((float) qnd.this.U.getLayout().getLineDescent(1));
                    progressIndicator.setTranslationX(textView.getLayout().getPrimaryHorizontal(textView.getText().length()) - progressIndicator.getX());
                    progressIndicator.setTranslationY(f);
                }
            });
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.fragment_free_tier_taste_onboarding_update_taste, viewGroup, false);
        this.T = (ProgressBar) inflate2.findViewById(R.id.progress_bar);
        this.T.getIndeterminateDrawable().setColorFilter(fr.c((Context) fay.a(n()), R.color.white), Mode.SRC_IN);
        this.U = (TextView) inflate2.findViewById(R.id.title);
        return inflate2;
    }

    public final void g() {
        super.g();
        this.a.a(this);
        if (!this.V) {
            this.b.a((View) fay.a(this.H));
        }
    }

    public final void A() {
        super.A();
        if (!this.V) {
            qhz qhz = this.b;
            if (qhz.c != null) {
                qhz.c.removeAllUpdateListeners();
                qhz.c.removeAllListeners();
            }
        }
    }

    public final void h() {
        super.h();
        this.a.a();
    }

    public final void a(String str) {
        if (!this.V) {
            this.U.setText(str);
        }
    }

    public final udr ag() {
        return udt.ad;
    }

    public final sih ae_() {
        return ViewUris.M;
    }

    public final gjf aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_UPDATETASTE;
    }

    public final String e() {
        return udt.ad.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREETIER_TASTEONBOARDING_UPDATETASTE, ViewUris.M.toString());
    }
}
