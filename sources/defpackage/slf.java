package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: slf reason: default package */
public final class slf implements Parcelable {
    public static final Creator<slf> CREATOR = new Creator<slf>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new slf[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new slf(parcel, 0);
        }
    };
    public final int a;
    public final int b;
    public final int c;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ slf(Parcel parcel, byte b2) {
        this(parcel);
    }

    @JsonCreator
    public slf(@JsonProperty("dark_color") int i, @JsonProperty("active_color") int i2, @JsonProperty("bright_color") int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private slf(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof slf)) {
            return false;
        }
        slf slf = (slf) obj;
        return slf.a == this.a && slf.b == this.b && slf.c == this.c;
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
