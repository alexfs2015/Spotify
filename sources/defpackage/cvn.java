package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ads.zzbfh;

/* renamed from: cvn reason: default package */
public final class cvn extends bxf {
    public static final Creator<cvn> CREATOR = new cvo();
    private final int a;
    private dbr b = null;
    private byte[] c;

    cvn(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        b();
    }

    private final void b() {
        if (this.b == null && this.c != null) {
            return;
        }
        if (this.b != null && this.c == null) {
            return;
        }
        if (this.b != null && this.c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.b == null && this.c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final dbr a() {
        if (!(this.b != null)) {
            try {
                byte[] bArr = this.c;
                this.b = (dbr) dgf.a(new dbr(), bArr, bArr.length);
                this.c = null;
            } catch (zzbfh e) {
                throw new IllegalStateException(e);
            }
        }
        b();
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = dgf.a((dgf) this.b);
        }
        bxg.a(parcel, 2, bArr, false);
        bxg.b(parcel, a2);
    }
}
