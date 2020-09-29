package com.spotify.music.features.fullscreen.story.logger;

public interface FullscreenStoryLogger {

    public enum Impression {
        VIDEO_PLAYING("video-playing"),
        AUDIO_PLAYING("audio-playing"),
        STORY_VIEW_SHOWN("story-shown"),
        STORY_FETCHED("story-fetched"),
        STORY_FETCHING_FAILED("story-fetching-failed"),
        EMPTY_STORY("empty-story"),
        EMPTY_CHAPTER("empty-chapter"),
        PLAYBACK_ERROR("playback-error"),
        STORY_PARSING_FAILED("story-parsing-failed");
        
        private final String mStrValue;

        private Impression(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum Interaction {
        NEXT_CHAPTER("next-chapter"),
        PREVIOUS_CHAPTER("previous-chapter"),
        CLOSE("close"),
        CONTEXT_PLAYER("context-player"),
        BACK_BUTTON("back-button"),
        HEART_BUTTON("heart-button"),
        CONTEXT_MENU_BUTTON("context-menu-button"),
        PLAYLIST_COVER("playlist-cover");
        
        private final String mStrValue;

        private Interaction(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        NAVIGATE_FORWARD("navigate-forward"),
        NAVIGATE_BACKWARD("navigate-backward"),
        DISMISS("dismiss"),
        HEARTED("hearted"),
        UNHEARTED("unhearted"),
        MORE("more");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    void a(ngg ngg);
}
