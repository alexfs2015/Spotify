package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mbq reason: default package */
final class mbq extends mbp {
    public static final Creator<mbq> CREATOR = new Creator<mbq>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mbq[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            SubView subView = (SubView) Enum.valueOf(SubView.class, parcel.readString());
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            Uri uri = (Uri) parcel.readParcelable(mbt.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            mbq mbq = new mbq(subView, readString, uri, z, parcel.readString(), Integer.valueOf(parcel.readInt()));
            return mbq;
        }
    };

    public final int describeContents() {
        return 0;
    }

    mbq(SubView subView, String str, Uri uri, boolean z, String str2, Integer num) {
        super(subView, str, uri, z, str2, num);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        if (this.b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.b);
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f.intValue());
    }
}
