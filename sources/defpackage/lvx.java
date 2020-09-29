package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lvx reason: default package */
final class lvx extends lvg<lvx> {
    public static final Creator<lvx> CREATOR = new Creator<lvx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lvx(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lvx[i];
        }
    };
    final String c;
    final String d;

    private lvx(Parcel parcel) {
        super(parcel);
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    /* synthetic */ lvx(Parcel parcel, byte b) {
        this(parcel);
    }

    lvx(String str, String str2, List<luu> list) {
        super(list);
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
