package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessTokenSource;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: anc reason: default package */
public final class anc extends anl {
    public static final Creator<anc> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new anc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new anc(parcel);
        }
    };
    private static ScheduledThreadPoolExecutor c;

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "device_auth";
    }

    public final int describeContents() {
        return 0;
    }

    public anc(LoginClient loginClient) {
        super(loginClient);
    }

    public final void i_() {
        this.b.a(Result.a(this.b.e, "User canceled log in."));
    }

    public final void a(Exception exc) {
        this.b.a(Result.a(this.b.e, null, exc.getMessage()));
    }

    public final void a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        aju aju = new aju(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, null, date3);
        this.b.a(Result.a(this.b.e, aju));
    }

    public static synchronized ScheduledThreadPoolExecutor c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (anc.class) {
            if (c == null) {
                c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = c;
        }
        return scheduledThreadPoolExecutor;
    }

    protected anc(Parcel parcel) {
        super(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(c cVar) {
        ka p = this.b.b.p();
        if (p != null && !p.isFinishing()) {
            anb anb = new anb();
            anb.a(p.i(), "login_with_facebook");
            anb.a(cVar);
        }
        return true;
    }
}
