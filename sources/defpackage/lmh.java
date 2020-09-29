package defpackage;

import android.content.Context;
import com.spotify.localization.SpotifyLocale.Separator;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: lmh reason: default package */
public final class lmh implements wig<String> {
    private final wzi<Context> a;

    private lmh(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static lmh a(wzi<Context> wzi) {
        return new lmh(wzi);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        ArrayList arrayList = new ArrayList(2);
        Locale a2 = jua.a(context);
        if (a2 != null) {
            arrayList.add(a2);
        }
        if (!Locale.US.equals(a2)) {
            arrayList.add(Locale.US);
        }
        List<Locale> subList = arrayList.subList(0, Math.min(arrayList.size(), Integer.MAX_VALUE));
        ArrayList<String> arrayList2 = new ArrayList<>(3);
        StringBuilder sb = new StringBuilder(32);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.##");
        double d = 1.0d;
        for (Locale a3 : subList) {
            String a4 = gos.a(a3, Separator.DASH.mSeparator);
            sb.delete(0, sb.length());
            sb.append(a4);
            if (subList.size() > 1) {
                sb.append(";q=");
                sb.append(decimalFormat.format(d));
            }
            arrayList2.add(sb.toString());
            double size = (double) subList.size();
            Double.isNaN(size);
            d -= d / size;
        }
        StringBuilder sb2 = new StringBuilder(32);
        for (String str : arrayList2) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return (String) wil.a(jun.a(sb2.toString()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
