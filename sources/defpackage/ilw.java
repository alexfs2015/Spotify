package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.util.UUID;
import javax.net.ServerSocketFactory;

/* renamed from: ilw reason: default package */
public final class ilw {
    private final BluetoothAdapter a;
    private final ServerSocketFactory b;

    public ilw(BluetoothAdapter bluetoothAdapter, ServerSocketFactory serverSocketFactory) {
        this.a = bluetoothAdapter;
        this.b = serverSocketFactory;
    }

    public final ilv a(int i, a aVar) {
        return new imf(i, this.b, aVar);
    }

    public final ilv a(UUID uuid, a aVar) {
        return new ilz(uuid, this.a, aVar);
    }
}
