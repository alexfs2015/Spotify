package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.InputStream;

@cey
/* renamed from: dmx reason: default package */
public final class dmx extends bxf {
    public static final Creator<dmx> CREATOR = new dmy();
    private ParcelFileDescriptor a;

    public dmx() {
        this(null);
    }

    public dmx(ParcelFileDescriptor parcelFileDescriptor) {
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
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, (Parcelable) c(), i, false);
        bxg.b(parcel, a2);
    }
}
