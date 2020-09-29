package defpackage;

import android.os.Parcel;
import com.spotify.playlist.models.offline.WaitingReason;

/* renamed from: vlk reason: default package */
public final class vlk {
    public static vli a(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            return new f();
        }
        if (readString.equals(f.class.getCanonicalName())) {
            return new f();
        }
        int readInt = parcel.readInt();
        if (readString.equals(h.class.getCanonicalName())) {
            WaitingReason waitingReason = (WaitingReason) parcel.readSerializable();
            if (waitingReason != null) {
                return vli.a(waitingReason, readInt);
            }
        }
        return readString.equals(b.class.getCanonicalName()) ? vli.a(readInt) : readString.equals(a.class.getCanonicalName()) ? new a() : readString.equals(c.class.getCanonicalName()) ? new c() : readString.equals(e.class.getCanonicalName()) ? new e() : readString.equals(d.class.getCanonicalName()) ? new d() : readString.equals(g.class.getCanonicalName()) ? new g() : new f();
    }

    /* access modifiers changed from: private */
    public static void a(Parcel parcel, String str, int i) {
        parcel.writeString(str);
        parcel.writeInt(i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Parcel parcel, h hVar) {
        a(parcel, h.class.getCanonicalName(), hVar.b);
        parcel.writeSerializable(hVar.a);
    }

    public static void a(vli vli, Parcel parcel) {
        vli.a((ged<f>) new $$Lambda$vlk$63Q3FISTEHt63ygFdRBPkI_no<f>(parcel), (ged<h>) new $$Lambda$vlk$znUuGvLmmTXSW60frT8FcYJDI<h>(parcel), (ged<b>) new $$Lambda$vlk$QA8JVeueJb8I6OYGSYR2WBweB08<b>(parcel), (ged<a>) new $$Lambda$vlk$ph2Hez86YIzC2iFEihhQ9v8ugJk<a>(parcel), (ged<c>) new $$Lambda$vlk$QnNTyiU2PKwBl8x3yCMSR2DHa0<c>(parcel), (ged<e>) new $$Lambda$vlk$NHbjTIECRe_HdmMk10VS5H__mdA<e>(parcel), (ged<d>) new $$Lambda$vlk$tH8BOUUF33JHBoMpBsyDxtXIZ0s<d>(parcel), (ged<g>) new $$Lambda$vlk$vm2wT8skF5vBqCSURUep9TVXpI<g>(parcel));
    }
}
