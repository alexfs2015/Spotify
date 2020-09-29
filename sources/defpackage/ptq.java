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

/* renamed from: ptq reason: default package */
public class ptq extends jrd implements jqx {
    private b T;
    public a a;
    public jvf b;

    public static ptq c() {
        return new ptq();
    }

    public final void B() {
        super.B();
        this.T.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.T.a(layoutInflater, viewGroup);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SETTINGS_NOTIFICATIONS, null);
    }

    public final uqm ag() {
        return uqo.av;
    }

    public final String b(Context context) {
        return context.getString(R.string.settings_notification_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
        c(true);
        this.T = new ptm(p(), o().getResources(), this.b);
        this.T.a(this.a, bundle);
    }

    public final String e() {
        return "internal:preferences_push_notification";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.T.a(bundle);
    }
}
