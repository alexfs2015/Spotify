package defpackage;

import java.util.PriorityQueue;

@cfp
/* renamed from: dnc reason: default package */
public final class dnc {
    private static long a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? a((j * j) % 1073807359, i / 2) : j * (a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    private static long a(String[] strArr, int i) {
        long a = (((long) dmz.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            a = (((a * 16785407) % 1073807359) + ((((long) dmz.a(strArr[i2])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    private static String a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            cml.a("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    private static void a(int i, long j, String str, int i2, PriorityQueue<dnd> priorityQueue) {
        dnd dnd = new dnd(j, str, i2);
        if ((priorityQueue.size() != i || (((dnd) priorityQueue.peek()).c <= dnd.c && ((dnd) priorityQueue.peek()).a <= dnd.a)) && !priorityQueue.contains(dnd)) {
            priorityQueue.add(dnd);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void a(String[] strArr, int i, int i2, PriorityQueue<dnd> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            a(i, a(strArr2, strArr2.length), a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long a = a(strArr2, i3);
        a(i, a, a(strArr2, 0, i3), i2, priorityQueue);
        long a2 = a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = a + 1073807359;
            a = (((((j - ((((((long) dmz.a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a2) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) dmz.a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            a(i, a, a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }
}
