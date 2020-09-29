package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: tmy reason: default package */
public final class tmy {
    final DateFormat a = DateFormat.getDateInstance(2);
    final SimpleDateFormat b = new SimpleDateFormat("MMM dd", Locale.getDefault());
    final SimpleDateFormat c = new SimpleDateFormat("EEE", Locale.getDefault());
    final Resources d;
    private final gbd e;

    /* renamed from: tmy$a */
    class a implements b {
        private final tmw a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e = true;
        private boolean f;
        private boolean g;

        public a(tmw tmw) {
            this.a = tmw;
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

        public final String a() {
            int i;
            String str;
            String str2;
            String str3;
            Integer d2 = this.a.d();
            if (d2 != null) {
                i = d2.intValue();
            } else {
                i = -1;
            }
            int a2 = tmx.a(this.a.e(), this.d, this.a.c(), i);
            Calendar f2 = gbd.a().f();
            Calendar calendar = (Calendar) f2.clone();
            calendar.setTimeInMillis(((long) this.a.b()) * 1000);
            if (this.b && this.f) {
                str = a(f2, calendar).toUpperCase(Locale.getDefault());
            } else {
                if (this.b && this.e) {
                    if (calendar.get(0) == f2.get(0) && calendar.get(1) == f2.get(1) && calendar.get(6) == f2.get(6)) {
                        str3 = tmy.this.d.getString(R.string.subtitle_today);
                    } else {
                        int i2 = f2.get(6) - calendar.get(6);
                        str3 = (f2.get(1) == calendar.get(1)) && i2 > 0 && i2 <= 7 ? f2.get(6) - calendar.get(6) == 1 ? tmy.this.d.getString(R.string.subtitle_yesterday) : tmy.this.c.format(calendar.getTime()) : a(f2, calendar);
                    }
                    str = str3.toUpperCase(Locale.getDefault());
                } else {
                    if (this.b && !this.e) {
                        str = tmy.this.a.format(calendar.getTime()).toUpperCase(Locale.getDefault());
                    } else {
                        str = this.a.a();
                    }
                }
            }
            if (this.c) {
                if (a2 == 2) {
                    str = tmy.this.d.getString(R.string.subtitle_played);
                }
                return str;
            }
            if (a2 != 1) {
                if (!(this.d && a2 != 2 && i > 0)) {
                    if (a2 == 2) {
                        str2 = tmy.this.d.getString(R.string.subtitle_played);
                    } else {
                        str2 = a(this.a.c());
                    }
                    return tmy.this.d.getString(R.string.subtitle_general_structure, new Object[]{str, str2});
                }
            }
            str2 = tmy.this.d.getString(R.string.subtitle_time_left, new Object[]{a(i)});
            return tmy.this.d.getString(R.string.subtitle_general_structure, new Object[]{str, str2});
        }

        private String a(Calendar calendar, Calendar calendar2) {
            if (calendar.get(1) == calendar2.get(1)) {
                return tmy.this.b.format(calendar2.getTime());
            }
            return tmy.this.a.format(calendar2.getTime());
        }

        private String a(int i) {
            if (this.e) {
                return tmy.a(tmy.this, i, this.g);
            }
            return tmy.a(i);
        }
    }

    /* renamed from: tmy$b */
    public interface b {
        String a();

        b a(boolean z);

        b b(boolean z);

        b c(boolean z);

        b d(boolean z);

        b e(boolean z);
    }

    public tmy(Resources resources, gbd gbd) {
        this.d = resources;
        this.e = gbd;
    }

    public final b a(String str, int i, int i2, Integer num, boolean z) {
        return new a(tmw.a(str, i, i2, num, z));
    }

    static /* synthetic */ String a(tmy tmy, int i, boolean z) {
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
            sb.append(tmy.d.getQuantityString(R.plurals.time_format_hours, i4, new Object[]{Integer.valueOf(i4)}));
        }
        if (i4 > 0 && i2 > 0) {
            sb.append(' ');
        }
        if (i2 > 0) {
            sb.append(tmy.d.getQuantityString(R.plurals.time_format_min, i2, new Object[]{Integer.valueOf(i2)}));
        }
        if (i2 > 0 && i3 > 0) {
            sb.append(' ');
        }
        if (i3 > 0) {
            sb.append(tmy.d.getQuantityString(R.plurals.time_format_sec, i3, new Object[]{Integer.valueOf(i3)}));
        }
        return sb.toString().toUpperCase(Locale.getDefault());
    }

    static /* synthetic */ String a(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        return String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
    }
}
