package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: smk reason: default package */
final class smk extends smj {
    public static final Creator<smk> CREATOR = new Creator<smk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new smk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            SessionState sessionState = (SessionState) parcel.readParcelable(smo.class.getClassLoader());
            fpt fpt = (fpt) parcel.readParcelable(smo.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new smk(sessionState, fpt, z);
        }
    };

    public final int describeContents() {
        return 0;
    }

    smk(SessionState sessionState, fpt fpt, boolean z) {
        super(sessionState, fpt, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
