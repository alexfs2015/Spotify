package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: -$$Lambda$ilx$iqyUxLVjQ_aL_WsfpH5A5sSjNb0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ilx$iqyUxLVjQ_aL_WsfpH5A5sSjNb0 implements Runnable {
    private final /* synthetic */ ilx f$0;
    private final /* synthetic */ InputStream f$1;
    private final /* synthetic */ OutputStream f$2;
    private final /* synthetic */ BluetoothSocket f$3;

    public /* synthetic */ $$Lambda$ilx$iqyUxLVjQ_aL_WsfpH5A5sSjNb0(ilx ilx, InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.f$0 = ilx;
        this.f$1 = inputStream;
        this.f$2 = outputStream;
        this.f$3 = bluetoothSocket;
    }

    public final void run() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
