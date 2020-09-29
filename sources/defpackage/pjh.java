package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.spotify.music.features.profile.domain.ProfileModel;

/* renamed from: pjh reason: default package */
public class pjh extends jor implements d, jol, a, udv {
    private b<ProfileModel, pjr> T;
    private sih U;
    public pji a;
    public pka b;

    public final Fragment ae() {
        return this;
    }

    public final String b(Context context) {
        return "";
    }

    public static jol a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("key_profile_uri", str);
        bundle.putString("key_current_username", str2);
        pjh pjh = new pjh();
        pjh.g(bundle);
        return pjh;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.U = sih.a((String) fay.a(this.i.getString("key_profile_uri")));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c(true);
        ProfileModel profileModel = bundle != null ? (ProfileModel) bundle.getParcelable("KEY_STATE") : null;
        if (profileModel == null) {
            String decode = Uri.decode(jst.a((String) fay.a(this.i.getString("key_profile_uri"))).c());
            profileModel = ProfileModel.l.l().b(decode).c(decode.equals(Uri.decode(this.i.getString("key_current_username")))).a();
        }
        pka pka = this.b;
        pjz pjz = new pjz((Context) pka.a(pka.a.get(), 1), (LayoutInflater) pka.a(layoutInflater, 2), viewGroup, (BadgesFactory) pka.a(pka.b.get(), 4), (jwv) pka.a(pka.c.get(), 5));
        this.T = kjt.a(this.a.a(), profileModel, kkd.a());
        this.T.a(pjz);
        return pjz.a;
    }

    public final void z() {
        super.z();
        this.T.c();
    }

    public final void A() {
        super.A();
        this.T.d();
    }

    public final void ax_() {
        super.ax_();
        this.T.b();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("KEY_STATE", (Parcelable) this.T.e());
    }

    public final sih ae_() {
        return this.U;
    }

    public final gjf aj() {
        return PageIdentifiers.PROFILE;
    }

    public final String e() {
        return this.U.toString();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PROFILE, null);
    }

    public final udr ag() {
        return udt.bd;
    }
}
