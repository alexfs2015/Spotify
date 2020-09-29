package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ads.zzbfh;

/* renamed from: cwe reason: default package */
public final class cwe extends bxw {
    public static final Creator<cwe> CREATOR = new cwf();
    private final int a;
    private dci b = null;
    private byte[] c;

    cwe(int i, byte[] bArr) {
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

    public final dci a() {
        if (!(this.b != null)) {
            try {
                byte[] bArr = this.c;
                this.b = (dci) dgw.a(new dci(), bArr, bArr.length);
                this.c = null;
            } catch (zzbfh e) {
                throw new IllegalStateException(e);
            }
        }
        b();
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = dgw.a((dgw) this.b);
        }
        bxx.a(parcel, 2, bArr, false);
        bxx.b(parcel, a2);
    }
}
