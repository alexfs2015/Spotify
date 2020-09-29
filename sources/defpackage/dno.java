package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.InputStream;

@cfp
/* renamed from: dno reason: default package */
public final class dno extends bxw {
    public static final Creator<dno> CREATOR = new dnp();
    private ParcelFileDescriptor a;

    public dno() {
        this(null);
    }

    public dno(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    private final synchronized ParcelFileDescriptor c() {
        return this.a;
    }

    public final synchronized boolean a() {
        return this.a != null;
    }

    public final synchronized InputStream b() {
        if (this.a == null) {
            return null;
        }
        AutoCloseInputStream autoCloseInputStream = new AutoCloseInputStream(this.a);
        this.a = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, (Parcelable) c(), i, false);
        bxx.b(parcel, a2);
    }
}
