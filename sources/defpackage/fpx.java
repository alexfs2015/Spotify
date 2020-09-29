package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.Serializable;

/* renamed from: fpx reason: default package */
public final class fpx implements fpt {
    public static final Creator<fpx> CREATOR = new Creator<fpx>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fpx[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new fpx(parcel.readString());
        }
    };
    private final String a;

    public final boolean a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public fpx(String str) {
        this.a = str;
    }

    public final <T extends Serializable> T a(fps<T> fps) {
        StringBuilder sb = new StringBuilder("You cannot read any flags from this object: ");
        sb.append(this.a);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final <T extends Serializable> boolean b(fps<T> fps) {
        StringBuilder sb = new StringBuilder("You cannot read any flags from this object: ");
        sb.append(this.a);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final boolean a(fpt fpt, fps<?> fps) {
        StringBuilder sb = new StringBuilder("You cannot read any flags from this object: ");
        sb.append(this.a);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
