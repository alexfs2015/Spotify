package defpackage;

import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: uco reason: default package */
public final class uco implements fvc {
    private final jlr a;
    private final jtz b;

    public uco(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    public final void onMenuItemClick(fva fva) {
        String str;
        Integer a2 = ucm.a(fva.h());
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
        bg bgVar = new bg(null, "spotify:contextmenu:episode:podcast", "spotify:contextmenu:episode:podcast:speedcontrol", "speedcontrol", 0, str, "hit", "select", (double) this.b.a());
        this.a.a(bgVar);
    }
}
