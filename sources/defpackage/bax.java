package defpackage;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bax reason: default package */
public final class bax extends baa {
    private static final Pattern c = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    private final StringBuilder d = new StringBuilder();

    public bax() {
        super("SubripDecoder");
    }

    private static long a(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    private bay a(byte[] bArr, int i) {
        String str = "SubripDecoder";
        ArrayList arrayList = new ArrayList();
        bdv bdv = new bdv();
        bea bea = new bea(bArr, i);
        while (true) {
            String r = bea.r();
            if (r == null) {
                break;
            } else if (r.length() != 0) {
                try {
                    Integer.parseInt(r);
                    String r2 = bea.r();
                    if (r2 == null) {
                        bdu.c(str, "Unexpected end");
                        break;
                    }
                    Matcher matcher = c.matcher(r2);
                    if (matcher.matches()) {
                        boolean z = true;
                        bdv.a(a(matcher, 1));
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            bdv.a(a(matcher, 6));
                        } else {
                            z = false;
                        }
                        this.d.setLength(0);
                        while (true) {
                            String r3 = bea.r();
                            if (TextUtils.isEmpty(r3)) {
                                break;
                            }
                            if (this.d.length() > 0) {
                                this.d.append("<br>");
                            }
                            this.d.append(r3.trim());
                        }
                        arrayList.add(new azz(Html.fromHtml(this.d.toString())));
                        if (z) {
                            arrayList.add(null);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Skipping invalid timing: ");
                        sb.append(r2);
                        bdu.c(str, sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder("Skipping invalid index: ");
                    sb2.append(r);
                    bdu.c(str, sb2.toString());
                }
            }
        }
        azz[] azzArr = new azz[arrayList.size()];
        arrayList.toArray(azzArr);
        return new bay(azzArr, bdv.a());
    }

    public final /* bridge */ /* synthetic */ bac a(byte[] bArr, int i, boolean z) {
        return a(bArr, i);
    }
}
