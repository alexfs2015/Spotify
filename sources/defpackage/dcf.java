package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;
import defpackage.dcf;
import defpackage.dcg;
import java.io.IOException;

/* renamed from: dcf reason: default package */
public abstract class dcf<MessageType extends dcf<MessageType, BuilderType>, BuilderType extends dcg<MessageType, BuilderType>> implements deq {
    private static boolean zzdpg;
    protected int zzdpf = 0;

    public void b(int i) {
        throw new UnsupportedOperationException();
    }

    public final zzbah f() {
        try {
            dct c = zzbah.c(j());
            a(c.a);
            return c.a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] g() {
        try {
            byte[] bArr = new byte[j()];
            zzbav a = zzbav.a(bArr);
            a(a);
            a.i();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int h() {
        throw new UnsupportedOperationException();
    }
}
