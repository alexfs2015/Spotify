package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: swr reason: default package */
final class swr extends swq {
    public static final Creator<swr> CREATOR = new Creator<swr>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            SessionState sessionState = (SessionState) parcel.readParcelable(swv.class.getClassLoader());
            fqn fqn = (fqn) parcel.readParcelable(swv.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new swr(sessionState, fqn, z);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new swr[i];
        }
    };

    swr(SessionState sessionState, fqn fqn, boolean z) {
        super(sessionState, fqn, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
