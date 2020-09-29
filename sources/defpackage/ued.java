package defpackage;

import android.text.Spannable;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: ued reason: default package */
public final class ued {
    private final b a;

    /* renamed from: ued$a */
    public static class a {
        private static <T> T a(T t, int i) {
            if (t != null) {
                return t;
            }
            StringBuilder sb = new StringBuilder("Method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(1);
            throw new NullPointerException(sb.toString());
        }

        public static ued a(b bVar) {
            return new ued((b) a(bVar, 1));
        }
    }

    /* renamed from: ued$b */
    public interface b {
        void onURLSpanClicked(String str);
    }

    public ued(b bVar) {
        this.a = bVar;
    }

    private static void a(Spannable spannable, CharacterStyle characterStyle, CharacterStyle characterStyle2) {
        fbp.a(spannable);
        fbp.a(characterStyle);
        fbp.a(characterStyle2);
        int spanStart = spannable.getSpanStart(characterStyle);
        int spanEnd = spannable.getSpanEnd(characterStyle);
        int spanFlags = spannable.getSpanFlags(characterStyle);
        spannable.removeSpan(characterStyle);
        spannable.setSpan(characterStyle2, spanStart, spanEnd, spanFlags);
    }

    private static void a(Spannable spannable, final b bVar) {
        Object[] spans;
        fbp.a(spannable);
        fbp.a(bVar);
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

    public final Spannable a(Spannable spannable) {
        hj.a(spannable, 3);
        a(spannable, this.a);
        return spannable;
    }
}
