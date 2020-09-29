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

/* renamed from: quz reason: default package */
public class quz extends ke implements OnClickListener, jqx, b, a, uqq {
    public a T;
    private p U;

    public static quz ah() {
        return new quz();
    }

    public final Dialog a(Bundle bundle) {
        Context context = (Context) fbp.a(n());
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_free_tier_taste_onboarding_skip_dialog, null);
        wzj.a((TextView) inflate.findViewById(16908313), null, 0);
        this.U = new a(context, 2132017714).a(inflate).a(R.string.free_tier_taste_onboarding_skip_dialog_skip, this).b(R.string.free_tier_taste_onboarding_skip_dialog_continue, this).a();
        this.T.b();
        return this.U;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void aP_() {
        super.aP_();
        this.T.a(this);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.I;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREETIER_TASTEONBOARDING_SKIPDIALOG, ViewUris.I.toString());
    }

    public final uqm ag() {
        return uqo.ad;
    }

    public final gkq aj() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_SKIPDIALOG;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return uqo.ad.a();
    }

    public final void h() {
        super.h();
        this.T.aL_();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.T.d();
        } else if (i == -1) {
            this.T.aM_();
        } else {
            throw new IllegalArgumentException("Unsupported dialog button");
        }
    }
}
