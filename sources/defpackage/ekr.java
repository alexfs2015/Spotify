package defpackage;

/* renamed from: ekr reason: default package */
public final class ekr extends eql<ekr> {
    public Integer a;
    public String b;
    public Boolean c;
    public String[] d;

    public ekr() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = eqt.c;
        this.L = null;
        this.M = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ekr a(eqj eqj) {
        int d2;
        while (true) {
            int a2 = eqj.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 8) {
                try {
                    d2 = eqj.d();
                    if (d2 < 0 || d2 > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(d2);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.a = Integer.valueOf(d2);
                    }
                } catch (IllegalArgumentException unused) {
                    eqj.e(eqj.i());
                    a(eqj, a2);
                }
            } else if (a2 == 18) {
                this.b = eqj.c();
            } else if (a2 == 24) {
                this.c = Boolean.valueOf(eqj.b());
            } else if (a2 == 34) {
                int a3 = eqt.a(eqj, 34);
                String[] strArr = this.d;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[(a3 + length)];
                if (length != 0) {
                    System.arraycopy(this.d, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = eqj.c();
                    eqj.a();
                    length++;
                }
                strArr2[length] = eqj.c();
                this.d = strArr2;
            } else if (!super.a(eqj, a2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(d2);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void a(eqk eqk) {
        Integer num = this.a;
        if (num != null) {
            eqk.a(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            eqk.a(2, str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            eqk.a(3, bool.booleanValue());
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
                    eqk.a(4, str2);
                }
                i++;
            }
        }
        super.a(eqk);
    }

    /* access modifiers changed from: protected */
    public final int b() {
        int b2 = super.b();
        Integer num = this.a;
        if (num != null) {
            b2 += eqk.b(1, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            b2 += eqk.b(2, str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            b2 += eqk.c(24) + 1;
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
                i2 += eqk.a(str2);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ekr)) {
            return false;
        }
        ekr ekr = (ekr) obj;
        Integer num = this.a;
        if (num == null) {
            if (ekr.a != null) {
                return false;
            }
        } else if (!num.equals(ekr.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ekr.b != null) {
                return false;
            }
        } else if (!str.equals(ekr.b)) {
            return false;
        }
        Boolean bool = this.c;
        if (bool == null) {
            if (ekr.c != null) {
                return false;
            }
        } else if (!bool.equals(ekr.c)) {
            return false;
        }
        if (!eqp.a((Object[]) this.d, (Object[]) ekr.d)) {
            return false;
        }
        return (this.L == null || this.L.a()) ? ekr.L == null || ekr.L.a() : this.L.equals(ekr.L);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.a;
        int i = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        String str = this.b;
        int hashCode2 = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + eqp.a((Object[]) this.d)) * 31;
        if (this.L != null && !this.L.a()) {
            i = this.L.hashCode();
        }
        return hashCode3 + i;
    }
}
