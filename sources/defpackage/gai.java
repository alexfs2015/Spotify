package defpackage;

import android.os.Build.VERSION;
import android.os.StatFs;
import java.io.IOException;

/* renamed from: gai reason: default package */
public final class gai {
    private StatFs a;

    public gai() {
    }

    public gai(String str) {
        try {
            this.a = new StatFs(str);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
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

    private long c() {
        if (VERSION.SDK_INT >= 18) {
            return this.a.getBlockSizeLong();
        }
        return (long) this.a.getBlockSize();
    }

    public final long a() {
        long j;
        if (VERSION.SDK_INT >= 18) {
            j = this.a.getBlockCountLong();
        } else {
            j = (long) this.a.getBlockCount();
        }
        return j * c();
    }

    public final long b() {
        long j;
        if (VERSION.SDK_INT >= 18) {
            j = this.a.getAvailableBlocksLong();
        } else {
            j = (long) this.a.getAvailableBlocks();
        }
        return j * c();
    }
}
