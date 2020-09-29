package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.util.UUID;
import javax.net.ServerSocketFactory;

/* renamed from: ijj reason: default package */
public final class ijj {
    private final BluetoothAdapter a;
    private final ServerSocketFactory b;

    public ijj(BluetoothAdapter bluetoothAdapter, ServerSocketFactory serverSocketFactory) {
        this.a = bluetoothAdapter;
        this.b = serverSocketFactory;
    }

    public final iji a(UUID uuid, a aVar) {
        return new ijm(uuid, this.a, aVar);
    }

    public final iji a(int i, a aVar) {
        return new ijs(i, this.b, aVar);
    }
}
