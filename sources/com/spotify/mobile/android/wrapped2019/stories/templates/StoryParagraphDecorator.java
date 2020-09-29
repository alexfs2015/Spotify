package com.spotify.mobile.android.wrapped2019.stories.templates;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public final class StoryParagraphDecorator {

    static class PlaceholderComparator implements Serializable, Comparator<a> {
        private static final long serialVersionUID = 4625656797337838287L;

        private PlaceholderComparator() {
        }

        /* synthetic */ PlaceholderComparator(byte b) {
            this();
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return ((a) obj).a() - ((a) obj2).a();
        }
    }

    public static abstract class a {
        /* access modifiers changed from: protected */
        public abstract int a();

        /* access modifiers changed from: protected */
        public abstract int b();

        /* access modifiers changed from: protected */
        public abstract String c();

        protected a() {
        }
    }

    public static CharSequence a(String str, String[] strArr, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<a> a2 = a(str, strArr);
        int i2 = 0;
        Collections.sort(a2, new PlaceholderComparator(0));
        for (a aVar : a2) {
            spannableStringBuilder.append(str.substring(i2, aVar.a()));
            String c = aVar.c();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(c);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 17);
            i2 = aVar.b();
        }
        int b = ((a) a2.get(a2.size() - 1)).b();
        if (b < str.length()) {
            spannableStringBuilder.append(str.substring(b));
        }
        return spannableStringBuilder;
    }

    private static List<a> a(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            int i2 = i + 1;
            String format = String.format(Locale.ENGLISH, "$%d", new Object[]{Integer.valueOf(i2)});
            int indexOf = str.indexOf(format);
            arrayList.add(new kfr(indexOf, format.length() + indexOf, strArr[i]));
            i = i2;
        }
        return arrayList;
    }
}
