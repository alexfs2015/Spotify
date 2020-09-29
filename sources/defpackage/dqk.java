package defpackage;

import android.os.Parcel;

/* renamed from: dqk reason: default package */
public abstract class dqk extends dkp implements dqj {
    public dqk() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                a(parcel.readInt());
                break;
            case 3:
                b();
                break;
            case 4:
                c();
                break;
            case 5:
                d();
                break;
            case 6:
                e();
                break;
            case 7:
                f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
