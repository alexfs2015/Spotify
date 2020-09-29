package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bpw reason: default package */
public final class bpw extends ehk implements bpu {
    bpw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    public final List<bpc> a() {
        Parcel a = a(3, e());
        ArrayList createTypedArrayList = a.createTypedArrayList(bpc.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final int[] b() {
        Parcel a = a(4, e());
        int[] createIntArray = a.createIntArray();
        a.recycle();
        return createIntArray;
    }
}
