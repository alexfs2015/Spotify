package com.google.android.gms.internal.measurement;

public final class zzyy extends IllegalArgumentException {
    public zzyy(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
