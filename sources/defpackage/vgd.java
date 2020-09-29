package defpackage;

import java.util.Locale;

/* renamed from: vgd reason: default package */
public final class vgd {
    final float a;
    final float b;
    final a c;

    /* renamed from: vgd$a */
    public interface a {
        float a(float f, float f2, float f3);
    }

    private vgd(float f, float f2, a aVar) {
        this.a = f;
        this.b = f2;
        this.c = aVar;
    }

    public static vgd a(float f, final float f2) {
        return c(0.0f, f2) ? b(0.0f) : new vgd(0.0f, f2, new a(0.0f) {
            public final float a(float f, float f2, float f3) {
                return f3;
            }

            public final String toString() {
                return String.format(Locale.US, "unit(%.2f, %.2f)", new Object[]{Float.valueOf(0.0f), Float.valueOf(f2)});
            }
        });
    }

    private vgd a(float f, float f2, float f3, float f4) {
        if (c(f, f2)) {
            throw new IllegalArgumentException("Can't remap from an empty domain");
        } else if (c(f3, f4)) {
            return b(f3);
        } else {
            final float f5 = f;
            final float f6 = f2;
            final float f7 = f3;
            final float f8 = f4;
            AnonymousClass4 r1 = new a() {
                public final float a(float f, float f2, float f3) {
                    return vge.a(f5, f6, f7, f8, f3);
                }

                public final String toString() {
                    return String.format(Locale.US, "map(%.2f, %.2f, %.2f, %.2f)", new Object[]{Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)});
                }
            };
            return a(new vgd(f3, f4, r1));
        }
    }

    private vgd a(final vgd vgd) {
        return new vgd(vgd.a, vgd.b, new a() {
            public final float a(float f, float f2, float f3) {
                return vgd.c.a(vgd.this.a, vgd.this.b, vgd.this.c.a(f, f2, f3));
            }

            public final String toString() {
                return String.format(Locale.US, "%s -> %s", new Object[]{vgd.this.c, vgd.c});
            }
        });
    }

    private static vgd b(final float f) {
        return new vgd(f, f, new a() {
            public final float a(float f, float f2, float f3) {
                return f;
            }

            public final String toString() {
                return String.format(Locale.US, "point(%.2f)", new Object[]{Float.valueOf(f)});
            }
        });
    }

    private static boolean c(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 1.0E-6d;
    }

    public final float a(float f) {
        return c(this.a, this.b) ? this.a : this.c.a(this.a, this.b, f);
    }

    public final vgd a() {
        return c(this.a, this.b) ? this : a(new vgd(this.a, this.b, new a() {
            public final float a(float f, float f2, float f3) {
                return vge.a(vgd.this.a, vgd.this.b, f3);
            }

            public final String toString() {
                return String.format(Locale.US, "clamp(%.2f, %.2f)", new Object[]{Float.valueOf(vgd.this.a), Float.valueOf(vgd.this.b)});
            }
        }));
    }

    public final vgd b(float f, float f2) {
        return a(this.a, this.b, f, 0.0f);
    }

    public final String toString() {
        return String.format(Locale.US, "IntervalTransformer: %s", new Object[]{this.c});
    }
}
