package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bae reason: default package */
public final class bae extends azj {
    private static final Pattern c = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private final boolean d;
    private int e;
    private int f;
    private int g;
    private int h;

    public bae() {
        this(null);
    }

    public bae(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.d = false;
            return;
        }
        this.d = true;
        String a = bdw.a((byte[]) list.get(0));
        bcu.a(a.startsWith("Format: "));
        a(a);
        a(new bdj((byte[]) list.get(1)));
    }

    private static void a(bdj bdj) {
        String r;
        do {
            r = bdj.r();
            if (r == null) {
                return;
            }
        } while (!r.startsWith("[Events]"));
    }

    private void a(bdj bdj, List<azi> list, bde bde) {
        long j;
        while (true) {
            String r = bdj.r();
            if (r == null) {
                return;
            }
            if (!this.d && r.startsWith("Format: ")) {
                a(r);
            } else if (r.startsWith("Dialogue: ")) {
                String str = "SsaDecoder";
                if (this.e == 0) {
                    StringBuilder sb = new StringBuilder("Skipping dialogue line before complete format: ");
                    sb.append(r);
                    bdd.c(str, sb.toString());
                } else {
                    String[] split = r.substring(10).split(",", this.e);
                    if (split.length != this.e) {
                        StringBuilder sb2 = new StringBuilder("Skipping dialogue line with fewer columns than format: ");
                        sb2.append(r);
                        bdd.c(str, sb2.toString());
                    } else {
                        long b = b(split[this.f]);
                        String str2 = "Skipping invalid timing: ";
                        if (b == -9223372036854775807L) {
                            StringBuilder sb3 = new StringBuilder(str2);
                            sb3.append(r);
                            bdd.c(str, sb3.toString());
                        } else {
                            String str3 = split[this.g];
                            if (!str3.trim().isEmpty()) {
                                j = b(str3);
                                if (j == -9223372036854775807L) {
                                    StringBuilder sb4 = new StringBuilder(str2);
                                    sb4.append(r);
                                    bdd.c(str, sb4.toString());
                                }
                            } else {
                                j = -9223372036854775807L;
                            }
                            String replaceAll = split[this.h].replaceAll("\\{.*?\\}", "");
                            String str4 = "\n";
                            list.add(new azi(replaceAll.replaceAll("\\\\N", str4).replaceAll("\\\\n", str4)));
                            bde.a(b);
                            if (j != -9223372036854775807L) {
                                list.add(null);
                                bde.a(j);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 8
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            int r0 = r9.length
            r8.e = r0
            r0 = -1
            r8.f = r0
            r8.g = r0
            r8.h = r0
            r1 = 0
            r2 = 0
        L_0x0018:
            int r3 = r8.e
            if (r2 >= r3) goto L_0x006d
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = defpackage.bdw.d(r3)
            int r4 = r3.hashCode()
            r5 = 100571(0x188db, float:1.4093E-40)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0050
            r5 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r5) goto L_0x0046
            r5 = 109757538(0x68ac462, float:5.219839E-35)
            if (r4 == r5) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            goto L_0x005b
        L_0x0046:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 2
            goto L_0x005b
        L_0x0050:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = -1
        L_0x005b:
            if (r3 == 0) goto L_0x0068
            if (r3 == r7) goto L_0x0065
            if (r3 == r6) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            r8.h = r2
            goto L_0x006a
        L_0x0065:
            r8.g = r2
            goto L_0x006a
        L_0x0068:
            r8.f = r2
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x006d:
            int r9 = r8.f
            if (r9 == r0) goto L_0x0079
            int r9 = r8.g
            if (r9 == r0) goto L_0x0079
            int r9 = r8.h
            if (r9 != r0) goto L_0x007b
        L_0x0079:
            r8.e = r1
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bae.a(java.lang.String):void");
    }

    private static long b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    public final /* synthetic */ azl a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        bde bde = new bde();
        bdj bdj = new bdj(bArr, i);
        if (!this.d) {
            a(bdj);
        }
        a(bdj, (List<azi>) arrayList, bde);
        azi[] aziArr = new azi[arrayList.size()];
        arrayList.toArray(aziArr);
        return new baf(aziArr, bde.a());
    }
}
