package com.spotify.libs.otp.session;

import android.os.Handler;

public final class OtpExpirationHandler extends Handler {
    private final a a;
    private long b;
    private long c;

    /* renamed from: com.spotify.libs.otp.session.OtpExpirationHandler$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[MessageType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.libs.otp.session.OtpExpirationHandler$MessageType[] r0 = com.spotify.libs.otp.session.OtpExpirationHandler.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.libs.otp.session.OtpExpirationHandler$MessageType r1 = com.spotify.libs.otp.session.OtpExpirationHandler.MessageType.EXPIRATION_UPDATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.libs.otp.session.OtpExpirationHandler$MessageType r1 = com.spotify.libs.otp.session.OtpExpirationHandler.MessageType.EXPIRED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.otp.session.OtpExpirationHandler.AnonymousClass1.<clinit>():void");
        }
    }

    enum MessageType {
        EXPIRATION_UPDATE,
        EXPIRED;
        
        static final MessageType[] c = null;

        static {
            c = values();
        }
    }

    public interface a {
        void a();

        void a(float f);
    }

    public OtpExpirationHandler(a aVar) {
        this.a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r7 != 2) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            com.spotify.libs.otp.session.OtpExpirationHandler$MessageType[] r0 = com.spotify.libs.otp.session.OtpExpirationHandler.MessageType.c
            int r7 = r7.what
            r7 = r0[r7]
            int[] r0 = com.spotify.libs.otp.session.OtpExpirationHandler.AnonymousClass1.a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            if (r7 == r0) goto L_0x0015
            r0 = 2
            if (r7 == r0) goto L_0x0032
            goto L_0x003a
        L_0x0015:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.c
            long r0 = r2 - r0
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0032
            long r4 = r6.b
            long r2 = r2 - r4
            float r7 = (float) r2
            float r0 = (float) r0
            float r0 = r0 / r7
            com.spotify.libs.otp.session.OtpExpirationHandler$a r7 = r6.a
            r7.a(r0)
            r6.b()
            return
        L_0x0032:
            r6.a()
            com.spotify.libs.otp.session.OtpExpirationHandler$a r7 = r6.a
            r7.a()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.otp.session.OtpExpirationHandler.handleMessage(android.os.Message):void");
    }

    public final void a(long j, long j2) {
        fay.b(j2 >= j);
        if (j2 <= j) {
            this.a.a();
            return;
        }
        a();
        this.b = j;
        this.c = j2;
        sendEmptyMessageAtTime(MessageType.EXPIRED.ordinal(), j2);
        b();
    }

    public final void a() {
        removeMessages(MessageType.EXPIRATION_UPDATE.ordinal());
        removeMessages(MessageType.EXPIRED.ordinal());
        this.c = 0;
        this.b = 0;
    }

    private void b() {
        sendEmptyMessageDelayed(MessageType.EXPIRATION_UPDATE.ordinal(), 1000);
    }
}
