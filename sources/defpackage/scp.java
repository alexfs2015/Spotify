package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: scp reason: default package */
public interface scp {
    public static final ImmutableSet<Long> a = ImmutableSet.a(Long.valueOf(4), Long.valueOf(2), Long.valueOf(1), Long.valueOf(1024), Long.valueOf(2048), Long.valueOf(32), Long.valueOf(16), Long.valueOf(4096), Long.valueOf(256), Long.valueOf(262144));

    /* renamed from: scp$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Set $default$b(scp scp) {
            return scp.a;
        }
    }

    String a();

    scw a(String str, hpt hpt, String str2);

    boolean a(String str);

    Set<Long> b();
}
