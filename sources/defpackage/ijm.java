package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.UUID;

/* renamed from: ijm reason: default package */
public final class ijm extends Thread implements iji {
    private BluetoothServerSocket a;
    private final UUID b;
    private final BluetoothAdapter c;
    private final a d;
    private boolean e;

    /* renamed from: ijm$a */
    interface a {
        void socketAccepted(BluetoothSocket bluetoothSocket);
    }

    public ijm(UUID uuid, BluetoothAdapter bluetoothAdapter, a aVar) {
        this.b = uuid;
        this.c = bluetoothAdapter;
        this.d = aVar;
    }

    public final void run() {
        try {
            if (this.c != null) {
                this.a = this.c.listenUsingRfcommWithServiceRecord("Spotify", this.b);
            }
        } catch (IOException e2) {
            Logger.e(e2, "Error closing BT server socket. UUID: %s", this.b.toString());
        }
        if (this.a == null) {
            Logger.e("BT server socket is null", new Object[0]);
            a();
            return;
        }
        while (!this.e) {
            try {
                BluetoothSocket accept = this.a.accept();
                if (accept != null) {
                    this.d.socketAccepted(accept);
                }
            } catch (IOException e3) {
                Logger.b(e3, "IOException, most likely from socket.accept() call being aborted. UUID: %s", this.b.toString());
            }
        }
    }

    public final void a() {
        this.e = true;
        try {
            if (this.a != null) {
                this.a.close();
            }
        } catch (IOException e2) {
            Logger.e(e2, "Error closing BT server socket", new Object[0]);
        }
        this.a = null;
    }
}
