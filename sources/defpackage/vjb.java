package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.playlist.Policy;

/* renamed from: vjb reason: default package */
final class vjb extends viz {
    public static final Creator<vjb> CREATOR = new Creator<vjb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Optional a = vjb.o.a(parcel);
            vjb.p;
            Optional a2 = wax.a(parcel);
            String readString = parcel.readString();
            vjb.q;
            Optional a3 = vkq.a(parcel);
            vjb.q;
            Optional a4 = vkq.a(parcel);
            vjb.q;
            Optional a5 = vkq.a(parcel);
            vjb.q;
            Optional a6 = vkq.a(parcel);
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            vjb.q;
            Optional a7 = vkq.a(parcel);
            vjb.q;
            Optional a8 = vkq.a(parcel);
            vjb.r;
            vjb vjb = new vjb(a, a2, readString, a3, a4, a5, a6, z2, z, a7, a8, vks.a(parcel), (Optional) parcel.readSerializable(), parcel.readInt());
            return vjb;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vjb[i];
        }
    };
    /* access modifiers changed from: private */
    public static final vkh o = new vkh();
    /* access modifiers changed from: private */
    public static final wax p = new wax();
    /* access modifiers changed from: private */
    public static final vkq q = new vkq();
    /* access modifiers changed from: private */
    public static final vks r = new vks();

    vjb(Optional<Policy> optional, Optional<way> optional2, String str, Optional<Boolean> optional3, Optional<Boolean> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, boolean z, boolean z2, Optional<Boolean> optional7, Optional<Boolean> optional8, Optional<vkg> optional9, Optional<Integer> optional10, int i) {
        super(optional, optional2, str, optional3, optional4, optional5, optional6, z, z2, optional7, optional8, optional9, optional10, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vkh.a(this.a, parcel);
        wax.a(this.b, parcel);
        parcel.writeString(this.c);
        vkq.a(this.d, parcel);
        vkq.a(this.e, parcel);
        vkq.a(this.f, parcel);
        vkq.a(this.g, parcel);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        vkq.a(this.j, parcel);
        vkq.a(this.k, parcel);
        vks.a(this.l, parcel);
        parcel.writeSerializable(this.m);
        parcel.writeInt(this.n);
    }
}
