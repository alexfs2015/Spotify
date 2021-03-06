package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.service.AppProtocolBluetoothService;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: ijl reason: default package */
public final class ijl {
    private final BluetoothCategorizer a;
    private final Scheduler b;
    private final Scheduler c;
    private final vjo d;
    private Disposable e;

    public ijl(BluetoothCategorizer bluetoothCategorizer, Scheduler scheduler, Scheduler scheduler2, vjo vjo) {
        this.a = bluetoothCategorizer;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = vjo;
    }

    public final void a(Context context, boolean z, BluetoothDevice bluetoothDevice, PendingResult pendingResult) {
        Single a2 = vun.b(this.a.a(bluetoothDevice.getName())).b(this.b).c((Function<? super T, ? extends R>) $$Lambda$Ga7UZO4hHIKL9PA6UW7QeilZE3Q.INSTANCE).d(5, TimeUnit.SECONDS, this.b).a(0, Boolean.FALSE).a(Single.b(Boolean.FALSE)).a(this.c);
        $$Lambda$ijl$VqUoAxChLxKVbYu6OJl54GLnhU r1 = new $$Lambda$ijl$VqUoAxChLxKVbYu6OJl54GLnhU(this, context, z, bluetoothDevice, pendingResult);
        this.e = a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$ijl$t7dwj1UE6lAATy95PvA3vi46iQ<Object>(this, pendingResult));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, boolean z, BluetoothDevice bluetoothDevice, PendingResult pendingResult, Boolean bool) {
        if (bool.booleanValue()) {
            this.d.a(context, AppProtocolBluetoothService.a(context, z, bluetoothDevice), "AppProtocolServiceStarter", new Object[0]);
        }
        a(pendingResult);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PendingResult pendingResult, Throwable th) {
        Logger.e(th, "failed getting bluetooth category", new Object[0]);
        a(pendingResult);
    }

    private void a(PendingResult pendingResult) {
        this.a.a.a();
        this.e.bf_();
        pendingResult.finish();
    }
}
