package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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

/* renamed from: nnz reason: default package */
public class nnz extends jom implements jol, noj, udv {
    private static final String X = nnz.class.getName();
    public nob T;
    public nok U;
    public nmv V;
    public jsz W;
    private noi Y;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static void a(kf kfVar) {
        if (kfVar.a(X) == null) {
            new nnz().a(kfVar, X);
            return;
        }
        Logger.e(X, "UserToggleDialogFragment not shown because one is already shown.");
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        Context context = (Context) fay.a(n());
        nok nok = this.U;
        nob nob = this.T;
        oix oix = (oix) nob.a(nob.a.get(), 1);
        uxh uxh = (uxh) nob.a(nob.b.get(), 2);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = (HomeMixFormatListAttributesHelper) nob.a(nob.c.get(), 3);
        nke nke = (nke) nob.a(nob.d.get(), 4);
        String str = (String) nob.a(nob.e.get(), 5);
        kxz kxz = (kxz) nob.a(nob.f.get(), 6);
        a aVar = (a) nob.a(nob.g.get(), 7);
        noj noj = (noj) nob.a(this, 8);
        Dialog dialog = a;
        noa noa = r6;
        noa noa2 = new noa(oix, uxh, homeMixFormatListAttributesHelper, nke, str, kxz, aVar, noj, (HomeMixInteractionLogger) nob.a(this.V.a(PageIdentifiers.HOMEMIX_USERTOGGLE), 9));
        this.Y = new noi((nog) nok.a(nok.a.get(), 1), (noa) nok.a(noa, 2), (LayoutInflater) nok.a(LayoutInflater.from(context), 3));
        Dialog dialog2 = dialog;
        dialog2.requestWindowFeature(1);
        dialog2.setContentView(this.Y.a);
        return dialog2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ka p = p();
        if (p != null) {
            p.i().a().a((Fragment) this).b();
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(0, 16973831);
    }

    public final String e() {
        return getClass().getSimpleName();
    }

    public final udr ag() {
        return udt.ai;
    }

    public final gjf aj() {
        return PageIdentifiers.HOMEMIX_USERTOGGLE;
    }

    public final void a(List<HomeMixUser> list) {
        nof nof = this.Y.b;
        nof.a = list;
        nof.e();
    }

    public final void ah() {
        this.W.a((int) R.string.home_mix_user_toggle_rejected_notification, 0, new Object[0]);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.HOMEMIX_USERTOGGLE, null);
    }
}
