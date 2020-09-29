package defpackage;

/* renamed from: eka reason: default package */
public final class eka extends epu<eka> {
    public Integer a;
    public String b;
    public Boolean c;
    public String[] d;

    public eka() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = eqc.c;
        this.L = null;
        this.M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eka)) {
            return false;
        }
        eka eka = (eka) obj;
        Integer num = this.a;
        if (num == null) {
            if (eka.a != null) {
                return false;
            }
        } else if (!num.equals(eka.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (eka.b != null) {
                return false;
            }
        } else if (!str.equals(eka.b)) {
            return false;
        }
        Boolean bool = this.c;
        if (bool == null) {
            if (eka.c != null) {
                return false;
            }
        } else if (!bool.equals(eka.c)) {
            return false;
        }
        if (!epy.a((Object[]) this.d, (Object[]) eka.d)) {
            return false;
        }
        if (this.L == null || this.L.a()) {
            return eka.L == null || eka.L.a();
        }
        return this.L.equals(eka.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        String str = this.b;
        int hashCode2 = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + epy.a((Object[]) this.d)) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode3 + i;
    }

    public final void a(ept ept) {
        Integer num = this.a;
        if (num != null) {
            ept.a(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            ept.a(2, str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            ept.a(3, bool.booleanValue());
        }
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    ept.a(4, str2);
                }
                i++;
            }
        }
        super.a(ept);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Integer num = this.a;
        if (num != null) {
            b2 += ept.b(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            b2 += ept.b(2, str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            b2 += ept.c(24) + 1;
        }
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0) {
            return b2;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.d;
            if (i >= strArr2.length) {
                return b2 + i2 + (i3 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i3++;
                i2 += ept.a(str2);
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final eka a(eps eps) {
        int d2;
        while (true) {
            int a2 = eps.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    d2 = eps.d();
                    if (d2 < 0 || d2 > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(d2);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.a = Integer.valueOf(d2);
                    }
                } catch (IllegalArgumentException unused) {
                    eps.e(eps.i());
                    a(eps, a2);
                }
            } else if (a2 == 18) {
                this.b = eps.c();
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(eps.b());
            } else if (a2 == 34) {
                int a3 = eqc.a(eps, 34);
                String[] strArr = this.d;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.d, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = eps.c();
                    eps.a();
                    length++;
                }
                strArr2[length] = eps.c();
                this.d = strArr2;
            } else if (!super.a(eps, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(d2);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
