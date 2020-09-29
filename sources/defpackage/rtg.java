package defpackage;

import com.spotify.music.inappmessaging.MessageRequest;
import io.reactivex.subjects.PublishSubject;

/* renamed from: rtg reason: default package */
public final class rtg {
    public final PublishSubject<rtf> a = PublishSubject.a();
    private MessageRequest b;

    public final void a(MessageRequest messageRequest) {
        MessageRequest messageRequest2 = this.b;
        if (messageRequest2 != null) {
            this.a.onNext(rtf.b(messageRequest2.e()));
        }
        this.a.onNext(rtf.a(messageRequest.e()));
        this.b = messageRequest;
    }
}
