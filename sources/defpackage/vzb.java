package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: vzb reason: default package */
final class vzb extends vza {
    public static final Creator<vzb> CREATOR = new Creator<vzb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vzc vzc;
            vzb.d;
            String str = (String) fbp.a(parcel.readString());
            if (str.equals(c.class.getCanonicalName())) {
                vzc = new c();
            } else if (str.equals(b.class.getCanonicalName())) {
                vzc = new b();
            } else if (str.equals(a.class.getCanonicalName())) {
                vzc = new a();
            } else if (str.equals(d.class.getCanonicalName())) {
                vzc = new d();
            } else {
                StringBuilder sb = new StringBuilder("Unknown state: ");
                sb.append(str);
                Assertion.c(sb.toString());
                vzc = new c();
            }
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new vzb(vzc, z);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vzb[i];
        }
    };
    /* access modifiers changed from: private */
    public static final waf d = new waf();

    vzb(vzc vzc, boolean z) {
        super(vzc, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        waf.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
