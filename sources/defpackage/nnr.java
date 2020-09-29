package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import com.spotify.music.features.homemix.models.HomeMixUser;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: nnr reason: default package */
public class nnr extends jom implements jol, nnv, udv {
    private static final String W = nnr.class.getName();
    public nnt T;
    public nnw U;
    public nmv V;
    private boolean X;
    private nnu Y;

    /* renamed from: nnr$a */
    public interface a {
        void az();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static void a(kf kfVar, boolean z) {
        if (kfVar.a(W) == null) {
            nnr nnr = new nnr();
            Bundle bundle = nnr.i;
            if (bundle == null) {
                bundle = new Bundle();
                nnr.g(bundle);
            }
            bundle.putBoolean("KEY_IS_WELCOME_SCREEN", z);
            nnr.a(kfVar, W);
            return;
        }
        Logger.e(W, "TasteVizDialogFragment not show because one is already shown.");
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final Dialog a(Bundle bundle) {
        Dialog a2 = super.a(bundle);
        Context context = (Context) fay.a(n());
        HomeMixInteractionLogger a3 = this.V.a(PageIdentifiers.HOMEMIX_GENRESPAGE);
        nnw nnw = this.U;
        nnt nnt = this.T;
        nns nns = new nns((oix) nnt.a(nnt.a.get(), 1), (HomeMixFormatListAttributesHelper) nnt.a(nnt.b.get(), 2), (com.spotify.mobile.android.util.ui.Lifecycle.a) nnt.a(nnt.c.get(), 3), (EnumMap) nnt.a(nnt.d.get(), 4), (nnv) nnt.a(this, 5), (HomeMixInteractionLogger) nnt.a(a3, 6));
        LayoutInflater from = LayoutInflater.from(context);
        this.Y = new nnu((nnp) nnw.a(nnw.a.get(), 1), (nns) nnw.a(nns, 2), (LayoutInflater) nnw.a(from, 3), this.X);
        a2.requestWindowFeature(1);
        a2.setContentView(this.Y.a);
        return a2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ka p = p();
        if (p != null) {
            if (this.X) {
                Fragment fragment = this.w;
                if (fragment instanceof a) {
                    ((a) fragment).az();
                }
            }
            p.i().a().a((Fragment) this).b();
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(0, 16973831);
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            this.X = bundle2.getBoolean("KEY_IS_WELCOME_SCREEN");
        }
    }

    public final String e() {
        return getClass().getSimpleName();
    }

    public final udr ag() {
        return udt.ai;
    }

    public final gjf aj() {
        return PageIdentifiers.HOMEMIX_GENRESPAGE;
    }

    public final void a(HomeMixPlanType homeMixPlanType) {
        if (n() != null) {
            a(new Intent("android.intent.action.VIEW", Uri.parse(n().getString(homeMixPlanType.mUrlResId))));
            c();
        }
    }

    public final void a(HomeMixPlanType homeMixPlanType, String str, List<nne> list, Map<String, HomeMixUser> map, int i) {
        nnu nnu = this.Y;
        nnu.a(homeMixPlanType, str);
        nnu.b.setTextColor(i);
        nnp nnp = nnu.c;
        nnp.a = new ArrayList(list);
        nnp.d = map;
        nnp.e();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.HOMEMIX_GENRESPAGE, null);
    }
}
