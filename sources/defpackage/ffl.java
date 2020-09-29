package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: ffl reason: default package */
public final class ffl {
    public final String a;
    public final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private ffl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        bxo.a(!caj.a(str), (Object) "ApplicationId must be set.");
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.b = str5;
        this.f = str6;
        this.g = str7;
    }

    public static ffl a(Context context) {
        bxu bxu = new bxu(context);
        String a2 = bxu.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        ffl ffl = new ffl(a2, bxu.a("google_api_key"), bxu.a("firebase_database_url"), bxu.a("ga_trackingId"), bxu.a("gcm_defaultSenderId"), bxu.a("google_storage_bucket"), bxu.a("project_id"));
        return ffl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffl)) {
            return false;
        }
        ffl ffl = (ffl) obj;
        return bxm.a(this.a, ffl.a) && bxm.a(this.c, ffl.c) && bxm.a(this.d, ffl.d) && bxm.a(this.e, ffl.e) && bxm.a(this.b, ffl.b) && bxm.a(this.f, ffl.f) && bxm.a(this.g, ffl.g);
    }

    public final int hashCode() {
        return bxm.a(this.a, this.c, this.d, this.e, this.b, this.f, this.g);
    }

    public final String toString() {
        return bxm.a((Object) this).a("applicationId", this.a).a("apiKey", this.c).a("databaseUrl", this.d).a("gcmSenderId", this.b).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
