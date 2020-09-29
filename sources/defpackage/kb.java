package defpackage;

/* renamed from: kb reason: default package */
public final class kb {
    double a;
    double b;
    double c = Double.MAX_VALUE;
    private double d = Math.sqrt(1500.0d);
    private double e = 0.5d;
    private boolean f = false;
    private double g;
    private double h;
    private double i;
    private final a j = new a();

    public kb() {
    }

    public kb(float f2) {
        this.c = (double) f2;
    }

    private void a() {
        if (!this.f) {
            if (this.c != Double.MAX_VALUE) {
                double d2 = this.e;
                if (d2 > 1.0d) {
                    double d3 = -d2;
                    double d4 = this.d;
                    this.g = (d3 * d4) + (d4 * Math.sqrt((d2 * d2) - 1.0d));
                    double d5 = this.e;
                    double d6 = -d5;
                    double d7 = this.d;
                    this.h = (d6 * d7) - (d7 * Math.sqrt((d5 * d5) - 1.0d));
                } else if (d2 >= 0.0d && d2 < 1.0d) {
                    this.i = this.d * Math.sqrt(1.0d - (d2 * d2));
                }
                this.f = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* access modifiers changed from: 0000 */
    public final a a(double d2, double d3, long j2) {
        double d4;
        double d5;
        a();
        double d6 = (double) j2;
        Double.isNaN(d6);
        double d7 = d6 / 1000.0d;
        double d8 = d2 - this.c;
        double d9 = this.e;
        if (d9 > 1.0d) {
            double d10 = this.h;
            double d11 = (d10 * d8) - d3;
            double d12 = this.g;
            double d13 = d8 - (d11 / (d10 - d12));
            double d14 = ((d8 * d10) - d3) / (d10 - d12);
            d5 = (Math.pow(2.718281828459045d, d10 * d7) * d13) + (Math.pow(2.718281828459045d, this.g * d7) * d14);
            double d15 = this.h;
            double pow = d13 * d15 * Math.pow(2.718281828459045d, d15 * d7);
            double d16 = this.g;
            d4 = pow + (d14 * d16 * Math.pow(2.718281828459045d, d16 * d7));
        } else if (d9 == 1.0d) {
            double d17 = this.d;
            double d18 = d3 + (d17 * d8);
            double d19 = d8 + (d18 * d7);
            d5 = Math.pow(2.718281828459045d, (-d17) * d7) * d19;
            double pow2 = d19 * Math.pow(2.718281828459045d, (-this.d) * d7);
            double d20 = this.d;
            d4 = (d18 * Math.pow(2.718281828459045d, (-d20) * d7)) + (pow2 * (-d20));
        } else {
            double d21 = 1.0d / this.i;
            double d22 = this.d;
            double d23 = d21 * ((d9 * d22 * d8) + d3);
            double pow3 = Math.pow(2.718281828459045d, (-d9) * d22 * d7) * ((Math.cos(this.i * d7) * d8) + (Math.sin(this.i * d7) * d23));
            double d24 = this.d;
            double d25 = (-d24) * pow3;
            double d26 = this.e;
            double d27 = d25 * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d24 * d7);
            double d28 = this.i;
            double d29 = pow3;
            double sin = (-d28) * d8 * Math.sin(d28 * d7);
            double d30 = this.i;
            d4 = d27 + (pow4 * (sin + (d23 * d30 * Math.cos(d30 * d7))));
            d5 = d29;
        }
        a aVar = this.j;
        aVar.a = (float) (d5 + this.c);
        aVar.b = (float) d4;
        return aVar;
    }

    public final kb a(float f2) {
        if (f2 > 0.0f) {
            this.d = Math.sqrt((double) f2);
            this.f = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final kb b(float f2) {
        if (f2 >= 0.0f) {
            this.e = (double) f2;
            this.f = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }
}
