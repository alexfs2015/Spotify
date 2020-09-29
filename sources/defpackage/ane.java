package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.c;

/* renamed from: ane reason: default package */
public final class ane extends ann {
    public static final Creator<ane> CREATOR = new Creator<ane>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ane[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ane(parcel);
        }
    };

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "fb_lite_login";
    }

    public final int describeContents() {
        return 0;
    }

    public ane(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(c cVar) {
        String e = LoginClient.e();
        Intent a = amr.a(this.b.b.p(), cVar.d, cVar.b, e, cVar.f, cVar.a(), cVar.c, a(cVar.e), cVar.h);
        a("e2e", e);
        return a(a, LoginClient.a());
    }

    ane(Parcel parcel) {
        super(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
