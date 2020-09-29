package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.ExternalIntegrationService;

/* renamed from: hpy reason: default package */
public final class hpy extends hiy<hpt> {
    private final Context g;
    private final String h;
    private a<hpt> i;
    private final BroadcastReceiver j = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            hpy.this.b();
        }
    };

    public hpy(Context context, String str, hjw hjw) {
        super(context, ExternalIntegrationService.class, $$Lambda$hpy$yZ1rf8GBzwRvqAe7ph02GkTRqY.INSTANCE, str, hjw);
        Logger.c("ExternalIntegrationServiceClient for %s has been created.", str);
        this.h = str;
        this.g = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hpt a(IBinder iBinder) {
        return (hpt) iBinder;
    }

    public final void a(a<hpt> aVar) {
        super.a(aVar);
        this.i = aVar;
    }

    public final void b() {
        super.b();
        a<hpt> aVar = this.i;
        if (aVar != null) {
            aVar.e();
            this.i = null;
        }
    }

    public final void d() {
        super.d();
        Logger.c("ExternalIntegrationServiceClient is connecting for the tag: %s", this.h);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.spotify.mobile.android.service.media.ACTION_DISCONNECT_CLIENTS");
        mh.a(this.g).a(this.j, intentFilter);
    }

    public final void e() {
        Logger.c("ExternalIntegrationServiceClient is disconnecting for the tag: %s", this.h);
        mh.a(this.g).a(this.j);
        super.e();
    }
}
