package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ServerSocketFactory;

/* renamed from: ijs reason: default package */
public final class ijs extends Thread implements iji {
    private ServerSocket a;
    private final ServerSocketFactory b;
    private final int c;
    private final a d;
    private boolean e;

    /* renamed from: ijs$a */
    interface a {
        void socketAccepted(Socket socket);
    }

    public ijs(int i, ServerSocketFactory serverSocketFactory, a aVar) {
        this.c = i;
        this.b = serverSocketFactory;
        this.d = aVar;
    }

    public final void run() {
        try {
            this.a = this.b.createServerSocket();
            this.a.setReuseAddress(true);
            this.a.bind(new InetSocketAddress(this.c));
        } catch (IOException e2) {
            Logger.e(e2, "Error opening tcp server socket. port: %s", Integer.valueOf(this.c));
        }
        if (this.a == null) {
            Logger.e("server socket is null", new Object[0]);
            a();
            return;
        }
        while (!this.e) {
            try {
                this.d.socketAccepted(this.a.accept());
            } catch (IOException e3) {
                Logger.e(e3, "The server socket was probably closed", new Object[0]);
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
            Logger.e(e2, "Error closing tcp server socket", new Object[0]);
        }
        this.a = null;
    }
}
