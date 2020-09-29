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

/* renamed from: vpu reason: default package */
public final class vpu implements vpt {
    private final Flowable<ByteBuffer> a;
    private final int b;
    private final vpr c;

    public vpu() {
        this.c = VERSION.SDK_INT >= 23 ? new vpr() : null;
        vps vps = new vps(this.c);
        this.b = vps.a;
        this.a = Flowable.a((Callable<? extends D>) vps, (Function<? super D, ? extends wrf<? extends T>>) new $$Lambda$vpu$X8UFoa1QpFbuQXtzIW1Rxu2uJA<Object,Object>(vps), (Consumer<? super D>) new $$Lambda$vpu$jHoK6y4zcU81X2X02stySaAkBc<Object>(this)).h().c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AudioRecord audioRecord) {
        Logger.b("Disposing recorder", new Object[0]);
        vpr vpr = this.c;
        if (!(vpr == null || audioRecord == null || vpr == null)) {
            Logger.c("Removing audio routing listener.", new Object[0]);
            if (VERSION.SDK_INT >= 24) {
                audioRecord.removeOnRoutingChangedListener(vpr);
            } else if (VERSION.SDK_INT == 23) {
                audioRecord.removeOnRoutingChangedListener(vpr);
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
            vpr vpr = this.c;
            if (vpr != null) {
                return vpr.a;
            }
        }
        return null;
    }
}
