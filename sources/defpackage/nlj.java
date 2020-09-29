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
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.spotify.playlist.models.Covers.Size;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Map;

/* renamed from: nlj reason: default package */
public class nlj extends jom implements jol, nls, udv {
    private static final String V = nlj.class.getName();
    public nll T;
    public nlt U;
    private String W;
    private nlr X;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static void b(kf kfVar, String str) {
        if (kfVar.a(V) == null) {
            nlj nlj = new nlj();
            Bundle bundle = nlj.i;
            if (bundle == null) {
                bundle = new Bundle();
                nlj.g(bundle);
            }
            bundle.putString("KEY_TRACK_URI", str);
            nlj.a(kfVar, V);
            return;
        }
        Logger.e(V, "FacePileDetailDialogFragment not show because one is already shown.");
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        Context n = n();
        nll nll = this.T;
        nlk nlk = new nlk((oix) nll.a(nll.a.get(), 1), (HomeMixFormatListAttributesHelper) nll.a(nll.b.get(), 2), (a) nll.a(nll.c.get(), 3), (String) nll.a(this.W, 4), (nls) nll.a(this, 5));
        nlt nlt = this.U;
        this.X = new nlr((nlp) nlt.a(nlt.a.get(), 1), (Picasso) nlt.a(nlt.b.get(), 2), (nlk) nlt.a(nlk, 3), (LayoutInflater) nlt.a(LayoutInflater.from(n), 4));
        a.requestWindowFeature(1);
        a.setContentView(this.X.b);
        return a;
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
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            this.W = bundle2.getString("KEY_TRACK_URI");
        } else {
            c();
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

    public final void a(Map<String, HomeMixUser> map, List<nnc> list) {
        nlp nlp = this.X.f;
        nlp.a = map;
        nlp.d = list;
        nlp.e();
    }

    public final void a(uzb uzb) {
        nlr nlr = this.X;
        nlr.a.a(uzb.getImageUri(Size.LARGE)).a(nlr.c);
        nlr.d.setText(uzb.getTitle());
        uzc b = uzb.b();
        if (b != null) {
            nlr.e.setText(jsx.a(b));
        }
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.HOMEMIX_GENRESPAGE, null);
    }
}
