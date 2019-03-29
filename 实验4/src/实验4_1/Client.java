package 实验4_1;

public class Client {
    public static void main(String[] args){
        ImageReaderFactory img=new GifReaderFactory();
        ImageReader ir=img.CreateImgReader();
        ir.Read();
    }
}
