package com.google.common.hash;

import java.io.Serializable;
import java.util.zip.Checksum;

final class ChecksumHashFunction extends fdo implements Serializable {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public final int bits = 32;
    private final fdt<? extends Checksum> checksumSupplier;
    private final String toString;

    final class a extends fdm {
        private final Checksum a;

        /* synthetic */ a(ChecksumHashFunction checksumHashFunction, Checksum checksum, byte b2) {
            this(checksum);
        }

        private a(Checksum checksum) {
            this.a = (Checksum) fay.a(checksum);
        }

        public final void a(byte b2) {
            this.a.update(b2);
        }

        public final void a(byte[] bArr, int i, int i2) {
            this.a.update(bArr, i, i2);
        }

        public final HashCode a() {
            long value = this.a.getValue();
            if (ChecksumHashFunction.this.bits == 32) {
                return HashCode.a((int) value);
            }
            return HashCode.a(value);
        }
    }

    ChecksumHashFunction(fdt<? extends Checksum> fdt, int i, String str) {
        this.checksumSupplier = (fdt) fay.a(fdt);
        fay.a(true, "bits (%s) must be either 32 or 64", 32);
        this.toString = (String) fay.a(str);
    }

    public final int b() {
        return this.bits;
    }

    public final fds a() {
        return new a(this, (Checksum) this.checksumSupplier.get(), 0);
    }

    public final String toString() {
        return this.toString;
    }
}
