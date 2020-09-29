package androidx.media;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(sc scVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.b = (mi) scVar.b(audioAttributesCompat.b, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, sc scVar) {
        scVar.a((se) audioAttributesCompat.b, 1);
    }
}
