package CSE_305_Lab2.AdapterPattern.src;

// Target: Giao diện mà client sử dụng
interface MediaPlayer {
    void play(String audioType, String fileName);
}