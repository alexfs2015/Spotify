package com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened;

final class AutoValue_MinutesListened extends MinutesListened {
    private static final long serialVersionUID = 2;
    private final int minutes;
    private final String minutesLabel;
    private final int year;

    static final class a implements com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened.a {
        private Integer a;
        private String b;
        private Integer c;

        a() {
        }

        public final com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null minutesLabel");
        }

        public final com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final MinutesListened a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" minutes");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" minutesLabel");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" year");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_MinutesListened(this.a.intValue(), this.b, this.c.intValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ AutoValue_MinutesListened(int i, String str, int i2, byte b) {
        this(i, str, i2);
    }

    private AutoValue_MinutesListened(int i, String str, int i2) {
        this.minutes = i;
        this.minutesLabel = str;
        this.year = i2;
    }

    public final int a() {
        return this.minutes;
    }

    public final String b() {
        return this.minutesLabel;
    }

    public final int c() {
        return this.year;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinutesListened{minutes=");
        sb.append(this.minutes);
        sb.append(", minutesLabel=");
        sb.append(this.minutesLabel);
        sb.append(", year=");
        sb.append(this.year);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MinutesListened) {
            MinutesListened minutesListened = (MinutesListened) obj;
            return this.minutes == minutesListened.a() && this.minutesLabel.equals(minutesListened.b()) && this.year == minutesListened.c();
        }
    }

    public final int hashCode() {
        return ((((this.minutes ^ 1000003) * 1000003) ^ this.minutesLabel.hashCode()) * 1000003) ^ this.year;
    }
}
