package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class MediaCodecUtil {
    private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    private static final e b = new e(0);
    private static final HashMap<a, List<avx>> c = new HashMap<>();
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final Map<String, Integer> f;
    private static final SparseIntArray g;
    private static int h = -1;

    public static class DecoderQueryException extends Exception {
        /* synthetic */ DecoderQueryException(Throwable th, byte b) {
            this(th);
        }

        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final int hashCode() {
            String str = this.a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                return TextUtils.equals(this.a, aVar.a) && this.b == aVar.b;
            }
        }
    }

    interface b {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, CodecCapabilities codecCapabilities);

        boolean b();
    }

    static final class c implements b {
        public final boolean b() {
            return false;
        }

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        public final MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public final boolean a(String str, CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    static final class d implements b {
        private final int a;
        private MediaCodecInfo[] b;

        public final boolean b() {
            return true;
        }

        public d(boolean z) {
            this.a = z ? 1 : 0;
        }

        public final int a() {
            c();
            return this.b.length;
        }

        public final MediaCodecInfo a(int i) {
            c();
            return this.b[i];
        }

        public final boolean a(String str, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }
    }

    static final class e implements Comparator<avx> {
        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return a((avx) obj) - a((avx) obj2);
        }

        private static int a(avx avx) {
            String str = avx.a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return -1;
            }
            return (bdw.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        d.put(77, 2);
        d.put(88, 4);
        d.put(100, 8);
        d.put(110, 16);
        d.put(122, 32);
        d.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        e.put(11, 4);
        e.put(12, 8);
        e.put(13, 16);
        e.put(20, 32);
        e.put(21, 64);
        e.put(22, 128);
        e.put(30, 256);
        e.put(31, 512);
        e.put(32, 1024);
        e.put(40, 2048);
        e.put(41, 4096);
        e.put(42, 8192);
        e.put(50, 16384);
        e.put(51, 32768);
        e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("L30", Integer.valueOf(1));
        f.put("L60", Integer.valueOf(4));
        f.put("L63", Integer.valueOf(16));
        f.put("L90", Integer.valueOf(64));
        f.put("L93", Integer.valueOf(256));
        f.put("L120", Integer.valueOf(1024));
        f.put("L123", Integer.valueOf(4096));
        f.put("L150", Integer.valueOf(16384));
        f.put("L153", Integer.valueOf(65536));
        f.put("L156", Integer.valueOf(262144));
        f.put("L180", Integer.valueOf(1048576));
        f.put("L183", Integer.valueOf(4194304));
        f.put("L186", Integer.valueOf(16777216));
        f.put("H30", Integer.valueOf(2));
        f.put("H60", Integer.valueOf(8));
        f.put("H63", Integer.valueOf(32));
        f.put("H90", Integer.valueOf(128));
        f.put("H93", Integer.valueOf(512));
        f.put("H120", Integer.valueOf(2048));
        f.put("H123", Integer.valueOf(8192));
        f.put("H150", Integer.valueOf(32768));
        f.put("H153", Integer.valueOf(131072));
        f.put("H156", Integer.valueOf(524288));
        f.put("H180", Integer.valueOf(2097152));
        f.put("H183", Integer.valueOf(8388608));
        f.put("H186", Integer.valueOf(33554432));
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        g = sparseIntArray3;
        sparseIntArray3.put(1, 1);
        g.put(2, 2);
        g.put(3, 3);
        g.put(4, 4);
        g.put(5, 5);
        g.put(6, 6);
        g.put(17, 17);
        g.put(20, 20);
        g.put(23, 23);
        g.put(29, 29);
        g.put(39, 39);
        g.put(42, 42);
    }

    public static avx a() {
        avx b2 = b("audio/raw", false);
        if (b2 == null) {
            return null;
        }
        avx avx = new avx(b2.a, null, null, true, false, false);
        return avx;
    }

    private static avx b(String str, boolean z) {
        List a2 = a(str, false);
        if (a2.isEmpty()) {
            return null;
        }
        return (avx) a2.get(0);
    }

    public static synchronized List<avx> a(String str, boolean z) {
        synchronized (MediaCodecUtil.class) {
            a aVar = new a(str, z);
            List<avx> list = (List) c.get(aVar);
            if (list != null) {
                return list;
            }
            b dVar = bdw.a >= 21 ? new d(z) : new c(0);
            ArrayList a2 = a(aVar, dVar, str);
            if (z && a2.isEmpty() && 21 <= bdw.a && bdw.a <= 23) {
                dVar = new c(0);
                a2 = a(aVar, dVar, str);
                if (!a2.isEmpty()) {
                    StringBuilder sb = new StringBuilder("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(((avx) a2.get(0)).a);
                    bdd.c("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                a2.addAll(a(new a("audio/eac3", aVar.b), dVar, str));
            }
            if ("audio/raw".equals(str)) {
                Collections.sort(a2, b);
            }
            List<avx> unmodifiableList = Collections.unmodifiableList(a2);
            c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int b() {
        int i;
        if (h == -1) {
            int i2 = 0;
            avx b2 = b("video/avc", false);
            if (b2 != null) {
                CodecProfileLevel[] a2 = b2.a();
                int length = a2.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = a2[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case defpackage.eu.b.bs /*64*/:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, bdw.a >= 21 ? 345600 : 172800);
            }
            h = i2;
        }
        return h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r3.equals("hev1") != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r10.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            switch(r5) {
                case 3006243: goto L_0x0041;
                case 3006244: goto L_0x0037;
                case 3199032: goto L_0x002e;
                case 3214780: goto L_0x0024;
                case 3356560: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x004b
        L_0x001a:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = 4
            goto L_0x004c
        L_0x0024:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = 1
            goto L_0x004c
        L_0x002e:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x0037:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = 3
            goto L_0x004c
        L_0x0041:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = 2
            goto L_0x004c
        L_0x004b:
            r2 = -1
        L_0x004c:
            if (r2 == 0) goto L_0x0061
            if (r2 == r9) goto L_0x0061
            if (r2 == r8) goto L_0x005c
            if (r2 == r7) goto L_0x005c
            if (r2 == r6) goto L_0x0057
            return r0
        L_0x0057:
            android.util.Pair r10 = b(r10, r1)
            return r10
        L_0x005c:
            android.util.Pair r10 = a(r10, r1)
            return r10
        L_0x0061:
            int r2 = r1.length
            java.lang.String r3 = "Ignoring malformed HEVC codec string: "
            java.lang.String r4 = "MediaCodecUtil"
            if (r2 >= r6) goto L_0x0078
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            defpackage.bdd.c(r4, r10)
            return r0
        L_0x0078:
            java.util.regex.Pattern r2 = a
            r5 = r1[r9]
            java.util.regex.Matcher r2 = r2.matcher(r5)
            boolean r5 = r2.matches()
            if (r5 != 0) goto L_0x0096
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            defpackage.bdd.c(r4, r10)
            return r0
        L_0x0096:
            java.lang.String r10 = r2.group(r9)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x00a4
            r8 = 1
            goto L_0x00ac
        L_0x00a4:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x00d8
        L_0x00ac:
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f
            r1 = r1[r7]
            java.lang.Object r10 = r10.get(r1)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x00ce
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown HEVC level string: "
            r10.<init>(r1)
            java.lang.String r1 = r2.group(r9)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            defpackage.bdd.c(r4, r10)
            return r0
        L_0x00ce:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0.<init>(r1, r10)
            return r0
        L_0x00d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown HEVC profile string: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            defpackage.bdd.c(r4, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.a(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x025e A[Catch:{ Exception -> 0x0347 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02ab A[Catch:{ Exception -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02f2 A[SYNTHETIC, Splitter:B:206:0x02f2] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x030f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x033c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<defpackage.avx> a(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.a r18, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b r19, java.lang.String r20) {
        /*
            r1 = r18
            r2 = r19
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0347 }
            r4.<init>()     // Catch:{ Exception -> 0x0347 }
            java.lang.String r5 = r1.a     // Catch:{ Exception -> 0x0347 }
            int r6 = r19.a()     // Catch:{ Exception -> 0x0347 }
            boolean r7 = r19.b()     // Catch:{ Exception -> 0x0347 }
            r8 = 0
        L_0x0014:
            if (r8 >= r6) goto L_0x0346
            android.media.MediaCodecInfo r9 = r2.a(r8)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x0347 }
            java.lang.String r11 = ".secure"
            if (r0 != 0) goto L_0x0065
            if (r7 != 0) goto L_0x002f
            boolean r0 = r10.endsWith(r11)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0065
        L_0x002f:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            r13 = 21
            if (r0 >= r13) goto L_0x0069
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0069
        L_0x0065:
            r13 = r20
            goto L_0x025b
        L_0x0069:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            r13 = 18
            if (r0 >= r13) goto L_0x0078
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0078
            goto L_0x0065
        L_0x0078:
            java.lang.String r0 = "OMX.SEC.mp3.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "SM-T530"
            java.lang.String r14 = defpackage.bdw.d     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x008b
            goto L_0x0065
        L_0x008b:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            if (r0 >= r13) goto L_0x00b6
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "a70"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "Xiaomi"
            java.lang.String r13 = defpackage.bdw.c     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r13 = "HM"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x00b6
            goto L_0x0065
        L_0x00b6:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            r13 = 16
            if (r0 != r13) goto L_0x013e
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x013e
            java.lang.String r0 = "dlxu"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "protou"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "ville"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "villeplus"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "villec2"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r14 = "gee"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "C6602"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "C6603"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "C6606"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "C6616"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "L36h"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "SO-02E"
            java.lang.String r14 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x013e
            goto L_0x0065
        L_0x013e:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            if (r0 != r13) goto L_0x0174
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0174
            java.lang.String r0 = "C1504"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "C1505"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "C1604"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "C1605"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0174
            goto L_0x0065
        L_0x0174:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            r13 = 24
            java.lang.String r14 = "samsung"
            if (r0 >= r13) goto L_0x01e6
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x018c
            java.lang.String r0 = "OMX.Exynos.AAC.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x01e6
        L_0x018c:
            java.lang.String r0 = defpackage.bdw.c     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r14.equals(r0)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r13 = "zeroflte"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r13 = "zerolte"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r13 = "zenlte"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "SC-05G"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "marinelteatt"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "404SC"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "SC-04G"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "SCV31"
            java.lang.String r13 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x01e6
            goto L_0x0065
        L_0x01e6:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            java.lang.String r13 = "jflte"
            r15 = 19
            if (r0 > r15) goto L_0x0230
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0230
            java.lang.String r0 = defpackage.bdw.c     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r14.equals(r0)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0230
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r14 = "d2"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r14 = "serrano"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r14 = "santos"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            java.lang.String r14 = "t0"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0230
            goto L_0x0065
        L_0x0230:
            int r0 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            if (r0 > r15) goto L_0x0246
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0246
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0246
            goto L_0x0065
        L_0x0246:
            java.lang.String r0 = "audio/eac3-joc"
            r13 = r20
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0259
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x0259
            goto L_0x025b
        L_0x0259:
            r0 = 1
            goto L_0x025c
        L_0x025b:
            r0 = 0
        L_0x025c:
            if (r0 == 0) goto L_0x033c
            java.lang.String[] r14 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x0347 }
            int r15 = r14.length     // Catch:{ Exception -> 0x0347 }
            r12 = 0
        L_0x0264:
            if (r12 >= r15) goto L_0x033c
            r3 = r14[r12]     // Catch:{ Exception -> 0x0347 }
            boolean r0 = r3.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x032e
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x02e4 }
            r16 = r6
            boolean r6 = r2.a(r5, r0)     // Catch:{ Exception -> 0x02e2 }
            int r2 = defpackage.bdw.a     // Catch:{ Exception -> 0x02e2 }
            r17 = r9
            r9 = 22
            if (r2 > r9) goto L_0x02a8
            java.lang.String r2 = "ODROID-XU3"
            java.lang.String r9 = defpackage.bdw.d     // Catch:{ Exception -> 0x02a6 }
            boolean r2 = r2.equals(r9)     // Catch:{ Exception -> 0x02a6 }
            if (r2 != 0) goto L_0x0294
            java.lang.String r2 = "Nexus 10"
            java.lang.String r9 = defpackage.bdw.d     // Catch:{ Exception -> 0x02a6 }
            boolean r2 = r2.equals(r9)     // Catch:{ Exception -> 0x02a6 }
            if (r2 == 0) goto L_0x02a8
        L_0x0294:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x02a6 }
            if (r2 != 0) goto L_0x02a4
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x02a6 }
            if (r2 == 0) goto L_0x02a8
        L_0x02a4:
            r2 = 1
            goto L_0x02a9
        L_0x02a6:
            r0 = move-exception
            goto L_0x02e9
        L_0x02a8:
            r2 = 0
        L_0x02a9:
            if (r7 == 0) goto L_0x02b2
            boolean r9 = r1.b     // Catch:{ Exception -> 0x02a6 }
            if (r9 == r6) goto L_0x02b0
            goto L_0x02b2
        L_0x02b0:
            r6 = 0
            goto L_0x02b9
        L_0x02b2:
            if (r7 != 0) goto L_0x02c2
            boolean r9 = r1.b     // Catch:{ Exception -> 0x02a6 }
            if (r9 != 0) goto L_0x02c2
            goto L_0x02b0
        L_0x02b9:
            avx r0 = defpackage.avx.a(r10, r5, r0, r2, r6)     // Catch:{ Exception -> 0x02a6 }
            r4.add(r0)     // Catch:{ Exception -> 0x02a6 }
            goto L_0x0332
        L_0x02c2:
            if (r7 != 0) goto L_0x02e0
            if (r6 == 0) goto L_0x02e0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a6 }
            r6.<init>()     // Catch:{ Exception -> 0x02a6 }
            r6.append(r10)     // Catch:{ Exception -> 0x02a6 }
            r6.append(r11)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02a6 }
            r9 = 1
            avx r0 = defpackage.avx.a(r6, r5, r0, r2, r9)     // Catch:{ Exception -> 0x02de }
            r4.add(r0)     // Catch:{ Exception -> 0x02de }
            return r4
        L_0x02de:
            r0 = move-exception
            goto L_0x02ea
        L_0x02e0:
            r9 = 1
            goto L_0x0332
        L_0x02e2:
            r0 = move-exception
            goto L_0x02e7
        L_0x02e4:
            r0 = move-exception
            r16 = r6
        L_0x02e7:
            r17 = r9
        L_0x02e9:
            r9 = 1
        L_0x02ea:
            int r2 = defpackage.bdw.a     // Catch:{ Exception -> 0x0347 }
            r6 = 23
            java.lang.String r9 = "MediaCodecUtil"
            if (r2 > r6) goto L_0x030f
            boolean r2 = r4.isEmpty()     // Catch:{ Exception -> 0x0347 }
            if (r2 != 0) goto L_0x030f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0347 }
            java.lang.String r2 = "Skipping codec "
            r0.<init>(r2)     // Catch:{ Exception -> 0x0347 }
            r0.append(r10)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r2 = " (failed to query capabilities)"
            r0.append(r2)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0347 }
            defpackage.bdd.d(r9, r0)     // Catch:{ Exception -> 0x0347 }
            goto L_0x0332
        L_0x030f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0347 }
            java.lang.String r2 = "Failed to query codec "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0347 }
            r1.append(r10)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch:{ Exception -> 0x0347 }
            r1.append(r3)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0347 }
            defpackage.bdd.d(r9, r1)     // Catch:{ Exception -> 0x0347 }
            throw r0     // Catch:{ Exception -> 0x0347 }
        L_0x032e:
            r16 = r6
            r17 = r9
        L_0x0332:
            int r12 = r12 + 1
            r2 = r19
            r6 = r16
            r9 = r17
            goto L_0x0264
        L_0x033c:
            r16 = r6
            int r8 = r8 + 1
            r2 = r19
            r6 = r16
            goto L_0x0014
        L_0x0346:
            return r4
        L_0x0347:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            r2 = 0
            r1.<init>(r0, r2)
            goto L_0x0350
        L_0x034f:
            throw r1
        L_0x0350:
            goto L_0x034f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.a(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$a, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b, java.lang.String):java.util.ArrayList");
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        Integer num;
        Integer num2;
        String str2 = "Ignoring malformed AVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 2) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            bdd.c(str3, sb.toString());
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                num2 = valueOf;
            } else if (strArr.length >= 3) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                StringBuilder sb2 = new StringBuilder(str2);
                sb2.append(str);
                bdd.c(str3, sb2.toString());
                return null;
            }
            int i = d.get(num2.intValue(), -1);
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Unknown AVC profile: ");
                sb3.append(num2);
                bdd.c(str3, sb3.toString());
                return null;
            }
            int i2 = e.get(num.intValue(), -1);
            if (i2 != -1) {
                return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
            }
            StringBuilder sb4 = new StringBuilder("Unknown AVC level: ");
            sb4.append(num);
            bdd.c(str3, sb4.toString());
            return null;
        } catch (NumberFormatException unused) {
            StringBuilder sb5 = new StringBuilder(str2);
            sb5.append(str);
            bdd.c(str3, sb5.toString());
            return null;
        }
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        String str2 = "Ignoring malformed MP4A codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length != 3) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            bdd.c(str3, sb.toString());
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(bdg.a(Integer.parseInt(strArr[1], 16)))) {
                int i = g.get(Integer.parseInt(strArr[2]), -1);
                if (i != -1) {
                    return new Pair<>(Integer.valueOf(i), Integer.valueOf(0));
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(str);
            bdd.c(str3, sb2.toString());
        }
        return null;
    }
}
