package defpackage;

import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.Executors;

/* renamed from: ilx reason: default package */
public final class ilx {
    private static final UUID e = UUID.fromString("E3CCCCCD-33B7-457D-A03C-AA1C54BF617F");
    private static final UUID f = UUID.fromString("7FBE865E-518B-462A-B31B-90ACF6A472FC");
    public ilv a;
    public ilv b;
    public ilv c;
    public ilv d;
    private final ilw g;
    private final boolean h = false;
    private final a i;
    private final Handler j = new Handler(Looper.getMainLooper());

    /* renamed from: ilx$a */
    public interface a {
        void a(ikm ikm, String str);
    }

    public ilx(ilw ilw, a aVar, boolean z) {
        this.g = ilw;
        this.i = aVar;
    }

    private static ikm a(InputStream inputStream, OutputStream outputStream) {
        return new ikx(inputStream, outputStream, Executors.newSingleThreadExecutor());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(BluetoothSocket bluetoothSocket) {
        try {
            this.j.post(new $$Lambda$ilx$iqyUxLVjQ_aL_WsfpH5A5sSjNb0(this, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream(), bluetoothSocket));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.i.a(b(inputStream, outputStream), bluetoothSocket.getRemoteDevice().getAddress());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.i.a(b(inputStream, outputStream), inetAddress.getHostAddress());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Socket socket) {
        try {
            this.j.post(new $$Lambda$ilx$fII0316jmtTCaTV__WNvf8ovNbI(this, socket.getInputStream(), socket.getOutputStream(), socket.getInetAddress()));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    private static ikm b(InputStream inputStream, OutputStream outputStream) {
        return new ilj(new ilg(inputStream, Executors.newSingleThreadExecutor(), new ilf()), new ili(outputStream, Executors.newSingleThreadScheduledExecutor(), new ilf()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(BluetoothSocket bluetoothSocket) {
        try {
            this.j.post(new $$Lambda$ilx$MgBycQBCVD7EjDCj72H3bnKNgeo(this, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream(), bluetoothSocket));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.i.a(a(inputStream, outputStream), bluetoothSocket.getRemoteDevice().getAddress());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.i.a(a(inputStream, outputStream), inetAddress.getHostAddress());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Socket socket) {
        try {
            this.j.post(new $$Lambda$ilx$mljT17822wA_VvyPabBvsfrmp2o(this, socket.getInputStream(), socket.getOutputStream(), socket.getInetAddress()));
        } catch (IOException e2) {
            Logger.e(e2, "failed opening streams", new Object[0]);
        }
    }

    public final void a() {
        if (!((this.a == null && this.b == null && this.c == null && this.d == null) ? false : true)) {
            this.a = this.g.a(e, (a) new $$Lambda$ilx$RANuDH1vKA4dASlRjtec7yYEIDI(this));
            this.a.start();
            this.b = this.g.a(f, (a) new $$Lambda$ilx$X4_W4VlwOrPZnBBNcaGuKt_aSfU(this));
            this.b.start();
            if (this.h) {
                this.c = this.g.a(9095, (a) new $$Lambda$ilx$dAAFkHWzEss86rQWF_TIGrliAo(this));
                this.c.start();
                this.d = this.g.a(9096, (a) new $$Lambda$ilx$LJIvDk308PX6gRkfyyutfZno8cU(this));
                this.d.start();
            }
        }
    }
}
