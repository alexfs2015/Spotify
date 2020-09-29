package defpackage;

import android.content.Context;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.music.R;

/* renamed from: mif reason: default package */
public final class mif {
    public final Context a;
    private final mia b;

    public mif(Context context, mia mia) {
        this.a = context;
        this.b = mia;
    }

    public final String a() {
        return this.a.getString(GaiaTypes.TABLET == this.b.a() ? R.string.connect_tablet_is_self : R.string.connect_phone_is_self);
    }

    public final String a(boolean z) {
        return this.a.getString(z ? R.string.connect_device_playing_on_video : R.string.connect_device_playing_on_audio);
    }
}
