package defpackage;

import com.spotify.base.java.logging.Logger;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jul reason: default package */
public final class jul {

    /* renamed from: jul$a */
    public interface a {
        void a(int i);

        void a(int i, int i2);

        void b(int i);

        void b(int i, int i2);
    }

    /* renamed from: jul$b */
    public interface b<T> {
        boolean compare(T t, T t2);
    }

    private static int a(List<Integer> list, int i) {
        int intValue = ((Integer) list.get(i)).intValue();
        int i2 = 0;
        while (i < list.size() && ((Integer) list.get(i)).intValue() == intValue) {
            i2 += intValue;
            i++;
        }
        return i2;
    }

    public static <T> int a(List<T> list, List<T> list2, a aVar, b<T> bVar) {
        if (list.size() * list2.size() > 10000) {
            Logger.d("Calculating difference on big lists! Be wary of performance issues.", new Object[0]);
        }
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{list.size() + 1, list2.size() + 1});
        iArr[0][0] = 0;
        for (int i = 1; i <= list.size(); i++) {
            iArr[i][0] = i;
        }
        for (int i2 = 1; i2 <= list2.size(); i2++) {
            iArr[0][i2] = i2;
        }
        for (int i3 = 1; i3 <= list.size(); i3++) {
            for (int i4 = 1; i4 <= list2.size(); i4++) {
                int i5 = i3 - 1;
                int i6 = i4 - 1;
                if (a(list.get(i5), list2.get(i6), bVar)) {
                    iArr[i3][i4] = iArr[i5][i6];
                } else {
                    int i7 = iArr[i3][i6] + 1;
                    iArr[i3][i4] = Math.min(i7, iArr[i5][i4] + 1);
                }
            }
        }
        if (aVar != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int size2 = list2.size();
            while (size > 0 && size2 > 0) {
                int i8 = size - 1;
                if (a(list.get(i8), list2.get(size2 - 1), bVar)) {
                    arrayList.add(Integer.valueOf(0));
                    size--;
                } else if (iArr[i8][size2] + 1 == iArr[size][size2]) {
                    arrayList.add(Integer.valueOf(-1));
                    size--;
                } else {
                    arrayList.add(Integer.valueOf(1));
                }
                size2--;
            }
            while (size > 0) {
                arrayList.add(Integer.valueOf(-1));
                size--;
            }
            while (size2 > 0) {
                arrayList.add(Integer.valueOf(1));
                size2--;
            }
            Collections.reverse(arrayList);
            int i9 = 0;
            int i10 = 0;
            while (i9 < arrayList.size()) {
                if (((Integer) arrayList.get(i9)).intValue() == 0) {
                    i10++;
                    i9++;
                } else {
                    int a2 = a(arrayList, i9);
                    if (a2 > 0) {
                        if (a2 == 1) {
                            aVar.a(i10);
                        } else {
                            aVar.a(i10, a2);
                        }
                    } else if (a2 == -1) {
                        aVar.b(i10);
                    } else {
                        aVar.b(i10, -a2);
                    }
                    i9 += Math.abs(a2);
                    i10 += Math.max(0, a2);
                }
            }
        }
        return iArr[list.size()][list2.size()];
    }

    private static <T> boolean a(T t, T t2, b<T> bVar) {
        return bVar != null ? bVar.compare(t, t2) : t == t2 || (t != null && t.equals(t2));
    }
}
