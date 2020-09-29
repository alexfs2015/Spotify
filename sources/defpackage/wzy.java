package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: wzy reason: default package */
public interface wzy {
    public static final wzy a = new wzy() {
        public final List<InetAddress> a(String str) {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    StringBuilder sb = new StringBuilder("Broken system behaviour for dns lookup of ");
                    sb.append(str);
                    UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    };

    List<InetAddress> a(String str);
}
