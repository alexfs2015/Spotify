package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cin reason: default package */
public final class cin extends djx implements cil {
    cin(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final String a() {
        Parcel a = a(1, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final int b() {
        Parcel a = a(2, K_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
