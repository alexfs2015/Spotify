package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dvp reason: default package */
public final class dvp extends dko implements dvn {
    dvp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String a() {
        Parcel a = a(2, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List<dvr> b() {
        Parcel a = a(3, K_());
        ArrayList b = dkq.b(a);
        a.recycle();
        return b;
    }
}
