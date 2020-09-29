package defpackage;

import com.spotify.music.feedback.FeedbackContextType;

/* renamed from: rao reason: default package */
public final class rao {
    private final raq a;

    public rao(raq raq) {
        this.a = raq;
    }

    public final FeedbackContextType a(String str, String str2) {
        if (uhq.g(str) || uhq.f(str)) {
            if (uhq.j(str)) {
                return FeedbackContextType.DAILY_MIX;
            }
            return FeedbackContextType.RADIO;
        } else if (this.a.a(str2)) {
            return FeedbackContextType.COLLECTION;
        } else {
            return FeedbackContextType.OTHER;
        }
    }
}
