package defpackage;

import android.os.Build.VERSION;
import android.os.StatFs;
import java.io.IOException;

/* renamed from: gbc reason: default package */
public final class gbc {
    private StatFs a;

    public gbc() {
    }

    public gbc(String str) {
        try {
            this.a = new StatFs(str);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    private long c() {
        return VERSION.SDK_INT >= 18 ? this.a.getBlockSizeLong() : (long) this.a.getBlockSize();
    }

    public final long a() {
        return (VERSION.SDK_INT >= 18 ? this.a.getBlockCountLong() : (long) this.a.getBlockCount()) * c();
    }

    public final void a(String str) {
        try {
            if (this.a == null) {
                this.a = new StatFs(str);
            } else {
                this.a.restat(str);
            }
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    public final long b() {
        return (VERSION.SDK_INT >= 18 ? this.a.getAvailableBlocksLong() : (long) this.a.getAvailableBlocks()) * c();
    }
}
