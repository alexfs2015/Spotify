package defpackage;

import android.text.Spannable;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: tsa reason: default package */
public final class tsa {
    private final b a;

    /* renamed from: tsa$a */
    public static class a {
        public static tsa a(b bVar) {
            return new tsa((b) a(bVar, 1));
        }

        private static <T> T a(T t, int i) {
            if (t != null) {
                return t;
            }
            StringBuilder sb = new StringBuilder("Method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(1);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: tsa$b */
    public interface b {
        void onURLSpanClicked(String str);
    }

    public tsa(b bVar) {
        this.a = bVar;
    }

    public final Spannable a(Spannable spannable) {
        hj.a(spannable, 3);
        a(spannable, this.a);
        return spannable;
    }

    private static void a(Spannable spannable, final b bVar) {
        Object[] spans;
        fay.a(spannable);
        fay.a(bVar);
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (obj instanceof URLSpan) {
                final URLSpan uRLSpan = (URLSpan) obj;
                a(spannable, uRLSpan, new URLSpan(uRLSpan.getURL()) {
                    public final void onClick(View view) {
                        super.onClick(view);
                        bVar.onURLSpanClicked(uRLSpan.getURL());
                    }
                });
            }
        }
    }

    private static void a(Spannable spannable, CharacterStyle characterStyle, CharacterStyle characterStyle2) {
        fay.a(spannable);
        fay.a(characterStyle);
        fay.a(characterStyle2);
        int spanStart = spannable.getSpanStart(characterStyle);
        int spanEnd = spannable.getSpanEnd(characterStyle);
        int spanFlags = spannable.getSpanFlags(characterStyle);
        spannable.removeSpan(characterStyle);
        spannable.setSpan(characterStyle2, spanStart, spanEnd, spanFlags);
    }
}
