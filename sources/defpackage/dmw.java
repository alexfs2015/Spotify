package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@cfp
/* renamed from: dmw reason: default package */
public final class dmw {
    private final int a;
    private final int b;
    private final int c;
    private final dmv d = new dna();

    public dmw(int i) {
        this.b = i;
        this.a = 6;
        this.c = 0;
    }

    private final String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        dmy dmy = new dmy();
        PriorityQueue priorityQueue = new PriorityQueue(this.b, new dmx());
        for (String a2 : split) {
            String[] a3 = dmz.a(a2, false);
            if (a3.length != 0) {
                dnc.a(a3, this.b, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                dmy.a(this.d.a(((dnd) it.next()).b));
            } catch (IOException e) {
                cml.a("Error while writing hash to byteStream", e);
            }
        }
        return dmy.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return a(sb.toString());
    }
}
