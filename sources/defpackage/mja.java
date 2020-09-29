package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.features.connect.picker.ui.DevicePickerActivity;

/* renamed from: mja reason: default package */
public final class mja implements gto {
    private final Activity a;

    public mja(Activity activity) {
        this.a = (Activity) fbp.a(activity);
    }

    public final void a(fqn fqn) {
        Activity activity = this.a;
        activity.startActivity(DevicePickerActivity.a((Context) activity, fqn));
    }
}
