package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* renamed from: wny reason: default package */
final class wny extends wob {
    private Method b;
    private Method c;

    private wny(Method method, Method method2) {
        this.b = method;
        this.c = method2;
    }

    public final void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = a(list);
            this.b.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw wmk.a("unable to set ssl parameters", (Exception) e);
        }
    }

    public final String a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.c.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw wmk.a("unable to get selected protocols", (Exception) e);
        }
    }

    public static wny a() {
        try {
            return new wny(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
