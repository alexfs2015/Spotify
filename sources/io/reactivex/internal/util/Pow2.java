package io.reactivex.internal.util;

public final class Pow2 {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
