package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;

/* renamed from: plf reason: default package */
public abstract class plf implements plg {
    public abstract String a();

    public final int aB_() {
        return 1;
    }

    public abstract String b();

    public static plf a(String str, String str2) {
        return new plc(str, str2);
    }

    public final View a(Context context, a aVar, View view, ViewGroup viewGroup, int i) {
        fsa fsa = (fsa) fqb.b(view, fsa.class);
        if (fsa == null) {
            fsa = new pkx(LayoutInflater.from(context).inflate(R.layout.notificationsettings_header_description, viewGroup, false));
            fqf.a(fsa);
        }
        fsa.a((CharSequence) a());
        fsa.b(b());
        fsa.a(false);
        return fsa.getView();
    }
}
