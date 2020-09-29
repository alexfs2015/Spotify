package defpackage;

import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.TooLongFrameException;
import java.util.List;

/* renamed from: wsw reason: default package */
public final class wsw extends wrc {
    private int e;
    private int f;
    private int g;
    private boolean h;
    private final int i;
    private final boolean j;

    public wsw() {
        this(1048576);
    }

    private wsw(int i2) {
        this(1048576, false);
    }

    private wsw(int i2, boolean z) {
        if (i2 > 0) {
            this.i = i2;
            this.j = false;
            return;
        }
        throw new IllegalArgumentException("maxObjectLength must be a positive int");
    }

    private void a(byte b, wnb wnb, int i2) {
        if ((b == 123 || b == 91) && !this.h) {
            this.e++;
        } else if ((b == 125 || b == 93) && !this.h) {
            this.e--;
        } else {
            if (b == 34) {
                if (!this.h) {
                    this.h = true;
                    return;
                }
                int i3 = i2 - 1;
                int i4 = 0;
                while (i3 >= 0 && wnb.e(i3) == 92) {
                    i4++;
                    i3--;
                }
                if (i4 % 2 == 0) {
                    this.h = false;
                }
            }
        }
    }

    private void e() {
        this.h = false;
        this.g = 0;
        this.e = 0;
    }

    public final void a(wpb wpb, wnb wnb, List<Object> list) {
        if (this.g == -1) {
            wnb.w(wnb.g());
            return;
        }
        int i2 = this.f;
        int d = wnb.d();
        String str = ": ";
        if (d <= this.i) {
            while (i2 < d) {
                byte e2 = wnb.e(i2);
                int i3 = this.g;
                if (i3 == 1) {
                    a(e2, wnb, i2);
                    if (this.e == 0) {
                        int i4 = i2 + 1;
                        wnb j2 = wnb.j(wnb.c(), i4 - wnb.c());
                        if (j2 != null) {
                            list.add(j2);
                        }
                        wnb.a(i4);
                        e();
                    }
                } else if (i3 == 2) {
                    a(e2, wnb, i2);
                    if (!this.h && ((this.e == 1 && e2 == 44) || (this.e == 0 && e2 == 93))) {
                        for (int c = wnb.c(); Character.isWhitespace(wnb.e(c)); c++) {
                            wnb.w(1);
                        }
                        int i5 = i2 - 1;
                        while (i5 >= wnb.c() && Character.isWhitespace(wnb.e(i5))) {
                            i5--;
                        }
                        wnb j3 = wnb.j(wnb.c(), (i5 + 1) - wnb.c());
                        if (j3 != null) {
                            list.add(j3);
                        }
                        wnb.a(i2 + 1);
                        if (e2 == 93) {
                            e();
                        }
                    }
                } else if (e2 == 123 || e2 == 91) {
                    this.e = 1;
                    if (e2 != 91 || !this.j) {
                        this.g = 1;
                    } else {
                        this.g = 2;
                    }
                    if (this.g == 2) {
                        wnb.w(1);
                    }
                } else if (Character.isWhitespace(e2)) {
                    wnb.w(1);
                } else {
                    this.g = -1;
                    StringBuilder sb = new StringBuilder("invalid JSON received at byte position ");
                    sb.append(i2);
                    sb.append(str);
                    sb.append(wng.a(wnb));
                    throw new CorruptedFrameException(sb.toString());
                }
                i2++;
            }
            if (wnb.g() == 0) {
                this.f = 0;
            } else {
                this.f = i2;
            }
        } else {
            wnb.w(wnb.g());
            e();
            StringBuilder sb2 = new StringBuilder("object length exceeds ");
            sb2.append(this.i);
            sb2.append(str);
            sb2.append(d);
            sb2.append(" bytes discarded");
            throw new TooLongFrameException(sb2.toString());
        }
    }
}
