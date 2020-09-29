package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.b;

/* renamed from: pky reason: default package */
public class pky extends jor implements jol {
    private b T;
    public a a;
    public jsz b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "internal:preferences_push_notification";
    }

    public static pky c() {
        return new pky();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
        c(true);
        this.T = new pku(p(), o().getResources(), this.b);
        this.T.a(this.a, bundle);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.T.a(layoutInflater, viewGroup);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.T.a(bundle);
    }

    public final void B() {
        super.B();
        this.T.a();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    public final String b(Context context) {
        return context.getString(R.string.settings_notification_title);
    }

    public final udr ag() {
        return udt.av;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SETTINGS_NOTIFICATIONS, null);
    }
}
