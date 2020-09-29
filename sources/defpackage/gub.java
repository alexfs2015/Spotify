package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: gub reason: default package */
final class gub extends gud {
    private final ConnectState b;
    private final EnumSet<Tech> c;
    private final GaiaDevice d;
    private final GaiaDevice e;

    gub(ConnectState connectState, EnumSet<Tech> enumSet, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gud) {
            gud gud = (gud) obj;
            if (this.b.equals(gud.a()) && this.c.equals(gud.b())) {
                GaiaDevice gaiaDevice = this.d;
                if (gaiaDevice != null ? gaiaDevice.equals(gud.c()) : gud.c() == null) {
                    GaiaDevice gaiaDevice2 = this.e;
                    return gaiaDevice2 != null ? gaiaDevice2.equals(gud.d()) : gud.d() == null;
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
}
