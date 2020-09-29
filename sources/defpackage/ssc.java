package defpackage;

import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;

/* renamed from: ssc reason: default package */
final class ssc extends ssd {
    private final Type a;
    private final int b;
    private final float c;

    ssc(Type type, int i, float f) {
        if (type != null) {
            this.a = type;
            this.b = i;
            this.c = f;
            return;
        }
        throw new NullPointerException("Null widgetType");
    }

    public final Type a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetVisibilityEvent{widgetType=");
        sb.append(this.a);
        sb.append(", widgetIndex=");
        sb.append(this.b);
        sb.append(", globalVisibilityRatio=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ssd) {
            ssd ssd = (ssd) obj;
            return this.a.equals(ssd.a()) && this.b == ssd.b() && Float.floatToIntBits(this.c) == Float.floatToIntBits(ssd.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c);
    }
}
