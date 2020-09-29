package defpackage;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.InboxStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fi reason: default package */
public final class fi {

    /* renamed from: fi$a */
    public static class a {
        final Bundle a;
        final fm[] b;
        final fm[] c;
        boolean d;
        boolean e;
        final int f;
        public int g;
        public CharSequence h;
        public PendingIntent i;

        /* renamed from: fi$a$a reason: collision with other inner class name */
        public static final class C0029a {
            private final int a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<fm> f;
            private int g;
            private boolean h;

            public C0029a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            private C0029a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, fm[] fmVarArr, boolean z, int i2, boolean z2) {
                this.d = true;
                this.h = true;
                this.a = i;
                this.b = c.e(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = null;
                this.d = true;
                this.g = 0;
                this.h = true;
            }

            public final a a() {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<fm> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        fm fmVar = (fm) it.next();
                        if (!fmVar.d && (fmVar.c == null || fmVar.c.length == 0) && fmVar.f != null && !fmVar.f.isEmpty()) {
                            arrayList.add(fmVar);
                        } else {
                            arrayList2.add(fmVar);
                        }
                    }
                }
                fm[] fmVarArr = null;
                fm[] fmVarArr2 = arrayList.isEmpty() ? null : (fm[]) arrayList.toArray(new fm[arrayList.size()]);
                if (!arrayList2.isEmpty()) {
                    fmVarArr = (fm[]) arrayList2.toArray(new fm[arrayList2.size()]);
                }
                a aVar = new a(this.a, this.b, this.c, this.e, fmVarArr, fmVarArr2, this.d, this.g, this.h);
                return aVar;
            }
        }

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        a(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, fm[] fmVarArr, fm[] fmVarArr2, boolean z, int i3, boolean z2) {
            this.e = true;
            this.g = i2;
            this.h = c.e(charSequence);
            this.i = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.a = bundle;
            this.b = fmVarArr;
            this.c = fmVarArr2;
            this.d = z;
            this.f = i3;
            this.e = z2;
        }
    }

    /* renamed from: fi$b */
    public static class b extends e {
        private CharSequence c;

        public final b a(CharSequence charSequence) {
            this.c = c.e(charSequence);
            return this;
        }

        public final void a(fh fhVar) {
            if (VERSION.SDK_INT >= 16) {
                new BigTextStyle(fhVar.a()).setBigContentTitle(null).bigText(this.c);
            }
        }
    }

    /* renamed from: fi$c */
    public static class c {
        public Context a;
        public ArrayList<a> b;
        ArrayList<a> c;
        CharSequence d;
        CharSequence e;
        public PendingIntent f;
        Bitmap g;
        public int h;
        public boolean i;
        e j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        public boolean o;
        public String p;
        Bundle q;
        public int r;
        public int s;
        public String t;
        int u;
        int v;
        public Notification w;
        @Deprecated
        public ArrayList<String> x;

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.i = true;
            this.o = false;
            this.r = 0;
            this.s = 0;
            this.u = 0;
            this.v = 0;
            this.w = new Notification();
            this.a = context;
            this.t = str;
            this.w.when = System.currentTimeMillis();
            this.w.audioStreamType = -1;
            this.h = 0;
            this.x = new ArrayList<>();
        }

        protected static CharSequence e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public final Bundle a() {
            if (this.q == null) {
                this.q = new Bundle();
            }
            return this.q;
        }

        public final c a(int i2) {
            this.w.icon = i2;
            return this;
        }

        public final c a(int i2, int i3, boolean z) {
            this.l = i2;
            this.m = i3;
            this.n = z;
            return this;
        }

        public final c a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public final c a(long j2) {
            this.w.when = j2;
            return this;
        }

        public final c a(PendingIntent pendingIntent) {
            this.w.deleteIntent = pendingIntent;
            return this;
        }

        public final c a(Bitmap bitmap) {
            if (bitmap != null && VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double d2 = (double) dimensionPixelSize;
                    double max = (double) Math.max(1, bitmap.getWidth());
                    Double.isNaN(d2);
                    Double.isNaN(max);
                    double d3 = d2 / max;
                    double d4 = (double) dimensionPixelSize2;
                    double max2 = (double) Math.max(1, bitmap.getHeight());
                    Double.isNaN(d4);
                    Double.isNaN(max2);
                    double min = Math.min(d3, d4 / max2);
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    int ceil = (int) Math.ceil(width * min);
                    double height = (double) bitmap.getHeight();
                    Double.isNaN(height);
                    bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
                }
            }
            this.g = bitmap;
            return this;
        }

        public final c a(a aVar) {
            this.b.add(aVar);
            return this;
        }

        public final c a(e eVar) {
            if (this.j != eVar) {
                this.j = eVar;
                e eVar2 = this.j;
                if (eVar2 != null) {
                    eVar2.a(this);
                }
            }
            return this;
        }

        public final c a(CharSequence charSequence) {
            this.d = e(charSequence);
            return this;
        }

        public final c a(boolean z) {
            a(8, true);
            return this;
        }

        public final c a(long[] jArr) {
            this.w.vibrate = jArr;
            return this;
        }

        public void a(int i2, boolean z) {
            if (z) {
                Notification notification = this.w;
                notification.flags = i2 | notification.flags;
                return;
            }
            Notification notification2 = this.w;
            notification2.flags = (i2 ^ -1) & notification2.flags;
        }

        public final Notification b() {
            return new fj(this).b();
        }

        public final c b(int i2) {
            Notification notification = this.w;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public final c b(CharSequence charSequence) {
            this.e = e(charSequence);
            return this;
        }

        public final c b(boolean z) {
            a(16, true);
            return this;
        }

        public final long c() {
            if (this.i) {
                return this.w.when;
            }
            return 0;
        }

        public final c c(CharSequence charSequence) {
            this.k = e(charSequence);
            return this;
        }

        public final c d(CharSequence charSequence) {
            this.w.tickerText = e(charSequence);
            return this;
        }
    }

    /* renamed from: fi$d */
    public static class d extends e {
        private ArrayList<CharSequence> c = new ArrayList<>();

        public final d a(CharSequence charSequence) {
            this.c.add(c.e(charSequence));
            return this;
        }

        public final void a(fh fhVar) {
            if (VERSION.SDK_INT >= 16) {
                InboxStyle bigContentTitle = new InboxStyle(fhVar.a()).setBigContentTitle(null);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
            }
        }
    }

    /* renamed from: fi$e */
    public static abstract class e {
        protected c a;
        boolean b = false;

        public RemoteViews a() {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0119  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.widget.RemoteViews a(boolean r12, int r13, boolean r14) {
            /*
                r11 = this;
                fi$c r12 = r11.a
                android.content.Context r12 = r12.a
                android.content.res.Resources r12 = r12.getResources()
                android.widget.RemoteViews r6 = new android.widget.RemoteViews
                fi$c r0 = r11.a
                android.content.Context r0 = r0.a
                java.lang.String r0 = r0.getPackageName()
                r6.<init>(r0, r13)
                fi$c r13 = r11.a
                int r13 = r13.h
                r7 = 1
                r8 = 0
                r0 = -1
                if (r13 >= r0) goto L_0x0020
                r13 = 1
                goto L_0x0021
            L_0x0020:
                r13 = 0
            L_0x0021:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                r2 = 16
                r3 = 2131428509(0x7f0b049d, float:1.8478664E38)
                if (r0 < r2) goto L_0x0050
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 >= r1) goto L_0x0050
                r0 = 2131429966(0x7f0b0a4e, float:1.848162E38)
                java.lang.String r4 = "setBackgroundResource"
                if (r13 == 0) goto L_0x0044
                r13 = 2131231588(0x7f080364, float:1.8079261E38)
                r6.setInt(r0, r4, r13)
                r13 = 2131231595(0x7f08036b, float:1.8079275E38)
                r6.setInt(r3, r4, r13)
                goto L_0x0050
            L_0x0044:
                r13 = 2131231587(0x7f080363, float:1.807926E38)
                r6.setInt(r0, r4, r13)
                r13 = 2131231594(0x7f08036a, float:1.8079273E38)
                r6.setInt(r3, r4, r13)
            L_0x0050:
                fi$c r13 = r11.a
                android.graphics.Bitmap r13 = r13.g
                r9 = 8
                if (r13 == 0) goto L_0x006a
                int r13 = android.os.Build.VERSION.SDK_INT
                if (r13 < r2) goto L_0x0067
                r6.setViewVisibility(r3, r8)
                fi$c r13 = r11.a
                android.graphics.Bitmap r13 = r13.g
                r6.setImageViewBitmap(r3, r13)
                goto L_0x006a
            L_0x0067:
                r6.setViewVisibility(r3, r9)
            L_0x006a:
                fi$c r13 = r11.a
                java.lang.CharSequence r13 = r13.d
                if (r13 == 0) goto L_0x007a
                r13 = 2131430735(0x7f0b0d4f, float:1.848318E38)
                fi$c r0 = r11.a
                java.lang.CharSequence r0 = r0.d
                r6.setTextViewText(r13, r0)
            L_0x007a:
                fi$c r13 = r11.a
                java.lang.CharSequence r13 = r13.e
                r0 = 2131430677(0x7f0b0d15, float:1.8483062E38)
                if (r13 == 0) goto L_0x008c
                fi$c r13 = r11.a
                java.lang.CharSequence r13 = r13.e
                r6.setTextViewText(r0, r13)
                r13 = 1
                goto L_0x008d
            L_0x008c:
                r13 = 0
            L_0x008d:
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 >= r1) goto L_0x0099
                fi$c r1 = r11.a
                android.graphics.Bitmap r1 = r1.g
                if (r1 == 0) goto L_0x0099
                r10 = 1
                goto L_0x009a
            L_0x0099:
                r10 = 0
            L_0x009a:
                r1 = 2131429577(0x7f0b08c9, float:1.848083E38)
                r6.setViewVisibility(r1, r9)
                fi$c r1 = r11.a
                java.lang.CharSequence r1 = r1.k
                if (r1 == 0) goto L_0x00c9
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r2) goto L_0x00c9
                fi$c r1 = r11.a
                java.lang.CharSequence r1 = r1.k
                r6.setTextViewText(r0, r1)
                fi$c r1 = r11.a
                java.lang.CharSequence r1 = r1.e
                r3 = 2131430679(0x7f0b0d17, float:1.8483066E38)
                if (r1 == 0) goto L_0x00c6
                fi$c r1 = r11.a
                java.lang.CharSequence r1 = r1.e
                r6.setTextViewText(r3, r1)
                r6.setViewVisibility(r3, r8)
                r1 = 1
                goto L_0x00ca
            L_0x00c6:
                r6.setViewVisibility(r3, r9)
            L_0x00c9:
                r1 = 0
            L_0x00ca:
                if (r1 == 0) goto L_0x00e8
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r2) goto L_0x00e8
                if (r14 == 0) goto L_0x00dd
                r14 = 2131165953(0x7f070301, float:1.7946138E38)
                int r12 = r12.getDimensionPixelSize(r14)
                float r12 = (float) r12
                r6.setTextViewTextSize(r0, r8, r12)
            L_0x00dd:
                r1 = 2131429641(0x7f0b0909, float:1.848096E38)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r0 = r6
                r0.setViewPadding(r1, r2, r3, r4, r5)
            L_0x00e8:
                fi$c r12 = r11.a
                long r0 = r12.c()
                r2 = 0
                int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r12 == 0) goto L_0x0106
                r12 = 2131430726(0x7f0b0d46, float:1.8483161E38)
                r6.setViewVisibility(r12, r8)
                fi$c r14 = r11.a
                long r0 = r14.c()
                java.lang.String r14 = "setTime"
                r6.setLong(r12, r14, r0)
                goto L_0x0107
            L_0x0106:
                r7 = r10
            L_0x0107:
                r12 = 2131430304(0x7f0b0ba0, float:1.8482305E38)
                if (r7 == 0) goto L_0x010e
                r14 = 0
                goto L_0x0110
            L_0x010e:
                r14 = 8
            L_0x0110:
                r6.setViewVisibility(r12, r14)
                r12 = 2131429642(0x7f0b090a, float:1.8480962E38)
                if (r13 == 0) goto L_0x0119
                goto L_0x011b
            L_0x0119:
                r8 = 8
            L_0x011b:
                r6.setViewVisibility(r12, r8)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fi.e.a(boolean, int, boolean):android.widget.RemoteViews");
        }

        public void a(fh fhVar) {
        }

        public final void a(c cVar) {
            if (this.a != cVar) {
                this.a = cVar;
                c cVar2 = this.a;
                if (cVar2 != null) {
                    cVar2.a(this);
                }
            }
        }

        public RemoteViews b() {
            return null;
        }
    }

    public static Bundle a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (VERSION.SDK_INT >= 16) {
            return fk.a(notification);
        }
        return null;
    }
}
