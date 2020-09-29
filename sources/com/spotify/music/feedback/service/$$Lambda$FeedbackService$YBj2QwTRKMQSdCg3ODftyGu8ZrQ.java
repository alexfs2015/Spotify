package com.spotify.music.feedback.service;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: com.spotify.music.feedback.service.-$$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ implements Consumer {
    public static final /* synthetic */ $$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ INSTANCE = new $$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ();

    private /* synthetic */ $$Lambda$FeedbackService$YBj2QwTRKMQSdCg3ODftyGu8ZrQ() {
    }

    public final void accept(Object obj) {
        Logger.e("Error sending feedback request", new Object[0]);
    }
}
