package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.nowplayingbar.domain.model.Track.Type;

/* renamed from: nxl reason: default package */
public final class nxl extends nxh {
    public static final Creator<nxl> CREATOR = new Creator<nxl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new nxl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            nxl nxl = new nxl(readString, readString2, readString3, readString4, z2, z, (Type) Enum.valueOf(Type.class, parcel.readString()));
            return nxl;
        }
    };

    public final int describeContents() {
        return 0;
    }

    public nxl(String str, String str2, String str3, String str4, boolean z, boolean z2, Type type) {
        super(str, str2, str3, str4, z, z2, type);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g.name());
    }
}
