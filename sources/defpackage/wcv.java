package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRecord;
import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* renamed from: wcv reason: default package */
public final class wcv implements wcu {
    private final Flowable<ByteBuffer> a;
    private final int b;
    private final wcs c;

    public wcv() {
        this.c = VERSION.SDK_INT >= 23 ? new wcs() : null;
        wct wct = new wct(this.c);
        this.b = wct.a;
        this.a = Flowable.a((Callable<? extends D>) wct, (Function<? super D, ? extends xfk<? extends T>>) new $$Lambda$wcv$tGGNFyrOSTGSSHrF73FRa6E0s6Y<Object,Object>(wct), (Consumer<? super D>) new $$Lambda$wcv$UR4HBYSrExaXxt78vJvRUCVbD5o<Object>(this)).h().c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AudioRecord audioRecord) {
        Logger.b("Disposing recorder", new Object[0]);
        wcs wcs = this.c;
        if (!(wcs == null || audioRecord == null || wcs == null)) {
            Logger.c("Removing audio routing listener.", new Object[0]);
            if (VERSION.SDK_INT >= 24) {
                audioRecord.removeOnRoutingChangedListener(wcs);
            } else if (VERSION.SDK_INT == 23) {
                audioRecord.removeOnRoutingChangedListener(wcs);
            }
        }
    }

    public final Flowable<ByteBuffer> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final AudioDeviceInfo c() {
        if (VERSION.SDK_INT >= 23) {
            wcs wcs = this.c;
            if (wcs != null) {
                return wcs.a;
            }
        }
        return null;
    }
}
