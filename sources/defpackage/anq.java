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

/* renamed from: anq reason: default package */
public final class anq extends anz {
    public static final Creator<anq> CREATOR = new Creator() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new anq(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new anq[i];
        }
    };
    private static ScheduledThreadPoolExecutor c;

    protected anq(Parcel parcel) {
        super(parcel);
    }

    public anq(LoginClient loginClient) {
        super(loginClient);
    }

    public static synchronized ScheduledThreadPoolExecutor c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (anq.class) {
            if (c == null) {
                c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = c;
        }
        return scheduledThreadPoolExecutor;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return "device_auth";
    }

    public final void a(Exception exc) {
        this.b.a(Result.a(this.b.e, null, exc.getMessage()));
    }

    public final void a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        aki aki = new aki(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, null, date3);
        this.b.a(Result.a(this.b.e, aki));
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(c cVar) {
        kf p = this.b.b.p();
        if (p != null && !p.isFinishing()) {
            anp anp = new anp();
            anp.a(p.i(), "login_with_facebook");
            anp.a(cVar);
        }
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void i_() {
        this.b.a(Result.a(this.b.e, "User canceled log in."));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
