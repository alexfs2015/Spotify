package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: gsb reason: default package */
final class gsb extends gsd {
    private final ConnectState b;
    private final EnumSet<Tech> c;
    private final GaiaDevice d;
    private final GaiaDevice e;

    gsb(ConnectState connectState, EnumSet<Tech> enumSet, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2) {
        if (connectState != null) {
            this.b = connectState;
            if (enumSet != null) {
                this.c = enumSet;
                this.d = gaiaDevice;
                this.e = gaiaDevice2;
                return;
            }
            throw new NullPointerException("Null techSet");
        }
        throw new NullPointerException("Null connectState");
    }

    public final ConnectState a() {
        return this.b;
    }

    public final EnumSet<Tech> b() {
        return this.c;
    }

    public final GaiaDevice c() {
        return this.d;
    }

    public final GaiaDevice d() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectButtonState{connectState=");
        sb.append(this.b);
        sb.append(", techSet=");
        sb.append(this.c);
        sb.append(", activeDevice=");
        sb.append(this.d);
        sb.append(", connectingDevice=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gsd) {
            gsd gsd = (gsd) obj;
            if (this.b.equals(gsd.a()) && this.c.equals(gsd.b())) {
                GaiaDevice gaiaDevice = this.d;
                if (gaiaDevice != null ? gaiaDevice.equals(gsd.c()) : gsd.c() == null) {
                    GaiaDevice gaiaDevice2 = this.e;
                    return gaiaDevice2 != null ? gaiaDevice2.equals(gsd.d()) : gsd.d() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        GaiaDevice gaiaDevice = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (gaiaDevice == null ? 0 : gaiaDevice.hashCode())) * 1000003;
        GaiaDevice gaiaDevice2 = this.e;
        if (gaiaDevice2 != null) {
            i = gaiaDevice2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
