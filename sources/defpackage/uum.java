package defpackage;

import java.util.Locale;

/* renamed from: uum reason: default package */
public final class uum {
    final float a;
    final float b;
    final a c;

    /* renamed from: uum$a */
    public interface a {
        float a(float f, float f2, float f3);
    }

    private uum(float f, float f2, a aVar) {
        this.a = f;
        this.b = f2;
        this.c = aVar;
    }

    public final String toString() {
        return String.format(Locale.US, "IntervalTransformer: %s", new Object[]{this.c});
    }

    public final float a(float f) {
        if (c(this.a, this.b)) {
            return this.a;
        }
        return this.c.a(this.a, this.b, f);
    }

    private static uum b(final float f) {
        return new uum(f, f, new a() {
            public final float a(float f, float f2, float f3) {
                return f;
            }

            public final String toString() {
                return String.format(Locale.US, "point(%.2f)", new Object[]{Float.valueOf(f)});
            }
        });
    }

    public static uum a(float f, final float f2) {
        if (c(0.0f, f2)) {
            return b(0.0f);
        }
        return new uum(0.0f, f2, new a(0.0f) {
            public final float a(float f, float f2, float f3) {
                return f3;
            }

            public final String toString() {
                return String.format(Locale.US, "unit(%.2f, %.2f)", new Object[]{Float.valueOf(0.0f), Float.valueOf(f2)});
            }
        });
    }

    private uum a(final uum uum) {
        return new uum(uum.a, uum.b, new a() {
            public final float a(float f, float f2, float f3) {
                return uum.c.a(uum.this.a, uum.this.b, uum.this.c.a(f, f2, f3));
            }

            public final String toString() {
                return String.format(Locale.US, "%s -> %s", new Object[]{uum.this.c, uum.c});
            }
        });
    }

    private uum a(float f, float f2, float f3, float f4) {
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
                    return uun.a(f5, f6, f7, f8, f3);
                }

                public final String toString() {
                    return String.format(Locale.US, "map(%.2f, %.2f, %.2f, %.2f)", new Object[]{Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)});
                }
            };
            return a(new uum(f3, f4, r1));
        }
    }

    private static boolean c(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 1.0E-6d;
    }

    public final uum b(float f, float f2) {
        return a(this.a, this.b, f, 0.0f);
    }

    public final uum a() {
        if (c(this.a, this.b)) {
            return this;
        }
        return a(new uum(this.a, this.b, new a() {
            public final float a(float f, float f2, float f3) {
                return uun.a(uum.this.a, uum.this.b, f3);
            }

            public final String toString() {
                return String.format(Locale.US, "clamp(%.2f, %.2f)", new Object[]{Float.valueOf(uum.this.a), Float.valueOf(uum.this.b)});
            }
        }));
    }
}
