package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;

/* renamed from: ptx reason: default package */
public abstract class ptx implements pty {
    public static ptx a(String str, String str2) {
        return new ptu(str, str2);
    }

    public final View a(Context context, a aVar, View view, ViewGroup viewGroup, int i) {
        fsu fsu = (fsu) fqv.b(view, fsu.class);
        if (fsu == null) {
            fsu = new ptp(LayoutInflater.from(context).inflate(R.layout.notificationsettings_header_description, viewGroup, false));
            fqz.a(fsu);
        }
        fsu.a((CharSequence) a());
        fsu.b(b());
        fsu.a(false);
        return fsu.getView();
    }

    public abstract String a();

    public final int az_() {
        return 1;
    }

    public abstract String b();
}
