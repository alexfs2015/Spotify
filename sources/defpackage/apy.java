package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.util.ArrayList;

/* renamed from: apy reason: default package */
public class apy implements aqr {
    private final Context a;
    private final asd<ash> b;
    private final int c;
    private final long d;

    /* access modifiers changed from: protected */
    public void a(ArrayList<aqo> arrayList) {
    }

    public apy(Context context) {
        this(context, 0);
    }

    public apy(Context context, int i) {
        this(context, i, 5000);
    }

    private apy(Context context, int i, long j) {
        this.a = context;
        this.c = i;
        this.d = 5000;
        this.b = null;
    }

    public aqo[] a(Handler handler, beg beg, arc arc, azq azq, awe awe, asd<ash> asd) {
        asd<ash> asd2 = asd == null ? null : asd;
        ArrayList arrayList = new ArrayList();
        asd<ash> asd3 = asd2;
        a(this.a, asd3, this.d, handler, beg, this.c, arrayList);
        a(this.a, asd3, new AudioProcessor[0], handler, arc, this.c, arrayList);
        arrayList.add(new azr(azq, handler.getLooper()));
        arrayList.add(new awf(awe, handler.getLooper()));
        arrayList.add(new bei());
        a(arrayList);
        return (aqo[]) arrayList.toArray(new aqo[arrayList.size()]);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, asd<ash> asd, long j, Handler handler, beg beg, int i, ArrayList<aqo> arrayList) {
        int i2 = i;
        ArrayList<aqo> arrayList2 = arrayList;
        bec bec = new bec(context, avy.a, j, asd, false, handler, beg, 50);
        arrayList2.add(bec);
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (aqo) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, beg.class, Integer.TYPE}).newInstance(new Object[]{Boolean.TRUE, Long.valueOf(j), handler, beg, Integer.valueOf(50)}));
                bdd.b("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:19:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r14, defpackage.asd<defpackage.ash> r15, com.google.android.exoplayer2.audio.AudioProcessor[] r16, android.os.Handler r17, defpackage.arc r18, int r19, java.util.ArrayList<defpackage.aqo> r20) {
        /*
            r13 = this;
            r0 = r19
            r10 = r20
            java.lang.String r11 = "DefaultRenderersFactory"
            ark r12 = new ark
            avy r3 = defpackage.avy.a
            aqz r8 = defpackage.aqz.a(r14)
            r5 = 0
            r1 = r12
            r2 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.add(r12)
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            int r1 = r20.size()
            r2 = 2
            if (r0 != r2) goto L_0x002a
            int r1 = r1 + -1
        L_0x002a:
            r0 = 0
            r3 = 3
            r4 = 1
            java.lang.String r5 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            java.lang.Class<arc> r7 = defpackage.arc.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r7 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r6[r2] = r7     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            r6[r0] = r17     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            r6[r4] = r18     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            r6[r2] = r16     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            aqo r5 = (defpackage.aqo) r5     // Catch:{ ClassNotFoundException -> 0x0067, Exception -> 0x005e }
            int r6 = r1 + 1
            r10.add(r1, r5)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
            java.lang.String r1 = "Loaded LibopusAudioRenderer."
            defpackage.bdd.b(r11, r1)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
            goto L_0x0068
        L_0x005e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0067:
            r6 = r1
        L_0x0068:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class<arc> r7 = defpackage.arc.class
            r5[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r7 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r5[r2] = r7     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r0] = r17     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r4] = r18     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r2] = r16     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Object r1 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            aqo r1 = (defpackage.aqo) r1     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            int r5 = r6 + 1
            r10.add(r6, r1)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x0099 }
            java.lang.String r1 = "Loaded LibflacAudioRenderer."
            defpackage.bdd.b(r11, r1)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a2:
            r5 = r6
        L_0x00a3:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.Class<arc> r7 = defpackage.arc.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r7 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r6[r2] = r7     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            r3[r0] = r17     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            r3[r4] = r18     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            r3[r2] = r16     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.Object r0 = r1.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            aqo r0 = (defpackage.aqo) r0     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            r10.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            defpackage.bdd.b(r11, r0)     // Catch:{ ClassNotFoundException -> 0x00db, Exception -> 0x00d2 }
            return
        L_0x00d2:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apy.a(android.content.Context, asd, com.google.android.exoplayer2.audio.AudioProcessor[], android.os.Handler, arc, int, java.util.ArrayList):void");
    }
}
