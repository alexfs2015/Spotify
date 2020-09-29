package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: vlv reason: default package */
final class vlv extends vlu {
    public static final Creator<vlv> CREATOR = new Creator<vlv>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vlv[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vlw vlw;
            vlv.d;
            String str = (String) fay.a(parcel.readString());
            if (str.equals(c.class.getCanonicalName())) {
                vlw = new c();
            } else if (str.equals(b.class.getCanonicalName())) {
                vlw = new b();
            } else if (str.equals(a.class.getCanonicalName())) {
                vlw = new a();
            } else if (str.equals(d.class.getCanonicalName())) {
                vlw = new d();
            } else {
                StringBuilder sb = new StringBuilder("Unknown state: ");
                sb.append(str);
                Assertion.c(sb.toString());
                vlw = new c();
            }
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new vlv(vlw, z);
        }
    };
    /* access modifiers changed from: private */
    public static final vmz d = new vmz();

    public final int describeContents() {
        return 0;
    }

    vlv(vlw vlw, boolean z) {
        super(vlw, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vmz.a(this.a, parcel);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
