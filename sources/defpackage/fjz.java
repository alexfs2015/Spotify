package defpackage;

/* renamed from: fjz reason: default package */
public final class fjz implements fji {
    private final fjo a;

    public fjz(fjo fjo) {
        this.a = fjo;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [fjh<?>, fjh] */
    /* JADX WARNING: type inference failed for: r8v13, types: [fjh] */
    /* JADX WARNING: type inference failed for: r8v14, types: [fjh] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.fjh<?> a(defpackage.fjo r8, defpackage.fix r9, defpackage.fko<?> r10, defpackage.fjj r11) {
        /*
            java.lang.Class r0 = r11.a()
            fko r0 = defpackage.fko.a(r0)
            fjs r8 = r8.a(r0)
            java.lang.Object r8 = r8.a()
            boolean r0 = r8 instanceof defpackage.fjh
            if (r0 == 0) goto L_0x0017
            fjh r8 = (defpackage.fjh) r8
            goto L_0x0072
        L_0x0017:
            boolean r0 = r8 instanceof defpackage.fji
            if (r0 == 0) goto L_0x0022
            fji r8 = (defpackage.fji) r8
            fjh r8 = r8.a(r9, r10)
            goto L_0x0072
        L_0x0022:
            boolean r0 = r8 instanceof defpackage.fjg
            if (r0 != 0) goto L_0x0058
            boolean r1 = r8 instanceof defpackage.fja
            if (r1 == 0) goto L_0x002b
            goto L_0x0058
        L_0x002b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r11.<init>(r0)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L_0x0058:
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0 = r8
            fjg r0 = (defpackage.fjg) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r8 instanceof defpackage.fja
            if (r0 == 0) goto L_0x0068
            r1 = r8
            fja r1 = (defpackage.fja) r1
        L_0x0068:
            r4 = r1
            fkh r8 = new fkh
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r8 == 0) goto L_0x007e
            boolean r9 = r11.b()
            if (r9 == 0) goto L_0x007e
            fjh r8 = r8.a()
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjz.a(fjo, fix, fko, fjj):fjh");
    }

    public final <T> fjh<T> a(fix fix, fko<T> fko) {
        fjj fjj = (fjj) fko.a.getAnnotation(fjj.class);
        if (fjj == null) {
            return null;
        }
        return a(this.a, fix, fko, fjj);
    }
}
