package com.google.common.hash;

import java.io.Serializable;
import java.util.zip.Checksum;

final class ChecksumHashFunction extends feg implements Serializable {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public final int bits = 32;
    private final fel<? extends Checksum> checksumSupplier;
    private final String toString;

    final class a extends fee {
        private final Checksum a;

        private a(Checksum checksum) {
            this.a = (Checksum) fbp.a(checksum);
        }

        /* synthetic */ a(ChecksumHashFunction checksumHashFunction, Checksum checksum, byte b2) {
            this(checksum);
        }

        public final HashCode a() {
            long value = this.a.getValue();
            return ChecksumHashFunction.this.bits == 32 ? HashCode.a((int) value) : HashCode.a(value);
        }

        public final void a(byte b2) {
            this.a.update(b2);
        }

        public final void a(byte[] bArr, int i, int i2) {
            this.a.update(bArr, i, i2);
        }
    }

    ChecksumHashFunction(fel<? extends Checksum> fel, int i, String str) {
        this.checksumSupplier = (fel) fbp.a(fel);
        fbp.a(true, "bits (%s) must be either 32 or 64", 32);
        this.toString = (String) fbp.a(str);
    }

    public final fek a() {
        return new a(this, (Checksum) this.checksumSupplier.get(), 0);
    }

    public final int b() {
        return this.bits;
    }

    public final String toString() {
        return this.toString;
    }
}
