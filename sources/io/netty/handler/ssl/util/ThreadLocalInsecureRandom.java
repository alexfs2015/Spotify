package io.netty.handler.ssl.util;

import io.netty.util.internal.ThreadLocalRandom;
import java.security.SecureRandom;

public final class ThreadLocalInsecureRandom extends SecureRandom {
    private static final SecureRandom a = new ThreadLocalInsecureRandom();
    private static final long serialVersionUID = -8209473337192526191L;

    private ThreadLocalInsecureRandom() {
    }

    public static SecureRandom a() {
        return a;
    }

    public final byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        ThreadLocalRandom.a().nextBytes(bArr);
        return bArr;
    }

    public final String getAlgorithm() {
        return "insecure";
    }

    public final boolean nextBoolean() {
        return ThreadLocalRandom.a().nextBoolean();
    }

    public final void nextBytes(byte[] bArr) {
        ThreadLocalRandom.a().nextBytes(bArr);
    }

    public final double nextDouble() {
        return ThreadLocalRandom.a().nextDouble();
    }

    public final float nextFloat() {
        return ThreadLocalRandom.a().nextFloat();
    }

    public final double nextGaussian() {
        return ThreadLocalRandom.a().nextGaussian();
    }

    public final int nextInt() {
        return ThreadLocalRandom.a().nextInt();
    }

    public final int nextInt(int i) {
        return ThreadLocalRandom.a().nextInt(i);
    }

    public final long nextLong() {
        return ThreadLocalRandom.a().nextLong();
    }

    public final void setSeed(long j) {
    }

    public final void setSeed(byte[] bArr) {
    }
}
