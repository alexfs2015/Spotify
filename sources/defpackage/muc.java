package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: muc reason: default package */
public class muc extends jrd implements jqx, muf, a, uqq {
    private tue<mvz> T;
    public vfa<mvz> a;
    public a<mvz> b;

    public static muc ah() {
        return new muc();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T = new tue<>(n(), this.b.a, 0);
        return this.T;
    }

    public final void aP_() {
        super.aP_();
        this.T.a(this, this.a);
        this.a.a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.aN;
    }

    public final rmf af() {
        return rmf.a(aj(), null);
    }

    public final uqm ag() {
        return uqo.W;
    }

    public final void ai() {
        Toast.makeText(n(), "Show Context Menu", 0).show();
    }

    public final gkq aj() {
        return new gkq() {
            public final String a() {
                return "followfeed";
            }
        };
    }

    public final void ak() {
        Toast.makeText(n(), "Show artist context menu ", 0).show();
    }

    public void al() {
        Toast.makeText(n(), "Network Error", 0).show();
    }

    public final String b(Context context) {
        return context.getString(R.string.follow_feed_default_title);
    }

    public final String e() {
        return "spotify:followfeed";
    }

    public final void h() {
        super.h();
        this.a.b();
    }
}
