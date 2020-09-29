package defpackage;

import android.os.Parcel;

/* renamed from: vnc reason: default package */
public final class vnc {
    /* access modifiers changed from: private */
    public static void a(Parcel parcel, String str, vla vla) {
        parcel.writeString(str);
        vla.writeToParcel(parcel, 0);
    }

    public static void a(vlb vlb, Parcel parcel) {
        vlb.a(new $$Lambda$vnc$1fOdD5O7x4lfgU0zqXQ56LB358s(parcel), new $$Lambda$vnc$mC6BLWId8eEbTmUi_4YKbbpqz1Y(parcel));
    }
}
