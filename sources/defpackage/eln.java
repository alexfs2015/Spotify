package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import defpackage.eln;
import defpackage.elo;
import java.io.IOException;

/* renamed from: eln reason: default package */
public abstract class eln<MessageType extends eln<MessageType, BuilderType>, BuilderType extends elo<MessageType, BuilderType>> implements enx {
    private static boolean zzbun = false;
    protected int zzbum = 0;

    public final zzun d() {
        try {
            ema d = zzun.d(h());
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

    public void b(int i) {
        throw new UnsupportedOperationException();
    }
}
