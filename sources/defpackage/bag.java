package defpackage;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bag reason: default package */
public final class bag extends azj {
    private static final Pattern c = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    private final StringBuilder d = new StringBuilder();

    public final /* bridge */ /* synthetic */ azl a(byte[] bArr, int i, boolean z) {
        return a(bArr, i);
    }

    public bag() {
        super("SubripDecoder");
    }

    private bah a(byte[] bArr, int i) {
        String str = "SubripDecoder";
        ArrayList arrayList = new ArrayList();
        bde bde = new bde();
        bdj bdj = new bdj(bArr, i);
        while (true) {
            String r = bdj.r();
            if (r == null) {
                break;
            } else if (r.length() != 0) {
                try {
                    Integer.parseInt(r);
                    String r2 = bdj.r();
                    if (r2 == null) {
                        bdd.c(str, "Unexpected end");
                        break;
                    }
                    Matcher matcher = c.matcher(r2);
                    if (matcher.matches()) {
                        boolean z = true;
                        bde.a(a(matcher, 1));
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            bde.a(a(matcher, 6));
                        } else {
                            z = false;
                        }
                        this.d.setLength(0);
                        while (true) {
                            String r3 = bdj.r();
                            if (TextUtils.isEmpty(r3)) {
                                break;
                            }
                            if (this.d.length() > 0) {
                                this.d.append("<br>");
                            }
                            this.d.append(r3.trim());
                        }
                        arrayList.add(new azi(Html.fromHtml(this.d.toString())));
                        if (z) {
                            arrayList.add(null);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Skipping invalid timing: ");
                        sb.append(r2);
                        bdd.c(str, sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder("Skipping invalid index: ");
                    sb2.append(r);
                    bdd.c(str, sb2.toString());
                }
            }
        }
        azi[] aziArr = new azi[arrayList.size()];
        arrayList.toArray(aziArr);
        return new bah(aziArr, bde.a());
    }

    private static long a(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }
}
