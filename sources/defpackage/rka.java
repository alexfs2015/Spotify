package defpackage;

import com.spotify.music.inappmessaging.MessageRequest;
import io.reactivex.subjects.PublishSubject;

/* renamed from: rka reason: default package */
public final class rka {
    public final PublishSubject<rjz> a = PublishSubject.a();
    private MessageRequest b;

    public final void a(MessageRequest messageRequest) {
        MessageRequest messageRequest2 = this.b;
        if (messageRequest2 != null) {
            this.a.onNext(rjz.b(messageRequest2.e()));
        }
        this.a.onNext(rjz.a(messageRequest.e()));
        this.b = messageRequest;
    }
}
