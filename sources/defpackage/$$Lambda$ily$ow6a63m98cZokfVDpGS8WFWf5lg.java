package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ily$ow6a63m98cZokfVDpGS8WFWf5lg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ily$ow6a63m98cZokfVDpGS8WFWf5lg implements Consumer {
    private final /* synthetic */ ily f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ boolean f$2;
    private final /* synthetic */ BluetoothDevice f$3;
    private final /* synthetic */ PendingResult f$4;

    public /* synthetic */ $$Lambda$ily$ow6a63m98cZokfVDpGS8WFWf5lg(ily ily, Context context, boolean z, BluetoothDevice bluetoothDevice, PendingResult pendingResult) {
        this.f$0 = ily;
        this.f$1 = context;
        this.f$2 = z;
        this.f$3 = bluetoothDevice;
        this.f$4 = pendingResult;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, (Boolean) obj);
    }
}
