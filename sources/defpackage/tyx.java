package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.spotify.music.podcast.episode.util.DurationFormatter.Format;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: tyx reason: default package */
public final class tyx {
    final DateFormat a = DateFormat.getDateInstance(2);
    final SimpleDateFormat b = new SimpleDateFormat("MMM dd", Locale.getDefault());
    final SimpleDateFormat c = new SimpleDateFormat("EEE", Locale.getDefault());
    final Resources d;
    final DurationFormatter e;
    private final gcb f;

    /* renamed from: tyx$a */
    class a implements b {
        private final tyv a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e = true;
        private boolean f;
        private boolean g;

        public a(tyv tyv) {
            this.a = tyv;
        }

        private String a(int i) {
            Format format = this.e ? this.g ? Format.LONG_MINUTE_AND_SECOND : Format.LONG_HOUR_AND_MINUTE : Format.SHORT_MINUTE_AND_SECOND;
            return tyx.this.e.a(format, i);
        }

        private String a(Calendar calendar, Calendar calendar2) {
            return calendar.get(1) == calendar2.get(1) ? tyx.this.b.format(calendar2.getTime()) : tyx.this.a.format(calendar2.getTime());
        }

        public final String a() {
            String str;
            String str2;
            String str3;
            Integer d2 = this.a.d();
            int intValue = d2 != null ? d2.intValue() : -1;
            int a2 = tyw.a(this.a.e(), this.d, this.a.c(), intValue);
            Calendar f2 = jtp.a.f();
            Calendar calendar = (Calendar) f2.clone();
            calendar.setTimeInMillis(((long) this.a.b()) * 1000);
            if (this.b && this.f) {
                str = a(f2, calendar).toUpperCase(Locale.getDefault());
            } else {
                if (this.b && this.e) {
                    if (calendar.get(0) == f2.get(0) && calendar.get(1) == f2.get(1) && calendar.get(6) == f2.get(6)) {
                        str3 = tyx.this.d.getString(R.string.subtitle_today);
                    } else {
                        int i = f2.get(6) - calendar.get(6);
                        str3 = (f2.get(1) == calendar.get(1)) && i > 0 && i <= 7 ? f2.get(6) - calendar.get(6) == 1 ? tyx.this.d.getString(R.string.subtitle_yesterday) : tyx.this.c.format(calendar.getTime()) : a(f2, calendar);
                    }
                    str = str3.toUpperCase(Locale.getDefault());
                } else {
                    str = this.b && !this.e ? tyx.this.a.format(calendar.getTime()).toUpperCase(Locale.getDefault()) : this.a.a();
                }
            }
            if (this.c) {
                if (a2 == 2) {
                    str = tyx.this.d.getString(R.string.subtitle_played);
                }
                return str;
            }
            if (a2 != 1) {
                if (!(this.d && a2 != 2 && intValue > 0)) {
                    str2 = a2 == 2 ? tyx.this.d.getString(R.string.subtitle_played) : a(this.a.c());
                    return tyx.this.d.getString(R.string.subtitle_general_structure, new Object[]{str, str2});
                }
            }
            str2 = tyx.this.d.getString(R.string.subtitle_time_left, new Object[]{a(intValue)});
            return tyx.this.d.getString(R.string.subtitle_general_structure, new Object[]{str, str2});
        }

        public final b a(boolean z) {
            this.b = true;
            return this;
        }

        public final b b(boolean z) {
            this.c = z;
            return this;
        }

        public final b c(boolean z) {
            this.d = z;
            return this;
        }

        public final b d(boolean z) {
            this.f = true;
            return this;
        }

        public final b e(boolean z) {
            this.g = true;
            return this;
        }
    }

    /* renamed from: tyx$b */
    public interface b {
        String a();

        b a(boolean z);

        b b(boolean z);

        b c(boolean z);

        b d(boolean z);

        b e(boolean z);
    }

    public tyx(Resources resources, gcb gcb, tyr tyr) {
        this.d = resources;
        this.f = gcb;
        this.e = tyr;
    }

    public final b a(String str, int i, int i2, Integer num, boolean z) {
        return new a(tyv.a(str, i, i2, num, z));
    }
}
