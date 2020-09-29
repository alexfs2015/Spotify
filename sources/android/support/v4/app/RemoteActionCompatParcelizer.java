package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(sc scVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(scVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, sc scVar) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, scVar);
    }
}
