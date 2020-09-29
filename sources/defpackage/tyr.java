package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.spotify.music.podcast.episode.util.DurationFormatter.Format;
import java.util.Locale;

/* renamed from: tyr reason: default package */
public final class tyr implements DurationFormatter {
    private final Resources a;

    /* renamed from: tyr$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Format.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.podcast.episode.util.DurationFormatter$Format[] r0 = com.spotify.music.podcast.episode.util.DurationFormatter.Format.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.podcast.episode.util.DurationFormatter$Format r1 = com.spotify.music.podcast.episode.util.DurationFormatter.Format.LONG_MINUTE_AND_SECOND     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.podcast.episode.util.DurationFormatter$Format r1 = com.spotify.music.podcast.episode.util.DurationFormatter.Format.LONG_HOUR_AND_MINUTE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tyr.AnonymousClass1.<clinit>():void");
        }
    }

    public tyr(Resources resources) {
        this.a = resources;
    }

    private static String a(Resources resources, int i, boolean z) {
        int i2;
        int i3;
        int i4 = i / 3600;
        if (z) {
            float f = (float) (i - (i4 * 3600));
            i2 = (int) Math.floor((double) (f / 60.0f));
            i3 = (int) Math.ceil((double) (f - (((float) i2) * 60.0f)));
        } else {
            i2 = (int) Math.ceil((double) (((float) (i - (i4 * 3600))) / 60.0f));
            i3 = 0;
        }
        StringBuilder sb = new StringBuilder(0);
        if (i4 > 0) {
            sb.append(resources.getQuantityString(R.plurals.time_format_hours, i4, new Object[]{Integer.valueOf(i4)}));
        }
        if (i4 > 0 && i2 > 0) {
            sb.append(' ');
        }
        if (i2 > 0) {
            sb.append(resources.getQuantityString(R.plurals.time_format_min, i2, new Object[]{Integer.valueOf(i2)}));
        }
        if (i2 > 0 && i3 > 0) {
            sb.append(' ');
        }
        if (i3 > 0) {
            sb.append(resources.getQuantityString(R.plurals.time_format_sec, i3, new Object[]{Integer.valueOf(i3)}));
        }
        return sb.toString().toUpperCase(Locale.getDefault());
    }

    public final String a(Format format, int i) {
        int i2 = AnonymousClass1.a[format.ordinal()];
        if (i2 == 1) {
            return a(this.a, i, true);
        }
        if (i2 == 2) {
            return a(this.a, i, false);
        }
        int i3 = i / 60;
        int i4 = i % 60;
        return String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
    }
}
