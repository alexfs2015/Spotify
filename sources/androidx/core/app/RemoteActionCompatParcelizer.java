package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(rx rxVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) rxVar.b(remoteActionCompat.a, 1);
        remoteActionCompat.b = rxVar.b(remoteActionCompat.b, 2);
        remoteActionCompat.c = rxVar.b(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) rxVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = rxVar.b(remoteActionCompat.e, 5);
        remoteActionCompat.f = rxVar.b(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, rx rxVar) {
        rxVar.a((rz) remoteActionCompat.a, 1);
        rxVar.a(remoteActionCompat.b, 2);
        rxVar.a(remoteActionCompat.c, 3);
        rxVar.a((Parcelable) remoteActionCompat.d, 4);
        rxVar.a(remoteActionCompat.e, 5);
        rxVar.a(remoteActionCompat.f, 6);
    }
}
