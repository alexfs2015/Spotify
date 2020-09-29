package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;

/* renamed from: fhx reason: default package */
public final class fhx extends bxf {
    public static final Creator<fhx> CREATOR = new fhz();
    private Bundle a;
    private Map<String, String> b;

    public fhx(Bundle bundle) {
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
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, a2);
    }
}
