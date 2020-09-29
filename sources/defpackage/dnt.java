package defpackage;

/* renamed from: dnt reason: default package */
public final class dnt extends dga<dnt> {
    private Integer a;
    private dog b;
    private dog c;
    private dog d;
    private dog[] e;
    private Integer f;

    public dnt() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = dog.b();
        this.f = null;
        this.Y = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        Integer num = this.a;
        if (num != null) {
            a2 += dfz.b(1, num.intValue());
        }
        dog dog = this.b;
        if (dog != null) {
            a2 += dfz.b(2, (dgf) dog);
        }
        dog dog2 = this.c;
        if (dog2 != null) {
            a2 += dfz.b(3, (dgf) dog2);
        }
        dog dog3 = this.d;
        if (dog3 != null) {
            a2 += dfz.b(4, (dgf) dog3);
        }
        dog[] dogArr = this.e;
        if (dogArr != null && dogArr.length > 0) {
            int i = 0;
            while (true) {
                dog[] dogArr2 = this.e;
                if (i >= dogArr2.length) {
                    break;
                }
                dog dog4 = dogArr2[i];
                if (dog4 != null) {
                    a2 += dfz.b(5, (dgf) dog4);
                }
                i++;
            }
        }
        Integer num2 = this.f;
        return num2 != null ? a2 + dfz.b(6, num2.intValue()) : a2;
    }

    public final /* synthetic */ dgf a(dfx dfx) {
        dog dog;
        while (true) {
            int a2 = dfx.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 != 8) {
                if (a2 == 18) {
                    if (this.b == null) {
                        this.b = new dog();
                    }
                    dog = this.b;
                } else if (a2 == 26) {
                    if (this.c == null) {
                        this.c = new dog();
                    }
                    dog = this.c;
                } else if (a2 == 34) {
                    if (this.d == null) {
                        this.d = new dog();
                    }
                    dog = this.d;
                } else if (a2 == 42) {
                    int a3 = dgi.a(dfx, 42);
                    dog[] dogArr = this.e;
                    int length = dogArr == null ? 0 : dogArr.length;
                    dog[] dogArr2 = new dog[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, dogArr2, 0, length);
                    }
                    while (length < dogArr2.length - 1) {
                        dogArr2[length] = new dog();
                        dfx.a((dgf) dogArr2[length]);
                        dfx.a();
                        length++;
                    }
                    dogArr2[length] = new dog();
                    dfx.a((dgf) dogArr2[length]);
                    this.e = dogArr2;
                } else if (a2 == 48) {
                    this.f = Integer.valueOf(dfx.f());
                } else if (!super.a(dfx, a2)) {
                    return this;
                }
                dfx.a((dgf) dog);
            } else {
                this.a = Integer.valueOf(dfx.f());
            }
        }
    }

    public final void a(dfz dfz) {
        Integer num = this.a;
        if (num != null) {
            dfz.a(1, num.intValue());
        }
        dog dog = this.b;
        if (dog != null) {
            dfz.a(2, (dgf) dog);
        }
        dog dog2 = this.c;
        if (dog2 != null) {
            dfz.a(3, (dgf) dog2);
        }
        dog dog3 = this.d;
        if (dog3 != null) {
            dfz.a(4, (dgf) dog3);
        }
        dog[] dogArr = this.e;
        if (dogArr != null && dogArr.length > 0) {
            int i = 0;
            while (true) {
                dog[] dogArr2 = this.e;
                if (i >= dogArr2.length) {
                    break;
                }
                dog dog4 = dogArr2[i];
                if (dog4 != null) {
                    dfz.a(5, (dgf) dog4);
                }
                i++;
            }
        }
        Integer num2 = this.f;
        if (num2 != null) {
            dfz.a(6, num2.intValue());
        }
        super.a(dfz);
    }
}
