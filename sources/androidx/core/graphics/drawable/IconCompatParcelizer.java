package androidx.core.graphics.drawable;

public class IconCompatParcelizer {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005b, code lost:
        if (r8 != 5) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(defpackage.sc r8) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.a
            r2 = 1
            int r1 = r8.b(r1, r2)
            r0.a = r1
            byte[] r1 = r0.c
            r3 = 2
            byte[] r1 = r8.b(r1, r3)
            r0.c = r1
            android.os.Parcelable r1 = r0.d
            r4 = 3
            android.os.Parcelable r1 = r8.b(r1, r4)
            r0.d = r1
            int r1 = r0.e
            r5 = 4
            int r1 = r8.b(r1, r5)
            r0.e = r1
            int r1 = r0.f
            r6 = 5
            int r1 = r8.b(r1, r6)
            r0.f = r1
            android.content.res.ColorStateList r1 = r0.g
            r7 = 6
            android.os.Parcelable r1 = r8.b(r1, r7)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.g = r1
            java.lang.String r1 = r0.j
            r7 = 7
            java.lang.String r8 = r8.b(r1, r7)
            r0.j = r8
            java.lang.String r8 = r0.j
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.valueOf(r8)
            r0.i = r8
            int r8 = r0.a
            r1 = -1
            if (r8 == r1) goto L_0x008b
            if (r8 == r2) goto L_0x0073
            if (r8 == r3) goto L_0x0063
            if (r8 == r4) goto L_0x005e
            if (r8 == r5) goto L_0x0063
            if (r8 == r6) goto L_0x0073
            goto L_0x0093
        L_0x005e:
            byte[] r8 = r0.c
            r0.b = r8
            goto L_0x0093
        L_0x0063:
            java.lang.String r8 = new java.lang.String
            byte[] r1 = r0.c
            java.lang.String r2 = "UTF-16"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r8.<init>(r1, r2)
            r0.b = r8
            goto L_0x0093
        L_0x0073:
            android.os.Parcelable r8 = r0.d
            if (r8 == 0) goto L_0x007c
            android.os.Parcelable r8 = r0.d
            r0.b = r8
            goto L_0x0093
        L_0x007c:
            byte[] r8 = r0.c
            r0.b = r8
            r0.a = r4
            r8 = 0
            r0.e = r8
            byte[] r8 = r0.c
            int r8 = r8.length
            r0.f = r8
            goto L_0x0093
        L_0x008b:
            android.os.Parcelable r8 = r0.d
            if (r8 == 0) goto L_0x0094
            android.os.Parcelable r8 = r0.d
            r0.b = r8
        L_0x0093:
            return r0
        L_0x0094:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(sc):androidx.core.graphics.drawable.IconCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r0 != 5) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(androidx.core.graphics.drawable.IconCompat r8, defpackage.sc r9) {
        /*
            android.graphics.PorterDuff$Mode r0 = r8.i
            java.lang.String r0 = r0.name()
            r8.j = r0
            int r0 = r8.a
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = -1
            if (r0 == r6) goto L_0x004d
            if (r0 == r5) goto L_0x0046
            java.lang.String r7 = "UTF-16"
            if (r0 == r4) goto L_0x0037
            if (r0 == r3) goto L_0x0030
            if (r0 == r2) goto L_0x001f
            if (r0 == r1) goto L_0x0046
            goto L_0x0053
        L_0x001f:
            java.lang.Object r0 = r8.b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.c = r0
            goto L_0x0053
        L_0x0030:
            java.lang.Object r0 = r8.b
            byte[] r0 = (byte[]) r0
            r8.c = r0
            goto L_0x0053
        L_0x0037:
            java.lang.Object r0 = r8.b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.c = r0
            goto L_0x0053
        L_0x0046:
            java.lang.Object r0 = r8.b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r8.d = r0
            goto L_0x0053
        L_0x004d:
            java.lang.Object r0 = r8.b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r8.d = r0
        L_0x0053:
            int r0 = r8.a
            if (r6 == r0) goto L_0x005c
            int r0 = r8.a
            r9.a(r0, r5)
        L_0x005c:
            byte[] r0 = r8.c
            if (r0 == 0) goto L_0x0065
            byte[] r0 = r8.c
            r9.a(r0, r4)
        L_0x0065:
            android.os.Parcelable r0 = r8.d
            if (r0 == 0) goto L_0x006e
            android.os.Parcelable r0 = r8.d
            r9.a(r0, r3)
        L_0x006e:
            int r0 = r8.e
            if (r0 == 0) goto L_0x0077
            int r0 = r8.e
            r9.a(r0, r2)
        L_0x0077:
            int r0 = r8.f
            if (r0 == 0) goto L_0x0080
            int r0 = r8.f
            r9.a(r0, r1)
        L_0x0080:
            android.content.res.ColorStateList r0 = r8.g
            if (r0 == 0) goto L_0x008a
            android.content.res.ColorStateList r0 = r8.g
            r1 = 6
            r9.a(r0, r1)
        L_0x008a:
            java.lang.String r0 = r8.j
            if (r0 == 0) goto L_0x0094
            java.lang.String r8 = r8.j
            r0 = 7
            r9.a(r8, r0)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(androidx.core.graphics.drawable.IconCompat, sc):void");
    }
}
