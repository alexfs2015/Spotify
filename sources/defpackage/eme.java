package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import defpackage.eme;
import defpackage.emf;
import java.io.IOException;

/* renamed from: eme reason: default package */
public abstract class eme<MessageType extends eme<MessageType, BuilderType>, BuilderType extends emf<MessageType, BuilderType>> implements eoo {
    private static boolean zzbun;
    protected int zzbum = 0;

    public void b(int i) {
        throw new UnsupportedOperationException();
    }

    public final zzun d() {
        try {
            emr d = zzun.d(h());
            a(d.a);
            return d.a();
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

    public int e() {
        throw new UnsupportedOperationException();
    }
}
