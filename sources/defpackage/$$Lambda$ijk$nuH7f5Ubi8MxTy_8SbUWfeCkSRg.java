package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: -$$Lambda$ijk$nuH7f5Ubi8MxTy_8SbUWfeCkSRg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ijk$nuH7f5Ubi8MxTy_8SbUWfeCkSRg implements Runnable {
    private final /* synthetic */ ijk f$0;
    private final /* synthetic */ InputStream f$1;
    private final /* synthetic */ OutputStream f$2;
    private final /* synthetic */ BluetoothSocket f$3;

    public /* synthetic */ $$Lambda$ijk$nuH7f5Ubi8MxTy_8SbUWfeCkSRg(ijk ijk, InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.f$0 = ijk;
        this.f$1 = inputStream;
        this.f$2 = outputStream;
        this.f$3 = bluetoothSocket;
    }

    public final void run() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
