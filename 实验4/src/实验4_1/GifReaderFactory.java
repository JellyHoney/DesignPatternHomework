package 实验4_1;

public class GifReaderFactory extends ImageReaderFactory{
    public ImageReader CreateImgReader(){
        return new GifReader();
    }

}
