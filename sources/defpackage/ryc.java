package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import java.util.Arrays;

/* renamed from: ryc reason: default package */
public final class ryc {
    public final int a;
    public final Optional<GaiaDevice> b;

    ryc(int i, Optional<GaiaDevice> optional) {
        this.a = i;
        this.b = optional;
    }

    public static ryc a() {
        return new ryc(0, Optional.e());
    }

    static boolean a(GaiaDevice gaiaDevice) {
        DeviceType type = gaiaDevice.getType();
        return GaiaTypes.CAST_VIDEO == type || GaiaTypes.CAST_AUDIO == type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ryc ryc = (ryc) obj;
            return this.a == ryc.a && this.b.equals(ryc.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectEvent{state=");
        sb.append(this.a);
        sb.append(", device=");
        sb.append(this.b.b() ? ((GaiaDevice) this.b.c()).getName() : null);
        sb.append('}');
        return sb.toString();
    }
}
