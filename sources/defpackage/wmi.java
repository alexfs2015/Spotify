package defpackage;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* renamed from: wmi reason: default package */
public abstract class wmi {
    public static wmi a;

    public abstract int a(a aVar);

    public abstract IOException a(wlj wlj, IOException iOException);

    public abstract Socket a(wln wln, wlf wlf, wmw wmw);

    public abstract wmt a(wln wln, wlf wlf, wmw wmw, wmh wmh);

    public abstract wmu a(wln wln);

    public abstract void a(wlo wlo, SSLSocket sSLSocket, boolean z);

    public abstract void a(a aVar, String str);

    public abstract void a(a aVar, String str, String str2);

    public abstract boolean a(wlf wlf, wlf wlf2);

    public abstract boolean a(wln wln, wmt wmt);

    public abstract void b(wln wln, wmt wmt);
}
