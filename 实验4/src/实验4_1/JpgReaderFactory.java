package 实验4_1;

public class JpgReaderFactory extends ImageReaderFactory {
    public ImageReader CreateImgReader(){
        return new JpgReader();
    }
}
