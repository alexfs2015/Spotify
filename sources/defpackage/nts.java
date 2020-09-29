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

/* renamed from: nts reason: default package */
public class nts extends jqy implements jqx, ntw, uqq {
    private static final String W = nts.class.getName();
    public ntu T;
    public ntx U;
    public nsk V;
    private boolean X;
    private ntv Y;

    /* renamed from: nts$a */
    public interface a {
        void az();
    }

    public static void a(kk kkVar, boolean z) {
        if (kkVar.a(W) == null) {
            nts nts = new nts();
            Bundle bundle = nts.i;
            if (bundle == null) {
                bundle = new Bundle();
                nts.g(bundle);
            }
            bundle.putBoolean("KEY_IS_WELCOME_SCREEN", z);
            nts.a(kkVar, W);
            return;
        }
        Logger.e(W, "TasteVizDialogFragment not show because one is already shown.");
    }

    public final Dialog a(Bundle bundle) {
        Dialog a2 = super.a(bundle);
        Context context = (Context) fbp.a(n());
        HomeMixInteractionLogger a3 = this.V.a(PageIdentifiers.HOMEMIX_GENRESPAGE);
        ntx ntx = this.U;
        ntu ntu = this.T;
        ntt ntt = new ntt((vje) ntu.a(ntu.a.get(), 1), (HomeMixFormatListAttributesHelper) ntu.a(ntu.b.get(), 2), (com.spotify.mobile.android.util.ui.Lifecycle.a) ntu.a(ntu.c.get(), 3), (EnumMap) ntu.a(ntu.d.get(), 4), (String) ntu.a(ntu.e.get(), 5), (ntw) ntu.a(this, 6), (HomeMixInteractionLogger) ntu.a(a3, 7));
        LayoutInflater from = LayoutInflater.from(context);
        this.Y = new ntv((ntq) ntx.a(ntx.a.get(), 1), (ntt) ntx.a(ntt, 2), (LayoutInflater) ntx.a(from, 3), this.X);
        a2.requestWindowFeature(1);
        a2.setContentView(this.Y.a);
        return a2;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(HomeMixPlanType homeMixPlanType) {
        if (n() != null) {
            a(new Intent("android.intent.action.VIEW", Uri.parse(n().getString(homeMixPlanType.mUrlResId))));
            c();
        }
    }

    public final void a(HomeMixPlanType homeMixPlanType, String str, List<nst> list, Map<String, HomeMixUser> map, int i) {
        ntv ntv = this.Y;
        ntv.a(homeMixPlanType, str);
        ntv.b.setTextColor(i);
        ntq ntq = ntv.c;
        ntq.a = new ArrayList(list);
        ntq.d = map;
        ntq.e();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.HOMEMIX_GENRESPAGE, null);
    }

    public final uqm ag() {
        return uqo.ai;
    }

    public final gkq aj() {
        return PageIdentifiers.HOMEMIX_GENRESPAGE;
    }

    public final String b(Context context) {
        return "";
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

    public void onDismiss(DialogInterface dialogInterface) {
        if (p() != null && this.X) {
            Fragment fragment = this.w;
            if (fragment instanceof a) {
                ((a) fragment).az();
            }
        }
        super.onDismiss(dialogInterface);
    }
}
