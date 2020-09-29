package defpackage;

import com.google.protobuf.ByteString;

/* renamed from: fkk reason: default package */
public class fkk {
    private ByteString a;
    private volatile fko b;
    private volatile ByteString c;

    public int hashCode() {
        return 1;
    }

    static {
        fke.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkk)) {
            return false;
        }
        fkk fkk = (fkk) obj;
        fko fko = this.b;
        fko fko2 = fkk.b;
        if (fko == null && fko2 == null) {
            return a().equals(fkk.a());
        }
        if (fko != null && fko2 != null) {
            return fko.equals(fko2);
        }
        if (fko != null) {
            return fko.equals(fkk.a(fko.i()));
        }
        return a(fko2.i()).equals(fko2);
    }

    public final fko a(fko fko) {
        c(fko);
        return this.b;
    }

    public final fko b(fko fko) {
        fko fko2 = this.b;
        this.a = null;
        this.c = null;
        this.b = fko;
        return fko2;
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
    private void c(defpackage.fko r2) {
        /*
            r1 = this;
            fko r0 = r1.b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            fko r0 = r1.b     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkk.c(fko):void");
    }
}
