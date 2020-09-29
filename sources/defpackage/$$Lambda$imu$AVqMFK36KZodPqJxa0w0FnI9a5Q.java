package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$imu$AVqMFK36KZodPqJxa0w0FnI9a5Q reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$imu$AVqMFK36KZodPqJxa0w0FnI9a5Q implements Consumer {
    private final /* synthetic */ imu f$0;
    private final /* synthetic */ AuthorizationRequest f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$imu$AVqMFK36KZodPqJxa0w0FnI9a5Q(imu imu, AuthorizationRequest authorizationRequest, int i) {
        this.f$0 = imu;
        this.f$1 = authorizationRequest;
        this.f$2 = i;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (ho) obj);
    }
}
