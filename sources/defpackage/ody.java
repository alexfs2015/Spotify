package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.nowplayingbar.domain.model.Track.Type;

/* renamed from: ody reason: default package */
public final class ody extends odu {
    public static final Creator<ody> CREATOR = new Creator<ody>() {
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
            ody ody = new ody(readString, readString2, readString3, readString4, z2, z, (Type) Enum.valueOf(Type.class, parcel.readString()));
            return ody;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ody[i];
        }
    };

    public ody(String str, String str2, String str3, String str4, boolean z, boolean z2, Type type) {
        super(str, str2, str3, str4, z, z2, type);
    }

    public final int describeContents() {
        return 0;
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
