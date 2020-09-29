package defpackage;

import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.util.connectivity.ConnectionType;

/* renamed from: hjz reason: default package */
public final class hjz implements jvs {
    private ConnectionType a = ConnectionType.CONNECTION_TYPE_UNKNOWN;
    private final OrbitServiceInterface b;

    hjz(OrbitServiceInterface orbitServiceInterface) {
        this.b = orbitServiceInterface;
    }

    public final void setConnectivityType(ConnectionType connectionType, boolean z) {
        this.b.setConnectivityType(connectionType.mNativeConstant, z);
        ConnectionType connectionType2 = this.a;
        if (connectionType != connectionType2) {
            this.a = connectionType;
            if (!connectionType.mIsOffline) {
                this.b.tryReconnectNow(!connectionType2.mIsOffline && connectionType2.mCellular != connectionType.mCellular);
            }
        }
    }
}
