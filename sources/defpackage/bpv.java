package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bpv reason: default package */
public final class bpv extends ehk implements bpt {
    bpv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    public final int a() {
        Parcel a = a(3, e());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final bwu a(boc boc, int i) {
        Parcel e = e();
        ehz.a(e, (Parcelable) boc);
        e.writeInt(i);
        Parcel a = a(1, e);
        bwu bwu = (bwu) ehz.a(a, bwu.CREATOR);
        a.recycle();
        return bwu;
    }

    public final bwu a(boc boc, boz boz) {
        Parcel e = e();
        ehz.a(e, (Parcelable) boc);
        ehz.a(e, (Parcelable) boz);
        Parcel a = a(4, e);
        bwu bwu = (bwu) ehz.a(a, bwu.CREATOR);
        a.recycle();
        return bwu;
    }

    public final cbi b() {
        Parcel a = a(2, e());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
