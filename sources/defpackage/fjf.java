package defpackage;

/* renamed from: fjf reason: default package */
public final class fjf implements fio {
    private final fiu a;

    public fjf(fiu fiu) {
        this.a = fiu;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [fin, fin<?>] */
    /* JADX WARNING: type inference failed for: r8v13, types: [fin] */
    /* JADX WARNING: type inference failed for: r8v14, types: [fin] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.fin<?> a(defpackage.fiu r8, defpackage.fid r9, defpackage.fju<?> r10, defpackage.fip r11) {
        /*
            java.lang.Class r0 = r11.a()
            fju r0 = defpackage.fju.a(r0)
            fiy r8 = r8.a(r0)
            java.lang.Object r8 = r8.a()
            boolean r0 = r8 instanceof defpackage.fin
            if (r0 == 0) goto L_0x0017
            fin r8 = (defpackage.fin) r8
            goto L_0x0072
        L_0x0017:
            boolean r0 = r8 instanceof defpackage.fio
            if (r0 == 0) goto L_0x0022
            fio r8 = (defpackage.fio) r8
            fin r8 = r8.a(r9, r10)
            goto L_0x0072
        L_0x0022:
            boolean r0 = r8 instanceof defpackage.fim
            if (r0 != 0) goto L_0x0058
            boolean r1 = r8 instanceof defpackage.fig
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
            fim r0 = (defpackage.fim) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r8 instanceof defpackage.fig
            if (r0 == 0) goto L_0x0068
            r1 = r8
            fig r1 = (defpackage.fig) r1
        L_0x0068:
            r4 = r1
            fjn r8 = new fjn
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r8 == 0) goto L_0x007e
            boolean r9 = r11.b()
            if (r9 == 0) goto L_0x007e
            fin r8 = r8.a()
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjf.a(fiu, fid, fju, fip):fin");
    }

    public final <T> fin<T> a(fid fid, fju<T> fju) {
        fip fip = (fip) fju.a.getAnnotation(fip.class);
        if (fip == null) {
            return null;
        }
        return a(this.a, fid, fju, fip);
    }
}
