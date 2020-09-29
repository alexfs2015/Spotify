package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: -$$Lambda$ilx$MgBycQBCVD7EjDCj72H3bnKNgeo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ilx$MgBycQBCVD7EjDCj72H3bnKNgeo implements Runnable {
    private final /* synthetic */ ilx f$0;
    private final /* synthetic */ InputStream f$1;
    private final /* synthetic */ OutputStream f$2;
    private final /* synthetic */ BluetoothSocket f$3;

    public /* synthetic */ $$Lambda$ilx$MgBycQBCVD7EjDCj72H3bnKNgeo(ilx ilx, InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.f$0 = ilx;
        this.f$1 = inputStream;
        this.f$2 = outputStream;
        this.f$3 = bluetoothSocket;
    }

    public final void run() {
        this.f$0.b(this.f$1, this.f$2, this.f$3);
    }
}
