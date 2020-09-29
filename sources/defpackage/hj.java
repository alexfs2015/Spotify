package defpackage;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: hj reason: default package */
public final class hj {
    private static final Comparator<a> a = new Comparator<a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            if (aVar.c < aVar2.c) {
                return -1;
            }
            if (aVar.c <= aVar2.c && aVar.d >= aVar2.d) {
                return aVar.d > aVar2.d ? -1 : 0;
            }
            return 1;
        }
    };

    /* renamed from: hj$a */
    static class a {
        URLSpan a;
        String b;
        int c;
        int d;

        a() {
        }
    }

    private static void a(ArrayList<a> arrayList, Spannable spannable) {
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            a aVar = new a();
            aVar.a = uRLSpanArr[i2];
            aVar.c = spannable.getSpanStart(uRLSpanArr[i2]);
            aVar.d = spannable.getSpanEnd(uRLSpanArr[i2]);
            arrayList.add(aVar);
        }
        Collections.sort(arrayList, a);
        int size = arrayList.size();
        while (i < size - 1) {
            a aVar2 = (a) arrayList.get(i);
            int i3 = i + 1;
            a aVar3 = (a) arrayList.get(i3);
            if (aVar2.c <= aVar3.c && aVar2.d > aVar3.c) {
                int i4 = (aVar3.d > aVar2.d && aVar2.d - aVar2.c <= aVar3.d - aVar3.c) ? aVar2.d - aVar2.c < aVar3.d - aVar3.c ? i : -1 : i3;
                if (i4 != -1) {
                    URLSpan uRLSpan = ((a) arrayList.get(i4)).a;
                    if (uRLSpan != null) {
                        spannable.removeSpan(uRLSpan);
                    }
                    arrayList.remove(i4);
                    size--;
                }
            }
            i = i3;
        }
    }

    private static void a(ArrayList<a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, MatchFilter matchFilter, TransformFilter transformFilter) {
        boolean z;
        Spannable spannable2 = spannable;
        String[] strArr2 = strArr;
        MatchFilter matchFilter2 = matchFilter;
        Matcher matcher = pattern.matcher(spannable2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter2 == null || matchFilter2.acceptMatch(spannable2, start, end)) {
                a aVar = new a();
                String group = matcher.group(0);
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= strArr2.length) {
                        z = false;
                        break;
                    }
                    if (group.regionMatches(true, 0, strArr2[i], 0, strArr2[i].length())) {
                        if (!group.regionMatches(false, 0, strArr2[i], 0, strArr2[i].length())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(strArr2[i]);
                            sb.append(group.substring(strArr2[i].length()));
                            group = sb.toString();
                        }
                    } else {
                        i++;
                    }
                }
                if (!z && strArr2.length > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strArr2[0]);
                    sb2.append(group);
                    group = sb2.toString();
                }
                aVar.b = group;
                aVar.c = start;
                aVar.d = end;
                arrayList.add(aVar);
            } else {
                ArrayList<a> arrayList2 = arrayList;
            }
        }
    }

    public static boolean a(Spannable spannable, int i) {
        if (VERSION.SDK_INT >= 28) {
            return Linkify.addLinks(spannable, 3);
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        Spannable spannable2 = spannable;
        a(arrayList2, spannable2, hp.a, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        a(arrayList2, spannable2, hp.b, new String[]{"mailto:"}, null, null);
        a(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a == null) {
                spannable.setSpan(new URLSpan(aVar.b), aVar.c, aVar.d, 33);
            }
        }
        return true;
    }
}
