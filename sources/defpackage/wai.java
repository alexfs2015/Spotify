package defpackage;

import android.os.Parcel;

/* renamed from: wai reason: default package */
public final class wai {
    /* access modifiers changed from: private */
    public static void a(Parcel parcel, String str, vyg vyg) {
        parcel.writeString(str);
        vyg.writeToParcel(parcel, 0);
    }

    public static void a(vyh vyh, Parcel parcel) {
        vyh.a(new $$Lambda$wai$YkSlGMfU39zvumhO7RmYryILqOk(parcel), new $$Lambda$wai$xiVX0f3BRKC0jAPRtjjyzWK0wl8(parcel));
    }
}
