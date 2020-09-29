package com.spotify.music.features.languagepicker.logger;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class LogInfo {

    public enum Button {
        NEXT("next-button", UserIntent.NAVIGATE_FORWARD, "language-picker", RenderType.PAGE),
        RETRY("retry-button", UserIntent.RETRY, "language-picker", RenderType.PAGE),
        GOT_IT("got-it-button", UserIntent.DISMISS, "language-picker-no-skip-dialog", RenderType.DIALOG);
        
        private final String mItemUri;
        private final RenderType mRenderType;
        private final String mSectionId;
        private final UserIntent mUserIntent;

        private Button(String str, UserIntent userIntent, String str2, RenderType renderType) {
            this.mItemUri = str;
            this.mUserIntent = userIntent;
            this.mSectionId = str2;
            this.mRenderType = renderType;
        }

        public final void a(ImpressionLogger impressionLogger) {
            impressionLogger.a(this.mItemUri, this.mSectionId, 0, ImpressionType.BUTTON, this.mRenderType);
        }

        public final void a(InteractionLogger interactionLogger) {
            interactionLogger.a(this.mItemUri, this.mSectionId, 0, InteractionType.HIT, this.mUserIntent.toString());
        }
    }

    public enum UserIntent {
        NAVIGATE_FORWARD("navigate-forward"),
        RETRY("retry"),
        SELECT("select-enable"),
        DESELECT("select-disable"),
        DISMISS("dismiss"),
        BACK_BUTTON("device-back-button"),
        SCROLL("scroll");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum View {
        LOADING("loading", ImpressionType.PROGRESS_BAR, "language-picker"),
        LANGUAGES("languages", ImpressionType.ITEM, "language-picker"),
        ERROR(LogMessage.SEVERITY_ERROR, ImpressionType.ERROR, "language-picker"),
        NO_CONNECTION("no-connection", ImpressionType.ITEM, "language-picker");
        
        private final ImpressionType mImpressionType;
        public final String mItemUri;
        public final String mSectionId;

        private View(String str, ImpressionType impressionType, String str2) {
            this.mItemUri = str;
            this.mImpressionType = impressionType;
            this.mSectionId = str2;
        }

        public final void a(ImpressionLogger impressionLogger) {
            impressionLogger.a(this.mItemUri, this.mSectionId, 0, this.mImpressionType, RenderType.PAGE);
        }

        public final void a(InteractionLogger interactionLogger) {
            interactionLogger.a(this.mItemUri, this.mSectionId, 0, InteractionType.HIT, UserIntent.BACK_BUTTON.toString());
        }
    }
}
