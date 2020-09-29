package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: mjz reason: default package */
public final class mjz implements Parcelable {
    public static final Creator<mjz> CREATOR = new Creator<mjz>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mjz(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mjz[i];
        }
    };
    public final String a;
    public final String b;
    public final Uri c;
    public final Uri d;
    private final String e;

    public mjz(Parcel parcel) {
        this.e = parcel.readString();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) Uri.CREATOR.createFromParcel(parcel);
        this.d = (Uri) Uri.CREATOR.createFromParcel(parcel);
    }

    public mjz(String str, String str2, String str3, Uri uri, Uri uri2) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = uri;
        this.d = uri2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Uri.writeToParcel(parcel, this.c);
        Uri.writeToParcel(parcel, this.d);
    }
}
