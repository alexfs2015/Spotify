package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: men reason: default package */
public final class men implements ota {
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
    private final Context b;
    private final mej c;

    public men(Context context, mej mej) {
        this.b = context;
        this.c = mej;
    }

    private String a(oqg oqg) {
        try {
            return this.c.a(this.a.parse(((String) fbp.a((String) oqg.a().q().getOrDefault("last_updated", "2000-01-01:00:00:00Z"))).replace("Z", "+00:00")).getTime());
        } catch (ParseException e) {
            Assertion.b("Failed to parse chart last updated date", (Throwable) e);
            return "";
        }
    }

    private static int b(oqg oqg) {
        return Integer.parseInt((String) fbp.a((String) oqg.a().q().getOrDefault("new_entries_count", Ad.DEFAULT_SKIPPABLE_AD_DELAY)));
    }

    public final boolean a(oqg oqg, TextView textView) {
        String a2 = a(oqg);
        int b2 = b(oqg);
        String b3 = this.c.b(b2);
        if (b2 > 0 && !a2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(b3);
            sb.append(" • ");
            sb.append(a2);
            a2 = sb.toString();
        } else if (b2 > 0) {
            a2 = b3;
        } else if (a2.isEmpty()) {
            a2 = "";
        }
        textView.setText(a2);
        if (b(oqg) > 0) {
            Resources resources = this.b.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.charts_chart_legend_icon_size);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new mey(dimensionPixelSize));
            shapeDrawable.getPaint().setColor(fr.c(this.b, R.color.charts_legend_circle));
            shapeDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            shapeDrawable.setPadding(new Rect(0, 0, 0, 0));
            textView.setCompoundDrawables(shapeDrawable, null, null, null);
            textView.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.charts_header_new_entry_spacing));
        }
        return !TextUtils.isEmpty(a2);
    }
}
