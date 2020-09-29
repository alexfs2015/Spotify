package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import java.util.Arrays;

/* renamed from: row reason: default package */
public final class row {
    public final int a;
    public final Optional<GaiaDevice> b;

    row(int i, Optional<GaiaDevice> optional) {
        this.a = i;
        this.b = optional;
    }

    public static row a() {
        return new row(0, Optional.e());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectEvent{state=");
        sb.append(this.a);
        sb.append(", device=");
        sb.append(this.b.b() ? ((GaiaDevice) this.b.c()).getName() : null);
        sb.append('}');
        return sb.toString();
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
            row row = (row) obj;
            return this.a == row.a && this.b.equals(row.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }
}
