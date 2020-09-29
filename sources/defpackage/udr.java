package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: udr reason: default package */
public class udr implements Parcelable {
    public static final Creator<udr> CREATOR = new Creator<udr>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new udr[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new udr(parcel.readString());
        }
    };
    private final String a;

    /* renamed from: udr$a */
    public interface a {
        udr ag();
    }

    public int describeContents() {
        return 0;
    }

    public udr(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udr)) {
            return false;
        }
        return a().equals(((udr) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
