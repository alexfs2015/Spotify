package io.netty.channel;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public final class DefaultChannelId implements ChannelId {
    private static final wyc a;
    private static final Pattern b = Pattern.compile("^(?:[0-9a-fA-F][:-]?){6,8}$");
    private static final byte[] c;
    private static final int d;
    private static final AtomicInteger e = new AtomicInteger();
    private static /* synthetic */ boolean g = false;
    private static final long serialVersionUID = 3884076183504074063L;
    private final byte[] data = new byte[28];
    private transient String f;
    private int hashCode;

    static {
        byte[] bArr;
        int i;
        Class<DefaultChannelId> cls = DefaultChannelId.class;
        g = !cls.desiredAssertionStatus();
        a = wyd.a(cls);
        String b2 = wxu.b("io.netty.processId");
        int i2 = -1;
        if (b2 != null) {
            try {
                i = Integer.parseInt(b2);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i < 0 || i > 4194304) {
                a.c("-Dio.netty.processId: {} (malformed)", (Object) b2);
            } else {
                if (a.b()) {
                    a.b("-Dio.netty.processId: {} (user-set)", (Object) Integer.valueOf(i));
                }
                i2 = i;
            }
        }
        if (i2 < 0) {
            i2 = c();
            if (a.b()) {
                a.b("-Dio.netty.processId: {} (auto-detected)", (Object) Integer.valueOf(i2));
            }
        }
        d = i2;
        byte[] bArr2 = null;
        String b3 = wxu.b("io.netty.machineId");
        if (b3 != null) {
            if (b.matcher(b3).matches()) {
                bArr2 = a(b3);
                a.b("-Dio.netty.machineId: {} (user-set)", (Object) b3);
            } else {
                a.c("-Dio.netty.machineId: {} (malformed)", (Object) b3);
            }
        }
        if (bArr == null) {
            bArr = wxl.a();
            if (bArr == null) {
                bArr = new byte[8];
                ThreadLocalRandom.a().nextBytes(bArr);
                a.c("Failed to find a usable hardware address from the network interfaces; using random bytes: {}", (Object) wxl.a(bArr));
            }
            if (a.b()) {
                a.b("-Dio.netty.machineId: {} (auto-detected)", (Object) wxl.a(bArr));
            }
        }
        c = bArr;
    }

    private DefaultChannelId() {
    }

    private int a(int i, int i2) {
        byte[] bArr = this.data;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        return i6;
    }

    private static byte[] a(String str) {
        String replaceAll = str.replaceAll("[:-]", "");
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < replaceAll.length()) {
            int i2 = i + 2;
            bArr[i] = (byte) Integer.parseInt(replaceAll.substring(i, i2), 16);
            i = i2;
        }
        return bArr;
    }

    public static DefaultChannelId b() {
        DefaultChannelId defaultChannelId = new DefaultChannelId();
        System.arraycopy(c, 0, defaultChannelId.data, 0, 8);
        int a2 = defaultChannelId.a(defaultChannelId.a(8, d), e.getAndIncrement());
        long reverse = Long.reverse(System.nanoTime()) ^ System.currentTimeMillis();
        byte[] bArr = defaultChannelId.data;
        int i = a2 + 1;
        bArr[a2] = (byte) ((int) (reverse >>> 56));
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (reverse >>> 48));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (reverse >>> 40));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (reverse >>> 32));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (reverse >>> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (reverse >>> 16));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (reverse >>> 8));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) reverse);
        int nextInt = ThreadLocalRandom.a().nextInt();
        defaultChannelId.hashCode = nextInt;
        int a3 = defaultChannelId.a(i8, nextInt);
        if (g || a3 == defaultChannelId.data.length) {
            return defaultChannelId;
        }
        throw new AssertionError();
    }

    private static int c() {
        String str;
        int i;
        ClassLoader a2 = PlatformDependent.a(DefaultChannelId.class);
        try {
            Class cls = Class.forName("java.lang.management.ManagementFactory", true, a2);
            Class cls2 = Class.forName("java.lang.management.RuntimeMXBean", true, a2);
            str = (String) cls2.getMethod("getName", wxg.d).invoke(cls.getMethod("getRuntimeMXBean", wxg.d).invoke(null, wxg.c), wxg.c);
        } catch (Exception e2) {
            a.b("Could not invoke ManagementFactory.getRuntimeMXBean().getName(); Android?", (Throwable) e2);
            try {
                str = Class.forName("android.os.Process", true, a2).getMethod("myPid", wxg.d).invoke(null, wxg.c).toString();
            } catch (Exception e3) {
                a.b("Could not invoke Process.myPid(); not Android?", (Throwable) e3);
                str = "";
            }
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i >= 0 && i <= 4194304) {
            return i;
        }
        int nextInt = ThreadLocalRandom.a().nextInt(4194305);
        a.c("Failed to find the current process ID from '{}'; using a random value: {}", str, Integer.valueOf(nextInt));
        return nextInt;
    }

    public final String a() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String a2 = wng.a(this.data, 24, 4);
        this.f = a2;
        return a2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultChannelId)) {
            return false;
        }
        return Arrays.equals(this.data, ((DefaultChannelId) obj).data);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return a();
    }
}
