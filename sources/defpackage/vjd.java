package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;

/* renamed from: vjd reason: default package */
final class vjd extends vja {
    public static final Creator<vjd> CREATOR = new Creator<vjd>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Optional a = vjd.i.a(parcel);
            vjd.j;
            Optional a2 = wax.a(parcel);
            String readString = parcel.readString();
            vjd.k;
            Optional a3 = vkq.a(parcel);
            vjd.k;
            Optional a4 = vkq.a(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            vjd.l;
            vjd vjd = new vjd(a, a2, readString, a3, a4, z, vks.a(parcel), parcel.readInt());
            return vjd;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vjd[i];
        }
    };
    /* access modifiers changed from: private */
    public static final vki i = new vki();
    /* access modifiers changed from: private */
    public static final wax j = new wax();
    /* access modifiers changed from: private */
    public static final vkq k = new vkq();
    /* access modifiers changed from: private */
    public static final vks l = new vks();

    vjd(Optional<RootlistRequestPayload> optional, Optional<way> optional2, String str, Optional<Boolean> optional3, Optional<Boolean> optional4, boolean z, Optional<vkg> optional5, int i2) {
        super(optional, optional2, str, optional3, optional4, z, optional5, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        vki.a(this.a, parcel);
        wax.a(this.b, parcel);
        parcel.writeString(this.c);
        vkq.a(this.d, parcel);
        vkq.a(this.e, parcel);
        parcel.writeInt(this.f ? 1 : 0);
        vks.a(this.g, parcel);
        parcel.writeInt(this.h);
    }
}
