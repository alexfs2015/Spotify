package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(sc scVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) scVar.b(remoteActionCompat.a, 1);
        remoteActionCompat.b = scVar.b(remoteActionCompat.b, 2);
        remoteActionCompat.c = scVar.b(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) scVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = scVar.b(remoteActionCompat.e, 5);
        remoteActionCompat.f = scVar.b(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, sc scVar) {
        scVar.a((se) remoteActionCompat.a, 1);
        scVar.a(remoteActionCompat.b, 2);
        scVar.a(remoteActionCompat.c, 3);
        scVar.a((Parcelable) remoteActionCompat.d, 4);
        scVar.a(remoteActionCompat.e, 5);
        scVar.a(remoteActionCompat.f, 6);
    }
}
