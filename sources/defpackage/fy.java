package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: fy reason: default package */
public final class fy {

    /* renamed from: fy$a */
    public interface a {
    }

    /* renamed from: fy$b */
    public static final class b implements a {
        public final c[] a;

        public b(c[] cVarArr) {
            this.a = cVarArr;
        }
    }

    /* renamed from: fy$c */
    public static final class c {
        public final String a;
        public int b;
        public boolean c;
        public String d;
        public int e;
        public int f;

        public c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }
    }

    /* renamed from: fy$d */
    public static final class d implements a {
        public final hb a;
        public final int b;
        public final int c;

        public d(hb hbVar, int i, int i2) {
            this.a = hbVar;
            this.c = i;
            this.b = i2;
        }
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String str = "font-family";
            xmlPullParser.require(2, null, str);
            if (xmlPullParser.getName().equals(str)) {
                return b(xmlPullParser, resources);
            }
            a(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), defpackage.ey.a.e);
        String string = obtainAttributes.getString(defpackage.ey.a.f);
        String string2 = obtainAttributes.getString(defpackage.ey.a.j);
        String string3 = obtainAttributes.getString(defpackage.ey.a.k);
        int resourceId = obtainAttributes.getResourceId(defpackage.ey.a.g, 0);
        int integer = obtainAttributes.getInteger(defpackage.ey.a.h, 1);
        int integer2 = obtainAttributes.getInteger(defpackage.ey.a.i, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(c(xmlPullParser, resources));
                    } else {
                        a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new d(new hb(string, string2, string3, a(resources, resourceId)), integer, integer2);
    }

    public static List<List<byte[]>> a(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static c c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), defpackage.ey.a.l);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(defpackage.ey.a.u) ? defpackage.ey.a.u : defpackage.ey.a.n, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(defpackage.ey.a.s) ? defpackage.ey.a.s : defpackage.ey.a.o, 0);
        int i2 = obtainAttributes.hasValue(defpackage.ey.a.v) ? defpackage.ey.a.v : defpackage.ey.a.p;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(defpackage.ey.a.t) ? defpackage.ey.a.t : defpackage.ey.a.q);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(defpackage.ey.a.r) ? defpackage.ey.a.r : defpackage.ey.a.m;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        c cVar = new c(string2, i, z, string, i3, resourceId);
        return cVar;
    }

    private static void a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
