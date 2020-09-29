package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;

/* renamed from: -$$Lambda$ijk$od2ZnGoSIOVLycdPXqvupxaXuU0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ijk$od2ZnGoSIOVLycdPXqvupxaXuU0 implements Runnable {
    private final /* synthetic */ ijk f$0;
    private final /* synthetic */ InputStream f$1;
    private final /* synthetic */ OutputStream f$2;
    private final /* synthetic */ InetAddress f$3;

    public /* synthetic */ $$Lambda$ijk$od2ZnGoSIOVLycdPXqvupxaXuU0(ijk ijk, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f$0 = ijk;
        this.f$1 = inputStream;
        this.f$2 = outputStream;
        this.f$3 = inetAddress;
    }

    public final void run() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
