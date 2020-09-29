package defpackage;

import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: tql reason: default package */
public final class tql implements fui {
    private final jjf a;
    private final jrp b;

    public tql(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
    }

    public final void onMenuItemClick(fug fug) {
        String str;
        Integer a2 = tqj.a(fug.h());
        if (a2 != null) {
            float intValue = ((float) a2.intValue()) / 100.0f;
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            StringBuilder sb = new StringBuilder("spotify:contextmenu:episode:podcast:speedcontrol:");
            sb.append(decimalFormat.format((double) intValue));
            sb.append('x');
            str = sb.toString();
        } else {
            str = String.format(Locale.ENGLISH, "%s:unknown", new Object[]{"spotify:contextmenu:episode:podcast:speedcontrol"});
        }
        bh bhVar = new bh(null, "spotify:contextmenu:episode:podcast", "spotify:contextmenu:episode:podcast:speedcontrol", "speedcontrol", 0, str, "hit", "select", (double) this.b.a());
        this.a.a(bhVar);
    }
}
