package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.R;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMixUser;
import java.util.List;

/* renamed from: nua reason: default package */
public class nua extends jqy implements jqx, nuk, uqq {
    private static final String X = nua.class.getName();
    public nuc T;
    public nul U;
    public nsk V;
    public jvf W;
    private nuj Y;

    public static void a(kk kkVar) {
        if (kkVar.a(X) == null) {
            new nua().a(kkVar, X);
            return;
        }
        Logger.e(X, "UserToggleDialogFragment not shown because one is already shown.");
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        Context context = (Context) fbp.a(n());
        nul nul = this.U;
        nuc nuc = this.T;
        vje vje = (vje) nuc.a(nuc.a.get(), 1);
        vjj vjj = (vjj) nuc.a(nuc.b.get(), 2);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = (HomeMixFormatListAttributesHelper) nuc.a(nuc.c.get(), 3);
        npy npy = (npy) nuc.a(nuc.d.get(), 4);
        String str = (String) nuc.a(nuc.e.get(), 5);
        lbi lbi = (lbi) nuc.a(nuc.f.get(), 6);
        a aVar = (a) nuc.a(nuc.g.get(), 7);
        nuk nuk = (nuk) nuc.a(this, 8);
        Dialog dialog = a;
        nub nub = r6;
        nub nub2 = new nub(vje, vjj, homeMixFormatListAttributesHelper, npy, str, lbi, aVar, nuk, (HomeMixInteractionLogger) nuc.a(this.V.a(PageIdentifiers.HOMEMIX_USERTOGGLE), 9));
        this.Y = new nuj((nuh) nul.a(nul.a.get(), 1), (nub) nul.a(nub, 2), (LayoutInflater) nul.a(LayoutInflater.from(context), 3));
        Dialog dialog2 = dialog;
        dialog2.requestWindowFeature(1);
        dialog2.setContentView(this.Y.a);
        return dialog2;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(List<HomeMixUser> list) {
        nug nug = this.Y.b;
        nug.a = list;
        nug.e();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.HOMEMIX_USERTOGGLE, null);
    }

    public final uqm ag() {
        return uqo.ai;
    }

    public final void ah() {
        this.W.a((int) R.string.home_mix_user_toggle_rejected_notification, 0, new Object[0]);
    }

    public final gkq aj() {
        return PageIdentifiers.HOMEMIX_USERTOGGLE;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(0, 16973831);
    }

    public final String e() {
        return getClass().getSimpleName();
    }
}
