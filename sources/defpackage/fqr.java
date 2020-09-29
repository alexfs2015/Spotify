package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.Serializable;

/* renamed from: fqr reason: default package */
public final class fqr implements fqn {
    public static final Creator<fqr> CREATOR = new Creator<fqr>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new fqr(parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fqr[i];
        }
    };
    private final String a;

    public fqr(String str) {
        this.a = str;
    }

    public final <T extends Serializable> T a(fqm<T> fqm) {
        StringBuilder sb = new StringBuilder("You cannot read any flags from this object: ");
        sb.append(this.a);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(fqn fqn, fqm<?> fqm) {
        StringBuilder sb = new StringBuilder("You cannot read any flags from this object: ");
        sb.append(this.a);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final <T extends Serializable> boolean b(fqm<T> fqm) {
        StringBuilder sb = new StringBuilder("You cannot read any flags from this object: ");
        sb.append(this.a);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
