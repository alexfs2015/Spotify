package defpackage;

import com.google.protobuf.ByteString;

/* renamed from: fle reason: default package */
public class fle {
    private ByteString a;
    private volatile fli b;
    private volatile ByteString c;

    static {
        fky.a();
    }

    private ByteString a() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                ByteString byteString = this.c;
                return byteString;
            }
            if (this.b == null) {
                this.c = ByteString.a;
            } else {
                this.c = this.b.a();
            }
            ByteString byteString2 = this.c;
            return byteString2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(defpackage.fli r2) {
        /*
            r1 = this;
            fli r0 = r1.b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            fli r0 = r1.b     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x000c:
            r1.b = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.a     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.c = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.b = r2     // Catch:{ all -> 0x001b }
            com.google.protobuf.ByteString r2 = com.google.protobuf.ByteString.a     // Catch:{ all -> 0x001b }
            r1.c = r2     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fle.c(fli):void");
    }

    public final fli a(fli fli) {
        c(fli);
        return this.b;
    }

    public final int b() {
        if (this.c != null) {
            return this.c.b();
        }
        if (this.b != null) {
            return this.b.j();
        }
        return 0;
    }

    public final fli b(fli fli) {
        fli fli2 = this.b;
        this.a = null;
        this.c = null;
        this.b = fli;
        return fli2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fle)) {
            return false;
        }
        fle fle = (fle) obj;
        fli fli = this.b;
        fli fli2 = fle.b;
        return (fli == null && fli2 == null) ? a().equals(fle.a()) : (fli == null || fli2 == null) ? fli != null ? fli.equals(fle.a(fli.i())) : a(fli2.i()).equals(fli2) : fli.equals(fli2);
    }

    public int hashCode() {
        return 1;
    }
}
