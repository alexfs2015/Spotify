package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(rx rxVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(rxVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, rx rxVar) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, rxVar);
    }
}
