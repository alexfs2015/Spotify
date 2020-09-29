package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qmr reason: default package */
public class qmr extends jz implements OnClickListener, jol, b, a, udv {
    public a T;
    private p U;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static qmr ah() {
        return new qmr();
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final Dialog a(Bundle bundle) {
        Context context = (Context) fay.a(n());
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_free_tier_taste_onboarding_skip_dialog, null);
        wld.a((TextView) inflate.findViewById(16908313), null, 0);
        this.U = new a(context, 2132017711).a(inflate).a(R.string.free_tier_taste_onboarding_skip_dialog_skip, this).b(R.string.free_tier_taste_onboarding_skip_dialog_continue, this).a();
        this.T.b();
        return this.U;
    }

    public final void g() {
        super.g();
        this.T.a(this);
    }

    public final void h() {
        super.h();
        this.T.aN_();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.T.d();
        } else if (i == -1) {
            this.T.aO_();
        } else {
            throw new IllegalArgumentException("Unsupported dialog button");
        }
    }

    public final udr ag() {
        return udt.ad;
    }

    public final sih ae_() {
        return ViewUris.J;
    }

    public final gjf aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_SKIPDIALOG;
    }

    public final String e() {
        return udt.ad.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREETIER_TASTEONBOARDING_SKIPDIALOG, ViewUris.J.toString());
    }
}
