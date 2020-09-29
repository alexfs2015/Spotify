package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: uqm reason: default package */
public class uqm implements Parcelable {
    public static final Creator<uqm> CREATOR = new Creator<uqm>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new uqm(parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uqm[i];
        }
    };
    private final String a;

    /* renamed from: uqm$a */
    public interface a {
        uqm ag();
    }

    public uqm(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqm)) {
            return false;
        }
        return a().equals(((uqm) obj).a());
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
