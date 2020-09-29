package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: -$$Lambda$ijk$wWRgH0LMCLVuvcVrfbNAQ02nS2g reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ijk$wWRgH0LMCLVuvcVrfbNAQ02nS2g implements Runnable {
    private final /* synthetic */ ijk f$0;
    private final /* synthetic */ InputStream f$1;
    private final /* synthetic */ OutputStream f$2;
    private final /* synthetic */ BluetoothSocket f$3;

    public /* synthetic */ $$Lambda$ijk$wWRgH0LMCLVuvcVrfbNAQ02nS2g(ijk ijk, InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.f$0 = ijk;
        this.f$1 = inputStream;
        this.f$2 = outputStream;
        this.f$3 = bluetoothSocket;
    }

    public final void run() {
        this.f$0.b(this.f$1, this.f$2, this.f$3);
    }
}
