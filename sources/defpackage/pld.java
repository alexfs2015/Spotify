package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;

/* renamed from: pld reason: default package */
public abstract class pld implements plg {
    public abstract String a();

    public final int aB_() {
        return 0;
    }

    public static pld a(String str) {
        return new plb(str);
    }

    public final View a(Context context, a aVar, View view, ViewGroup viewGroup, int i) {
        frs frs = (frs) fqb.b(view, frs.class);
        boolean z = false;
        if (frs == null) {
            frs = new pkw(LayoutInflater.from(context).inflate(R.layout.notificationsettings_header_category, viewGroup, false));
            fqf.a(frs);
        }
        frs.a((CharSequence) a());
        frs.a(false);
        if (i == 0) {
            z = true;
        }
        frs.b(z);
        return frs.getView();
    }
}
