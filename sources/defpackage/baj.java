package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: baj reason: default package */
final class baj {
    public final long a;
    public final long b;
    public final String c;
    private String d;
    private String e;
    private boolean f;
    private bal g;
    private final String[] h;
    private final HashMap<String, Integer> i;
    private final HashMap<String, Integer> j;
    private List<baj> k;

    baj(String str, String str2, long j2, long j3, bal bal, String[] strArr, String str3) {
        this.d = str;
        this.e = str2;
        this.g = bal;
        this.h = strArr;
        this.f = str2 != null;
        this.a = j2;
        this.b = j3;
        this.c = (String) bcu.a(str3);
        this.i = new HashMap<>();
        this.j = new HashMap<>();
    }

    private boolean a(long j2) {
        return (this.a == -9223372036854775807L && this.b == -9223372036854775807L) || (this.a <= j2 && this.b == -9223372036854775807L) || ((this.a == -9223372036854775807L && j2 < this.b) || (this.a <= j2 && j2 < this.b));
    }

    public final void a(baj baj) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(baj);
    }

    private baj a(int i2) {
        List<baj> list = this.k;
        if (list != null) {
            return (baj) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    private int b() {
        List<baj> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] a() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i3 = i2 + 1;
            jArr[i2] = ((Long) it.next()).longValue();
            i2 = i3;
        }
        return jArr;
    }

    private void a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.d);
        if (z || equals) {
            long j2 = this.a;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.b;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                ((baj) this.k.get(i2)).a(treeSet, z || equals);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(long j2, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.i.clear();
        this.j.clear();
        if (!"metadata".equals(this.d)) {
            if (!"".equals(this.c)) {
                str = this.c;
            }
            if (!this.f || !z) {
                if (!"br".equals(this.d) || !z) {
                    if (a(j2)) {
                        for (Entry entry : map.entrySet()) {
                            this.i.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                        }
                        boolean equals = "p".equals(this.d);
                        for (int i2 = 0; i2 < b(); i2++) {
                            a(i2).a(j2, z || equals, str, map);
                        }
                        if (equals) {
                            SpannableStringBuilder a2 = a(str, map);
                            int length = a2.length() - 1;
                            while (length >= 0 && a2.charAt(length) == ' ') {
                                length--;
                            }
                            if (length >= 0 && a2.charAt(length) != 10) {
                                a2.append(10);
                            }
                        }
                        for (Entry entry2 : map.entrySet()) {
                            this.j.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                        }
                    }
                    return;
                }
                a(str, map).append(10);
                return;
            }
            a(str, map).append(this.e);
        }
    }

    private static SpannableStringBuilder a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(long j2, Map<String, bal> map, Map<String, SpannableStringBuilder> map2) {
        if (a(j2)) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                int i2 = 0;
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    String str = (String) entry.getKey();
                    int intValue = this.i.containsKey(str) ? ((Integer) this.i.get(str)).intValue() : 0;
                    int intValue2 = ((Integer) entry.getValue()).intValue();
                    if (intValue != intValue2) {
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map2.get(str);
                        bal bal = this.g;
                        String[] strArr = this.h;
                        if (bal == null && strArr == null) {
                            bal = null;
                        } else if (bal == null && strArr.length == 1) {
                            bal = (bal) map.get(strArr[0]);
                        } else if (bal == null && strArr.length > 1) {
                            bal = new bal();
                            for (String str2 : strArr) {
                                bal.a((bal) map.get(str2), true);
                            }
                        } else if (bal != null && strArr != null && strArr.length == 1) {
                            bal = bal.a((bal) map.get(strArr[0]), true);
                        } else if (!(bal == null || strArr == null || strArr.length <= 1)) {
                            for (String str3 : strArr) {
                                bal.a((bal) map.get(str3), true);
                            }
                        }
                        if (bal == null) {
                            continue;
                        } else {
                            if (bal.a() != -1) {
                                spannableStringBuilder.setSpan(new StyleSpan(bal.a()), intValue, intValue2, 33);
                            }
                            if (bal.f == 1) {
                                spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                            }
                            if (bal.g == 1) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                            }
                            if (bal.c) {
                                if (bal.c) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(bal.b), intValue, intValue2, 33);
                                } else {
                                    throw new IllegalStateException("Font color has not been defined.");
                                }
                            }
                            if (bal.e) {
                                if (bal.e) {
                                    spannableStringBuilder.setSpan(new BackgroundColorSpan(bal.d), intValue, intValue2, 33);
                                } else {
                                    throw new IllegalStateException("Background color has not been defined.");
                                }
                            }
                            if (bal.a != null) {
                                spannableStringBuilder.setSpan(new TypefaceSpan(bal.a), intValue, intValue2, 33);
                            }
                            if (bal.m != null) {
                                spannableStringBuilder.setSpan(new Standard(bal.m), intValue, intValue2, 33);
                            }
                            int i3 = bal.j;
                            if (i3 == 1) {
                                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) bal.k, true), intValue, intValue2, 33);
                            } else if (i3 == 2) {
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(bal.k), intValue, intValue2, 33);
                            } else if (i3 == 3) {
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(bal.k / 100.0f), intValue, intValue2, 33);
                            }
                        }
                    }
                } else {
                    while (i2 < b()) {
                        a(i2).a(j2, map, map2);
                        i2++;
                    }
                    return;
                }
            }
        }
    }

    static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder) {
        int i2;
        int i3;
        int i4 = 0;
        int length = spannableStringBuilder.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == ' ') {
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                    i7++;
                }
                int i8 = i7 - i6;
                if (i8 > 0) {
                    spannableStringBuilder.delete(i5, i5 + i8);
                    length -= i8;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i9 = 0;
        while (true) {
            i2 = length - 1;
            if (i9 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i9) == 10) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    spannableStringBuilder.delete(i10, i9 + 2);
                    length--;
                }
            }
            i9++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == ' ') {
            spannableStringBuilder.delete(i2, length);
            length--;
        }
        while (true) {
            i3 = length - 1;
            if (i4 >= i3) {
                break;
            }
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i11 = i4 + 1;
                if (spannableStringBuilder.charAt(i11) == 10) {
                    spannableStringBuilder.delete(i4, i11);
                    length--;
                }
            }
            i4++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i3) == 10) {
            spannableStringBuilder.delete(i3, length);
        }
        return spannableStringBuilder;
    }
}
