package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;

/* renamed from: fir reason: default package */
public final class fir extends bxw {
    public static final Creator<fir> CREATOR = new fit();
    private Bundle a;
    private Map<String, String> b;

    public fir(Bundle bundle) {
        this.a = bundle;
    }

    public final Map<String, String> a() {
        if (this.b == null) {
            Bundle bundle = this.a;
            dp dpVar = new dp();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        dpVar.put(str, str2);
                    }
                }
            }
            this.b = dpVar;
        }
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, a2);
    }
}
