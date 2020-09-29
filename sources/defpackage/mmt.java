package defpackage;

import android.content.Context;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.music.R;

/* renamed from: mmt reason: default package */
public final class mmt {
    public final Context a;
    private final mmo b;

    public mmt(Context context, mmo mmo) {
        this.a = context;
        this.b = mmo;
    }

    public final String a() {
        DeviceType a2 = this.b.a();
        return GaiaTypes.CHROMEBOOK == a2 ? this.a.getString(R.string.connect_chromebook_is_self) : GaiaTypes.TABLET == a2 ? this.a.getString(R.string.connect_tablet_is_self) : this.a.getString(R.string.connect_phone_is_self);
    }

    public final String a(boolean z) {
        return this.a.getString(z ? R.string.connect_device_playing_on_video : R.string.connect_device_playing_on_audio);
    }
}
