package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;

/* renamed from: uxb reason: default package */
final class uxb extends uwy {
    public static final Creator<uxb> CREATOR = new Creator<uxb>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uxb[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Optional a = uxb.i.a(parcel);
            uxb.j;
            Optional a2 = vnr.a(parcel);
            String readString = parcel.readString();
            uxb.k;
            Optional a3 = uyn.a(parcel);
            uxb.k;
            Optional a4 = uyn.a(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            uxb.l;
            uxb uxb = new uxb(a, a2, readString, a3, a4, z, uyp.a(parcel), parcel.readInt());
            return uxb;
        }
    };
    /* access modifiers changed from: private */
    public static final uyf i = new uyf();
    /* access modifiers changed from: private */
    public static final vnr j = new vnr();
    /* access modifiers changed from: private */
    public static final uyn k = new uyn();
    /* access modifiers changed from: private */
    public static final uyp l = new uyp();

    public final int describeContents() {
        return 0;
    }

    uxb(Optional<RootlistRequestPayload> optional, Optional<vns> optional2, String str, Optional<Boolean> optional3, Optional<Boolean> optional4, boolean z, Optional<uyd> optional5, int i2) {
        super(optional, optional2, str, optional3, optional4, z, optional5, i2);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        uyf.a(this.a, parcel);
        vnr.a(this.b, parcel);
        parcel.writeString(this.c);
        uyn.a(this.d, parcel);
        uyn.a(this.e, parcel);
        parcel.writeInt(this.f ? 1 : 0);
        uyp.a(this.g, parcel);
        parcel.writeInt(this.h);
    }
}
