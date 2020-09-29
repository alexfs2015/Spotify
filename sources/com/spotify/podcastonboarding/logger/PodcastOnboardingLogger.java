package com.spotify.podcastonboarding.logger;

public interface PodcastOnboardingLogger {

    public enum PodcastOnboardingRenderType {
        PILL("pill"),
        PILLOW("pillow");
        
        private final String mStrValue;

        private PodcastOnboardingRenderType(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    void a();

    void a(String str, int i);

    void a(String str, int i, PodcastOnboardingRenderType podcastOnboardingRenderType);

    void b();

    void b(String str, int i);

    void c();

    void d();

    void e();

    void f();

    void g();
}
