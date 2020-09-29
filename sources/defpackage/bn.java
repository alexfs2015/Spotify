package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bn reason: default package */
public class bn extends DataSetObservable {
    static final String a = bn.class.getSimpleName();
    public final Object b;
    public final List<a> c;
    public final List<b> d;
    final Context e;
    public final String f;
    boolean g;
    public boolean h;
    public boolean i;

    /* renamed from: bn$a */
    public static final class a implements Comparable<a> {
        public final ResolveInfo a;

        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            return Float.floatToIntBits(0.0f) - Float.floatToIntBits(0.0f);
        }

        public final int hashCode() {
            return Float.floatToIntBits(0.0f) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal(0.0d));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: bn$b */
    public static final class b {
        public final ComponentName a;
        public final long b;
        public final float c;

        public b(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public b(ComponentName componentName, long j, float f) {
            this.a = componentName;
            this.b = j;
            this.c = f;
        }

        public final int hashCode() {
            ComponentName componentName = this.a;
            int hashCode = ((componentName == null ? 0 : componentName.hashCode()) + 31) * 31;
            long j = this.b;
            return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            ComponentName componentName = this.a;
            if (componentName == null) {
                if (bVar.a != null) {
                    return false;
                }
            } else if (!componentName.equals(bVar.a)) {
                return false;
            }
            return this.b == bVar.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(bVar.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.a);
            sb.append("; time:");
            sb.append(this.b);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: bn$c */
    public final class c extends AsyncTask<Object, Void, Void> {
        public c() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r15 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
            if (r15 == null) goto L_0x00ca;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00aa, code lost:
            if (r15 == null) goto L_0x00ca;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
            if (r15 == null) goto L_0x00ca;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                bn r7 = defpackage.bn.this     // Catch:{ FileNotFoundException -> 0x00d5 }
                android.content.Context r7 = r7.e     // Catch:{ FileNotFoundException -> 0x00d5 }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00d5 }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r9 = 0
            L_0x002f:
                if (r9 >= r8) goto L_0x0061
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                bn$b r10 = (defpackage.bn.b) r10     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.a     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                java.lang.String r12 = r12.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                java.lang.String r11 = "time"
                long r12 = r10.b     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                java.lang.String r11 = "weight"
                float r10 = r10.c     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                int r9 = r9 + 1
                goto L_0x002f
            L_0x0061:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
                bn r0 = defpackage.bn.this
                r0.g = r5
                if (r15 == 0) goto L_0x00ca
            L_0x006d:
                r15.close()     // Catch:{ IOException -> 0x00ca }
                goto L_0x00ca
            L_0x0071:
                r0 = move-exception
                goto L_0x00cb
            L_0x0073:
                r0 = move-exception
                java.lang.String r1 = defpackage.bn.a     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>(r2)     // Catch:{ all -> 0x0071 }
                bn r2 = defpackage.bn.this     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r2.f     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0071 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0071 }
                bn r0 = defpackage.bn.this
                r0.g = r5
                if (r15 == 0) goto L_0x00ca
                goto L_0x006d
            L_0x0090:
                r0 = move-exception
                java.lang.String r1 = defpackage.bn.a     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>(r2)     // Catch:{ all -> 0x0071 }
                bn r2 = defpackage.bn.this     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r2.f     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0071 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0071 }
                bn r0 = defpackage.bn.this
                r0.g = r5
                if (r15 == 0) goto L_0x00ca
                goto L_0x006d
            L_0x00ad:
                r0 = move-exception
                java.lang.String r1 = defpackage.bn.a     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>(r2)     // Catch:{ all -> 0x0071 }
                bn r2 = defpackage.bn.this     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r2.f     // Catch:{ all -> 0x0071 }
                r3.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0071 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0071 }
                bn r0 = defpackage.bn.this
                r0.g = r5
                if (r15 == 0) goto L_0x00ca
                goto L_0x006d
            L_0x00ca:
                return r6
            L_0x00cb:
                bn r1 = defpackage.bn.this
                r1.g = r5
                if (r15 == 0) goto L_0x00d4
                r15.close()     // Catch:{ IOException -> 0x00d4 }
            L_0x00d4:
                throw r0
            L_0x00d5:
                r0 = move-exception
                java.lang.String r1 = defpackage.bn.a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                r3.append(r15)
                java.lang.String r15 = r3.toString()
                android.util.Log.e(r1, r15, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bn.c.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    static {
        new Object();
        new HashMap();
    }

    public final int a() {
        int size;
        synchronized (this.b) {
            d();
            size = this.c.size();
        }
        return size;
    }

    public final ResolveInfo a(int i2) {
        ResolveInfo resolveInfo;
        synchronized (this.b) {
            d();
            resolveInfo = ((a) this.c.get(i2)).a;
        }
        return resolveInfo;
    }

    public final int a(ResolveInfo resolveInfo) {
        synchronized (this.b) {
            d();
            List<a> list = this.c;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((a) list.get(i2)).a == resolveInfo) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public final Intent b(int i2) {
        synchronized (this.b) {
        }
        return null;
    }

    public final ResolveInfo b() {
        synchronized (this.b) {
            d();
            if (this.c.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((a) this.c.get(0)).a;
            return resolveInfo;
        }
    }

    public final int c() {
        int size;
        synchronized (this.b) {
            d();
            size = this.d.size();
        }
        return size;
    }

    public void d() {
        boolean f2 = f() | false;
        e();
        if (f2) {
            notifyChanged();
        }
    }

    private boolean f() {
        if (!this.g || !this.i || TextUtils.isEmpty(this.f)) {
            return false;
        }
        this.g = false;
        this.h = true;
        g();
        return true;
    }

    public void e() {
        int size = this.d.size();
        if (size > 0) {
            this.i = true;
            for (int i2 = 0; i2 < size; i2++) {
                this.d.remove(0);
            }
        }
    }

    private void g() {
        String str = "Error reading historical recrod file: ";
        try {
            boolean openFileInput = this.e.openFileInput(this.f);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i2 = 0;
                while (i2 != 1 && i2 != 2) {
                    i2 = newPullParser.next();
                }
                openFileInput = "historical-records".equals(newPullParser.getName());
                if (openFileInput) {
                    List<b> list = this.d;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (!(next == 3 || next == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new b(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException unused) {
                            }
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (XmlPullParserException e2) {
                String str2 = a;
                StringBuilder sb = new StringBuilder(str);
                sb.append(this.f);
                Log.e(str2, sb.toString(), e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (IOException e3) {
                String str3 = a;
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(this.f);
                Log.e(str3, sb2.toString(), e3);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
            } finally {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        } catch (FileNotFoundException unused5) {
        }
    }
}
