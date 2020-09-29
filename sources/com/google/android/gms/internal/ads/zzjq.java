package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

@cfp
public final class zzjq {
    public final bfi[] a;
    public final String b;

    public zzjq(Context context, AttributeSet attributeSet) {
        IllegalArgumentException illegalArgumentException;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a.a);
        String string = obtainAttributes.getString(a.b);
        String string2 = obtainAttributes.getString(a.c);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.a = a(string);
        } else if (!z && z2) {
            this.a = a(string2);
        } else if (z) {
            illegalArgumentException = new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            throw illegalArgumentException;
        } else {
            illegalArgumentException = new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            throw illegalArgumentException;
        }
        this.b = obtainAttributes.getString(a.d);
        if (TextUtils.isEmpty(this.b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static bfi[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        bfi[] bfiArr = new bfi[split.length];
        int i = 0;
        while (true) {
            String str2 = "Could not parse XML attribute \"adSize\": ";
            if (i < split.length) {
                String trim = split[i].trim();
                if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                    String[] split2 = trim.split("[xX]");
                    split2[0] = split2[0].trim();
                    split2[1] = split2[1].trim();
                    try {
                        bfiArr[i] = new bfi("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                    } catch (NumberFormatException unused) {
                        String valueOf = String.valueOf(trim);
                        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                } else if ("BANNER".equals(trim)) {
                    bfiArr[i] = bfi.a;
                } else if ("LARGE_BANNER".equals(trim)) {
                    bfiArr[i] = bfi.c;
                } else if ("FULL_BANNER".equals(trim)) {
                    bfiArr[i] = bfi.b;
                } else if ("LEADERBOARD".equals(trim)) {
                    bfiArr[i] = bfi.d;
                } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                    bfiArr[i] = bfi.e;
                } else if ("SMART_BANNER".equals(trim)) {
                    bfiArr[i] = bfi.g;
                } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                    bfiArr[i] = bfi.f;
                } else if ("FLUID".equals(trim)) {
                    bfiArr[i] = bfi.h;
                } else if ("ICON".equals(trim)) {
                    bfiArr[i] = bfi.i;
                } else {
                    String valueOf2 = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                }
                i++;
            } else if (bfiArr.length != 0) {
                return bfiArr;
            } else {
                String valueOf3 = String.valueOf(str);
                throw new IllegalArgumentException(valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2));
            }
        }
    }
}
