package CSE_305.AdapterPattern.src;

// Target: Giao diện mà client sử dụng
interface MediaPlayer {
    void play(String audioType, String fileName);
}