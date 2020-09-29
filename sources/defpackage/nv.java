package defpackage;

import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nv reason: default package */
public final class nv implements a {
    public final ArrayList<b> a;
    public int b;
    private defpackage.hq.a<b> c;
    private ArrayList<b> d;
    private a e;
    private boolean f;
    private ol g;

    /* renamed from: nv$a */
    public interface a {
        u a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    /* renamed from: nv$b */
    public static class b {
        public int a;
        public int b;
        public Object c;
        public int d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            String str = i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : PlayerTrack.TRACK_THUMB_STATE_UP : "rm" : "add";
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public nv(a aVar) {
        this(aVar, false);
    }

    private nv(a aVar, boolean z) {
        this.c = new defpackage.hq.b(30);
        this.a = new ArrayList<>();
        this.d = new ArrayList<>();
        this.b = 0;
        this.e = aVar;
        this.f = false;
        this.g = new ol(this);
    }

    private void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((b) list.get(i));
        }
        list.clear();
    }

    private void a(b bVar, int i) {
        this.e.a(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.e.a(i, bVar.d);
        } else if (i2 == 4) {
            this.e.a(i, bVar.d, bVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int b(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.d.size() - 1; size >= 0; size--) {
            b bVar = (b) this.d.get(size);
            if (bVar.a == 8) {
                if (bVar.b < bVar.d) {
                    i4 = bVar.b;
                    i3 = bVar.d;
                } else {
                    i4 = bVar.d;
                    i3 = bVar.b;
                }
                if (i < i4 || i > i3) {
                    if (i < bVar.b) {
                        if (i2 == 1) {
                            bVar.b++;
                            bVar.d++;
                        } else if (i2 == 2) {
                            bVar.b--;
                            bVar.d--;
                        }
                    }
                } else if (i4 == bVar.b) {
                    if (i2 == 1) {
                        bVar.d++;
                    } else if (i2 == 2) {
                        bVar.d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.b++;
                    } else if (i2 == 2) {
                        bVar.b--;
                    }
                    i--;
                }
            } else if (bVar.b <= i) {
                if (bVar.a == 1) {
                    i -= bVar.d;
                } else if (bVar.a == 2) {
                    i += bVar.d;
                }
            } else if (i2 == 1) {
                bVar.b++;
            } else if (i2 == 2) {
                bVar.b--;
            }
        }
        for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.d.get(size2);
            if (bVar2.a == 8) {
                if (bVar2.d == bVar2.b || bVar2.d < 0) {
                    this.d.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.d.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    private void b(b bVar) {
        int i;
        if (bVar.a == 1 || bVar.a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(bVar.b, bVar.a);
        int i2 = bVar.b;
        int i3 = bVar.a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = b2;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.d; i7++) {
            int b3 = b(bVar.b + (i * i7), bVar.a);
            int i8 = bVar.a;
            if (i8 == 2 ? b3 == i4 : i8 == 4 && b3 == i4 + 1) {
                i6++;
            } else {
                b a2 = a(bVar.a, i4, i6, bVar.c);
                a(a2, i5);
                a(a2);
                if (bVar.a == 4) {
                    i5 += i6;
                }
                i4 = b3;
                i6 = 1;
            }
        }
        Object obj = bVar.c;
        a(bVar);
        if (i6 > 0) {
            b a3 = a(bVar.a, i4, i6, obj);
            a(a3, i5);
            a(a3);
        }
    }

    private void c(b bVar) {
        this.d.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            this.e.c(bVar.b, bVar.d);
        } else if (i == 2) {
            this.e.b(bVar.b, bVar.d);
        } else if (i == 4) {
            this.e.a(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            this.e.d(bVar.b, bVar.d);
        } else {
            StringBuilder sb = new StringBuilder("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean d(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.d.get(i2);
            if (bVar.a == 8) {
                if (a(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.a == 1) {
                int i3 = bVar.b + bVar.d;
                for (int i4 = bVar.b; i4 < i3; i4++) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final int a(int i, int i2) {
        int size = this.d.size();
        while (i2 < size) {
            b bVar = (b) this.d.get(i2);
            if (bVar.a == 8) {
                if (bVar.b == i) {
                    i = bVar.d;
                } else {
                    if (bVar.b < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else if (bVar.b > i) {
                continue;
            } else if (bVar.a == 2) {
                if (i < bVar.b + bVar.d) {
                    return -1;
                }
                i -= bVar.d;
            } else if (bVar.a == 1) {
                i += bVar.d;
            }
            i2++;
        }
        return i;
    }

    public final b a(int i, int i2, int i3, Object obj) {
        b bVar = (b) this.c.a();
        if (bVar == null) {
            return new b(i, i2, i3, obj);
        }
        bVar.a = i;
        bVar.b = i2;
        bVar.d = i3;
        bVar.c = obj;
        return bVar;
    }

    public final void a() {
        a((List<b>) this.a);
        a((List<b>) this.d);
        this.b = 0;
    }

    public final void a(b bVar) {
        if (!this.f) {
            bVar.c = null;
            this.c.a(bVar);
        }
    }

    public final boolean a(int i) {
        return (i & this.b) != 0;
    }

    public final int b(int i) {
        return a(i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r16 = this;
            r0 = r16
            ol r1 = r0.g
            java.util.ArrayList<nv$b> r2 = r0.a
        L_0x0006:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x000d:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0023
            java.lang.Object r9 = r2.get(r3)
            nv$b r9 = (defpackage.nv.b) r9
            int r9 = r9.a
            if (r9 != r7) goto L_0x001f
            if (r6 == 0) goto L_0x0020
            goto L_0x0024
        L_0x001f:
            r6 = 1
        L_0x0020:
            int r3 = r3 + -1
            goto L_0x000d
        L_0x0023:
            r3 = -1
        L_0x0024:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x0208
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            nv$b r11 = (defpackage.nv.b) r11
            java.lang.Object r12 = r2.get(r7)
            nv$b r12 = (defpackage.nv.b) r12
            int r13 = r12.a
            if (r13 == r4) goto L_0x01d0
            if (r13 == r10) goto L_0x00b4
            if (r13 == r9) goto L_0x0040
            goto L_0x0006
        L_0x0040:
            int r5 = r11.d
            int r8 = r12.b
            if (r5 >= r8) goto L_0x004c
            int r5 = r12.b
            int r5 = r5 - r4
            r12.b = r5
            goto L_0x0065
        L_0x004c:
            int r5 = r11.d
            int r8 = r12.b
            int r10 = r12.d
            int r8 = r8 + r10
            if (r5 >= r8) goto L_0x0065
            int r5 = r12.d
            int r5 = r5 - r4
            r12.d = r5
            ol$a r5 = r1.a
            int r8 = r11.b
            java.lang.Object r10 = r12.c
            nv$b r5 = r5.a(r9, r8, r4, r10)
            goto L_0x0066
        L_0x0065:
            r5 = r6
        L_0x0066:
            int r8 = r11.b
            int r10 = r12.b
            if (r8 > r10) goto L_0x0072
            int r8 = r12.b
            int r8 = r8 + r4
            r12.b = r8
            goto L_0x0094
        L_0x0072:
            int r8 = r11.b
            int r10 = r12.b
            int r13 = r12.d
            int r10 = r10 + r13
            if (r8 >= r10) goto L_0x0094
            int r6 = r12.b
            int r8 = r12.d
            int r6 = r6 + r8
            int r8 = r11.b
            int r6 = r6 - r8
            ol$a r8 = r1.a
            int r10 = r11.b
            int r10 = r10 + r4
            java.lang.Object r4 = r12.c
            nv$b r4 = r8.a(r9, r10, r6, r4)
            int r8 = r12.d
            int r8 = r8 - r6
            r12.d = r8
            goto L_0x0095
        L_0x0094:
            r4 = r6
        L_0x0095:
            r2.set(r7, r11)
            int r6 = r12.d
            if (r6 <= 0) goto L_0x00a0
            r2.set(r3, r12)
            goto L_0x00a8
        L_0x00a0:
            r2.remove(r3)
            ol$a r6 = r1.a
            r6.a(r12)
        L_0x00a8:
            if (r5 == 0) goto L_0x00ad
            r2.add(r3, r5)
        L_0x00ad:
            if (r4 == 0) goto L_0x0006
            r2.add(r3, r4)
            goto L_0x0006
        L_0x00b4:
            int r8 = r11.b
            int r9 = r11.d
            if (r8 >= r9) goto L_0x00ce
            int r8 = r12.b
            int r9 = r11.b
            if (r8 != r9) goto L_0x00cb
            int r8 = r12.d
            int r9 = r11.d
            int r13 = r11.b
            int r9 = r9 - r13
            if (r8 != r9) goto L_0x00cb
            r5 = 1
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r8 = 0
            goto L_0x00e2
        L_0x00ce:
            int r8 = r12.b
            int r9 = r11.d
            int r9 = r9 + r4
            if (r8 != r9) goto L_0x00e0
            int r8 = r12.d
            int r9 = r11.b
            int r13 = r11.d
            int r9 = r9 - r13
            if (r8 != r9) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            r8 = 1
        L_0x00e2:
            int r9 = r11.d
            int r13 = r12.b
            if (r9 >= r13) goto L_0x00ee
            int r9 = r12.b
            int r9 = r9 - r4
            r12.b = r9
            goto L_0x010e
        L_0x00ee:
            int r9 = r11.d
            int r13 = r12.b
            int r14 = r12.d
            int r13 = r13 + r14
            if (r9 >= r13) goto L_0x010e
            int r3 = r12.d
            int r3 = r3 - r4
            r12.d = r3
            r11.a = r10
            r11.d = r4
            int r3 = r12.d
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            ol$a r3 = r1.a
            r3.a(r12)
            goto L_0x0006
        L_0x010e:
            int r9 = r11.b
            int r13 = r12.b
            if (r9 > r13) goto L_0x011a
            int r9 = r12.b
            int r9 = r9 + r4
            r12.b = r9
            goto L_0x013b
        L_0x011a:
            int r9 = r11.b
            int r13 = r12.b
            int r14 = r12.d
            int r13 = r13 + r14
            if (r9 >= r13) goto L_0x013b
            int r9 = r12.b
            int r13 = r12.d
            int r9 = r9 + r13
            int r13 = r11.b
            int r9 = r9 - r13
            ol$a r13 = r1.a
            int r14 = r11.b
            int r14 = r14 + r4
            nv$b r6 = r13.a(r10, r14, r9, r6)
            int r4 = r11.b
            int r9 = r12.b
            int r4 = r4 - r9
            r12.d = r4
        L_0x013b:
            if (r5 == 0) goto L_0x014a
            r2.set(r3, r12)
            r2.remove(r7)
            ol$a r3 = r1.a
            r3.a(r11)
            goto L_0x0006
        L_0x014a:
            if (r8 == 0) goto L_0x0183
            if (r6 == 0) goto L_0x0168
            int r4 = r11.b
            int r5 = r6.b
            if (r4 <= r5) goto L_0x015b
            int r4 = r11.b
            int r5 = r6.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x015b:
            int r4 = r11.d
            int r5 = r6.b
            if (r4 <= r5) goto L_0x0168
            int r4 = r11.d
            int r5 = r6.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x0168:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 <= r5) goto L_0x0175
            int r4 = r11.b
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0175:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 <= r5) goto L_0x01b9
            int r4 = r11.d
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
            goto L_0x01b9
        L_0x0183:
            if (r6 == 0) goto L_0x019f
            int r4 = r11.b
            int r5 = r6.b
            if (r4 < r5) goto L_0x0192
            int r4 = r11.b
            int r5 = r6.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0192:
            int r4 = r11.d
            int r5 = r6.b
            if (r4 < r5) goto L_0x019f
            int r4 = r11.d
            int r5 = r6.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x019f:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 < r5) goto L_0x01ac
            int r4 = r11.b
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x01ac:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 < r5) goto L_0x01b9
            int r4 = r11.d
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x01b9:
            r2.set(r3, r12)
            int r4 = r11.b
            int r5 = r11.d
            if (r4 == r5) goto L_0x01c6
            r2.set(r7, r11)
            goto L_0x01c9
        L_0x01c6:
            r2.remove(r7)
        L_0x01c9:
            if (r6 == 0) goto L_0x0006
            r2.add(r3, r6)
            goto L_0x0006
        L_0x01d0:
            int r4 = r11.d
            int r6 = r12.b
            if (r4 >= r6) goto L_0x01d8
            r5 = -1
            goto L_0x01d9
        L_0x01d8:
            r5 = 0
        L_0x01d9:
            int r4 = r11.b
            int r6 = r12.b
            if (r4 >= r6) goto L_0x01e1
            int r5 = r5 + 1
        L_0x01e1:
            int r4 = r12.b
            int r6 = r11.b
            if (r4 > r6) goto L_0x01ee
            int r4 = r11.b
            int r6 = r12.d
            int r4 = r4 + r6
            r11.b = r4
        L_0x01ee:
            int r4 = r12.b
            int r6 = r11.d
            if (r4 > r6) goto L_0x01fb
            int r4 = r11.d
            int r6 = r12.d
            int r4 = r4 + r6
            r11.d = r4
        L_0x01fb:
            int r4 = r12.b
            int r4 = r4 + r5
            r12.b = r4
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x0208:
            java.util.ArrayList<nv$b> r1 = r0.a
            int r1 = r1.size()
            r2 = 0
        L_0x020f:
            if (r2 >= r1) goto L_0x02dd
            java.util.ArrayList<nv$b> r3 = r0.a
            java.lang.Object r3 = r3.get(r2)
            nv$b r3 = (defpackage.nv.b) r3
            int r11 = r3.a
            if (r11 == r4) goto L_0x02d6
            if (r11 == r10) goto L_0x027f
            if (r11 == r9) goto L_0x022a
            if (r11 == r7) goto L_0x0225
            goto L_0x02d9
        L_0x0225:
            r0.c(r3)
            goto L_0x02d9
        L_0x022a:
            int r11 = r3.b
            int r12 = r3.b
            int r13 = r3.d
            int r12 = r12 + r13
            int r13 = r3.b
            r14 = r11
            r11 = 0
            r15 = -1
        L_0x0236:
            if (r13 >= r12) goto L_0x0268
            nv$a r5 = r0.e
            androidx.recyclerview.widget.RecyclerView$u r5 = r5.a(r13)
            if (r5 != 0) goto L_0x0256
            boolean r5 = r0.d(r13)
            if (r5 == 0) goto L_0x0247
            goto L_0x0256
        L_0x0247:
            if (r15 != r4) goto L_0x0254
            java.lang.Object r5 = r3.c
            nv$b r5 = r0.a(r9, r14, r11, r5)
            r0.c(r5)
            r14 = r13
            r11 = 0
        L_0x0254:
            r15 = 0
            goto L_0x0264
        L_0x0256:
            if (r15 != 0) goto L_0x0263
            java.lang.Object r5 = r3.c
            nv$b r5 = r0.a(r9, r14, r11, r5)
            r0.b(r5)
            r14 = r13
            r11 = 0
        L_0x0263:
            r15 = 1
        L_0x0264:
            int r11 = r11 + r4
            int r13 = r13 + 1
            goto L_0x0236
        L_0x0268:
            int r5 = r3.d
            if (r11 == r5) goto L_0x0275
            java.lang.Object r5 = r3.c
            r0.a(r3)
            nv$b r3 = r0.a(r9, r14, r11, r5)
        L_0x0275:
            if (r15 != 0) goto L_0x027b
            r0.b(r3)
            goto L_0x02d9
        L_0x027b:
            r0.c(r3)
            goto L_0x02d9
        L_0x027f:
            int r5 = r3.b
            int r11 = r3.b
            int r12 = r3.d
            int r11 = r11 + r12
            int r12 = r3.b
            r13 = 0
            r14 = -1
        L_0x028a:
            if (r12 >= r11) goto L_0x02c1
            nv$a r15 = r0.e
            androidx.recyclerview.widget.RecyclerView$u r15 = r15.a(r12)
            if (r15 != 0) goto L_0x02a9
            boolean r15 = r0.d(r12)
            if (r15 == 0) goto L_0x029b
            goto L_0x02a9
        L_0x029b:
            if (r14 != r4) goto L_0x02a6
            nv$b r14 = r0.a(r10, r5, r13, r6)
            r0.c(r14)
            r14 = 1
            goto L_0x02a7
        L_0x02a6:
            r14 = 0
        L_0x02a7:
            r15 = 0
            goto L_0x02b6
        L_0x02a9:
            if (r14 != 0) goto L_0x02b4
            nv$b r14 = r0.a(r10, r5, r13, r6)
            r0.b(r14)
            r14 = 1
            goto L_0x02b5
        L_0x02b4:
            r14 = 0
        L_0x02b5:
            r15 = 1
        L_0x02b6:
            if (r14 == 0) goto L_0x02bc
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x02be
        L_0x02bc:
            int r13 = r13 + 1
        L_0x02be:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x028a
        L_0x02c1:
            int r11 = r3.d
            if (r13 == r11) goto L_0x02cc
            r0.a(r3)
            nv$b r3 = r0.a(r10, r5, r13, r6)
        L_0x02cc:
            if (r14 != 0) goto L_0x02d2
            r0.b(r3)
            goto L_0x02d9
        L_0x02d2:
            r0.c(r3)
            goto L_0x02d9
        L_0x02d6:
            r0.c(r3)
        L_0x02d9:
            int r2 = r2 + 1
            goto L_0x020f
        L_0x02dd:
            java.util.ArrayList<nv$b> r1 = r0.a
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv.b():void");
    }

    public final int c(int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.a.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (bVar.b == i) {
                            i = bVar.d;
                        } else {
                            if (bVar.b < i) {
                                i--;
                            }
                            if (bVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (bVar.b > i) {
                    continue;
                } else if (bVar.b + bVar.d > i) {
                    return -1;
                } else {
                    i -= bVar.d;
                }
            } else if (bVar.b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    public final void c() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.e.b((b) this.d.get(i));
        }
        a((List<b>) this.d);
        this.b = 0;
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.a.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                this.e.b(bVar);
                this.e.c(bVar.b, bVar.d);
            } else if (i2 == 2) {
                this.e.b(bVar);
                this.e.a(bVar.b, bVar.d);
            } else if (i2 == 4) {
                this.e.b(bVar);
                this.e.a(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.e.b(bVar);
                this.e.d(bVar.b, bVar.d);
            }
        }
        a((List<b>) this.a);
        this.b = 0;
    }

    public final boolean f() {
        return !this.d.isEmpty() && !this.a.isEmpty();
    }
}
