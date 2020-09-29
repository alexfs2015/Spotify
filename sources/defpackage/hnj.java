package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.ExternalIntegrationService;

/* renamed from: hnj reason: default package */
public final class hnj extends hgc<hne> {
    private final Context f;
    private final String g;
    private a<hne> h;
    private final BroadcastReceiver i = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            hnj.this.b();
        }
    };

    public hnj(Context context, String str) {
        super(context, ExternalIntegrationService.class, $$Lambda$hnj$GsJH7AWv0HX0nMxSL_0_xzE8sg.INSTANCE, str);
        Logger.c("ExternalIntegrationServiceClient for %s has been created.", str);
        this.g = str;
        this.f = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hne a(IBinder iBinder) {
        return (hne) iBinder;
    }

    public final void a(a<hne> aVar) {
        super.a(aVar);
        this.h = aVar;
    }

    public final void b() {
        super.b();
        a<hne> aVar = this.h;
        if (aVar != null) {
            aVar.e();
            this.h = null;
        }
    }

    public final void e() {
        super.e();
        Logger.c("ExternalIntegrationServiceClient is connecting for the tag: %s", this.g);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.spotify.mobile.android.service.media.ACTION_DISCONNECT_CLIENTS");
        mc.a(this.f).a(this.i, intentFilter);
    }

    public final void f() {
        Logger.c("ExternalIntegrationServiceClient is disconnecting for the tag: %s", this.g);
        mc.a(this.f).a(this.i);
        super.f();
    }
}
