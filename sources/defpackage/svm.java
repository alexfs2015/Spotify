package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: svm reason: default package */
public final class svm implements Parcelable {
    public static final Creator<svm> CREATOR = new Creator<svm>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new svm(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new svm[i];
        }
    };
    public final int a;
    public final int b;
    public final int c;

    @JsonCreator
    public svm(@JsonProperty("dark_color") int i, @JsonProperty("active_color") int i2, @JsonProperty("bright_color") int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private svm(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    /* synthetic */ svm(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof svm)) {
            return false;
        }
        svm svm = (svm) obj;
        return svm.a == this.a && svm.b == this.b && svm.c == this.c;
    }

    public final int hashCode() {
        return this.a + 527 + this.b + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
