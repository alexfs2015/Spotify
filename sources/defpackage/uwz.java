package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.playlist.Policy;

/* renamed from: uwz reason: default package */
final class uwz extends uwx {
    public static final Creator<uwz> CREATOR = new Creator<uwz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uwz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Optional a = uwz.o.a(parcel);
            uwz.p;
            Optional a2 = vnr.a(parcel);
            String readString = parcel.readString();
            uwz.q;
            Optional a3 = uyn.a(parcel);
            uwz.q;
            Optional a4 = uyn.a(parcel);
            uwz.q;
            Optional a5 = uyn.a(parcel);
            uwz.q;
            Optional a6 = uyn.a(parcel);
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            uwz.q;
            Optional a7 = uyn.a(parcel);
            uwz.q;
            Optional a8 = uyn.a(parcel);
            uwz.r;
            uwz uwz = new uwz(a, a2, readString, a3, a4, a5, a6, z2, z, a7, a8, uyp.a(parcel), (Optional) parcel.readSerializable(), parcel.readInt());
            return uwz;
        }
    };
    /* access modifiers changed from: private */
    public static final uye o = new uye();
    /* access modifiers changed from: private */
    public static final vnr p = new vnr();
    /* access modifiers changed from: private */
    public static final uyn q = new uyn();
    /* access modifiers changed from: private */
    public static final uyp r = new uyp();

    public final int describeContents() {
        return 0;
    }

    uwz(Optional<Policy> optional, Optional<vns> optional2, String str, Optional<Boolean> optional3, Optional<Boolean> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, boolean z, boolean z2, Optional<Boolean> optional7, Optional<Boolean> optional8, Optional<uyd> optional9, Optional<Integer> optional10, int i) {
        super(optional, optional2, str, optional3, optional4, optional5, optional6, z, z2, optional7, optional8, optional9, optional10, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        uye.a(this.a, parcel);
        vnr.a(this.b, parcel);
        parcel.writeString(this.c);
        uyn.a(this.d, parcel);
        uyn.a(this.e, parcel);
        uyn.a(this.f, parcel);
        uyn.a(this.g, parcel);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        uyn.a(this.j, parcel);
        uyn.a(this.k, parcel);
        uyp.a(this.l, parcel);
        parcel.writeSerializable(this.m);
        parcel.writeInt(this.n);
    }
}
