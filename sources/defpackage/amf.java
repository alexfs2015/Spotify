package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: amf reason: default package */
public class amf {
    private static volatile Integer a;

    public static int a(Context context) {
        int i;
        if (a == null) {
            synchronized (amf.class) {
                if (a == null) {
                    long a2 = ame.a(context);
                    int i2 = 2011;
                    if (a2 == -1) {
                        ArrayList arrayList = new ArrayList();
                        int a3 = ame.a();
                        int i3 = a3 <= 0 ? -1 : a3 == 1 ? 2008 : a3 <= 3 ? 2011 : 2012;
                        a(arrayList, i3);
                        long b = (long) ame.b();
                        int i4 = b == -1 ? -1 : b <= 528000 ? 2008 : b <= 620000 ? 2009 : b <= 1020000 ? 2010 : b <= 1220000 ? 2011 : b <= 1520000 ? 2012 : b <= 2020000 ? 2013 : 2014;
                        a(arrayList, i4);
                        long a4 = ame.a(context);
                        if (a4 <= 0) {
                            i2 = -1;
                        } else if (a4 <= 201326592) {
                            i2 = 2008;
                        } else if (a4 <= 304087040) {
                            i2 = 2009;
                        } else if (a4 <= 536870912) {
                            i2 = 2010;
                        } else if (a4 > 1073741824) {
                            i2 = a4 <= 1610612736 ? 2012 : a4 <= 2147483648L ? 2013 : 2014;
                        }
                        a(arrayList, i2);
                        if (arrayList.isEmpty()) {
                            i = -1;
                        } else {
                            Collections.sort(arrayList);
                            if ((arrayList.size() & 1) == 1) {
                                i = ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
                            } else {
                                int size = (arrayList.size() / 2) - 1;
                                i = ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
                            }
                        }
                    } else if (a2 <= 805306368) {
                        i = ame.a() <= 1 ? 2009 : 2010;
                    } else {
                        if (a2 > 1073741824) {
                            if (a2 <= 1610612736) {
                                if (ame.b() < 1800000) {
                                }
                            } else if (a2 > 2147483648L) {
                                i = a2 <= 3221225472L ? 2014 : a2 <= 5368709120L ? 2015 : 2016;
                            }
                            i = 2013;
                        } else if (ame.b() < 1300000) {
                            i = 2011;
                        }
                        i = 2012;
                    }
                    a = Integer.valueOf(i);
                }
            }
        }
        return a.intValue();
    }

    private static void a(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }
}
