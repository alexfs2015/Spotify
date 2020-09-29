package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;

/* renamed from: ptv reason: default package */
public abstract class ptv implements pty {
    public static ptv a(String str) {
        return new ptt(str);
    }

    public final View a(Context context, a aVar, View view, ViewGroup viewGroup, int i) {
        fsm fsm = (fsm) fqv.b(view, fsm.class);
        boolean z = false;
        if (fsm == null) {
            fsm = new pto(LayoutInflater.from(context).inflate(R.layout.notificationsettings_header_category, viewGroup, false));
            fqz.a(fsm);
        }
        fsm.a((CharSequence) a());
        fsm.a(false);
        if (i == 0) {
            z = true;
        }
        fsm.b(z);
        return fsm.getView();
    }

    public abstract String a();

    public final int az_() {
        return 0;
    }
}
