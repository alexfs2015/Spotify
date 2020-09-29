package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: fer reason: default package */
public final class fer {
    public final String a;
    public final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private fer(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        bwx.a(!bzs.a(str), (Object) "ApplicationId must be set.");
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.b = str5;
        this.f = str6;
        this.g = str7;
    }

    public static fer a(Context context) {
        bxd bxd = new bxd(context);
        String a2 = bxd.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        fer fer = new fer(a2, bxd.a("google_api_key"), bxd.a("firebase_database_url"), bxd.a("ga_trackingId"), bxd.a("gcm_defaultSenderId"), bxd.a("google_storage_bucket"), bxd.a("project_id"));
        return fer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fer)) {
            return false;
        }
        fer fer = (fer) obj;
        if (!bwv.a(this.a, fer.a) || !bwv.a(this.c, fer.c) || !bwv.a(this.d, fer.d) || !bwv.a(this.e, fer.e) || !bwv.a(this.b, fer.b) || !bwv.a(this.f, fer.f) || !bwv.a(this.g, fer.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return bwv.a(this.a, this.c, this.d, this.e, this.b, this.f, this.g);
    }

    public final String toString() {
        return bwv.a((Object) this).a("applicationId", this.a).a("apiKey", this.c).a("databaseUrl", this.d).a("gcmSenderId", this.b).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
